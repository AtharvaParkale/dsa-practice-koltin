package com.example.koltindsa.binary_tree.questions

import com.example.koltindsa.binary_tree.TreeNode


fun getFloorOfBT(root: TreeNode?, temp: MutableList<Int>, key:Int) {
    if(root==null) return
    if(root.value<=key) {
        temp[0]=root.value
    }

    if(root.value<key){
        getFloorOfBT(root.rightNode,temp,key)
    }
    else{
        getFloorOfBT(root.leftNode,temp,key)
    }
    return
}

fun getCeilOfBT(root: TreeNode?, temp: MutableList<Int>, key:Int) {
    if(root==null) return
    if(root.value>=key) {
        temp[0] = root.value
    }

    if(key>root.value){
        getCeilOfBT(root.rightNode,temp,key)
    }
    else{
        getCeilOfBT(root.leftNode,temp,key)
    }

    return
}