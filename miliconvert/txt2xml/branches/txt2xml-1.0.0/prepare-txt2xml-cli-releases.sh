#!/bin/bash

VERSION=1.0.0-SNAPSHOT

#
# Prepare txt2xml release
#

for i in ../cli/*/txt2xml; do
    echo "Adding launch script to ${i}"
    rm -f ${i}/txt2xml
    rm -f ${i}/libcairo-swt.so
    rm -f ${i}/txt2xml.exe
    cp org.miliconvert.txt2xml.cli/txt2xml.sh ${i}
    cp org.miliconvert.txt2xml.cli/txt2xml.bat ${i}
    cp org.miliconvert.txt2xml.cli/xml2txt.sh ${i}
    cp org.miliconvert.txt2xml.cli/xml2txt.bat ${i}
done

pushd ../cli

for i in *; do
    fname=txt2xml-${i}_${VERSION}.tar.gz
    echo "releasing ${fname}..."
    pushd $i
    mv txt2xml txt2xml-1.0.0
    tar cfz ../../txt2xml/${fname} txt2xml-1.0.0
    mv txt2xml-1.0.0 txt2xml
    popd
done

popd
