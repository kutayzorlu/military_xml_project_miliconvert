#!/bin/bash

appid=org.miliconvert.xsmt.cli.XSMT
curdir=`dirname $0`

echo -n "equinox shell lib loading..."
source ${curdir}/equinox.lib
echo "[OK]"

aliasource_equinox_run_appid ${curdir} ${appid} $@
