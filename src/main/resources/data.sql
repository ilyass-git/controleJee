-- Insertion de données de test pour la table Campagne
INSERT INTO campagne (nom, objectif_montant, date_debut, date_fin)
VALUES ('Campagne Test 1', 10000.00, '2023-01-01', '2023-12-31');

INSERT INTO campagne (nom, objectif_montant, date_debut, date_fin)
VALUES ('Campagne Test 2', 5000.00, '2023-06-01', '2026-12-31');

-- Insertion de données de test pour la table Donation
INSERT INTO donation (campagne_id, nom_donateur, montant, date)
VALUES (1, 'Donateur 1', 100.00, '2023-01-15 10:30:00');

INSERT INTO donation (campagne_id, nom_donateur, montant, date)
VALUES (1, 'Donateur 2', 200.00, '2023-02-20 14:45:00'); 