package view.problemas;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 * @author douglas-silva
 * @since 11/10/2016
 */
public class P001{
	private JPanel		pnlP001, pnlTop, pnlCenter;
	private JLabel		lblDescri, lblNum, lblMultiplos, lblSoma;
	private JTextArea	txAMultiplos;
	private JTextField	txFNum, txFSoma;

	public P001(){
		novaInstancia();
		setPropriedades();
		preparaLayout();
		init();
	}

	private void novaInstancia(){
		pnlP001			= new JPanel();
		pnlTop			= new JPanel();
		pnlCenter		= new JPanel();
		lblDescri		= new JLabel("Problema 001");
		lblNum			= new JLabel("Números primos até:");
		lblMultiplos	= new JLabel("<html>Múltiplos de 3 ou 5 <br>do número informado:</html>");
		lblSoma			= new JLabel("Soma dos múltiplos:");
		txAMultiplos	= new JTextArea(10,10);
		txFNum			= new JTextField(30);
		txFSoma			= new JTextField(30);
	}

	private void setPropriedades(){
		pnlP001.setVisible(false);
		pnlP001.setLayout(new BorderLayout());
		pnlP001.setName("P001");

		pnlTop.setLayout(new FlowLayout());

		pnlCenter.setLayout(new GridBagLayout());

		txFNum.setEditable(true);
		txFSoma.setEditable(false);
		txAMultiplos.setEditable(false);
		txAMultiplos.setLineWrap(true);
	}

	private void preparaLayout(){
		GridBagConstraints gbc = new GridBagConstraints();
		JScrollPane scroll = new JScrollPane(txAMultiplos);

		pnlTop.add(lblDescri);

		gbc.insets = new Insets(5, 5, 5, 5);
		gbc.anchor = GridBagConstraints.WEST;
		gbc.fill   = GridBagConstraints.HORIZONTAL;
		gbc.gridx = 1; gbc.gridy = 1; pnlCenter.add(lblNum, gbc);
		gbc.gridx = 3; gbc.gridy = 1; pnlCenter.add(txFNum, gbc);
		gbc.gridx = 1; gbc.gridy = 3; pnlCenter.add(lblMultiplos, gbc);
		gbc.gridx = 3; gbc.gridy = 3; pnlCenter.add(scroll, gbc);
		gbc.gridx = 1; gbc.gridy = 5; pnlCenter.add(lblSoma, gbc);
		gbc.gridx = 3; gbc.gridy = 5; pnlCenter.add(txFSoma, gbc);

		pnlP001.add(pnlTop, BorderLayout.NORTH);
		pnlP001.add(pnlCenter, BorderLayout.CENTER);
	}

	private void init(){
		pnlP001.setVisible(true);
	}

	public JPanel		getPanel()			{return pnlP001;		}
	public JPanel		getPnlCenter()		{return pnlCenter;		}
	public JPanel		getPnlTop()			{return pnlTop;			}
	public JLabel		getLblMultiplos()	{return lblMultiplos;	}
	public JLabel		getLblDescri()		{return lblDescri;		}
	public JLabel		getLblNum()			{return lblNum;			}
	public JTextArea	getTxAMultiplos()	{return txAMultiplos;	}
	public JLabel		getLblSoma()		{return lblSoma;		}
	public JTextField	getTxFNum()			{return txFNum;			}
	public JTextField	getTxFSoma()		{return txFSoma;		}

	public void setPnlCenter(JPanel pnlCenter			) {this.pnlCenter = pnlCenter;			}
	public void setPnlTop(JPanel pnlTop					) {this.pnlTop = pnlTop;				}
	public void setLblMultiplos(JLabel lblMultiplos		) {this.lblMultiplos = lblMultiplos;	}
	public void setLblDescri(JLabel lblDescri			) {this.lblDescri = lblDescri;			}
	public void setLblNum(JLabel lblNum					) {this.lblNum = lblNum;				}
	public void setTxAMultiplos(JTextArea txAMultiplos	) {this.txAMultiplos = txAMultiplos;	}
	public void setLblSoma(JLabel lblSoma				) {this.lblSoma = lblSoma;				}
	public void setTxFNum(JTextField txFNum				) {this.txFNum = txFNum;				}
	public void setTxFSoma(JTextField txFSoma			) {this.txFSoma = txFSoma;				}
}