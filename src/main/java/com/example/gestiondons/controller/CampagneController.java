package com.example.gestiondons.controller;

import com.example.gestiondons.dto.DonDTO;
import com.example.gestiondons.projection.CampagneResume;
import com.example.gestiondons.service.CampagneService;
import com.example.gestiondons.service.DonService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
@Tag(name = "API Campagnes", description = "API de gestion des campagnes de dons")
public class CampagneController {
    private final CampagneService campagneService;
    private final DonService donService;

    @GetMapping("/campagnes/actives")
    @Operation(summary = "Récupérer les campagnes actives")
    public ResponseEntity<List<CampagneResume>> getCampagnesActives() {
        return ResponseEntity.ok(campagneService.getCampagnesActives());
    }

    @PostMapping("/campagnes/{id}/dons")
    @Operation(summary = "Enregistrer un don pour une campagne")
    public ResponseEntity<DonDTO> enregistrerDon(
            @PathVariable Long id,
            @Valid @RequestBody DonDTO donDTO) {
        return ResponseEntity.ok(donService.enregistrerDon(id, donDTO));
    }
} 