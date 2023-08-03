package com.mab.data_structures.tree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

class BinaryTreeTest {

    private BinaryTree tree;

    @BeforeEach
    void setUp() {
        tree = new BinaryTree();
    }

    @Test
    void shouldAddNodesToTreeAndVerifyTheyExist() {
        //when
        tree.add(9);
        tree.add(8);
        tree.add(6);
        tree.add(1);
        tree.add(10);
        tree.add(24);
        tree.add(8);
        tree.add(4);

        //then
        assertThat(tree.containsNode(9)).isTrue();
        assertThat(tree.containsNode(8)).isTrue();
    }

}
