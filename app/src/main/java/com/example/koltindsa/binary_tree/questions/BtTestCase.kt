package com.example.koltindsa.binary_tree.questions

data class BTTestCase(
    val tree: List<Int?>,
    val query: Int,
    val expectedFloor: Int,
    val expectedCeil: Int
)