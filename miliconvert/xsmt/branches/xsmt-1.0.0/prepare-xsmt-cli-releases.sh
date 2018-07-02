#!/bin/bash

VERSION=1.0.0-SNAPSHOT

#
# Prepare xsmt release
#

for i in ../cli/*/xsmt; do
    echo "Adding launch script to ${i}"
    rm -f ${i}/xsmt
    rm -f ${i}/libcairo-swt.so
    rm -f ${i}/xsmt.exe
    cp org.miliconvert.xsmt.cli/launch_xsmt.sh ${i}
    cp org.miliconvert.xsmt.cli/launch_xsmt.bat ${i}
done

pushd ../cli

for i in *; do
    fname=xsmt-${i}_${VERSION}.tar.gz
    echo "releasing ${fname}..."
    pushd $i
    mv xsmt xsmt-1.0.0
    tar cfz ../../xsmt/${fname} xsmt-1.0.0
    mv xsmt-1.0.0 xsmt
    popd
done

popd
