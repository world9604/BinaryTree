public class Main {
    public static void main(String[] args) {
        int num = 15;
        Node[] nodes = new Node[num + 1];
        for (int i = 0; i < num; i++) {
            nodes[i] = new Node(i, null, null);
        }
        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0)
                nodes[i / 2].leftChild = nodes[i];
            else
                nodes[i / 2].rightChild = nodes[i];
        }
        BinaryTreeExplorer explorer = new BinaryTreeExplorer();
        explorer.postOrder(nodes[1]);
    }
}

class Node {
    int data;
    Node leftChild;
    Node rightChild;
    public Node(int data, Node leftChild, Node rightChild) {
        this.data = data;
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }
}

class BinaryTreeExplorer {
    // 전위 순회를 구현 합니다.
    void preOrder(Node node) {
        if (node != null) {
            System.out.printf("%d ", node.data);
            preOrder(node.leftChild);
            preOrder(node.rightChild);
        }
    }

    // 중위 순회를 구현 합니다.
    void inOrder(Node node) {
        if (node != null) {
            inOrder(node.leftChild);
            System.out.printf("%d ", node.data);
            inOrder(node.rightChild);
        }
    }

    // 후위 순회를 구현 합니다.
    void postOrder(Node node) {
        if (node != null) {
            postOrder(node.leftChild);
            postOrder(node.rightChild);
            System.out.printf("%d ", node.data);
        }
    }
}