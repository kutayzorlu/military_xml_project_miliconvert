#!/bin/bash
# tests adatp3 txt to xml transformations

test_data=../plugins/org.miliconvert.otg.tests/data

./txt2xml.sh contactreportToXml ${test_data}/contactreport4.mtf contact.xml
xmllint --format contact.xml > f.xml
mv f.xml contact.xml

./txt2xml.sh opnoteToXml  ${test_data}/opnote3.mtf opnote.xml
xmllint --format opnote.xml > f.xml
mv f.xml opnote.xml

./txt2xml.sh fourwhiskyToXml ${test_data}/4whisky1.mtf 4whisky.xml
xmllint --format 4whisky.xml > f.xml
mv f.xml 4whisky.xml

