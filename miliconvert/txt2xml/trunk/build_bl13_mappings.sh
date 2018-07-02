
bl13_home=${HOME}/svn/miliconvert/format-docs/trunk/bl13
txt2xml_repo=${HOME}/svn/miliconvert/txt2xml
xsmt_repo=${HOME}/svn/miliconvert/xsmt


rm -fr tools-adatp3 && \
./adatp3_tools_build.sh && \
tar xfj tools-adatp3-1.9.0.tar.bz2 && cd tools-adatp3 && \
./extract.sh -f ${bl13_home}/1_Messages -n 1 -o ${bl13_home}/csv -bl bl13 && \
./extractdef.sh -f ${bl13_home}/2_Sets -n 1 -o ${bl13_home}/sets_csv -bl bl13 && \
./extractfield.sh -f ${bl13_home}/3_FFIRN -n 1 -o ${bl13_home}/fields_csv && \
./gen_mapping.sh -u nato:adatp-3:b13  -f ${bl13_home}/csv/ \
 -s ${bl13_home}/sets_csv -d ${bl13_home}/fields_csv -o ${bl13_home}/mappings -bl bl13 && \
./schema_gen.sh -f ${bl13_home}/csv/ \
 -s ${bl13_home}/sets_csv -d ${bl13_home}/fields_csv -o ${bl13_home}/schemas -bl bl13 && \
./sample_gen.sh -f ${bl13_home}/csv/ \
 -s ${bl13_home}/sets_csv -o ${bl13_home}/samples  && \
cd ..

cd ${bl13_home}/schemas
for i in $(ls);  do
     xmllint --format $i > temp
     mv temp $i
done
cd -

cp -r ${bl13_home}/mappings/* ${txt2xml_repo}/plugins/org.miliconvert.adatp3/mappings/bl13/
cp -r ${bl13_home}/schemas/*  ${xsmt_repo}/plugins/org.miliconvert.xsmt.engine.tests/test-data/bl13
cp -r ${bl13_home}/samples/*  ${txt2xml_repo}/plugins/org.miliconvert.adatp3.tests/data/bl13
