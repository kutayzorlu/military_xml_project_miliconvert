#!/bin/bash

for i in *.othtgold ;
do
  	  ../run_otg_test.sh contactreportToXml $i  contactreport.xsd contactreportToTxt
done    