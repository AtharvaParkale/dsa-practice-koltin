package com.example.koltindsa

import com.example.koltindsa.binary_tree.BinaryTree
import com.example.koltindsa.binary_tree.questions.binaryTreeBoundary
import com.example.koltindsa.binary_tree.questions.checkChildrenSum

fun main() {
//    val binaryTree = BinaryTree(listOf(10, 8, 2, 3, 5, null, null))
//    val ans: Boolean =checkChildrenSum(binaryTree.getRoot())
//    println("Ans :: $ans");
    runAllTests()
}

data class TestCase(
    val input: List<Int?>,
    val expected: Boolean
)

fun runAllTests() {
    val testCases = listOf(
        TestCase(listOf(10, 8, 2, 3, 5, null, null), true),
        TestCase(listOf(10, 8, 3, 2, 2, null, null), false),
        TestCase(listOf(5), true),
        TestCase(listOf(5, 5, null, 5, null), true),
        TestCase(listOf(15, 10, 5, 2, 8), false),
        TestCase(listOf(8, 4, 4, 2, 2, 2, 2), true),
        TestCase(listOf(7, null, 7, null, null, 3, 4), false),
        TestCase(listOf(20, 8, 12, 3, 5, 7, 5), false),
        TestCase(listOf(5, 2, 3), true),
        TestCase(emptyList(), true)
    )

    for ((index, test) in testCases.withIndex()) {
        val tree = BinaryTree(test.input)
        val derived = checkChildrenSum(tree.getRoot())

        println("Test ${index + 1}: Input = ${test.input}")
        println("  Expected = ${test.expected}")
        println("  Derived  = $derived")

        if (derived == test.expected)
            println("  ✅ PASSED")
        else
            println("  ❌ FAILED")

        println("------------------------------------")
    }
}