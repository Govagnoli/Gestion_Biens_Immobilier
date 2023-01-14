package vue;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class UnBien extends JPanel {

	public UnBien() {

		JPanel block4 = new JPanel();
		block4.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		this.add(block4);
		GridBagLayout gbl_block4 = new GridBagLayout();
		gbl_block4.columnWidths = new int[]{0, 0, 0, 0};
		gbl_block4.rowHeights = new int[]{0, 0, 0, 0, 0};
		gbl_block4.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_block4.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		block4.setLayout(gbl_block4);
		
		JLabel lblTitre4 = new JLabel("Titre");
		GridBagConstraints gbc_lblTitre4 = new GridBagConstraints();
		gbc_lblTitre4.insets = new Insets(0, 0, 5, 5);
		gbc_lblTitre4.gridx = 1;
		gbc_lblTitre4.gridy = 0;
		block4.add(lblTitre4, gbc_lblTitre4);
		
		JLabel lblAdresse4 = new JLabel("Adresse du bien");
		GridBagConstraints gbc_lblAdresse4 = new GridBagConstraints();
		gbc_lblAdresse4.insets = new Insets(0, 0, 5, 5);
		gbc_lblAdresse4.gridx = 0;
		gbc_lblAdresse4.gridy = 1;
		block4.add(lblAdresse4, gbc_lblAdresse4);
		
		JLabel lblNbLoc4 = new JLabel("Nb locataire");
		GridBagConstraints gbc_lblNbLoc4 = new GridBagConstraints();
		gbc_lblNbLoc4.insets = new Insets(0, 0, 5, 0);
		gbc_lblNbLoc4.gridx = 2;
		gbc_lblNbLoc4.gridy = 1;
		block4.add(lblNbLoc4, gbc_lblNbLoc4);
		
		JLabel lblMontantTotal4 = new JLabel("Montant rapporté");
		GridBagConstraints gbc_lblMontantTotal4 = new GridBagConstraints();
		gbc_lblMontantTotal4.insets = new Insets(0, 0, 5, 5);
		gbc_lblMontantTotal4.gridx = 1;
		gbc_lblMontantTotal4.gridy = 2;
		block4.add(lblMontantTotal4, gbc_lblMontantTotal4);
		
		JLabel lblNbMois4 = new JLabel("Nb mois de location");
		GridBagConstraints gbc_lblNbMois4 = new GridBagConstraints();
		gbc_lblNbMois4.insets = new Insets(0, 0, 0, 5);
		gbc_lblNbMois4.gridx = 0;
		gbc_lblNbMois4.gridy = 3;
		block4.add(lblNbMois4, gbc_lblNbMois4);
		
		JLabel lblRevenu4 = new JLabel("Revenu/mois");
		GridBagConstraints gbc_lblRevenu4 = new GridBagConstraints();
		gbc_lblRevenu4.insets = new Insets(0, 0, 5, 0);
		gbc_lblRevenu4.gridx = 2;
		gbc_lblRevenu4.gridy = 3;
		block4.add(lblRevenu4, gbc_lblRevenu4);

	}
}
