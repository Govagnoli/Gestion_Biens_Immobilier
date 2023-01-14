package vue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import controleur.GestionFermerPages;
import controleur.GestionQuittances;
import javax.swing.JLabel;
import java.awt.Font;

public class FenQuittances extends JFrame {

	private JPanel contentPane;
	private JTable tableQuittance;
	private GestionQuittances gestionTableQuittance;
	private GestionFermerPages gestionFermerPages;

	
	public FenQuittances() {
		this.gestionFermerPages = new GestionFermerPages(this);
		this.gestionTableQuittance = new GestionQuittances(this);
		
		setBounds(100, 100, 404, 386);
		setVisible(true);
		
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(44, 60, 300, 239);
		contentPane.add(scrollPane);
		
		tableQuittance = new JTable();
		tableQuittance.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
			},
			new String[] {
				"Identifiant", "Date"
			}
		));
		this.getTableQuittances().getSelectionModel().addListSelectionListener(this.gestionTableQuittance);	
		scrollPane.setViewportView(tableQuittance);
		
		JButton btnFermer = new JButton("Fermer");
		btnFermer.addActionListener(this.gestionFermerPages);
		btnFermer.setBounds(293, 315, 85, 21);
		contentPane.add(btnFermer);
		
		JLabel lblTitre = new JLabel("Quitances de loyer");
		lblTitre.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblTitre.setBounds(10, 11, 259, 28);
		contentPane.add(lblTitre);
			
	}
	public JTable getTableQuittances() {
		return tableQuittance;
	}
}
	

