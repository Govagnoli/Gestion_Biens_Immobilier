package controleur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import vue.FenAjoutLocataire;
import vue.FenLocataires;

public class GestionLocataire implements ActionListener, ListSelectionListener{
	
	private FenLocataires fenLocataires;
	
	public GestionLocataire(FenLocataires fenLocataires) {
		this.fenLocataires = fenLocataires;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {		
		JButton item = (JButton) e.getSource();		
		switch(item.getText()) {
		case "Ajouter un locataire":
			FenAjoutLocataire fenAjoutLocataire = new FenAjoutLocataire();
			fenAjoutLocataire.setVisible(true);		
			break;
		}
	}
	
	@Override
	public void valueChanged(ListSelectionEvent e) {
		int ligneSelectionnee = this.fenLocataires.getTableLocataires().getSelectedRow();
		if(ligneSelectionnee < 0) {
			System.out.println("Aucune ligne s�lectionn�e");
			this.fenLocataires.getDetailsLocataire().setVisible(false);
		} else {
			this.fenLocataires.getDetailsLocataire().setVisible(true);
		}
	}
}
