package com.example.koltindsa.binary_tree.questions

import com.example.koltindsa.binary_tree.TreeNode

fun isLeaf(tempRoot:TreeNode):Boolean{
    return tempRoot.leftNode== null && tempRoot.rightNode==null
}

fun leftSide(root:TreeNode){
    val leftNodes: MutableList<TreeNode> = mutableListOf()
    val queue: ArrayDeque<TreeNode> = ArrayDeque()

    leftNodes.add(root)
    queue.add(root)

    while(!queue.isEmpty()){
        val topElement = queue.removeFirst()

        if(isLeaf(topElement)){
            break;
        }
        else if(topElement.leftNode!=null){
            if(isLeaf(topElement.leftNode?:TreeNode(-1))){
                break
            }
            leftNodes.add(topElement.leftNode?: TreeNode(-1))
            queue.addLast(topElement.leftNode?:TreeNode(-1))
        }
        else if(topElement.rightNode!=null ){
            if(isLeaf(topElement.rightNode?:TreeNode(-1))){
                break
            }
            leftNodes.add(topElement.rightNode?: TreeNode(-1))
            queue.addLast(topElement.rightNode?:TreeNode(-1))
        }
    }

    for (x in leftNodes) {
        print("${x.value} ")
    }
}
fun binaryTreeBoundary(root: TreeNode?) {
    if (root == null) return


    leftSide(root)
}