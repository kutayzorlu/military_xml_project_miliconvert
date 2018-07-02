#!/bin/bash

for i in *.othtgold ;
do
  	  ../run_otg_test.sh opnoteToXml $i  opnote.xsd opnoteToTxt
done    

