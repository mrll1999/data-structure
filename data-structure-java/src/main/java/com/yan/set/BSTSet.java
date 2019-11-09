package com.yan.set;

import com.yan.tree.BST;

/**
 * @author Administrator
 * @since 1.0.0
 * 2019/10/30 0030 16:11
 */
public class BSTSet<E extends Comparable<E>> implements Set<E> {
    private BST<E> bst;

    public BSTSet() {
        bst = new BST<>();
    }

    @Override
    public void add(E e) {
        bst.add(e);
    }

    @Override
    public void remove(E e) {
        bst.remove(e);
    }

    @Override
    public int size() {
        return bst.size();
    }

    @Override
    public boolean contains(E e) {
        return bst.contains(e);
    }
}
