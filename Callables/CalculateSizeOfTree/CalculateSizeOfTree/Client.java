package CalculateSizeOfTree;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
class Client{
    public static void main(String[ ] args){
        ExecutorService es = Executors.newCachedThreadPool();
          // Create nodes
        Node root = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Node node6 = new Node(6);
        Node node7 = new Node(7);

        // Link nodes to form the binary tree
        root.left = node2;
        root.right = node3;
        node2.left = node4;
        node2.right = node5;
        node3.left = node6;
        node3.right = node7;
        try {
          TreeSizeCalculator tsc = new TreeSizeCalculator(root, es);
          Future<Integer> size = es.submit(tsc);
          System.out.println(size.get());
     
        } catch (Exception e) {
          // TODO: handle exception
        }
      }
}