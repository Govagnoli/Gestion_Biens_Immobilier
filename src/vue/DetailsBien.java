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
import modele.BienImmobilier;

public class DetailsBien extends JInternalFrame {
	
	private JLabel labelAdresse;
	private JLabel labelNbrLocataire;
	private GestionDetailsBien gestionDetailsBien;
	private BienImmobilier bien;

	public DetailsBien() {
		
		this.gestionDetailsBien = new GestionDetailsBien(this);
		
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
		butonDiagnostic.addActionListener(this.gestionDetailsBien);
		panel.add(butonDiagnostic);
		
		JButton butonCharges = new JButton("Regularisation des Charges");
		butonCharges.addActionListener(this.gestionDetailsBien);
		panel.add(butonCharges);
		
		JButton boutonSoldeToutCompte = new JButton("Solde de tout compte");
		boutonSoldeToutCompte.addActionListener(this.gestionDetailsBien);
		panel.add(boutonSoldeToutCompte);
		
		JSeparator separator = new JSeparator();
		panel.add(separator);		
		
		JButton btnAssurance = new JButton("Assurance");
		btnAssurance.addActionListener(this.gestionDetailsBien);
		panel.add(btnAssurance);
	}

	public void setLabelAdresse(String labelAdresse) {
		this.labelAdresse.setText(labelAdresse);;
	}

	public void setLabelLoyerEtNbrLocataire(String loyer, String labelNbrLocataire) {
		this.labelNbrLocataire.setText(loyer+" "+labelNbrLocataire);
	}

	public BienImmobilier getBien() {
		return bien;
	}

	public void setBien(BienImmobilier bien) {
		this.bien = bien;
	}
	
	
}
