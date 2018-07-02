#!/bin/bash

for i in *.ad3 ;
do
  	  ../run_test.sh navsitsumToXml $i  bl11/navsitsum b11XmlToTxt
done    
