package controleur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;

import vue.FenAjoutBien;

public class GestionAjoutBien implements ActionListener, ItemListener{

	private FenAjoutBien fenAjoutBien;
	private boolean Logement;
	
	public GestionAjoutBien(FenAjoutBien fenAjoutBien) {
		this.fenAjoutBien = fenAjoutBien;
		this.Logement = true;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton item = (JButton) e.getSource();		
		switch(item.getText()) {
		case "Ajouter":
			String textAdresse = this.fenAjoutBien.getTextAdresse();
			String textVille = this.fenAjoutBien.getTextVille();
			String textCP = this.fenAjoutBien.getTextCP();
			String textLoyer = this.fenAjoutBien.getTextLoyer();
			String TextSuperficie = this.fenAjoutBien.getTextSuperficie();
			String textDateAcquisition = this.fenAjoutBien.getTextDateAcquisition();
			String SpinnerNbrLocataireMax = this.fenAjoutBien.getStrSpinnerNbrLocataireMax();
			
			
			if(textAdresse.isBlank() || textVille.isBlank() || textCP.isBlank() || textLoyer.isBlank() || TextSuperficie.isBlank() || textDateAcquisition.isBlank() || SpinnerNbrLocataireMax.isBlank()) {
				javax.swing.JOptionPane.showMessageDialog(this.fenAjoutBien,"Il manque des informations.", "Erreur", javax.swing.JOptionPane.ERROR_MESSAGE);
			} else if(this.Logement) {
				javax.swing.JOptionPane.showMessageDialog(this.fenAjoutBien,"Le logement a bien été ajouté à la liste de vos biens.", "information", javax.swing.JOptionPane.INFORMATION_MESSAGE);
				fenAjoutBien.dispose();
			} else {
				javax.swing.JOptionPane.showMessageDialog(this.fenAjoutBien,"Le garage a bien été ajouté à la liste de vos biens.", "information", javax.swing.JOptionPane.INFORMATION_MESSAGE);
				fenAjoutBien.dispose();
			}
			break;
		}
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		if(this.fenAjoutBien.getRdbtnLogement().getSelectedObjects() == null) {
			this.Logement = false;
			System.out.println("Garage");
		} else {
			this.Logement = true;
			System.out.println("Logement");
		}		
	}
}
