package controleur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

import vue.FenAjoutBien;
import vue.FenBiensImmobilier;

public class GestionBiensImmobilier implements ActionListener, ListSelectionListener{
	
 private FenBiensImmobilier fenBiens;
	
	public GestionBiensImmobilier(FenBiensImmobilier fenBiens) {
		this.fenBiens = fenBiens;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton item = (JButton) e.getSource();		
		switch(item.getText()) {
		case "Ajouter un bien":
			FenAjoutBien fenAjoutBien = new FenAjoutBien();
			fenAjoutBien.setVisible(true);
			break;
		}
	}
	
	@Override
	public void valueChanged(ListSelectionEvent e) {
		int ligneSelectionnee = this.fenBiens.getTableBien().getSelectedRow();
		if(ligneSelectionnee < 0) {
			System.out.println("Aucune ligne s�lectionn�e");
			this.fenBiens.getDetailsBien().setVisible(false);
		} else {
			DefaultTableModel modeleTableBien = (DefaultTableModel) this.fenBiens.getTableBien().getModel();
			this.fenBiens.getDetailsBien().setVisible(true);
			
			
			try {
				String adresse = modeleTableBien.getValueAt(ligneSelectionnee, 2).toString();
				String loyer = modeleTableBien.getValueAt(ligneSelectionnee, 6).toString();
				String nbrLocataires = modeleTableBien.getValueAt(ligneSelectionnee, 5).toString();
				
				this.fenBiens.getDetailsBien().setLabelAdresse(adresse);
				this.fenBiens.getDetailsBien().setLabelLoyerEtNbrLocataire(loyer, nbrLocataires);
				this.fenBiens.getDetailsBien().setVisible(true);
			} catch(java.lang.NullPointerException z) {
				System.out.println("La chaine de caract�re adresse, loyer ou nbrLocataires est null car la ligne s�lectionn�e est null. \n");
				System.out.println("Lignes 26 � 28");
			} 
		}
	}
}
