#!/bin/bash

mkdir -p searchable

cp mapping/dump.sql searchable

for i in *.ods; do
    jar xvf $i content.xml
    xmllint --format content.xml > searchable/$i.xml
    rm content.xml
done

for i in *.pdf; do
    pdftotext $i searchable/$i.txt
done

