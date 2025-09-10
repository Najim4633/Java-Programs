class BinaryTree2<E>
{
    Node<E> root;
    class Node<E>
    {
        Node<E> left,right;
        E ele;
        public Node(E ele)
        {
            this.ele=ele;
        }
    }
    public void preOrder(Node<E> root)
    {
        if(root==null)return;
        System.out.println(root.ele);
        preOrder(root.left);
        preOrder(root.right);
    }
        public void inOrder(Node<E> root)
    {
        if(root==null)return;
        inOrder(root.left);
        System.out.println(root.ele);
        inOrder(root.right);
    }
        public void postOrder(Node<E> root)
    {
        if(root==null)return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.ele);
    }
}
public class TreeTraversal2 {
    public static void main(String[] args) {
        BinaryTree2<Character> tree2=new BinaryTree2();
        tree2.root=
    }
}
