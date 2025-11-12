package com.example.koltindsa

import com.example.koltindsa.binary_tree.BinaryTree
import com.example.koltindsa.binary_tree.questions.binaryTreeBoundary

fun main() {
    val binaryTree = BinaryTree(listOf(10, 5, 3, 7, 8, 18, 25, 20))

    binaryTree.inorderTraversal(binaryTree.getRoot())
    println()
    binaryTreeBoundary(binaryTree.getRoot())
}