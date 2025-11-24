package com.example.koltindsa

import com.example.koltindsa.binary_tree.BinaryTree
import com.example.koltindsa.binary_tree.questions.binaryTreeBoundary
import com.example.koltindsa.binary_tree.questions.checkChildrenSum

fun main() {
    val binaryTree = BinaryTree(listOf(10,4,6,1,3,2,4))
    val ans: Boolean =checkChildrenSum(binaryTree.getRoot())
    println("Ans :: $ans");
}