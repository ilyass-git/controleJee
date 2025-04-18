package com.example.gestiondons.repository;

import com.example.gestiondons.model.Campagne;
import com.example.gestiondons.projection.CampagneResume;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface CampagneRepository extends JpaRepository<Campagne, Long> {
    @Query("SELECT c.id as id, c.nom as nom, c.objectifMontant as objectifMontant FROM Campagne c WHERE c.dateDebut <= :today AND c.dateFin >= :today")
    List<CampagneResume> findActiveCampagnes(LocalDate today);
} 