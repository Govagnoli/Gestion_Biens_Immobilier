CREATE TABLE S3_Immeuble(
   Adresse VARCHAR(50),
   ville VARCHAR(50),
   cp DECIMAL(5,0),
   Tantiemes DECIMAL(7,2),
   Besson_ancien CHAR(1) NOT NULL,
   Borloo_ancien CHAR(1) NOT NULL,
   Cosse CHAR(1) NOT NULL,
   PRIMARY KEY(Adresse, ville, cp)
);

CREATE TABLE S3_Locataire(
   Id_Locataire INT,
   Nom VARCHAR(50) NOT NULL,
   prenom VARCHAR(50) NOT NULL,
   tel DECIMAL(10,0) NOT NULL,
   email VARCHAR(70),
   date_naissance DATE NOT NULL,
   depot_garantie DECIMAL(7,2) NOT NULL,
   ancien_locataire CHAR(1) NOT NULL,
   part_possession DECIMAL(3,2) NOT NULL,
   PRIMARY KEY(Id_Locataire)
);

CREATE TABLE S3_Facture_electricite_bat(
   Id_Facture_electricite_bat INT,
   index_electricite DECIMAL(7,2) NOT NULL,
   montant DECIMAL(7,2) NOT NULL,
   date_emission DATE NOT NULL,
   date_paiement DATE,
   mode_paiement VARCHAR(50),
   num_Cheque DECIMAL(7,0),
   Document BFILE NOT NULL,
   Adresse VARCHAR(50),
   ville VARCHAR(50),
   cp DECIMAL(5,0),
   PRIMARY KEY(Id_Facture_electricite_bat),
   FOREIGN KEY(Adresse, ville, cp) REFERENCES S3_Immeuble(Adresse, ville, cp)
);

CREATE TABLE S3_Facture_eau_bat(
   Id_Facture_eau_bat INT,
   index_eau DECIMAL(7,0) NOT NULL,
   montant DECIMAL(6,2) NOT NULL,
   date_emission DATE,
   date_paiement DATE,
   mode_paiement VARCHAR(50),
   num_Cheque DECIMAL(7,0),
   document BFILE NOT NULL,
   Adresse VARCHAR(50),
   ville VARCHAR(50),
   cp DECIMAL(5,0),
   PRIMARY KEY(Id_Facture_eau_bat),
   FOREIGN KEY(Adresse, ville, cp) REFERENCES S3_Immeuble(Adresse, ville, cp)
);

CREATE TABLE S3_Facture_gaz_bat(
   Id_Facture_gaz_bat INT,
   index_gaz DECIMAL(7,0) NOT NULL,
   coefficient_conversion DECIMAL(4,2) NOT NULL,
   montant DECIMAL(7,2) NOT NULL,
   date_emission DATE NOT NULL,
   date_paiement DATE,
   mode_paiement VARCHAR(50),
   num_Cheque DECIMAL(7,0),
   Document BFILE NOT NULL,
   Adresse VARCHAR(50),
   ville VARCHAR(50),
   cp DECIMAL(5,0),
   PRIMARY KEY(Id_Facture_gaz_bat),
   FOREIGN KEY(Adresse, ville, cp) REFERENCES S3_Immeuble(Adresse, ville, cp)
);

CREATE TABLE S3_Garant(
   Id_Garant INT,
   nom VARCHAR(50),
   prenom VARCHAR(50),
   adresse VARCHAR(50),
   ville VARCHAR(50),
   cp DECIMAL(5,0) NOT NULL,
   tel DECIMAL(10,0) NOT NULL,
   email VARCHAR(50) NOT NULL,
   PRIMARY KEY(Id_Garant)
);

CREATE TABLE S3_Propriétaire(
   Nom VARCHAR(50),
   Prenom VARCHAR(50),
   Adresse VARCHAR(50) NOT NULL,
   Ville VARCHAR(50) NOT NULL,
   Cp VARCHAR(50) NOT NULL,
   email VARCHAR(50) NOT NULL,
   telephone DECIMAL(10,0) NOT NULL,
   PRIMARY KEY(Nom, Prenom)
);

CREATE TABLE S3_Associations(
   Siren DECIMAL(9,0),
   libelle VARCHAR(50) NOT NULL,
   date_donnations DATE NOT NULL,
   montant_donnation DECIMAL(7,2),
   Nom VARCHAR(50) NOT NULL,
   Prenom VARCHAR(50) NOT NULL,
   PRIMARY KEY(Siren),
   FOREIGN KEY(Nom, Prenom) REFERENCES S3_Propriétaire(Nom, Prenom)
);

CREATE TABLE S3_Quittance_loyer(
   Id_Locataire INT,
   Date_envoie DATE,
   Document BFILE NOT NULL,
   PRIMARY KEY(Id_Locataire, Date_envoie),
   FOREIGN KEY(Id_Locataire) REFERENCES S3_Locataire(Id_Locataire)
);

CREATE TABLE S3_aides_sociales(
   Libelle VARCHAR(50),
   PRIMARY KEY(Libelle)
);

CREATE TABLE S3_Facture_Charges(
   Id_Charges INT,
   Libelle VARCHAR(50) NOT NULL,
   montant DECIMAL(8,2) NOT NULL,
   date_emission DATE NOT NULL,
   date_paiement DATE NOT NULL,
   mode_paiement VARCHAR(50) NOT NULL,
   num_cheque DECIMAL(7,0),
   document BFILE NOT NULL,
   Adresse VARCHAR(50),
   ville VARCHAR(50),
   cp DECIMAL(5,0),
   PRIMARY KEY(Id_Charges),
   FOREIGN KEY(Adresse, ville, cp) REFERENCES S3_Immeuble(Adresse, ville, cp)
);

CREATE TABLE S3_Assurance(
   Id_Assurance INT,
   num_contrat VARCHAR(50) NOT NULL,
   Prime DECIMAL(7,2) NOT NULL,
   protection_juridique DECIMAL(7,2) NOT NULL,
   date_fin_de_validite DATE NOT NULL,
   date_debut_validite DATE NOT NULL,
   taux_augmentation DECIMAL(4,3) NOT NULL,
   Nom VARCHAR(50) NOT NULL,
   Prenom VARCHAR(50) NOT NULL,
   PRIMARY KEY(Id_Assurance),
   FOREIGN KEY(Nom, Prenom) REFERENCES S3_Propriétaire(Nom, Prenom)
);

CREATE TABLE S3_declaration_fiscale(
   Id_declaration_fiscale INT,
   Num_fiscale SMALLINT NOT NULL,
   date_mise_recouvrement DATE NOT NULL,
   frais_admin_et_gestion DECIMAL(6,2) NOT NULL,
   Autres_frais_gestions DECIMAL(6,2) NOT NULL,
   indemnite_eviction DECIMAL(7,2),
   Nom VARCHAR(50) NOT NULL,
   Prenom VARCHAR(50) NOT NULL,
   PRIMARY KEY(Id_declaration_fiscale),
   FOREIGN KEY(Nom, Prenom) REFERENCES S3_Propriétaire(Nom, Prenom)
);

CREATE TABLE S3_bien_immobilier(
   Adresse VARCHAR(50),
   ville VARCHAR(50),
   cp DECIMAL(5,0),
   numero INT,
   Garage CHAR(1) NOT NULL,
   superficie DECIMAL(6,2) NOT NULL,
   tantiemes DECIMAL(7,2),
   loyer DECIMAL(7,2) NOT NULL,
   date_acquisition DATE NOT NULL,
   nbr_locataires_max DECIMAL(1,0) NOT NULL,
   Id_Assurance INT NOT NULL,
   Nom VARCHAR(50) NOT NULL,
   Prenom VARCHAR(50) NOT NULL,
   PRIMARY KEY(Adresse, ville, cp, numero),
   FOREIGN KEY(Adresse, ville, cp) REFERENCES S3_Immeuble(Adresse, ville, cp),
   FOREIGN KEY(Id_Assurance) REFERENCES S3_Assurance(Id_Assurance),
   FOREIGN KEY(Nom, Prenom) REFERENCES S3_Propriétaire(Nom, Prenom)
);

CREATE TABLE S3_Location(
   Id_Location INT,
   taxe_fonciere VARCHAR(50),
   duree DECIMAL(2,0),
   date_debut_contrat DATE NOT NULL,
   document_bail BFILE NOT NULL,
   Adresse VARCHAR(50) NOT NULL,
   ville VARCHAR(50) NOT NULL,
   cp DECIMAL(5,0) NOT NULL,
   numero INT NOT NULL,
   PRIMARY KEY(Id_Location),
   FOREIGN KEY(Adresse, ville, cp, numero) REFERENCES S3_bien_immobilier(Adresse, ville, cp, numero)
);

CREATE TABLE S3_Travaux(
   Siret DECIMAL(14,0),
   Num_Facture VARCHAR(50),
   Date_T DATE NOT NULL,
   montant DECIMAL(7,2) NOT NULL,
   nature VARCHAR(100) NOT NULL,
   num_devis VARCHAR(50) NOT NULL,
   maitre_d_oeuvre VARCHAR(50) NOT NULL,
   date_emission DATE NOT NULL,
   date_paiement DATE,
   mode_paiement VARCHAR(50),
   num_Cheque DECIMAL(7,0),
   Document BFILE NOT NULL,
   Adresse VARCHAR(50),
   ville VARCHAR(50),
   cp DECIMAL(5,0),
   Adresse_1 VARCHAR(50),
   ville_1 VARCHAR(50),
   cp_1 DECIMAL(5,0),
   numero INT,
   PRIMARY KEY(Siret, Num_Facture),
   FOREIGN KEY(Adresse, ville, cp) REFERENCES S3_Immeuble(Adresse, ville, cp),
   FOREIGN KEY(Adresse_1, ville_1, cp_1, numero) REFERENCES S3_bien_immobilier(Adresse, ville, cp, numero)
);

CREATE TABLE S3_Diagnostic(
   Id_Diagnostic INT,
   libelle VARCHAR(50),
   Date_debut_validite DATE,
   document BFILE NOT NULL,
   Adresse VARCHAR(50) NOT NULL,
   ville VARCHAR(50) NOT NULL,
   cp DECIMAL(5,0) NOT NULL,
   numero INT NOT NULL,
   PRIMARY KEY(Id_Diagnostic),
   FOREIGN KEY(Adresse, ville, cp, numero) REFERENCES S3_bien_immobilier(Adresse, ville, cp, numero)
);

CREATE TABLE S3_Regularisation_des_charges(
   Id_Location INT,
   Id_Regularisation_des_charges INT,
   date_envoie DATE NOT NULL,
   Document BFILE NOT NULL,
   PRIMARY KEY(Id_Location, Id_Regularisation_des_charges),
   FOREIGN KEY(Id_Location) REFERENCES S3_Location(Id_Location)
);

CREATE TABLE S3_Facture_Agence_location(
   Siret VARCHAR(50),
   Num_facture VARCHAR(50),
   montant_honoraire DECIMAL(5,2) NOT NULL,
   date_honoraire DATE NOT NULL,
   date_emission VARCHAR(50) NOT NULL,
   date_paiement DATE,
   mode_paiement VARCHAR(50),
   num_Cheque DECIMAL(7,0),
   document BFILE NOT NULL,
   Id_Location INT NOT NULL,
   PRIMARY KEY(Siret, Num_facture),
   FOREIGN KEY(Id_Location) REFERENCES S3_Location(Id_Location)
);

CREATE TABLE S3_Anniversaire_location(
   Id_Location INT,
   date_Anniv DATE,
   indice_ICC DECIMAL(7,3) NOT NULL,
   Document BFILE NOT NULL,
   ancien_loyer DECIMAL(7,2) NOT NULL,
   PRIMARY KEY(Id_Location, date_Anniv),
   FOREIGN KEY(Id_Location) REFERENCES S3_Location(Id_Location)
);

CREATE TABLE S3_Solde_Tout_Compte(
   Id_Location INT,
   cout_degradation DECIMAL(6,2),
   Document BFILE NOT NULL,
   numero_Cheque DECIMAL(7,0),
   date_Solde_tout_compte DATE NOT NULL,
   PRIMARY KEY(Id_Location),
   FOREIGN KEY(Id_Location) REFERENCES S3_Location(Id_Location)
);

CREATE TABLE S3_louer(
   Id_Location INT,
   Id_Locataire INT,
   PRIMARY KEY(Id_Location, Id_Locataire),
   FOREIGN KEY(Id_Location) REFERENCES S3_Location(Id_Location),
   FOREIGN KEY(Id_Locataire) REFERENCES S3_Locataire(Id_Locataire)
);

CREATE TABLE S3_associer(
   Id_Locataire INT,
   Id_Garant INT,
   PRIMARY KEY(Id_Locataire, Id_Garant),
   FOREIGN KEY(Id_Locataire) REFERENCES S3_Locataire(Id_Locataire),
   FOREIGN KEY(Id_Garant) REFERENCES S3_Garant(Id_Garant)
);

CREATE TABLE S3_deduire(
   Id_Locataire INT,
   Date_envoie DATE,
   Libelle VARCHAR(50),
   montant_aide_sociale DECIMAL(8,2) NOT NULL,
   PRIMARY KEY(Id_Locataire, Date_envoie, Libelle),
   FOREIGN KEY(Id_Locataire, Date_envoie) REFERENCES S3_Quittance_loyer(Id_Locataire, Date_envoie),
   FOREIGN KEY(Libelle) REFERENCES S3_aides_sociales(Libelle)
);