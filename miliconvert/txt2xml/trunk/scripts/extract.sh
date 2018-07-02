#!/bin/bash

$JAVA_HOME/bin/java \
-cp ./plugins/org.eclipse.equinox.launcher_1.0.*.jar \
org.eclipse.equinox.launcher.Main -application \
org.miliconvert.adatp3.tools.extractapp $@

