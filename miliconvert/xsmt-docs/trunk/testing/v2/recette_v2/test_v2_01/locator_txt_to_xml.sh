#!/bin/bash

for i in *.ad3 ;
do
  	  ../run_test.sh locatorToXml $i  bl11/locator b11XmlToTxt
done    



