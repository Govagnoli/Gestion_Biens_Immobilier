package vue;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import controleur.GestionFermerPages;
import controleur.GestionMenu;
import controleur.GestionRegularisationDesCharges;
import javax.swing.JButton;

public class FenRegularisationCharges extends JFrame {

	private JPanel contentPane;
	private JTable tableRegularisationCharges;
	private GestionMenu gestionMenu;
	private GestionRegularisationDesCharges gestionTableRegularisationDesCharges;
	private GestionFermerPages gestionFermerPages;

	
	public FenRegularisationCharges() {
		
		this.gestionFermerPages = new GestionFermerPages(this);
		
		setBounds(100, 100, 633, 432);
		this.gestionMenu = new GestionMenu(this);
		this.gestionTableRegularisationDesCharges = new GestionRegularisationDesCharges(this);
		setVisible(true);
		
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(5, 37, 300, 239);
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
		btnFermer.setBounds(534, 342, 85, 21);
		contentPane.add(btnFermer);
			
	}
	public JTable getTableRegularisationCharges() {
		return tableRegularisationCharges;
	}
}
	

