#!/bin/sh

CP=org.miliconvert.xsmt.xalan/xalan.jar
for i in `ls -d org.miliconvert.xsmt.*/bin`; do
    CP=$CP:$i
done

java -classpath $CP org.apache.xalan.xslt.Process -in $1 -xsl $2

