#!/bin/bash

rm -fr built_archive_test && mkdir built_archive_test

pushd built_archive_test >/dev/null 2>&1
tar xfj ../xsmt-1.6.0.tar.bz2 >/dev/null 2>&1
time ./xsmt/xsmt.sh
popd >/dev/null 2>&1
rm -fr built_archive_test
