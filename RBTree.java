class RBTree{
    public Node root;
    public RBTree(){
        root = null;
    }

    class Node{

        int val;
        Node left;
        Node right;
        Node parent;
        char color;

        Node(int val){
            this.val = val;
            this.left = null;
            this.right = null;
            this.parent = null;
            this.color = 'R';
        }
    }
    Node leftRot(Node root){
        
        Node a = root.right;
        Node b = a.left;
        
        a.left=root;
        root.right = b;
        
        root.parent=a;
        if(b!=null)
            b.parent=root;
        return a;
    }

    Node rightRot(Node root){
        Node a = root.left;
        Node b = a.right;
        
        a.right=root;
        root.left = b;
        
        root.parent=a;
        if(b!=null)
            b.parent=root;
        return a;
    }


    void insert(int data){
        
        if(root==null){
            root = new Node(data);
            root.color= 'B';
            root.parent=null;
            return;
        }
        else{
            Node y = null;
            Node x = root;

            if(data>root.val)
                x=x.right;
            else
                x=x.left;

            

                      
        }
    }


    public static void main(String[] args) {
        
        RBTree myTree = new RBTree() ;

        
        int[] arr = {1,4,6,3,5,7,8,2,9};

        for(int i=0; i<arr.length; i++){
            myTree.insert(arr[i]);
        }

    }
}