package com.portfolio.controller

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.servlet.mvc.support.RedirectAttributes

@Controller
class PortfolioController {
    
    @GetMapping("/")
    fun home(model: Model): String {
        return "index"
    }
    
    @PostMapping("/contact")
    fun submitContact(
        @RequestParam name: String,
        @RequestParam email: String,
        @RequestParam subject: String,
        @RequestParam message: String,
        redirectAttributes: RedirectAttributes
    ): String {
        // Ici, vous pouvez ajouter la logique pour envoyer un email
        // Par exemple avec JavaMailSender ou un service d'email
        
        // Pour l'instant, on simule l'envoi réussi
        println("=== NOUVEAU MESSAGE DE CONTACT ===")
        println("De: $name ($email)")
        println("Sujet: $subject")
        println("Message: $message")
        println("===================================")
        
        // Ajouter un message de succès
        redirectAttributes.addFlashAttribute(
            "successMessage", 
            "✅ Votre message a été envoyé avec succès ! Je vous répondrai dans les plus brefs délais."
        )
        
        // Rediriger vers la section contact
        return "redirect:/#contact"
    }
    
    @GetMapping("/health")
    fun health() = "OK - Portfolio Kotlin/Spring Boot"
}