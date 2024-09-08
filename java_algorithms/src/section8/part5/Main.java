package section8.part5;

public class Main {

    public void DFS2(Node root) {



    }









    Node root;

    public void DFS(Node root) {
        if (root == null) return;
        else {
            // System.out.println("root = " + root); // 전위순회 출력: 1 2 4 5 3 6 7
            DFS(root.lt);
            // System.out.println("root = " + root); // 중위순회 출력: 4 2 5 1 6 3 7
            DFS(root.rt);
            // System.out.println("root = " + root); // 후위순회 출력: 4 5 2 6 7 3 1
        }
    }

    public static void main(String[] args) {

        Main tree = new Main();

        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        tree.root.rt.lt = new Node(6);
        tree.root.rt.rt = new Node(7);

        tree.DFS(tree.root);
    }

    static class Node {

        int data;
        Node lt;
        Node rt;

        public Node(int data) {
            this.data = data;
            lt = null;
            rt = null;
        }
    }

}