package controleur;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import vue.FenLocataires;

public class GestionTableLocataires implements ListSelectionListener{
	
	private FenLocataires fenLocataires;
	
	public GestionTableLocataires(FenLocataires fenLocataires) {
		this.fenLocataires = fenLocataires;
	}
	
	@Override
	public void valueChanged(ListSelectionEvent e) {
		int ligneSelectionnee = this.fenLocataires.getTableLocataires().getSelectedRow();
		if(ligneSelectionnee < 0) {
			System.out.println("Aucune ligne sélectionnée");
			this.fenLocataires.getDetailsLocataire().setVisible(false);
		} else {
			this.fenLocataires.getDetailsLocataire().setVisible(true);
		}
	}
}
