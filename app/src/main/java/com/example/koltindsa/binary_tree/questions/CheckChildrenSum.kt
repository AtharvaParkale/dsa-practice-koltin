package com.example.koltindsa.binary_tree.questions

import com.example.koltindsa.binary_tree.TreeNode

fun isConditionValid(root: TreeNode?): Boolean {
    if (root == null) return true

    if (root.leftNode == null && root.rightNode == null) return true

    return (root.leftNode?.value ?: 0) + (root.rightNode?.value ?: 0) == root.value
}

fun checkChildrenSum(root: TreeNode?): Boolean {

    if (root == null) return true;

    val leftSide = checkChildrenSum(root.leftNode)
    val rightSide = checkChildrenSum(root.rightNode)

    return leftSide && rightSide && isConditionValid(root);
}