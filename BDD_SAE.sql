
    CREATE TABLE Immeuble (
    Adresse VARCHAR2(50),
    ville VARCHAR2(50),
    cp DECIMAL(5,0),
    Tantiemes DECIMAL(7,2),
    Besson_ancien CHAR(1) NOT NULL,
    Borloo_ancien CHAR(1) NOT NULL,
    Cosse CHAR(1) NOT NULL,
    PRIMARY KEY(Adresse, ville, cp)
    ); 

    CREATE TABLE Locataire(
   Id_Locataire INT,
   Nom VARCHAR2(50) NOT NULL,
   prénom VARCHAR2(50) NOT NULL,
   tel DECIMAL(10,0) NOT NULL,
   email VARCHAR2(70),
   date_naissance DATE NOT NULL,
   depot_garantie DECIMAL(7,2) NOT NULL,
   ancien_locataire CHAR(1) NOT NULL,
   part_possession DECIMAL(3,2) NOT NULL,
   PRIMARY KEY(Id_Locataire)
);   

    CREATE TABLE Facture_electricite_bat(
   Id_Facture_electricite_bat INT,
   INDEX_ELECTRICITE DECIMAL(7,2) NOT NULL,
   montant DECIMAL(7,2) NOT NULL,
   date_emission DATE NOT NULL,
   date_paiement DATE,
   mode_paiement VARCHAR2(50),
   num_Cheque DECIMAL(7,0),
   "Document" BFILE NOT NULL,
   Adresse VARCHAR2(50),
   ville VARCHAR2(50),
   cp DECIMAL(5,0),
   PRIMARY KEY(Id_Facture_electricite_bat),
   FOREIGN KEY(Adresse, ville, cp) REFERENCES Immeuble(Adresse, ville, cp)
);   

    CREATE TABLE Facture_eau_batiment(
   Id_Facture_eau_batiment INT,
   INDEX_EAU DECIMAL(7,0) NOT NULL,
   montant DECIMAL(6,2) NOT NULL,
   date_emission DATE,
   date_paiement DATE,
   mode_paiement VARCHAR2(50),
   num_Cheque DECIMAL(7,0),
   document BFILE NOT NULL,
   Adresse VARCHAR2(50),
    ville VARCHAR2(50),
   cp DECIMAL(5,0),
   PRIMARY KEY(Id_Facture_eau_batiment),
   FOREIGN KEY(Adresse, ville, cp) REFERENCES Immeuble(Adresse, ville, cp)
);

    CREATE TABLE Facture_gaz_batiment(
   Id_Facture_gaz_batiment INT,
   INDEX_GAZ DECIMAL(7,0) NOT NULL,
   coefficient_conversion DECIMAL(4,2) NOT NULL,
   montant DECIMAL(7,2) NOT NULL,
   date_emission DATE NOT NULL,
   date_paiement DATE,
   mode_paiement VARCHAR2(50),
   num_Cheque DECIMAL(7,0),
   Document BFILE NOT NULL,
   Adresse VARCHAR2(50),
   ville VARCHAR2(50),
   cp DECIMAL(5,0),
   PRIMARY KEY(Id_Facture_gaz_batiment),
   FOREIGN KEY(Adresse, ville, cp) REFERENCES Immeuble(Adresse, ville, cp)
);

    CREATE TABLE Garant(
   Id_Garant INT,
   nom VARCHAR2(50),
   prenom VARCHAR2(50),
   adresse VARCHAR2(50),
   ville VARCHAR2(50),
   cp DECIMAL(5,0) NOT NULL,
   tel DECIMAL(10,0) NOT NULL,
   email VARCHAR2(50) NOT NULL,
   PRIMARY KEY(Id_Garant)
);

    CREATE TABLE Propriétaire(
   Nom VARCHAR2(50),
   Prenom VARCHAR2(50),
   Adresse VARCHAR2(50) NOT NULL,
   Ville VARCHAR2(50) NOT NULL,
   Cp VARCHAR2(50) NOT NULL,
   email VARCHAR2(50) NOT NULL,
   telephone DECIMAL(10,0) NOT NULL,
   PRIMARY KEY(Nom, Prénom)
);  

    CREATE TABLE bien_immobilier(
   Id_BienImmobilier INT,
   Garage CHAR(1) NOT NULL,
   superficie DECIMAL(6,2) NOT NULL,
   tantièmes DECIMAL(7,2),
   loyer DECIMAL(7,2) NOT NULL,
   date_acquisition DATE NOT NULL,
   nbr_locataires_max DECIMAL(1,0) NOT NULL,
   Nom VARCHAR2(50) NOT NULL,
   Prénom VARCHAR2(50) NOT NULL,
   Adresse VARCHAR2(50) NOT NULL,
   ville VARCHAR2(50) NOT NULL,
   cp DECIMAL(5,0) NOT NULL,
   PRIMARY KEY(Id_BienImmobilier),
   FOREIGN KEY(Nom, Prénom) REFERENCES Propriétaire(Nom, Prénom),
   FOREIGN KEY(Adresse, ville, cp) REFERENCES Immeuble(Adresse, ville, cp)
);

    CREATE TABLE Associations(
   Siren DECIMAL(9,0),
   libelle VARCHAR2(50) NOT NULL,
   date_donnations DATE NOT NULL,
   montant_donnation DECIMAL(7,2),
   Nom VARCHAR2(50) NOT NULL,
   Prénom VARCHAR2(50) NOT NULL,
   PRIMARY KEY(Siren),
   FOREIGN KEY(Nom, Prénom) REFERENCES Propriétaire(Nom, Prénom)
);

    CREATE TABLE Quittance_loyer(
   Id_Locataire INT,
   Date_envoie DATE,
   Document BFILE NOT NULL,
   PRIMARY KEY(Id_Locataire, Date_envoie),
   FOREIGN KEY(Id_Locataire) REFERENCES Locataire(Id_Locataire)
); 

    CREATE TABLE aides_sociales(
   Libelle VARCHAR2(50),
   PRIMARY KEY(Libelle)
); 

    CREATE TABLE Facture_des_Charges(
   Id_Charges INT,
   Libelle VARCHAR2(50) NOT NULL,
   montant DECIMAL(8,2) NOT NULL,
   date_emission DATE NOT NULL,
   date_paiement DATE NOT NULL,
   mode_paiement VARCHAR2(50) NOT NULL,
   num_cheque DECIMAL(7,0),
   document BFILE NOT NULL,
   Adresse VARCHAR2(50),
   ville VARCHAR2(50),
   cp DECIMAL(5,0),
   PRIMARY KEY(Id_Charges),
   FOREIGN KEY(Adresse, ville, cp) REFERENCES Immeuble(Adresse, ville, cp)
);

    CREATE TABLE Location(
   Id_Location INT,
   taxe_fonciere VARCHAR2(50),
   durée DECIMAL(2,0),
   date_debut_contrat DATE NOT NULL,
   document_bail BFILE NOT NULL,
   Id_BienImmobilier INT NOT NULL,
   PRIMARY KEY(Id_Location),
   FOREIGN KEY(Id_BienImmobilier) REFERENCES bien_immobilier(Id_BienImmobilier)
); 

    CREATE TABLE Travaux(
   Siret DECIMAL(14,0),
   Num_Facture VARCHAR2(50),
   Date_T DATE NOT NULL,
   montant DECIMAL(7,2) NOT NULL,
   nature VARCHAR2(100) NOT NULL,
   num_devis VARCHAR2(50) NOT NULL,
   maitre_d_oeuvre VARCHAR2(50) NOT NULL,
    date_emission DATE NOT NULL,
   date_paiement DATE,
   mode_paiement VARCHAR2(50),
   num_Cheque DECIMAL(7,0),
   Document BFILE NOT NULL,
   Adresse VARCHAR2(50),
   ville VARCHAR2(50),
   cp DECIMAL(5,0),
   Id_BienImmobilier INT,
   PRIMARY KEY(Siret, Num_Facture),
   FOREIGN KEY(Adresse, ville, cp) REFERENCES Immeuble(Adresse, ville, cp),
   FOREIGN KEY(Id_BienImmobilier) REFERENCES bien_immobilier(Id_BienImmobilier)
); 

    CREATE TABLE Diagnostic(
   Id_Diagnostic INT,
   Performance_Energie BFILE NOT NULL,
   Date_Performance_Energie DATE NOT NULL,
   Amiante BFILE NOT NULL,
   Plomb BFILE NOT NULL,
   Risque_Pollution BFILE NOT NULL,
   Date_Risque_pollution DATE NOT NULL,
   Nuissance_Sonore_aeriennes BFILE NOT NULL,
   Date_Nuissance_sonore DATE NOT NULL,
    etat_insta_ext_elect BFILE NOT NULL,
   Date_etat_ext_elec DATE NOT NULL,
   Id_BienImmobilier INT NOT NULL,
   PRIMARY KEY(Id_Diagnostic),
   FOREIGN KEY(Id_BienImmobilier) REFERENCES bien_immobilier(Id_BienImmobilier)
);  

    CREATE TABLE Regularisation_des_charges(
   Id_Regularisation_des_charges INT,
   date_envoie DATE NOT NULL,
   Document BFILE NOT NULL,
   Id_Location INT NOT NULL,
   PRIMARY KEY(Id_Regularisation_des_charges),
   FOREIGN KEY(Id_Location) REFERENCES Location(Id_Location)
);

    CREATE TABLE Assurance(
   Id_Assurance INT,
   numéro_de_contrat VARCHAR2(50) NOT NULL,
   Prime DECIMAL(7,2) NOT NULL,
   protection_juridique DECIMAL(7,2) NOT NULL,
   date_fin_de_validité DATE NOT NULL,
   date_debut_validite DATE NOT NULL,
   taux_augmentation DECIMAL(4,3) NOT NULL,
   Nom VARCHAR2(50) NOT NULL,
   Prénom VARCHAR2(50) NOT NULL,
   PRIMARY KEY(Id_Assurance),
   FOREIGN KEY(Nom, Prénom) REFERENCES Propriétaire(Nom, Prénom)
   ); 

    CREATE TABLE declaration_fiscale(
   Id_declaration_fiscale INT,
   Numero_fiscale SMALLINT NOT NULL,
   date_mise_en_recouvrement DATE NOT NULL,
   frais_admin_et_gestion DECIMAL(6,2) NOT NULL,
   Autres_frais_gestions DECIMAL(6,2) NOT NULL,
   indemnite_eviction DECIMAL(7,2),
   Nom VARCHAR2(50) NOT NULL,
   Prénom VARCHAR2(50) NOT NULL,
   PRIMARY KEY(Id_declaration_fiscale),
    FOREIGN KEY(Nom, Prénom) REFERENCES Propriétaire(Nom, Prénom)
);

    CREATE TABLE Facture_Agence_location(
   Siret VARCHAR2(50),
   Numéro_facture VARCHAR2(50),
   montant_honorair DECIMAL(5,2) NOT NULL,
   date_honoraire DATE NOT NULL,
   date_emission VARCHAR2(50) NOT NULL,
   date_paiement DATE,
   mode_paiement VARCHAR2(50),
   num_Cheque DECIMAL(7,0),
   document BFILE NOT NULL,
   Id_Location INT NOT NULL,
   PRIMARY KEY(Siret, Numéro_facture),
   FOREIGN KEY(Id_Location) REFERENCES Location(Id_Location)
);

    CREATE TABLE Anniversaire_location(
   Id_Anniversaire INT,
   indice_ICC DECIMAL(7,3) NOT NULL,
   date_Anniv DATE NOT NULL,
   Document BFILE NOT NULL,
   ancien_loyer DECIMAL(7,2) NOT NULL,
   Id_Location INT NOT NULL,
   PRIMARY KEY(Id_Anniversaire),
   FOREIGN KEY(Id_Location) REFERENCES Location(Id_Location)
);

    CREATE TABLE Solde_Tout_Compte(
   Id_Solde_Tout_Compte INT,
   cout_degradation DECIMAL(6,2),
   Document BFILE NOT NULL,
   numero_Cheque DECIMAL(7,0),
   date_Solde_tout_compte DATE NOT NULL,
   Id_Location INT NOT NULL,
   PRIMARY KEY(Id_Solde_Tout_Compte),
   UNIQUE(Id_Location),
   FOREIGN KEY(Id_Location) REFERENCES Location(Id_Location)
);

    CREATE TABLE louer(
   Id_Location INT,
   Id_Locataire INT,
   PRIMARY KEY(Id_Location, Id_Locataire),
   FOREIGN KEY(Id_Location) REFERENCES Location(Id_Location),
   FOREIGN KEY(Id_Locataire) REFERENCES Locataire(Id_Locataire)
);

    CREATE TABLE associer(
   Id_Locataire INT,
   Id_Garant INT,
   PRIMARY KEY(Id_Locataire, Id_Garant),
   FOREIGN KEY(Id_Locataire) REFERENCES Locataire(Id_Locataire),
   FOREIGN KEY(Id_Garant) REFERENCES Garant(Id_Garant)
);

    CREATE TABLE deduire(
   Id_Locataire INT,
   Date_envoie DATE,
   Libelle VARCHAR2(50),
   montant_aide_sociale DECIMAL(8,2) NOT NULL,
   PRIMARY KEY(Id_Locataire, Date_envoie, Libelle),
   FOREIGN KEY(Id_Locataire, Date_envoie) REFERENCES Quittance_loyer(Id_Locataire, Date_envoie),
   FOREIGN KEY(Libelle) REFERENCES aides_sociales(Libelle)
); 