rm -fr tools-adatp3 && \
./adatp3_tools_build.sh && \
tar xfj tools-adatp3-1.9.0.tar.bz2 && cd tools-adatp3 && \
#./gen_fields_def.sh && \
#./gen_all_fields_csv.sh && \
./regen_all_mappings.sh && \
./gen_all_schemas.sh && \
cd ..
