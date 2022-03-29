package com.blz.Hashtablebst;

public class BinarySearchTree {
    public INode root;
    public BinarySearchTree() {
        root = null;
    }
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        //Add nodes to the binary tree
        tree.insert(56);
        tree.insert(30);
        tree.insert(70);
        tree.insert(22);
        tree.insert(40);
        tree.insert(60);
        tree.insert(95);
        tree.insert(11);
        tree.insert(3);
        tree.insert(16);
        tree.insert(65);
        tree.insert(63);
        tree.insert(67);
        System.out.println("Binary search tree after insertion:");
        //Displays the binary tree
        tree.display(tree.root);
        System.out.println();
        tree.searchNode(tree.root, 63);

    }

    private static void searchNode(INode root, int data) {

        // start with the root node
        INode curr = root;

        // pointer to store the parent of the current node
        INode parent = null;

        // traverse the tree and search for the key
        while (curr != null && curr.data != data) {
            // update the parent to the current node
            parent = curr;

            // if the given key is less than the current node, go to the left subtree;
            // otherwise, go to the right subtree
            if (data < curr.data) {
                curr = curr.left;
            } else {
                curr = curr.right;
            }
        }

        // if the key is not present in the key
        if (curr == null) {
            System.out.println("Key not found");
            return;
        }

        if (parent == null) {
            System.out.println("The node with key " + data + " is root node");
        } else if (data < parent.data) {
            System.out.println("The given key " + data + " is the left node of the node with key " + parent.data);
        } else {
            System.out.println("The given key " + data + "is the right node of the node with key " + parent.data);
        }
    }

    private void insert(int data) {
        //Create a new node
        INode newNode = new INode(data);
        //Check whether tree is empty
        if (root == null) {
            root = newNode;
            return;
        } else {
            //current node point to root of the tree
            INode current = root, parent = null;
            while (true) {
                //parent keep track of the parent node of current node.
                parent = current;
                //If data is less than current's data, node will be inserted to the left of tree
                if (data < current.data) {
                    current = current.left;
                    if (current == null) {
                        parent.left = newNode;
                        return;
                    }
                }
                //If data is greater than current's data, node will be inserted to the right of tree
                else {
                    current = current.right;
                    if (current == null) {
                        parent.right = newNode;
                        return;
                    }
                }
            }
        }
    }
    private void display(INode root) {
        //Check whether tree is empty
        if (root == null) {
            System.out.println("Tree is empty");
            return;
        } else {
            if (root.left != null)
                display(root.left);
            System.out.print(root.data + " ");
            if (root.right != null)
                display(root.right);
        }
    }
}



