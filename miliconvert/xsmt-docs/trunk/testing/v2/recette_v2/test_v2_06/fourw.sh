#!/bin/bash

for i in *.othtgold ;
do
  	  ../run_otg_test.sh fourwhiskyToXml $i  fourwhisky.xsd fourwhiskyToTxt
done    