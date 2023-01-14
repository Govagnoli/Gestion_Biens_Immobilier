package vue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import controleur.GestionFermerPages;
import controleur.GestionRegularisationDesCharges;
import javax.swing.JLabel;
import java.awt.Font;

public class FenRegularisationCharges extends JFrame {

	private JPanel contentPane;
	private JTable tableRegularisationCharges;
	private GestionRegularisationDesCharges gestionTableRegularisationDesCharges;
	private GestionFermerPages gestionFermerPages;

	
	public FenRegularisationCharges() {
		
		this.gestionFermerPages = new GestionFermerPages(this);
		
		setBounds(100, 100, 392, 386);
		this.gestionTableRegularisationDesCharges = new GestionRegularisationDesCharges(this);
		setVisible(true);

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(46, 58, 300, 239);
		contentPane.add(scrollPane);
		
		tableRegularisationCharges = new JTable();
		tableRegularisationCharges.setModel(new DefaultTableModel(
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
		this.getTableRegularisationCharges().getSelectionModel().addListSelectionListener(this.gestionTableRegularisationDesCharges);	
		scrollPane.setViewportView(tableRegularisationCharges);
		
		JButton btnFermer = new JButton("Fermer");
		btnFermer.addActionListener(this.gestionFermerPages);
		btnFermer.setBounds(281, 315, 85, 21);
		contentPane.add(btnFermer);
		
		JLabel lblTitre = new JLabel("Régularisation des charges");
		lblTitre.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblTitre.setBounds(10, 11, 278, 14);
		contentPane.add(lblTitre);
			
	}
	public JTable getTableRegularisationCharges() {
		return tableRegularisationCharges;
	}
}
	

