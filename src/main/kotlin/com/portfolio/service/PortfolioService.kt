package com.portfolio.service

import com.portfolio.model.*
import org.springframework.stereotype.Service

@Service
class PortfolioService {
    
    fun getProjects(): List<Project> = listOf(
        Project(
            id = 1,
            title = "Portfolio Kotlin",
            description = "Site web portfolio développé avec Kotlin, Spring Boot et déployé sur Render avec Docker",
            technologies = listOf("Kotlin", "Spring Boot", "Docker", "Thymeleaf", "CSS"),
            githubUrl = "https://github.com/votre-username/portfolio-kotlin",
            liveUrl = "https://portfolio-kotlin.onrender.com"
        ),
        Project(
            id = 2,
            title = "API REST Kotlin",
            description = "API RESTful pour gérer des tâches avec authentification JWT",
            technologies = listOf("Kotlin", "Spring Security", "PostgreSQL", "JWT"),
            githubUrl = "https://github.com/votre-username/api-kotlin"
        ),
        Project(
            id = 3,
            title = "Application Mobile Android",
            description = "Application de suivi d'habitudes développée en Kotlin natif",
            technologies = listOf("Kotlin", "Android", "Room", "Coroutines"),
            githubUrl = "https://github.com/votre-username/habit-tracker"
        )
    )
    
    fun getSkills(): Map<SkillCategory, List<Skill>> {
        val allSkills = listOf(
            Skill("Kotlin", SkillLevel.AVANCE, SkillCategory.LANGAGE),
            Skill("Java", SkillLevel.INTERMEDIAIRE, SkillCategory.LANGAGE),
            Skill("Python", SkillLevel.INTERMEDIAIRE, SkillCategory.LANGAGE),
            Skill("JavaScript", SkillLevel.INTERMEDIAIRE, SkillCategory.LANGAGE),
            
            Skill("Spring Boot", SkillLevel.AVANCE, SkillCategory.FRAMEWORK),
            Skill("Android SDK", SkillLevel.INTERMEDIAIRE, SkillCategory.FRAMEWORK),
            
            Skill("Docker", SkillLevel.INTERMEDIAIRE, SkillCategory.OUTIL),
            Skill("Git", SkillLevel.AVANCE, SkillCategory.OUTIL),
            Skill("Maven", SkillLevel.AVANCE, SkillCategory.OUTIL),
            
            Skill("PostgreSQL", SkillLevel.INTERMEDIAIRE, SkillCategory.BASE_DE_DONNEES),
            Skill("MongoDB", SkillLevel.DEBUTANT, SkillCategory.BASE_DE_DONNEES)
        )
        
        return allSkills.groupBy { it.category }
    }
    
    fun getAboutInfo() = mapOf(
        "name" to "Votre Nom",
        "title" to "Développeur Kotlin / Spring Boot",
        "description" to """
            Passionné par le développement logiciel, je me spécialise dans la création 
            d'applications robustes et performantes avec Kotlin et l'écosystème Spring. 
            J'aime découvrir de nouvelles technologies et résoudre des problèmes complexes.
        """.trimIndent(),
        "email" to "votre.email@example.com",
        "github" to "https://github.com/votre-username",
        "linkedin" to "https://linkedin.com/in/votre-profil"
    )
}