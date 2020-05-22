echo "removing .jar files"
find . -name \*.jar -type f -delete
echo "ok"
echo "removing .class files"
find . -name \*.class -type f -delete
echo "ok"
echo "Done."