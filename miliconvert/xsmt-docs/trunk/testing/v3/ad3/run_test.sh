#!/bin/bash

test -f ../../../testing.inc || {
    echo "`dirname $0`/../../../testing.inc is missing"
    exit 1
}

source ../../../testing.inc

echo $1 $2 $3

rm -f *.xml new_* *_mpgt.xml
echo "running txt2xml for $2 in `pwd`"
${txt2xml_path}/txt2xml.sh $1 $2 $2.xml  >> ./test.log 2>&1 
test -f $2.xml || {
    echo -e "ad3 to xml [FAILED] for $2\n" 
    cat ./test.log
    exit 1
}

mkdir -p xml
cp $2.xml xml 
xmllint --schema ../../../xsd/$3/messages.xsd $2.xml 2>&1 | grep -q validates
ret=$?
test $ret -eq 0 || {
    echo -e "xml validation [FAILED] for $2\n" 
    exit 1
}

echo "running xml2txt for $2 in `pwd`"
${txt2xml_path}/xml2txt.sh $4 $2.xml  new_$2 >> ./test.log 2>&1 
test -f new_$2 || {
    echo -e "xml to ad3 [FAILED] for $2\n" 
    exit 1
}
mkdir -p ad3
cp new_$2 ad3/$2
diff -u -b -w -B -N --strip-trailing-cr  $2 new_$2 
echo "Test OK for $2"

rm -rf $2.xml new_$2 workspace


echo -e "\n\n"
