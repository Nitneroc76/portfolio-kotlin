# Stage 1: Build avec Maven et Kotlin
FROM maven:3.9-eclipse-temurin-17 AS build
WORKDIR /app

# Copier les fichiers de configuration
COPY pom.xml .
COPY src ./src

# Construire l'application
RUN mvn clean package -DskipTests

# Stage 2: Runtime avec JRE
FROM eclipse-temurin:17-jre-alpine
WORKDIR /app

# Copier le JAR depuis le stage de build
COPY --from=build /app/target/*.jar app.jar

# Exposer le port
EXPOSE 8080

# Variables d'environnement
ENV PORT=8080

# Point d'entrée
ENTRYPOINT ["java", "-jar", "app.jar"]