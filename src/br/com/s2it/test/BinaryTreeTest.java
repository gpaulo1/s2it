package br.com.s2it.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.com.s2it.exercise9.BinaryTree;

public class BinaryTreeTest {

	@Test
	public void createBinaryTree() {
	    BinaryTree bt = new BinaryTree();
	 
	    bt.add(6);
	    bt.add(4);
	    bt.add(8);
	    bt.add(3);
	    bt.add(5);
	    bt.add(7);
	    bt.add(9);
	 
	    assertEquals(36, bt.sumNextNode(bt.root));
	}
	
}
