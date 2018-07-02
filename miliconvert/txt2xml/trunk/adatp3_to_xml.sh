#!/bin/bash

xsmt_plugs=${HOME}/svn/miliconvert/xsmt/plugins

rm -fr txt2xml && \
./product_build.sh && \
tar xvfj txt2xml*bz2

pushd txt2xml
./adatp3_tests.sh
popd

cp txt2xml/*.xml ${xsmt_plugs}/org.miliconvert.xsmt.engine.tests/test-data/
