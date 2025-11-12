package com.example.koltindsa.binary_tree.questions

import com.example.koltindsa.binary_tree.TreeNode


fun helperRootToLeafPath(root: TreeNode?): MutableList<MutableList<Int>> {
    if (root == null) {
        return mutableListOf()
    }

    var leftList = helperRootToLeafPath(root.leftNode)
    var rightList = helperRootToLeafPath(root.rightNode)

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

fun rootToLeafNode(root: TreeNode?): List<List<Int>> {
    if (root == null) listOf<MutableList<Int>>()

    var ans: MutableList<MutableList<Int>> = helperRootToLeafPath(root)

    println(ans)
    return ans;
}