package vue;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import controleur.GestionMenu;
import javax.swing.JLabel;
import javax.swing.BoxLayout;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import java.awt.Canvas;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Panel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

public class FenStatistiques extends JFrame {

	private JPanel contentPane;
	private GestionMenu gestionMenu;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FenStatistiques frame = new FenStatistiques();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public FenStatistiques() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1300, 600);
		setVisible(true);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel general = new JPanel();
		general.setBounds(34, 11, 674, 461);
		contentPane.add(general);
		general.setLayout(new BorderLayout(0, 0));
		
		JPanel Centre = new JPanel();
		Centre.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		general.add(Centre, BorderLayout.CENTER);
		Centre.setLayout(new BorderLayout(0, 0));
		
		JLabel lblTest = new JLabel("GRAPHIQUE");
		lblTest.setHorizontalAlignment(SwingConstants.CENTER);
		Centre.add(lblTest);
		
		JPanel Droit = new JPanel();
		Droit.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		general.add(Droit, BorderLayout.EAST);
		Droit.setLayout(new BorderLayout(0, 0));
		
		JLabel lblTest2 = new JLabel("GRAPHIQUE");
		lblTest2.setHorizontalAlignment(SwingConstants.CENTER);
		Droit.add(lblTest2);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		general.add(scrollPane, BorderLayout.NORTH);
		
		JPanel panel = new JPanel();
		scrollPane.setViewportView(panel);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JPanel block2 = new JPanel();
		block2.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel.add(block2);
		GridBagLayout gbl_block2 = new GridBagLayout();
		gbl_block2.columnWidths = new int[]{0, 0, 0, 0};
		gbl_block2.rowHeights = new int[]{0, 0, 0, 0, 0};
		gbl_block2.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_block2.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		block2.setLayout(gbl_block2);
		
		JLabel lblTitre2 = new JLabel("Titre");
		GridBagConstraints gbc_lblTitre2 = new GridBagConstraints();
		gbc_lblTitre2.insets = new Insets(0, 0, 5, 5);
		gbc_lblTitre2.gridx = 1;
		gbc_lblTitre2.gridy = 0;
		block2.add(lblTitre2, gbc_lblTitre2);
		
		JLabel lblAdresse2 = new JLabel("Adresse du bien");
		GridBagConstraints gbc_lblAdresse2 = new GridBagConstraints();
		gbc_lblAdresse2.insets = new Insets(0, 0, 5, 5);
		gbc_lblAdresse2.gridx = 0;
		gbc_lblAdresse2.gridy = 1;
		block2.add(lblAdresse2, gbc_lblAdresse2);
		
		JLabel lblNbLoc2 = new JLabel("Nb locataire");
		GridBagConstraints gbc_lblNbLoc2 = new GridBagConstraints();
		gbc_lblNbLoc2.insets = new Insets(0, 0, 5, 0);
		gbc_lblNbLoc2.gridx = 2;
		gbc_lblNbLoc2.gridy = 1;
		block2.add(lblNbLoc2, gbc_lblNbLoc2);
		
		JLabel lblMontantTotal2 = new JLabel("Montant rapporté");
		GridBagConstraints gbc_lblMontantTotal2 = new GridBagConstraints();
		gbc_lblMontantTotal2.insets = new Insets(0, 0, 5, 5);
		gbc_lblMontantTotal2.gridx = 1;
		gbc_lblMontantTotal2.gridy = 2;
		block2.add(lblMontantTotal2, gbc_lblMontantTotal2);
		
		JLabel lblNbMois2 = new JLabel("Nb mois de location");
		GridBagConstraints gbc_lblNbMois2 = new GridBagConstraints();
		gbc_lblNbMois2.insets = new Insets(0, 0, 0, 5);
		gbc_lblNbMois2.gridx = 0;
		gbc_lblNbMois2.gridy = 3;
		block2.add(lblNbMois2, gbc_lblNbMois2);
		
		JLabel lblRevenu2 = new JLabel("Revenu/mois");
		GridBagConstraints gbc_lblRevenu2 = new GridBagConstraints();
		gbc_lblRevenu2.insets = new Insets(0, 0, 5, 0);
		gbc_lblRevenu2.gridx = 2;
		gbc_lblRevenu2.gridy = 3;
		block2.add(lblRevenu2, gbc_lblRevenu2);
		
		JPanel block2_1 = new JPanel();
		block2_1.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel.add(block2_1);
		GridBagLayout gbl_block2_1 = new GridBagLayout();
		gbl_block2_1.columnWidths = new int[]{0, 0, 0, 0};
		gbl_block2_1.rowHeights = new int[]{0, 0, 0, 0, 0};
		gbl_block2_1.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_block2_1.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		block2_1.setLayout(gbl_block2_1);
		
		JLabel lblTitre1 = new JLabel("Titre");
		GridBagConstraints gbc_lblTitre1 = new GridBagConstraints();
		gbc_lblTitre1.insets = new Insets(0, 0, 5, 5);
		gbc_lblTitre1.gridx = 1;
		gbc_lblTitre1.gridy = 0;
		block2_1.add(lblTitre1, gbc_lblTitre1);
		
		JLabel lblAdresse1 = new JLabel("Adresse du bien");
		GridBagConstraints gbc_lblAdresse1 = new GridBagConstraints();
		gbc_lblAdresse1.insets = new Insets(0, 0, 5, 5);
		gbc_lblAdresse1.gridx = 0;
		gbc_lblAdresse1.gridy = 1;
		block2_1.add(lblAdresse1, gbc_lblAdresse1);
		
		JLabel lblNbLoc1 = new JLabel("Nb locataire");
		GridBagConstraints gbc_lblNbLoc1 = new GridBagConstraints();
		gbc_lblNbLoc1.insets = new Insets(0, 0, 5, 0);
		gbc_lblNbLoc1.gridx = 2;
		gbc_lblNbLoc1.gridy = 1;
		block2_1.add(lblNbLoc1, gbc_lblNbLoc1);
		
		JLabel lblMontantTotal1 = new JLabel("Montant rapporté");
		GridBagConstraints gbc_lblMontantTotal1 = new GridBagConstraints();
		gbc_lblMontantTotal1.insets = new Insets(0, 0, 5, 5);
		gbc_lblMontantTotal1.gridx = 1;
		gbc_lblMontantTotal1.gridy = 2;
		block2_1.add(lblMontantTotal1, gbc_lblMontantTotal1);
		
		JLabel lblNbMois1 = new JLabel("Nb mois de location");
		GridBagConstraints gbc_lblNbMois1 = new GridBagConstraints();
		gbc_lblNbMois1.insets = new Insets(0, 0, 0, 5);
		gbc_lblNbMois1.gridx = 0;
		gbc_lblNbMois1.gridy = 3;
		block2_1.add(lblNbMois1, gbc_lblNbMois1);
		
		JLabel lblRevenu1 = new JLabel("Revenu/mois");
		GridBagConstraints gbc_lblRevenu1 = new GridBagConstraints();
		gbc_lblRevenu1.insets = new Insets(0, 0, 5, 0);
		gbc_lblRevenu1.gridx = 2;
		gbc_lblRevenu1.gridy = 3;
		block2_1.add(lblRevenu1, gbc_lblRevenu1);
		
		JPanel block2_2 = new JPanel();
		block2_2.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel.add(block2_2);
		GridBagLayout gbl_block2_2 = new GridBagLayout();
		gbl_block2_2.columnWidths = new int[]{0, 0, 0, 0};
		gbl_block2_2.rowHeights = new int[]{0, 0, 0, 0, 0};
		gbl_block2_2.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_block2_2.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		block2_2.setLayout(gbl_block2_2);
		
		JLabel lblTitre2_2 = new JLabel("Titre");
		GridBagConstraints gbc_lblTitre2_2 = new GridBagConstraints();
		gbc_lblTitre2_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblTitre2_2.gridx = 1;
		gbc_lblTitre2_2.gridy = 0;
		block2_2.add(lblTitre2_2, gbc_lblTitre2_2);
		
		JLabel lblAdresse2_2 = new JLabel("Adresse du bien");
		GridBagConstraints gbc_lblAdresse2_2 = new GridBagConstraints();
		gbc_lblAdresse2_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblAdresse2_2.gridx = 0;
		gbc_lblAdresse2_2.gridy = 1;
		block2_2.add(lblAdresse2_2, gbc_lblAdresse2_2);
		
		JLabel lblNbLoc2_2 = new JLabel("Nb locataire");
		GridBagConstraints gbc_lblNbLoc2_2 = new GridBagConstraints();
		gbc_lblNbLoc2_2.insets = new Insets(0, 0, 5, 0);
		gbc_lblNbLoc2_2.gridx = 2;
		gbc_lblNbLoc2_2.gridy = 1;
		block2_2.add(lblNbLoc2_2, gbc_lblNbLoc2_2);
		
		JLabel lblMontantTotal2_2 = new JLabel("Montant rapporté");
		GridBagConstraints gbc_lblMontantTotal2_2 = new GridBagConstraints();
		gbc_lblMontantTotal2_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblMontantTotal2_2.gridx = 1;
		gbc_lblMontantTotal2_2.gridy = 2;
		block2_2.add(lblMontantTotal2_2, gbc_lblMontantTotal2_2);
		
		JLabel lblNbMois2_2 = new JLabel("Nb mois de location");
		GridBagConstraints gbc_lblNbMois2_2 = new GridBagConstraints();
		gbc_lblNbMois2_2.insets = new Insets(0, 0, 0, 5);
		gbc_lblNbMois2_2.gridx = 0;
		gbc_lblNbMois2_2.gridy = 3;
		block2_2.add(lblNbMois2_2, gbc_lblNbMois2_2);
		
		JLabel lblRevenu2_2 = new JLabel("Revenu/mois");
		GridBagConstraints gbc_lblRevenu2_2 = new GridBagConstraints();
		gbc_lblRevenu2_2.insets = new Insets(0, 0, 5, 0);
		gbc_lblRevenu2_2.gridx = 2;
		gbc_lblRevenu2_2.gridy = 3;
		block2_2.add(lblRevenu2_2, gbc_lblRevenu2_2);
		
		JPanel block1 = new JPanel();
		GridBagLayout gbl_block1 = new GridBagLayout();
		
		this.gestionMenu = new GestionMenu(this);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu gestion = new JMenu("Gestion");
		menuBar.add(gestion);
		
		JMenu parametres = new JMenu("Parametres");
		menuBar.add(parametres);

		JMenu compte = new JMenu("Compte");
		menuBar.add(compte);
		
		JMenuItem biens = new JMenuItem("Mes Biens Immobilier");
		biens.addActionListener(this.gestionMenu);
		gestion.add(biens);
		
		JMenuItem locataires = new JMenuItem("Locataires");
		locataires.addActionListener(this.gestionMenu);
		gestion.add(locataires);
				
		JMenuItem statistiques = new JMenuItem("Statistiques");
		statistiques.addActionListener(this.gestionMenu);
		parametres.add(statistiques);
		
		JMenuItem fermer = new JMenuItem("Fermer");
		fermer.addActionListener(this.gestionMenu);
		parametres.add(fermer);

		JMenuItem monCompte = new JMenuItem("Mon compte");
		monCompte.addActionListener(this.gestionMenu);
		compte.add(monCompte);
	}
}