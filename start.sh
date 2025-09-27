
source "$SDKMAN_DIR/bin/sdkman-init.sh"
sdk use java 17.0.12-oracle
sdk use gradle 8.10.2

BUILD_FOLDER="build/install/jackson-library/bin"

if [[ -d $BUILD_FOLDER ]]
then
  cd $BUILD_FOLDER || exit
  bash stop
  cd ../../../../ || exit
  gradle clean iA
  source setenv.sh
  cd $BUILD_FOLDER || exit
  bash start
else
    gradle clean iA
    source setenv.sh
    cd $BUILD_FOLDER || exit
    bash start
fi