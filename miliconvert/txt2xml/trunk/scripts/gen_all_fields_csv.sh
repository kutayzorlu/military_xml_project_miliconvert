#!/bin/bash
# 
# regenerate csv for each set specification


fmt_docs=${HOME}/svn/miliconvert/format-docs/trunk

function map() {
    ./extract.sh -f $1 -n 3 -o $2 -bl $3
}

map ${fmt_docs}/sets/html/b11 ${fmt_docs}/sets/csv/b11 bl11
map ${fmt_docs}/sets/html/b12 ${fmt_docs}/sets/csv/b12 bl12
