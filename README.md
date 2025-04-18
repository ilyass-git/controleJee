# Service de Gestion de Campagnes de Dons

Ce projet est un mini-service de gestion de campagnes de dons développé avec Spring Boot.

## Technologies utilisées

- Java 17
- Spring Boot 3.2.3
- Spring Data JPA
- Base de données H2 (en mémoire)
- Swagger UI pour la documentation API
- Maven pour la gestion des dépendances

## Fonctionnalités implémentées

### Modélisation
- ✅ Entité Campagne avec les champs requis
- ✅ Entité Donation avec les champs requis
- ✅ Relation ManyToOne entre Donation et Campagne

### Repositories
- ✅ CampagneRepository avec méthode pour trouver les campagnes actives
- ✅ DonationRepository pour la gestion des dons

### DTOs et Projections
- ✅ DonDTO pour la transformation des données
- ✅ CampagneResume comme projection pour les campagnes actives

### Services
- ✅ ServiceCampagne pour récupérer les campagnes actives
- ✅ ServiceDon pour enregistrer un don et transformer les entités

### API REST
- ✅ GET /api/campagnes/actives pour lister les campagnes actives
- ✅ POST /api/campagnes/{id}/dons pour enregistrer un don

### Validation et Gestion des erreurs
- ✅ Validation des champs avec @Valid
- ✅ Messages d'erreur personnalisés

### Documentation
- ✅ Documentation Swagger UI intégrée

## Points d'accès

- API Documentation: http://localhost:8080/swagger-ui.html
- Console H2: http://localhost:8080/h2-console

## Structure du projet

```
src/main/java/com/example/gestiondons/
├── GestionDonsApplication.java
├── controller/
│   └── CampagneController.java
├── dto/
│   └── DonDTO.java
├── model/
│   ├── Campagne.java
│   └── Donation.java
├── projection/
│   └── CampagneResume.java
├── repository/
│   ├── CampagneRepository.java
│   └── DonationRepository.java
└── service/
    ├── CampagneService.java
    └── DonService.java
```

## Comment démarrer

1. Cloner le projet
2. Exécuter `mvn clean install`
3. Lancer l'application avec `mvn spring-boot:run`
4. Accéder à l'API via http://localhost:8080/swagger-ui.html 