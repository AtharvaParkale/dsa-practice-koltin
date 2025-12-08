package com.example.koltindsa

import com.example.koltindsa.binary_tree.BinaryTree
import com.example.koltindsa.binary_tree.questions.checkChildrenSum
import com.example.koltindsa.binary_tree.questions.getCeilOfBT
import com.example.koltindsa.binary_tree.questions.getFloorOfBT
import com.example.koltindsa.binary_tree.questions.testCases

fun main() {
//    val binaryTree = BinaryTree(listOf(5, null, 9, null, null, null, 12))
//
//    var temp: MutableList<Int> = mutableListOf();
//    temp.add(-1)
//    getFloorOfBT(binaryTree.getRoot(), temp, 11)
//    println("Floor :: ${temp[0]}")
//
//    temp = mutableListOf()
//    temp.add(-1)
//    getCeilOfBT(binaryTree.getRoot(), temp, 15)
//    println("Ceil :: ${temp[0]}");

    runAllTests()
}

fun runAllTests() {
    for ((index, tc) in testCases.withIndex()) {
        val bt = BinaryTree(tc.tree)
        val root = bt.getRoot()

        val floorHolder = mutableListOf(-1)
        val ceilHolder = mutableListOf(-1)

        getFloorOfBT(root, floorHolder, tc.query)
        getCeilOfBT(root, ceilHolder, tc.query)

        val floorCorrect = floorHolder[0] == tc.expectedFloor
        val ceilCorrect = ceilHolder[0] == tc.expectedCeil

        val floorMark = if (floorCorrect) "✔" else "✘"
        val ceilMark = if (ceilCorrect) "✔" else "✘"

        println("TEST CASE ${index + 1}")
        println("Tree: ${tc.tree}")
        println("Query: ${tc.query}")

        println("Floor → Expected: ${tc.expectedFloor}, Actual: ${floorHolder[0]}  $floorMark")
        println("Ceil  → Expected: ${tc.expectedCeil},  Actual: ${ceilHolder[0]}  $ceilMark")

        println("------------------------------------------------------")
    }
}
