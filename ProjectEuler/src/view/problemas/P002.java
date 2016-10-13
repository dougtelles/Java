package view.problemas;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JPanel;

public class P002{
	private JPanel				pnlP002;
	private GridBagLayout		layout;
	private GridBagConstraints	gbc;

	public P002(){
		novaInstancia();
		setPropriedades();
		init();
	}

	private void novaInstancia(){
		pnlP002	= new JPanel();
		layout	= new GridBagLayout();
		gbc		= new GridBagConstraints();
	}

	private void setPropriedades(){
		pnlP002.setVisible(false);
		pnlP002.setLayout(layout);
		pnlP002.setName("P002");
	}

	private void init(){
		pnlP002.setVisible(true);
		pnlP002.setBackground(Color.GREEN);
	}

	public JPanel getPanel(){
		return pnlP002;
	}
}