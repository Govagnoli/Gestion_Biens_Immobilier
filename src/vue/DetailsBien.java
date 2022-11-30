package vue;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DetailsBien extends JInternalFrame {
	
	private JLabel labelAdresse;
	private JLabel labelNbrLocataire;

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
		
		JButton butonCharges = new JButton("Charges");
		panel.add(butonCharges);
		
		JButton boutonSoldeToutCompte = new JButton("Solde de tout compte");
		panel.add(boutonSoldeToutCompte);
		
		JSeparator separator = new JSeparator();
		panel.add(separator);		
		
		JButton btnAssurance = new JButton("Assurance");
		btnAssurance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FenAssurance fenAssurance = new FenAssurance();
				fenAssurance.setVisible(true);
			}
		});
		panel.add(btnAssurance);
	}

	public void setLabelAdresse(String labelAdresse) {
		this.labelAdresse.setText(labelAdresse);;
	}

	public void setLabelLoyerEtNbrLocataire(String loyer, String labelNbrLocataire) {
		this.labelNbrLocataire.setText(loyer+" "+labelNbrLocataire);
	}	
}
