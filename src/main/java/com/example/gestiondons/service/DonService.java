package com.example.gestiondons.service;

import com.example.gestiondons.dto.DonDTO;
import com.example.gestiondons.model.Campagne;
import com.example.gestiondons.model.Donation;
import com.example.gestiondons.repository.CampagneRepository;
import com.example.gestiondons.repository.DonationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class DonService {
    private final DonationRepository donationRepository;
    private final CampagneRepository campagneRepository;

    @Transactional
    public DonDTO enregistrerDon(Long campagneId, DonDTO donDTO) {
        Campagne campagne = campagneRepository.findById(campagneId)
                .orElseThrow(() -> new RuntimeException("Campagne non trouvée"));

        Donation donation = new Donation();
        donation.setCampagne(campagne);
        donation.setNomDonateur(donDTO.getNomDonateur());
        donation.setMontant(donDTO.getMontant());
        donation.setDate(donDTO.getDate());

        Donation savedDonation = donationRepository.save(donation);
        return convertToDTO(savedDonation);
    }

    private DonDTO convertToDTO(Donation donation) {
        DonDTO dto = new DonDTO();
        dto.setId(donation.getId());
        dto.setNomCampagne(donation.getCampagne().getNom());
        dto.setNomDonateur(donation.getNomDonateur());
        dto.setMontant(donation.getMontant());
        dto.setDate(donation.getDate());
        return dto;
    }
} 