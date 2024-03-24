package DS;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.atomic.AtomicInteger;

public class BinaryTree {
    public class Node {
        int data;
        Node right;
        Node left;
        Node(int data) {
            this.data = data;
        }

        @Override
        public String toString() {
            return "data -> " + this.data;
        }
    }
    public Node root;
    public BinaryTree(int rootData) {
        root = new Node(rootData);
    }

    public void addLeft(Node node, int data) {
        node.left = new Node(data);
    }

    public void addRight(Node node, int data) {
        node.right = new Node(data);
    }

    public void printTreeUsingStack(Node node, Stack stack) {
        if (node == null) return;
        stack.push(node);
        printTreeUsingStack(node.left, stack);
        printTreeUsingStack(node.right, stack);
    }

    public void printTreeUsingQueue(Node node, Queue<Node> queue) {
        if (node == null) return;
        queue.add(node);

        printTreeUsingQueue(node.left, queue);
        printTreeUsingQueue(node.right, queue);
    }

    public void printBfs(Queue<Node> queue) {
        while (!queue.isEmpty()) {
            var queueNode = queue.poll();

            System.out.println(queueNode);
            if (queueNode.left != null)
                queue.offer(queueNode.left);
            if (queueNode.right != null)
                queue.offer(queueNode.right);
        }
    }

    private Integer getAverage(List<Node> list) {
        int sum = 0;
        for (Node node : list) {
            sum += node.data;
        }
        return sum/list.size();
    }

    public void printBfsAverage(Queue<Node> queue) {
        List<Integer> result = new ArrayList<>();
        while (!queue.isEmpty()) {
            List<Node> nodeList = new ArrayList<>();
            while (!queue.isEmpty()) {
                nodeList.add(queue.poll());
            }
            result.add(getAverage(nodeList));
            for (Node node : nodeList) {
                if (node.left != null)
                  queue.offer(node.left);
                if (node.right != null)
                  queue.offer(node.right);
            }
        }
        System.out.println(result);
    }

    public void printBfsAverage1(Queue<Node> queue) {
        List<Integer> result = new ArrayList<>();

        while (!queue.isEmpty()) {
            int sum = 0;
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Node node = queue.poll();
                sum += node.data;
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
            result.add(sum/size);
        }

        System.out.println(result);
    }


//            System.out.println(queueNode);
//            if (queueNode.left != null)
//                queue.offer(queueNode.left);
//            if (queueNode.right != null)
//                queue.offer(queueNode.right);
//        }

    public void printTree(Node node) {
        if(node == null) return;
        System.out.println(node);
        printTree(node.left);
        printTree(node.right);
    }
}
