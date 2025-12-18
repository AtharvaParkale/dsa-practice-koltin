package com.example.koltindsa

import com.example.koltindsa.arrays.ArrayBaseClass
import com.example.koltindsa.arrays.questions.TwoSumProblem


fun main() {
//    val question: ArrayBaseClass<List<Int>, Int> = TwoSumProblem()
//    question.solve(listOf(1, 2, 3, 4, 5))


    val list = listOf(3,4,1,1,9,8,7)

    val demo:List<Int> = list.sorted()

    val x = 'B' - 'A' + 1
    print(x)

    val test : Array<Int> = Array(5){0}


}


// Binary tree template code
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
