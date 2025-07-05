package com.example.arhomegarden.model

data class Plant(
    val id: String,
    val name: String,
    val description: String,
    val sunlight: String,
    val waterNeeds: String,
    val modelFile: String // e.g., "fern.glb"
)

