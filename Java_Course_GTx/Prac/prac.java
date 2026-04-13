import java.util.ArrayList;
import java.util.List;

public class prac {

  public static void main(String[] args) {

    Node pracNode = new Node("some data");
    Node extNode = new Node("ext data");
    pracNode.left = extNode;

    System.out.println(pracNode.left.data);

  }
 }

class Node {
  String data;
  Node left;

  public Node(String data) {
    this.data = data;
  }
}

