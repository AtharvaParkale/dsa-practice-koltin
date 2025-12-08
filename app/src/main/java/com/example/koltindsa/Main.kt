package com.example.koltindsa

import com.example.koltindsa.binary_tree.BinaryTree
import com.example.koltindsa.binary_tree.questions.checkChildrenSum
import com.example.koltindsa.binary_tree.questions.getCeilOfBT
import com.example.koltindsa.binary_tree.questions.getFloorOfBT

fun main() {
    val binaryTree = BinaryTree(listOf(8, 4, 12, 2, 6, 10, 14))

    var temp: MutableList<Int> = mutableListOf();
    temp.add(-1)
    getFloorOfBT(binaryTree.getRoot(), temp, 11)
    println("Floor :: ${temp[0]}")

    temp = mutableListOf()
    temp.add(-1)
    getCeilOfBT(binaryTree.getRoot(), temp, 15)
    println("Ceil :: ${temp[0]}");
}

data class TestCase(
    val input: List<Int?>, val expected: Boolean
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

        if (derived == test.expected) println("  ✅ PASSED")
        else println("  ❌ FAILED")

        println("------------------------------------")
    }
}