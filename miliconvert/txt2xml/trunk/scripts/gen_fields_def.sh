#!/bin/bash
# 
# regenerate csv for each field specification


fmt_docs=${HOME}/svn/miliconvert/format-docs/trunk

function map() {
    ./extractdef.sh -f $1 -n 7 -o $2 -bl $3
}

map ${fmt_docs}/fields/html/b11 ${fmt_docs}/fields/csv/b11 bl11
map ${fmt_docs}/fields/html/b12 ${fmt_docs}/fields/csv/b12 bl12
