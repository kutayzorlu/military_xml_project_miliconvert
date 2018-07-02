#!/bin/bash
# tests adatp3 txt to xml transformations

test_data=../plugins/org.miliconvert.adatp3.tests/data

./txt2xml.sh atoToXml ${test_data}/ato_0002.adatp3 ato.xml
xmllint --format ato.xml > f.xml
mv f.xml ato.xml

./txt2xml.sh intsumToXml ${test_data}/intsum_0001.adatp3 intsum.xml
xmllint --format intsum.xml > f.xml
mv f.xml intsum.xml

./txt2xml.sh ownsitrepToXml ${test_data}/ownsitrep_0001.adatp3 ownsitrep.xml
xmllint --format ownsitrep.xml > f.xml
mv f.xml ownsitrep.xml

./txt2xml.sh navsitrepToXml ${test_data}/navsitrep_0001.adatp3 navsitrep.xml
xmllint --format navsitrep.xml > f.xml
mv f.xml navsitrep.xml

./txt2xml.sh acoToXml ${test_data}/aco_0001.adatp3 aco.xml
xmllint --format aco.xml > f.xml
mv f.xml aco.xml

./txt2xml.sh ensitrepToXml ${test_data}/ensitrep_0001.adatp3 ensitrep.xml
xmllint --format ensitrep.xml > f.xml
mv f.xml ensitrep.xml

./txt2xml.sh navsitsumToXml ${test_data}/navsitsum_0001.adatp3 navsitsum.xml
xmllint --format navsitsum.xml > f.xml
mv f.xml navsitsum.xml

./txt2xml.sh locatorToXml ${test_data}/locator_0002.adatp3 locator.xml
xmllint --format locator.xml > f.xml
mv f.xml locator.xml
