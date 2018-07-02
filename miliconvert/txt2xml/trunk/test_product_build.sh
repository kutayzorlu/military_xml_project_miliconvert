#!/bin/bash

rm -fr txt2xml && \
./product_build.sh && \
tar xfj ./txt2xml-1.8.0.tar.bz2 && cd txt2xml && \
time ./adatp3_tests.sh && \
time ./os-otg_tests.sh && \
cd -
