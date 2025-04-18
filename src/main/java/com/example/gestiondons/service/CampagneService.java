package com.example.gestiondons.service;

import com.example.gestiondons.model.Campagne;
import com.example.gestiondons.projection.CampagneResume;
import com.example.gestiondons.repository.CampagneRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CampagneService {
    private final CampagneRepository campagneRepository;

    public List<CampagneResume> getCampagnesActives() {
        return campagneRepository.findActiveCampagnes(LocalDate.now());
    }
} 