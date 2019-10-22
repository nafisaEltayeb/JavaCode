class Node {
    private Node leftChild, rightChild;
    
    public Node(Node leftChild, Node rightChild) {
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }
    
    public Node getLeftChild() {
        return this.leftChild;
    }
    
    public Node getRightChild() {
        return this.rightChild;
    }

    public int height() {
    	if(leftChild == null && rightChild==null)
    		return 0;
    	int hLeftSub=0,hRightSub=0;
    	if(leftChild !=null) {
    		 hLeftSub = leftChild.height();
    	}
    	if(rightChild != null) {
    		 hRightSub =rightChild.height();
    	}
    	if(hLeftSub > hRightSub){
            return hLeftSub+1;
        }
        else{
            return hRightSub+1;
        }
	}

    

    public static void main(String[] args) {
        Node leaf1 = new Node(null, null);
        Node leaf2 = new Node(null, null);
        Node node = new Node(leaf1, null);
        Node root = new Node(node, leaf2);

        System.out.println(root.height());
    }
}
