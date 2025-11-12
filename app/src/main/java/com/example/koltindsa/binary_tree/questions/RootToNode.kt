package com.example.koltindsa.binary_tree.questions

import com.example.koltindsa.binary_tree.TreeNode

fun helperRootToNode(root: TreeNode?): MutableList<MutableList<Int>> {
    if (root == null) {
        return mutableListOf()
    }

    var leftList = helperRootToNode(root.leftNode)
    var rightList = helperRootToNode(root.rightNode)

    val arr: MutableList<Int> = mutableListOf(root.value);

    val combinedList: MutableList<MutableList<Int>> = (leftList + rightList).toMutableList()

    if (combinedList.size == 0) {
        combinedList.add(0, arr)
    } else {
        for (x in combinedList) {
            x.add(0, root.value)
        }
    }

    return combinedList

}

fun rootToNode(root: TreeNode?): List<List<Int>> {
    if (root == null) listOf<MutableList<Int>>()
    var ans: MutableList<MutableList<Int>> = helperRootToNode(root)
    println(ans)
    return ans;
}