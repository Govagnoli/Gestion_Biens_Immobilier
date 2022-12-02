package vue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controleur.GestionFermerPages;

import javax.swing.JButton;

public class FenDiagnostique extends JFrame {

	private JPanel contentPane;
	private GestionFermerPages gestionFermerPages;

	public FenDiagnostique() {
		this.gestionFermerPages = new GestionFermerPages(this);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnAnnuler = new JButton("Annuler");
		btnAnnuler.addActionListener(this.gestionFermerPages);
		btnAnnuler.setBounds(341, 232, 85, 21);
		contentPane.add(btnAnnuler);
	}

}
