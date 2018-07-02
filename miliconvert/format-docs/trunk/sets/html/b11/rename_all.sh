#!/bin/bash


function rename() {
    old=$1
    new=`echo ${old} | sed -e s/III-AGREED-//`
    new=`echo ${new} | sed -e s/.MTF//`
    new=`echo ${new} | tr A-Z a-z`
    export new
}

for i in *.HTM; do
    rename $i
    echo "$i -> $new"
    mv $i $new
done
