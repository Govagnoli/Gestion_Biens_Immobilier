package vue;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

import controleur.GestionDetailsBien;

public class DetailsBien extends JInternalFrame {
	
	private JLabel labelAdresse;
	private JLabel labelNbrLocataire;
	private GestionDetailsBien gestionClic;

	public DetailsBien() {
		setBounds(100, 100, 800, 100);
		
		this.labelAdresse = new JLabel("Adresse");
		labelAdresse.setHorizontalAlignment(SwingConstants.CENTER);
		getContentPane().add(labelAdresse, BorderLayout.NORTH);
		
		this.labelNbrLocataire = new JLabel("NbrLocataire");
		getContentPane().add(labelNbrLocataire, BorderLayout.EAST);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 2, true), "Document", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLACK));
		getContentPane().add(panel, BorderLayout.CENTER);
		
		JButton butonDiagnostic = new JButton("Diagnostics");
		panel.add(butonDiagnostic);
		
		JButton butonCharges = new JButton("R�gularisation des Charges");
		butonCharges.addActionListener(new GestionDetailsBien(this));
		
		panel.add(butonCharges);
		
		JButton boutonSoldeToutCompte = new JButton("Solde de tout compte");
		panel.add(boutonSoldeToutCompte);
		
		JSeparator separator = new JSeparator();
		panel.add(separator);
	}

	public void setLabelAdresse(String labelAdresse) {
		this.labelAdresse.setText(labelAdresse);;
	}

	public void setLabelLoyerEtNbrLocataire(String loyer, String labelNbrLocataire) {
		this.labelNbrLocataire.setText(loyer+" "+labelNbrLocataire);
	}	
}
