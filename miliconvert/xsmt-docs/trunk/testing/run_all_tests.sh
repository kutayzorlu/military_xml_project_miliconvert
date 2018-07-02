#!/bin/bash


###############################
#     Run all Tests           #
###############################

pushd v1/recette_v1/test_v1_01 >/dev/null 2>&1 
test -f test.log &&  rm test.log
./ownsitrep_txt_to_xml.sh 
popd >/dev/null 2>&1 

pushd v1/recette_v1/test_v1_02 >/dev/null 2>&1 
test -f test.log &&  rm test.log
./ensitrep_txt_to_xml.sh 
popd >/dev/null 2>&1 

pushd v1/recette_v1/test_v1_03 >/dev/null 2>&1 
test -f test.log &&  rm test.log
./navsitrep_txt_to_xml.sh 
popd >/dev/null 2>&1 

pushd v1/recette_v1/test_v1_04 >/dev/null 2>&1 
test -f test.log &&  rm test.log
./aco_txt_to_xml.sh 
popd >/dev/null 2>&1 

pushd v1/recette_v1/test_v1_05 >/dev/null 2>&1 
test -f test.log &&  rm test.log
./ato_txt_to_xml.sh 
popd >/dev/null 2>&1 

pushd v1/recette_v1/test_v1_06 >/dev/null 2>&1 
test -f test.log &&  rm test.log
./intsum_txt_to_xml.sh 
popd >/dev/null 2>&1 

pushd v2/recette_v2/test_v2_01 >/dev/null 2>&1 
test -f test.log &&  rm test.log
./locator_txt_to_xml.sh 
popd >/dev/null 2>&1 

pushd v2/recette_v2/test_v2_02 >/dev/null 2>&1 
test -f test.log &&  rm test.log
./navsitsum_txt_to_xml.sh 
popd >/dev/null 2>&1 

pushd v2/recette_v2/test_v2_04 >/dev/null 2>&1 
test -f test.log &&  rm test.log
./opreport.sh 
popd >/dev/null 2>&1 

pushd v2/recette_v2/test_v2_05 >/dev/null 2>&1 
test -f test.log &&  rm test.log
./contactreport.sh 
popd >/dev/null 2>&1 

pushd v2/recette_v2/test_v2_06 >/dev/null 2>&1 
test -f test.log &&  rm test.log
./fourw.sh 
popd >/dev/null 2>&1 


echo "*********************************"
echo "** FIN DES TESTS ADATP3        **"
echo "*********************************"
sleep 5
