#!/bin/bash

format_docs=${HOME}/svn/miliconvert/format-docs/trunk
xsmt_home=${HOME}/svn/miliconvert/xsmt

./schema_gen.sh -f ${format_docs}/air_control_order/csv/aco.csv . \
-s ${format_docs}/sets/csv \
-d ${format_docs}/fields/csv \
-r airspace_control_order -o .
xmllint --format airspace_control_order.xsd > f.xsd 
mv f.xsd aco.xsd
rm airspace_control_order.xsd

./schema_gen.sh -f ${format_docs}/air_tasking_order/csv/ato.csv . \
-s ${format_docs}/sets/csv \
-d ${format_docs}/fields/csv \
-r air_tasking_order -o .
xmllint --format air_tasking_order.xsd > f.xsd 
mv f.xsd ato.xsd
rm air_tasking_order.xsd

./schema_gen.sh -f ${format_docs}/nav_sit_rep/csv/navsitrep.csv . \
-s ${format_docs}/sets/csv \
-d ${format_docs}/fields/csv \
-r naval_situation_report -o .
xmllint --format naval_situation_report.xsd > f.xsd 
mv f.xsd navsitrep.xsd
rm naval_situation_report.xsd

./schema_gen.sh  -f ${format_docs}/own_sit_rep/csv/own_sit_rep.csv . \
-s ${format_docs}/sets/csv \
-d ${format_docs}/fields/csv \
-r own_land_force_situation_report -o .
xmllint --format own_land_force_situation_report.xsd > f.xsd 
mv f.xsd ownsitrep.xsd
rm own_land_force_situation_report.xsd

./schema_gen.sh -f ${format_docs}/intelligence_summary/csv/intsum.csv . \
-s ${format_docs}/sets/csv \
-d ${format_docs}/fields/csv \
-r intelligence_summary -o .
xmllint --format intelligence_summary.xsd > f.xsd 
mv f.xsd intsum.xsd
rm intelligence_summary.xsd

./schema_gen.sh -f ${format_docs}/eni_sit_rep/csv/ensitrep.csv . \
-s ${format_docs}/sets/csv \
-d ${format_docs}/fields/csv \
-r enemy_land_force_situation_report -o .
xmllint --format enemy_land_force_situation_report.xsd > f.xsd 
mv f.xsd ensitrep.xsd
rm enemy_land_force_situation_report.xsd


./schema_gen.sh -f ${format_docs}/locator/csv/locator.csv . \
-s ${format_docs}/sets/csv \
-d ${format_docs}/fields/csv \
-r maritime_force_locator -o .
xmllint --format maritime_force_locator.xsd > f.xsd 
mv f.xsd locator.xsd
rm maritime_force_locator.xsd


./schema_gen.sh -f ${format_docs}/nav_sit_sum/csv/navsitsum.csv . \
-s ${format_docs}/sets/csv \
-d ${format_docs}/fields/csv \
-r naval_situation_summary -o .
xmllint --format naval_situation_summary.xsd > f.xsd 
mv f.xsd navsitsum.xsd
rm naval_situation_summary.xsd

mv *.xsd ${xsmt_home}/plugins/org.miliconvert.xsmt.engine.tests/test-data/bl11/
