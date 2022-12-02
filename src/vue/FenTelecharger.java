package vue;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import controleur.GestionTelecharger;

public class FenTelecharger extends JFrame {
	private  GestionTelecharger gestionTelecharger;
	private JPanel contentPane;
	
	public FenTelecharger() {
		this.gestionTelecharger = new GestionTelecharger(this);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 82);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel message = new JLabel("Voulez-vous telecharger le fichier ? : ");
		contentPane.add(message);
		
		JButton btnYes = new JButton("Oui");
		btnYes.addActionListener(this.gestionTelecharger);
		contentPane.add(btnYes);
		
		JButton btnNo = new JButton("Non");
		btnNo.addActionListener(this.gestionTelecharger);
		contentPane.add(btnNo);
	}
}

