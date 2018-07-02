#!/bin/bash

../run_test.sh ensitrepToXml ensitrep_0001.adatp3 bl11/ensitrep b11XmlToTxt
 
for i in *.ad3 ;
do
  	  ../run_test.sh ensitrepToXml $i bl11/ensitrep b11XmlToTxt
done    
