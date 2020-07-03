/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BinarySearchTreeAlgo;

/**
 *
 * @author user
 */
// Java program for different tree traversals 

/* Class containing left and right child of current 
node and key value*/
class Node1 
{
	int key; 
	Node1 left, right; 

	public Node1(int item) 
	{ 
		key = item; 
		left = right = null; 
	} 
} 

class PrintBST 
{ 
	// Root of Binary Tree 
	Node1 root; 

	PrintBST() 
	{ 
		root = null; 
	} 

	/* Given a binary tree, print its nodes according to the 
	"bottom-up" postorder traversal. */
	void printPostorder(Node1 node) 
	{ 
		if (node == null) 
			return; 

		// first recur on left subtree 
		printPostorder(node.left); 

		// then recur on right subtree 
		printPostorder(node.right); 

		// now deal with the node 
		System.out.print(node.key + " "); 
	} 

	/* Given a binary tree, print its nodes in inorder*/
	void printInorder(Node1 node) 
	{ 
		if (node == null) 
			return; 

		/* first recur on left child */
		printInorder(node.left); 

		/* then print the data of node */
		System.out.print(node.key + " "); 

		/* now recur on right child */
		printInorder(node.right); 
	} 

	/* Given a binary tree, print its nodes in preorder*/
	void printPreorder(Node1 node) 
	{ 
		if (node == null) 
			return; 

		/* first print data of node */
		System.out.print(node.key + " "); 

		/* then recur on left sutree */
		printPreorder(node.left); 

		/* now recur on right subtree */
		printPreorder(node.right); 
	} 

	// Wrappers over above recursive functions 
	void printPostorder() {	 printPostorder(root); } 
	void printInorder() {	 printInorder(root); } 
	void printPreorder() {	 printPreorder(root); } 

	// Driver method 
	public static void main(String[] args) 
	{ 
            
		PrintBST tree = new PrintBST(); 
		tree.root = new Node1(10); 
		tree.root.left = new Node1(5); 
		tree.root.right = new Node1(15);
                tree.root.right.left = new Node1(13); 
                tree.root.right.right = new Node1(18); 
		tree.root.left.left = new Node1(3); 
		tree.root.left.right = new Node1(7); 

		System.out.println("Preorder traversal of binary tree is "); 
		tree.printPreorder(); 

		System.out.println("\nInorder traversal of binary tree is "); 
		tree.printInorder(); 

		System.out.println("\nPostorder traversal of binary tree is "); 
		tree.printPostorder(); 
	} 
} 

