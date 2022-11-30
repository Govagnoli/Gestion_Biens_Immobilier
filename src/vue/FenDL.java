package vue;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controleur.GestionDetailsBien;
import controleur.GestionSoldeToutCompte;

import javax.swing.JButton;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FenDL extends JFrame {
	private  GestionSoldeToutCompte gestionSoldeToutCompte;
	private JPanel contentPane;
	
	public FenDL() {
		this.gestionSoldeToutCompte = new GestionSoldeToutCompte(this);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 82);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel message = new JLabel("Voulez-vous telecharger le fichier ? : ");
		contentPane.add(message);
		
		JButton btnYes = new JButton("Oui");
		btnYes.addActionListener(this.gestionSoldeToutCompte);
		contentPane.add(btnYes);
		
		JButton btnNo = new JButton("Non");
		btnNo.addActionListener(this.gestionSoldeToutCompte);
		contentPane.add(btnNo);
	}


}

