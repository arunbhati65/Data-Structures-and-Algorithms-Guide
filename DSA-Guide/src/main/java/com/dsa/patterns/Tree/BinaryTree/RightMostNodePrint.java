package com.dsa.patterns.Tree.BinaryTree;


//Q:- Given a binary tree, write a program to print the rightmost node at each level of the tree.
// If multiple nodes exist at the same level, print the rightmost one.

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
class TNode{
    int data;
    TNode left;
    TNode right;
}

class RightMostNodePrint {
    static TNode getRightMostNode(TNode root) {
        if(root==null){
            throw new IllegalArgumentException("Pass a valid Tree");
        }
        return dfs(root);
    }

    private static TNode dfs(TNode node) {
        if(node==null) return null;
        TNode left=dfs(node.left);
        System.out.println("");
        TNode right=dfs(node.right);
        return null;
    }


    public static void main(String args[]){

    }
}