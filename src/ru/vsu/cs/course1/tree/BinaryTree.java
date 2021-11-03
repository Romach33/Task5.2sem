package ru.vsu.cs.course1.tree;

import java.awt.Color;
import java.util.Iterator;

public interface BinaryTree<T> extends Iterable<T> {

    interface TreeNode<T> extends Iterable<T> {

        T getValue();

        default TreeNode<T> getLeft() {
            return null;
        }

        default TreeNode<T> getRight() {
            return null;
        }

        default Color getColor() {
            return Color.BLACK;
        }

    }

    TreeNode<T> getRoot();

    void rebuildTree();

    @Override
    default Iterator<T> iterator() {
        return this.getRoot().iterator();
    }
    
}
