#!/bin/bash
# 
# regenerate mapping properties file from the CVSs generated with
# extract.sh


fmt_docs=${HOME}/svn/miliconvert/format-docs/trunk
txt2xml_repo=${HOME}/svn/miliconvert/txt2xml
xsmt_repo=${HOME}/svn/miliconvert/xsmt

function map() {
	if [ -e /tmp/adatp3 ] 
	then
		echo "/tmp/adatp3 exists"
	else 
		mkdir /tmp/adatp3
	fi
    ./gen_mapping.sh -u $1 -p $2 -r $3 -f $4 -s $5 -d $6  -o ${txt2xml_repo}/plugins/org.miliconvert.adatp3/mappings/bl11
    #ret=`./gen_mapping.sh -u $1 -p $2 -r $3 -f $4 -s $5 -d $6 -o /tmp/adatp3 2>&1 | grep "/tmp/adatp3"`
    #export map_file=`echo ${ret} | sed -e 's/INFO: Wrote mapping to //'`
    #echo "${map_file} -> ${txt2xml_repo}/plugins/org.miliconvert.adatp3/mappings/$3.mapping"
    #mv $map_file ${txt2xml_repo}/plugins/org.miliconvert.adatp3/mappings/$3.mapping
}

map nato:adatp-3:b11 ato air_tasking_order ${fmt_docs}/air_tasking_order/csv/ato.csv ${fmt_docs}/sets/csv ${fmt_docs}/fields/csv

map nato:adatp-3:b11 intsum intelligence_summary ${fmt_docs}/intelligence_summary/csv/intsum.csv ${fmt_docs}/sets/csv  ${fmt_docs}/fields/csv

map nato:adatp-3:b11 ownsitrep own_land_force_situation_report ${fmt_docs}/own_sit_rep/csv/own_sit_rep.csv ${fmt_docs}/sets/csv  ${fmt_docs}/fields/csv

map nato:adatp-3:b11 ensitrep enemy_land_force_situation_report ${fmt_docs}/eni_sit_rep/csv/ensitrep.csv ${fmt_docs}/sets/csv  ${fmt_docs}/fields/csv

map nato:adatp-3:b11 navsitrep naval_situation_report ${fmt_docs}/nav_sit_rep/csv/navsitrep.csv ${fmt_docs}/sets/csv  ${fmt_docs}/fields/csv

map nato:adatp-3:b11 aco airspace_control_order ${fmt_docs}/air_control_order/csv/aco.csv ${fmt_docs}/sets/csv  ${fmt_docs}/fields/csv

map nato:adatp-3:b11 locator maritime_force_locator ${fmt_docs}/locator/csv/locator.csv ${fmt_docs}/sets/csv  ${fmt_docs}/fields/csv

map nato:adatp-3:b11 navsitsum naval_situation_summary ${fmt_docs}/nav_sit_sum/csv/navsitsum.csv ${fmt_docs}/sets/csv  ${fmt_docs}/fields/csv

cp ${txt2xml_repo}/plugins/org.miliconvert.adatp3/mappings/bl11/* ${xsmt_repo}/plugins/org.miliconvert.xsmt.mpgt/mappings/bl11
