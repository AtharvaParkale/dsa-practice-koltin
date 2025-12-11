package com.example.koltindsa.arrays.questions

import com.example.koltindsa.arrays.ArrayBaseClass

class TwoSumProblem : ArrayBaseClass<List<Int>, Int> {
    override fun solve(input: List<Int>): Int {
        val arrList: MutableList<Int> = mutableListOf()
        println("Enter the size of the arrays :")
        val inputSize = readlnOrNull();

        for (i in 0 until (inputSize?.toInt() ?: 0)) {
            println("Enter the ${i}th element : ")
            val elem = readlnOrNull();

            arrList.add(elem?.toInt() ?: 0)
        }

        println(arrList)

        return 0;
    }
}