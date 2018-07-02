#!/bin/bash

source ../../../testing.inc

${txt2xml_path}/txt2xml.sh $1 $2 $2.xml  >/dev/null 2>&1 
test -f $2.xml || echo "otg to xml [FAILED] for $2" 
test -f $2.xml || exit
xmllint --schema ../../../xsd/$3 $2.xml 2>&1 | grep -q validates
ret=$?
test $ret -eq 0 ||  echo "xml validation [FAILED]  for $2" 
test $ret -eq 0 ||  exit
${txt2xml_path}/xml2txt.sh $4 $2.xml  new_$2 > /dev/null  2>&1 
test -f new_$2 || echo "xml to otg [FAILED]  for $2 " 
test  -f new_$2 ||  exit
diff -b -w -B -N --strip-trailing-cr $2 new_$2 
mkdir -p otg
mkdir -p xml
mv new_$2 otg/$2
mv $2.xml xml/$2.xml
echo "Test OK for $2"

