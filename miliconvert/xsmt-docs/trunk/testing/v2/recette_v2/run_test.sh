#!/bin/bash

source ../../../testing.inc

rm -f *.xml new_* *_mpgt.xml
${txt2xml_path}/txt2xml.sh $1 $2 $2.xml  >> ./test.log 2>&1 
test -f $2.xml || echo "ad3 to xml [FAILED] for $2" 
test -f $2.xml || exit
cp $2.xml $2_mpgt.xml
mkdir -p xml
cp $2.xml xml 
xmllint --schema ../../../xsd/$3/messages.xsd $2.xml 2>&1 | grep -q validates
ret=$?
test $ret -eq 0 ||  echo "xml validation [FAILED]  for $2" 
test $ret -eq 0 ||  exit
${txt2xml_path}/xml2txt.sh $4 $2.xml  new_$2 >> ./test.log 2>&1 
test -f new_$2 || echo "xml to ad3 [FAILED]  for $2 " 
test  -f new_$2 ||  exit
mkdir -p ad3
cp new_$2 ad3/$2
diff -b -w -B -N --strip-trailing-cr  $2 new_$2 
echo "Test OK for $2"

#test -f ./mapping.xsmt ||  exit
#${xsmt_path}/xsmt.sh ./mapping.xsmt mpgt $2_mpgt.xml >> /dev/null 2>&1
#xmllint --schema ../../../xsd/mpgt_v317.xsd mpgt/$2_mpgt.xml 2>&1 | grep -q validates
#ret=$?
#test $ret -eq 0 ||  echo " MPGT [FAILED]  for $2" 
rm -rf $2.xml new_$2 workspace $2_mpgt.xml