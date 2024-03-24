package DS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class DSMain {
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree(15);
        binaryTree.addLeft(binaryTree.root, 12);
        binaryTree.addRight(binaryTree.root, 16);
        binaryTree.addLeft(binaryTree.root.left, 11);
        binaryTree.addRight(binaryTree.root.left, 13);
        binaryTree.addLeft(binaryTree.root.right, 14);
        binaryTree.addRight(binaryTree.root.right, 18);
//        binaryTree.printTree(binaryTree.root);

//        Stack<BinaryTree.Node> stack = new Stack<>();
//        while (!stack.isEmpty()) {
//            System.out.println(stack.pop());
//        }
//        binaryTree.printTreeUsingStack(binaryTree.root, stack);


        Queue<BinaryTree.Node> queue = new LinkedList<>();
//        binaryTree.printTreeUsingQueue(binaryTree.root, queue);
//        for (int i = 0; i < queue.size(); i++) {
//            queue.poll();
//        }

        queue.add(binaryTree.root);
//        binaryTree.printBfs(queue);
        binaryTree.printBfsAverage(queue);
    }
}
