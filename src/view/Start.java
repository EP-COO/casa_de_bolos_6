package view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

//IMPORT PAGES
import controller.BotaoAbrirTelas;

public class Start extends BotaoAbrirTelas{
 
/*
 * CODE PADRÃO DA TELA
	private JFrame frame;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Start window = new Start();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Start() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

*/
	
	protected JFrame frmHome;
	private JLabel lblBemVindoAo;
	
	//private Funcionario funcionario = new Funcionario();

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Start window = new Start();
					window.frmHome.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Start() {
		initialize();
	}

	private void initialize() {
		frmHome = new JFrame("Bolos Coorporation");
		frmHome.setForeground(Color.DARK_GRAY);
		frmHome.getContentPane().setForeground(Color.BLACK);
		frmHome.getContentPane().setBackground(new Color(255, 235, 205));
		frmHome.setBackground(Color.WHITE);
		frmHome.setBounds(100, 100, 450, 300);
		frmHome.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmHome.getContentPane().setLayout(null);
		frmHome.setResizable(false);
		
		JButton btnLogin = new JButton("LOGIN");
		btnLogin.setFont(new Font("Segoe Print", Font.BOLD, 12));
		btnLogin.setForeground(Color.DARK_GRAY);
		btnLogin.setBackground(Color.WHITE);
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnLogin.setBounds(150, 139, 126, 23);
		frmHome.getContentPane().add(btnLogin);
		addActionListener(btnLogin, "abreTelaMenu");
		
		lblBemVindoAo = new JLabel("BEM VINDO AO SISTEMA BOLOS COORPORATION");
		lblBemVindoAo.setFont(new Font("Segoe Print", Font.BOLD, 12));
		lblBemVindoAo.setForeground(Color.DARK_GRAY);
		lblBemVindoAo.setHorizontalAlignment(SwingConstants.CENTER);
		lblBemVindoAo.setBounds(47, 68, 337, 60);
		frmHome.getContentPane().add(lblBemVindoAo);
	}
	
	public void abreTelaMenu(ActionEvent e) {		
		Login login = new Login();
		login.frmLogin.setVisible(true);
		frmHome.setVisible(false);		
	}
}
