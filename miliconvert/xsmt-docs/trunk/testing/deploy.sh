#!/bin/bash
source ./testing.inc

cd ${txt2xml_src_path}
rm -rf txt2xml && ./product_build.sh && tar xfj txt2xml-${txt2xml_version}.tar.bz2
cd -

cd ${xsmt_src_path}
rm -rf xsmt && ./product_build.sh && tar xfj xsmt-${xsmt_version}.tar.bz2
cd -

#cp ${xsmt_src_path}/plugins/org.miliconvert.xsmt.engine.tests/test-data/bl11/*.xsd ./xsd/
