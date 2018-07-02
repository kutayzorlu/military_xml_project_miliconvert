#!/bin/bash

echo -n "dumping SQL schema..."
mdb-schema -S mapping.mdb mysql > dump.sql
echo "[OK]"

for i in `mdb-tables mapping.mdb`; do
    table_name=$i
    echo -n "dumping ${table_name}..."
    mdb-export -S -I mapping.mdb ${table_name} | sed -e 's/)$/)\;/' >> dump.sql
    echo "[OK]"
done
