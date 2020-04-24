echo "creating jar file"
javac DoublyLinkedList.java Node.java 
jar cf Linked.jar DoublyLinkedList.class Node.class
echo "created jar file succesfully"

echo "creating build file"
javac -cp Linked.jar Main.java 
echo "build complete"