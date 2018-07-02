#!/bin/bash


for i in *.ad3 ;
do
  	  ../run_test.sh atoToXml $i  bl11/ato b11XmlToTxt
done    
