class  Tree<E> {
    Node<E> root;
     class Node<E>{
        Node<E> left;
        Node<E> right;
        E ele;
        Node(E ele )
        {
            this.ele=ele;
        }
    }
    public void preOrder(Node<E> root)
    {
        if(root ==null ) return;
        System.out.print(root.ele+ " ");
        preOrder(root.left);
        preOrder(root.right);
    }
     public void inOrder(Node<E> root) 
    {
        if(root ==null ) return;
        inOrder(root.left);
        System.out.print(root.ele+ " ");
        inOrder(root.right);
    }
     public void postOrder(Node<E> root)
    {
        if(root ==null ) return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.ele+ " ");
    }
}
public class TreeTraversal {
    public static void main(String[] args) {
        Tree<Character> tree= new Tree<Character>();
        tree.root=tree.new Node<Character>('A');
        tree.root.left=tree.new Node<Character>('B');
        tree.root.right=tree.new Node<Character>('C');
        tree.root.left.left=tree.new Node<Character>('D');
        tree.root.left.right=tree.new Node<Character>('E');
        tree.root.right.left=tree.new Node<Character>('F');
        tree.root.right.right=tree.new Node<Character>('G');
        tree.root.left.left.left=tree. new Node<Character>('H');
        tree.root.left.right.left=tree.new Node<Character>('I');


        // tree.root=tree.new Node<Character>('A');
        // tree.root.left=tree.new Node<Character>('B');
        // tree.root.right=tree.new Node<Character>('C');
        // tree.root.left.left=tree.new Node<Character>('D');
        // tree.root.left.right=tree.new Node<Character>('E');
        // tree.root.right.left=tree.new Node<Character>('F');
        // tree.root.right.right=tree.new Node<Character>('G');

        System.out.print(" preorder  : ");
        tree.preOrder(tree.root);
        System.out.print("\n===========================================\n postorder : ");
        tree.postOrder(tree.root);
        System.out.print("\n===============================================\n inorder : ");
        tree.inOrder(tree.root);
    }
}
