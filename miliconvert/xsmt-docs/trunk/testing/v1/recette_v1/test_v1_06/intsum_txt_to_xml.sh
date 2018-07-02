#!/bin/bash

for i in *.ad3 ;
do
  	  ../run_test.sh intsumToXml $i  bl11/intsum b11XmlToTxt
done    




