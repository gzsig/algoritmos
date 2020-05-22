echo "Starting build"
pushd ./srcFifo
./buildFifo.sh
pushd ./build
./buildJar.sh
popd
popd
pushd ./srcAtivII
./build.sh
echo "Project build Success"