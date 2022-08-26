class BST {
  
    class Node {
        int val;
        Node left, right;
  
        public Node(int item)
        {
            val = item;
            left = right = null;
        }
    }

    Node root;
   
    BST() { root = null; }
  
    BST(int value) { root = new Node(value); }
  
    void insert(int key) { root = insertRec(root, key); }
  
    Node insertRec(Node root, int val)
    {
  
        if (root == null) {
            root = new Node(val);
            return root;
        }
  
        else if (val < root.val)
            root.left = insertRec(root.left, val);
        else if (val > root.val)
            root.right = insertRec(root.right, val);
  
        
        return root;
    }
  
    // void inorder() { inorderRec(root); }
  
    
    void inorder(Node root)
    {
        if (root != null) {
            inorder(root.left);
            System.out.println(root.val);
            inorder(root.right);
        }
    }

    void preorder(Node root)
    {
        if (root != null) {
            System.out.println(root.val);
            preorder(root.left);
            preorder(root.right);
        }
    }

    void postorder(Node root)
    {
        if (root != null) {


            postorder(root.left);
            postorder(root.right);
            System.out.println(root.val);
        }
    }
  
    
    public static void main(String[] args)
    {
        BST tree = new BST();
  
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);
  
        tree.inorder(tree.root);
        tree.preorder(tree.root);
        tree.postorder(tree.root);
    }
}