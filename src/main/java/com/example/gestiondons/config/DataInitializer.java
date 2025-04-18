package com.example.gestiondons.config;

import com.example.gestiondons.model.Campagne;
import com.example.gestiondons.model.Donation;
import com.example.gestiondons.repository.CampagneRepository;
import com.example.gestiondons.repository.DonationRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Configuration
public class DataInitializer {

    @Bean
    public CommandLineRunner initDatabase(CampagneRepository campagneRepository, DonationRepository donationRepository) {
        return args -> {
            // Vérifier si des données existent déjà
            if (campagneRepository.count() == 0) {
                // Créer des campagnes
                Campagne campagne1 = new Campagne();
                campagne1.setNom("Campagne Test 1");
                campagne1.setObjectifMontant(new BigDecimal("10000.00"));
                campagne1.setDateDebut(LocalDate.of(2023, 1, 1));
                campagne1.setDateFin(LocalDate.of(2026, 12, 31));
                campagneRepository.save(campagne1);

                Campagne campagne2 = new Campagne();
                campagne2.setNom("Campagne Test 2");
                campagne2.setObjectifMontant(new BigDecimal("5000.00"));
                campagne2.setDateDebut(LocalDate.of(2023, 6, 1));
                campagne2.setDateFin(LocalDate.of(2023, 12, 31));
                campagneRepository.save(campagne2);

                // Créer des dons
                Donation donation1 = new Donation();
                donation1.setCampagne(campagne1);
                donation1.setNomDonateur("Donateur 1");
                donation1.setMontant(new BigDecimal("100.00"));
                donation1.setDate(LocalDateTime.of(2023, 1, 15, 10, 30));
                donationRepository.save(donation1);

                Donation donation2 = new Donation();
                donation2.setCampagne(campagne1);
                donation2.setNomDonateur("Donateur 2");
                donation2.setMontant(new BigDecimal("200.00"));
                donation2.setDate(LocalDateTime.of(2023, 2, 20, 14, 45));
                donationRepository.save(donation2);

                System.out.println("Base de données initialisée avec des données de test.");
            } else {
                System.out.println("La base de données contient déjà des données.");
            }
        };
    }
} 