#!/bin/bash

for i in *.ad3 ;
do
  	  ../run_test.sh acoToXml $i  bl12/aco b12XmlToTxt
done    
