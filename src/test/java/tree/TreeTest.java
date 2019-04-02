package tree;

import org.junit.Test;

import static org.junit.Assert.*;

public class TreeTest {

    @Test
    public void treeTest() {

        Tree intTree = new Tree();
        intTree.insert(25);
        intTree.insert(20);
        intTree.insert(15);
        intTree.insert(27);
        intTree.insert(30);
        intTree.insert(29);
        intTree.insert(26);
        intTree.insert(22);
        intTree.insert(32);
        intTree.insert(17);

        intTree.traverseInOrder();
        assertEquals(intTree.get(27), new TreeNode(27));
        assertEquals(intTree.get(17), new TreeNode(17));
        assertNull(intTree.get(100));

        assertEquals(intTree.min(), 15);
        assertEquals(intTree.max(), 32);
    }
}