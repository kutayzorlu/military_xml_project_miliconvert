#!/bin/bash
# Author: Thomas Cataldo <thomas.cataldo@aliasource.fr>
#
# Uses an headless eclipse to build ${product_name}
#
# 
# user build settings should be put in
# `whoami`.product_build.properties

pbuild_dir=`dirname $0`
pushd $pbuild_dir >/dev/null 2>&1

## USER VARS: The only user settable variables in this script
release_version=1.8.3
product_name=txt2xml
product_file=`pwd`/plugins/org.miliconvert.txt2xml.cli/txt2xml.cli.product
## END USER VARS

test $UID -eq 0 && {
    echo "WARNING: this script is not runnable under fakeroot."
}

source product_build.properties
test -f `whoami`.product_build.properties && { 
    echo "Loading ${pbuild_dir}/`whoami`.product_build.properties"
    source `whoami`.product_build.properties 
}

# files to use in the build
pde=org.eclipse.pde.build_${pdev}/scripts/productBuild/productBuild.xml
equi=org.eclipse.equinox.launcher_${equiv}.jar
product_build_file=${eclipse_home}/plugins/${pde}
equinox_launcher=${eclipse_home}/plugins/${equi}

test -f $equinox_launcher || {
    echo "$equinox_launcher not found."
    exit 1
}

test -f $product_build_file || {
    echo "$product_build_file not found"
    exit 1
}

echo "Found valid PDE & Equinox launcher."

echo -n "Setting up build dir & build conf..."
rm -fr build_conf_dir
rm -fr build_directory
mkdir build_conf_dir
mkdir build_directory

cp -r plugins/* build_directory
find build_directory -name "svn" -type d |xargs rm -fr
rm -fr build_directory/*/bin
rm -fr build_directory/*.tests

cat > build_conf_dir/build.properties <<EOF
product=${product_file}
runPackager=true
archivePrefix=${product_name}
collectingFolder=${product_name}
buildId=${product_name}-svn
buildLabel=svn_build
buildDirectory=`pwd`/build_directory
baseLocation=`pwd`/build_directory
pluginPath=$eclipse_home
baseos=linux
basews=gtk
basearch=x86
configs=linux, gtk, x86
skipBase=true
skipMaps=true
skipFetch=true
filteredDependencyCheck=false
resolution.devMode=false
javacSource=1.6
javacTarget=1.6
EOF
echo "Done."

echo "Invoking PDE build..."
$JAVA_HOME/bin/java -cp ${equinox_launcher} org.eclipse.equinox.launcher.Main \
-application org.eclipse.ant.core.antRunner \
-buildfile $product_build_file \
-Dbuilder=`pwd`/build_conf_dir >build.log 2>&1
test -f build_directory/svn_build/${product_name}-svn-linux.gtk.x86.zip || {
    echo "FAILED: Cannot find `pwd`/build_directory/svn_build/${product_name}-svn-linux.gtk.x86.zip."
    exit 1
}
echo "Build finished."

cp build_directory/svn_build/${product_name}-svn-linux.gtk.x86.zip . && \
rm -fr build_conf_dir build_directory && \
echo "PDE built package is '${product_name}-svn-linux.gtk.x86.zip'"

echo -n "Adding launch scripts to archive..."
mkdir zip_update_dir
pushd zip_update_dir >/dev/null 2>&1
unzip ../${product_name}-svn-linux.gtk.x86.zip >/dev/null 2>&1
pushd ${product_name} >/dev/null 2>&1
cp ../../scripts/txt2xml.sh .
cp ../../scripts/xml2txt.sh .
cp ../../scripts/txt2xml.bat .
cp ../../scripts/xml2txt.bat .
cp ../../scripts/adatp3_tests.sh .
cp ../../scripts/os-otg_tests.sh .
popd >/dev/null 2>&1
tar cfj ../${product_name}-${release_version}.tar.bz2 ${product_name}
rm ../${product_name}-svn-linux.gtk.x86.zip
popd >/dev/null 2>&1
rm -fr zip_update_dir
echo "Done."

echo "Product is in '${product_name}-${release_version}.tar.bz2'"

echo "Build finished."

popd >/dev/null 2>&1
