-- Création de la table Campagne
CREATE TABLE IF NOT EXISTS campagne (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nom VARCHAR(255) NOT NULL,
    objectif_montant DECIMAL(19,2) NOT NULL,
    date_debut DATE NOT NULL,
    date_fin DATE NOT NULL
);

-- Création de la table Donation
CREATE TABLE IF NOT EXISTS donation (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    campagne_id BIGINT NOT NULL,
    nom_donateur VARCHAR(255) NOT NULL,
    montant DECIMAL(19,2) NOT NULL,
    date TIMESTAMP NOT NULL,
    FOREIGN KEY (campagne_id) REFERENCES campagne(id)
); 