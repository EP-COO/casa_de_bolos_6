/*ROTEIRO
 * Conectar telas
 * Fazer BD do login
 * Conectar BD do login
*/

package view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


//IMPORTE DE FILES
import model.Validador;
import model.ValidacaoException;
import controller.BotaoAbrirTelas;

public class Login extends BotaoAbrirTelas {

/* CODE PADRÃO DA TELA

	private JFrame frame;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Login() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

 */
	
	protected JFrame frmLogin;
	private JTextField txtAcesso;
	private Validador validador = new Validador();

	public Login() {
		initialize();
	}

	private void initialize() {
		setFrame(new JFrame("Bolos Coorporation"));
		getFrame().getContentPane().setBackground(new Color(255, 235, 205));
		getFrame().setBounds(100, 100, 450, 300);
		getFrame().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getFrame().getContentPane().setLayout(null);
		getFrame().setResizable(false);
		
		JLabel lblEntrarBolosCoorporation = new JLabel("ENTRAR NA CASA DE BOLOS");
		lblEntrarBolosCoorporation.setFont(new Font("Segoe Print", Font.BOLD, 12));
		lblEntrarBolosCoorporation.setForeground(Color.DARK_GRAY);
		lblEntrarBolosCoorporation.setBounds(130, 30, 200, 14);
		getFrame().getContentPane().add(lblEntrarBolosCoorporation);
		
		JLabel lblAcesso = new JLabel("Acesso:");
		lblAcesso.setFont(new Font("Segoe Print", Font.BOLD, 12));
		lblAcesso.setForeground(Color.DARK_GRAY);
		lblAcesso.setBounds(130, 78, 46, 14);		
		getFrame().getContentPane().add(lblAcesso);
		
		txtAcesso = new JTextField();
		txtAcesso.setBounds(130, 103, 208, 20);
		getFrame().getContentPane().add(txtAcesso);
		txtAcesso.setColumns(10);
		
		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {				
				String acesso;
				try {
					acesso = validador.validaLogin(txtAcesso.getText(), "Acesso");
					System.out.println(acesso);
					
				} catch (Exception e) {
					JOptionPane.showInputDialog(
						this,
						e.getMessage());
				}
			}
		});
		btnEntrar.setFont(new Font("Segoe Print", Font.BOLD, 12));
		btnEntrar.setForeground(Color.DARK_GRAY);
		btnEntrar.setBackground(Color.WHITE);
		btnEntrar.setBounds(169, 158, 113, 23);
		getFrame().getContentPane().add(btnEntrar);
		addActionListener(btnEntrar, "abreTelaMenu");
		
}

	public JFrame getFrame() {
		return frmLogin;
	}

	public void setFrame(JFrame frame) {
		this.frmLogin = frame;
	}
	
	public void abreTelaMenu(ActionEvent e) {		
		boolean resposta;
		try {
			resposta = true;
			if(resposta == true){
				Menu menu = new Menu();
				frmLogin.setVisible(false);
				menu.frmMenu.setVisible(true);
			}else {
				JOptionPane.showInputDialog(this, "Acesso Negado.");
			}
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	}
}
