package view;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 * @author Douglas Telles
 * @since 2016/10/04
 */
public class MainMenu implements ActionListener{
	private JFrame		frame;
	private JMenuBar	menu;
	private JMenuItem	sobre;
	private JMenuItem	sair;
	private JPanel		pnlTop;
	private JPanel		pnlView;
	private JPanel		pnlContent;
	private JButton		btnPrimeiro;
	private JButton		btnAnterior;
	private JButton		btnProximo;
	private JButton		btnUltimo;

	/**
	 * Construtor
	 * 2016/10/04
	 */
	public MainMenu(){
		novaInstancia();
		setPropriedades();
		init();
	}

	/**
	 * Gera nova instancia dos objetos
	 * 2016/10/04
	 */
	private void novaInstancia(){
		frame		= new JFrame("Projeto Euler.");
		menu		= new JMenuBar();
		sobre		= new JMenuItem("Sobre");
		sair		= new JMenuItem("Sair");
		pnlTop		= new JPanel();
		pnlView		= new JPanel();
		pnlContent	= new JPanel();
        btnPrimeiro	= new JButton("Primeiro");
        btnAnterior	= new JButton("Anterior");
        btnProximo	= new JButton("Próximo");
        btnUltimo	= new JButton("Último");
	}

	/**
	 * Altera as propriedades dos objetos
	 * 2016/10/04
	 */
	private void setPropriedades(){
		pnlTopPro();
		pnlViewPro();
		menuPro();
		contentPro();
		framePro();
	}

	private void pnlTopPro(){
		pnlTop.setLayout(new FlowLayout());

		pnlTop.add(btnPrimeiro);
		pnlTop.add(btnAnterior);
		pnlTop.add(btnProximo);
		pnlTop.add(btnUltimo);

        btnPrimeiro.addActionListener(this);
        btnProximo.addActionListener(this);
        btnAnterior.addActionListener(this);
        btnUltimo.addActionListener(this);
	}

	private void pnlViewPro(){
		control.MainMenu main = new control.MainMenu();
		pnlView.setLayout(new CardLayout());

		for (int i = 0; i < main.getSizeView(); i++) {
			pnlView.add(main.getView(i), main.getNameView(i));
		}
	}

	private void menuPro(){
		menu.add(sobre);
		menu.add(sair);

		sobre.addActionListener(this);
		sair.addActionListener(this);
	}

	private void contentPro(){
        pnlContent.setLayout(new BorderLayout());
        pnlContent.add(pnlTop, BorderLayout.NORTH);
        pnlContent.add(pnlView, BorderLayout.CENTER);
	}

	private void framePro(){
		frame.setVisible(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(true);
		frame.setSize(800, 600);
		frame.setLocationRelativeTo(null);
		frame.setContentPane(pnlContent);
		frame.setJMenuBar(menu);
	}

	/**
	 * Inicia a tela para interacao do usuario
	 * 2016/10/04
	 */
	private void init(){
		frame.setVisible(true);
	}

	/**
	 * Executa acao dos botoes e dos menus
	 * 2016/10/04
	 */
	public void actionPerformed(ActionEvent event) {
		if (event.getSource() == sobre) {
			String msg = "Programa com a finalidade de apresentar \na resolução dos problemas do projeto Euler. \n";
			msg += "Fonte: https://projecteuler.net/archives";
			JOptionPane.showMessageDialog(null, msg, "Sobre!", JOptionPane.INFORMATION_MESSAGE);
		} else if (event.getSource() == sair) {
			int i = JOptionPane.showConfirmDialog(null, "Deseja realmente sair?","Fechar tudo",JOptionPane.YES_NO_OPTION);
			if (i == 0){
				System.exit(0);
			}
		} else if (event.getSource() == btnPrimeiro) {
			((CardLayout)pnlView.getLayout()).first(pnlView);
		} else if (event.getSource() == btnUltimo) {
			((CardLayout)pnlView.getLayout()).last(pnlView);
		} else if (event.getSource() == btnAnterior){
			((CardLayout)pnlView.getLayout()).previous(pnlView);
		} else if (event.getSource() == btnProximo) {
			((CardLayout)pnlView.getLayout()).next(pnlView);
		}
	}
}