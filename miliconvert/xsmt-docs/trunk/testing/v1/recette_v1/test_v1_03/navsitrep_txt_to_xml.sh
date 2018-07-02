#!/bin/bash

for i in *.ad3 ;
do
  	  ../run_test.sh navsitrepToXml $i  bl12/navsitrep b12XmlToTxt
done    
