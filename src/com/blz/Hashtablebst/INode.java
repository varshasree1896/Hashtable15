package com.blz.Hashtablebst;

public class INode {
    int data;
    INode left;
    INode right;

    public INode(int data){
        //Assign data to the new node, set left and right children to null
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
