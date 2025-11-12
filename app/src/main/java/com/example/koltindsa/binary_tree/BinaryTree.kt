package com.example.koltindsa.binary_tree

class BinaryTree(private val treeValues: List<Int?>) {
    private var root: TreeNode? = null

    init {
        buildBT()
    }

    fun getRoot(): TreeNode? {
        return root;
    }


    fun buildBT() {
        if (treeValues.isEmpty() || treeValues[0] == null) {
            root = null
            return
        }

        root = TreeNode(treeValues[0]!!)
        val queue: ArrayDeque<TreeNode> = ArrayDeque()
        queue.addLast(root!!)

        var i = 1
        while (i < treeValues.size && queue.isNotEmpty()) {
            val current = queue.removeFirst()

            // Left child
            if (i < treeValues.size && treeValues[i] != null) {
                val leftChild = TreeNode(treeValues[i]!!)
                current.leftNode = leftChild
                queue.addLast(leftChild)
            }
            i++

            // Right child
            if (i < treeValues.size && treeValues[i] != null) {
                val rightChild = TreeNode(treeValues[i]!!)
                current.rightNode = rightChild
                queue.addLast(rightChild)
            }
            i++
        }
    }


    fun inorderTraversal(node: TreeNode?) {
        if (node == null) return
        inorderTraversal(node.leftNode)
        print("${node.value} ")
        inorderTraversal(node.rightNode)
    }
}