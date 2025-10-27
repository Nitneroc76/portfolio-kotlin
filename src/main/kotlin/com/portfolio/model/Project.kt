package com.portfolio.model

data class Project(
    val id: Int,
    val title: String,
    val description: String,
    val technologies: List<String>,
    val githubUrl: String? = null,
    val liveUrl: String? = null,
    val imageUrl: String? = null
)