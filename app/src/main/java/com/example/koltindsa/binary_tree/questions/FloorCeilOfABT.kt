package com.example.koltindsa.binary_tree.questions

import com.example.koltindsa.binary_tree.BinaryTree
import com.example.koltindsa.binary_tree.TreeNode


fun getFloorOfBT(root: TreeNode?, temp: MutableList<Int>, key: Int) {
    if (root == null) return
    if (root.value <= key) {
        temp[0] = root.value
    }

    if (root.value < key) {
        getFloorOfBT(root.rightNode, temp, key)
    } else {
        getFloorOfBT(root.leftNode, temp, key)
    }
}

fun getCeilOfBT(root: TreeNode?, temp: MutableList<Int>, key: Int) {
    if (root == null) return
    if (root.value >= key) {
        temp[0] = root.value
    }

    if (key > root.value) {
        getCeilOfBT(root.rightNode, temp, key)
    } else {
        getCeilOfBT(root.leftNode, temp, key)
    }
}

val testCases = listOf(

    // 1. Perfect BST
    BTTestCase(
        tree = listOf(8, 4, 12, 2, 6, 10, 14),
        query = 11,
        expectedFloor = 10,
        expectedCeil = 12
    ),

    // 2. Left-skewed BST
    BTTestCase(
        tree = listOf(10, 5, null, 2, null, null, null),
        query = 3,
        expectedFloor = 2,
        expectedCeil = 5
    ),

    // 3. Right-skewed BST
    BTTestCase(
        tree = listOf(5, null, 9, null, null, null, 12),
        query = 11,
        expectedFloor = 9,
        expectedCeil = 12
    ),

    // 4. Single-node BST
    BTTestCase(
        tree = listOf(7),
        query = 10,
        expectedFloor = 7,
        expectedCeil = -1
    ),

    // 5. Balanced BST with missing nodes (still valid BST)
    BTTestCase(
        tree = listOf(15, 7, 20, null, 9, 18, null),
        query = 8,
        expectedFloor = 7,
        expectedCeil = 9
    ),

    // 6. Query smaller than smallest
    BTTestCase(
        tree = listOf(10, 5, 15, 3, 7, null, 20),
        query = 1,
        expectedFloor = -1,
        expectedCeil = 3
    ),

    // 7. Query greater than largest
    BTTestCase(
        tree = listOf(5, 2, 8, 1, null, null, 10),
        query = 20,
        expectedFloor = 10,
        expectedCeil = -1
    ),

    // 8. Valid BST with mid-value children
    BTTestCase(
        tree = listOf(30, 20, 40, null, 25, null, 50),
        query = 26,
        expectedFloor = 25,
        expectedCeil = 30
    ),

    // 9. Perfect balanced BST
    BTTestCase(
        tree = listOf(50, 30, 70, 20, 40, 60, 80),
        query = 65,
        expectedFloor = 60,
        expectedCeil = 70
    ),

    // 10. Zig-zag BST (still valid)
    BTTestCase(
        tree = listOf(10, 5, 15, null, 7, null, 18),
        query = 6,
        expectedFloor = 5,
        expectedCeil = 7
    )
)
