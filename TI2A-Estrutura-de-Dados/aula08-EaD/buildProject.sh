echo "Starting build"
pushd ./srcPilha
./buildPilha.sh
pushd ./build
./buildJar.sh
popd
popd
pushd ./srcPolishNotation
./build.sh
echo "Project build Success"