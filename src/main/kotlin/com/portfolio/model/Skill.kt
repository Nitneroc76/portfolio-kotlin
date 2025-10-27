package com.portfolio.model

data class Skill(
    val name: String,
    val level: SkillLevel,
    val category: SkillCategory
)

enum class SkillLevel {
    DEBUTANT,
    INTERMEDIAIRE,
    AVANCE,
    EXPERT
}

enum class SkillCategory {
    LANGAGE,
    FRAMEWORK,
    OUTIL,
    BASE_DE_DONNEES
}