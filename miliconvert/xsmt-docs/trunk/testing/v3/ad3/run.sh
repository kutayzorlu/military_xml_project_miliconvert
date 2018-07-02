#!/bin/bash

pushd bl11
for i in *.adapt3; do
    ../run_test.sh ${i%%.*}ToXml $i bl11/${i%%.*} b11XmlToTxt || true
done
popd


pushd bl12
for i in *.adapt3; do
    ../run_test.sh ${i%%.*}ToXml $i bl12/${i%%.*} b12XmlToTxt || true
done
popd

pushd dga
for i in *.bl12.ad3; do
    echo "run test DGA bl12 $i"
    ../run_test.sh ${i%%.*}ToXml $i bl12/${i%%.*} b12XmlToTxt || true
done

for i in *.bl11.ad3; do
    echo "run test DGA bl11 $i"
    ../run_test.sh ${i%%.*}ToXml $i bl11/${i%%.*} b11XmlToTxt || true
done
popd
