version=1.0.3

rm -fr tmp && mkdir -p tmp

cp -r specs user_manual testing install_guide tmp

pushd tmp
find . -name ".svn" -type d |xargs rm -fr
tar cfz ../xsmt-docs-${version}.tar.gz *
popd

rm -fr tmp

