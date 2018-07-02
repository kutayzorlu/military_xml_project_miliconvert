#!/bin/bash

../run_test.sh ownsitrepToXml ownsitrep_0001.adatp3 bl11/ownsitrep b11XmlToTxt

for i in *.ad3 ;
do
  	  ../run_test.sh ownsitrepToXml $i bl11/ownsitrep b11XmlToTxt
done    


