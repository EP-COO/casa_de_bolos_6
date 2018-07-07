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
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import model.ValidacaoException;
//IMPORT FILES
import model.Validador;

public class CadastrarBolo {
	protected JFrame frmCadastrarBolo;
	private JTextField textCodigo;
	private JTextField textPrecoQuilo;
	private JTextField textValidade;
	private JTextField textPeso;
	private JTextField textQuantidade;
	private JTextField textSabor;
	private JTextField textRecheio;
	private JTextField textCobertura;

	public CadastrarBolo() {
		try {
		} catch (Exception e) {
			JOptionPane.showInputDialog(this, e.getMessage() + "\n"
					+ "A aplicação será encerrada.");
			System.exit(0);
		}

		initialize();
	}

	private void initialize() {
		frmCadastrarBolo = new JFrame();
		frmCadastrarBolo.getContentPane().setBackground(new Color(255, 235, 205));
		frmCadastrarBolo.setTitle("Bolos Coorporation");
		frmCadastrarBolo.setBounds(100, 100, 450, 300);
		frmCadastrarBolo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCadastrarBolo.setResizable(false);
		
		JMenuBar menuBar = new JMenuBar();
		frmCadastrarBolo.setJMenuBar(menuBar);
		
		JMenuItem mntmCadastroBoloEspecial = new JMenuItem("Cadastro Bolo Especial");
		mntmCadastroBoloEspecial.setFont(new Font("Segoe Print", Font.BOLD, 12));
		menuBar.add(mntmCadastroBoloEspecial);
		frmCadastrarBolo.getContentPane().setLayout(null);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cadastrarBoloEspecialActionPerformed(e);
			}
		});
		btnCadastrar.setFont(new Font("Segoe Print", Font.BOLD, 11));
		btnCadastrar.setBounds(10, 203, 89, 23);
		frmCadastrarBolo.getContentPane().add(btnCadastrar);
				
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setFont(new Font("Segoe Print", Font.BOLD, 11));
		btnCancelar.setBounds(335, 203, 89, 23);
		frmCadastrarBolo.getContentPane().add(btnCancelar);
		//addActionListener(btnCancelar,  "abreTelaMenu");
		
		JLabel lblPrecoQuilo = new JLabel("Preço\\kg:");
		lblPrecoQuilo.setFont(new Font("Segoe Print", Font.BOLD, 11));
		lblPrecoQuilo.setBounds(10, 64, 69, 14);
		frmCadastrarBolo.getContentPane().add(lblPrecoQuilo);
		
		JLabel lblCodigo = new JLabel("C\u00F3digo:");
		lblCodigo.setFont(new Font("Segoe Print", Font.BOLD, 11));
		lblCodigo.setBounds(10, 25, 60, 14);
		frmCadastrarBolo.getContentPane().add(lblCodigo);
		
		JLabel lblSabor = new JLabel("Sabor:");
		lblSabor.setFont(new Font("Segoe Print", Font.BOLD, 11));
		lblSabor.setBounds(10, 101, 60, 14);
		frmCadastrarBolo.getContentPane().add(lblSabor);
		
		JLabel lblValidade = new JLabel("Validade:");
		lblValidade.setFont(new Font("Segoe Print", Font.BOLD, 11));
		lblValidade.setBounds(176, 101, 60, 14);
		frmCadastrarBolo.getContentPane().add(lblValidade);
		
		textCodigo = new JTextField();
		textCodigo.setBounds(80, 22, 86, 20);
		frmCadastrarBolo.getContentPane().add(textCodigo);
		textCodigo.setColumns(10);
		//int codigo = Integer.parseInt(textCodigo.getText());
		
		textPrecoQuilo = new JTextField();
		textPrecoQuilo.setColumns(10);
		textPrecoQuilo.setBounds(80, 61, 86, 20);
		frmCadastrarBolo.getContentPane().add(textPrecoQuilo);
		
		textValidade = new JTextField();
		textValidade.setColumns(10);
		textValidade.setBounds(264, 98, 86, 20);
		frmCadastrarBolo.getContentPane().add(textValidade);
		
		JLabel lblQuantidade = new JLabel("Quantidade:");
		lblQuantidade.setFont(new Font("Segoe Print", Font.BOLD, 11));
		lblQuantidade.setBounds(176, 25, 78, 14);
		frmCadastrarBolo.getContentPane().add(lblQuantidade);
		
		JLabel lblPeso = new JLabel("Peso:");
		lblPeso.setFont(new Font("Segoe Print", Font.BOLD, 11));
		lblPeso.setBounds(176, 64, 78, 14);
		frmCadastrarBolo.getContentPane().add(lblPeso);
		
		textPeso = new JTextField();
		textPeso.setColumns(10);
		textPeso.setBounds(264, 61, 86, 20);
		frmCadastrarBolo.getContentPane().add(textPeso);
		
		textQuantidade = new JTextField();
		textQuantidade.setColumns(10);
		textQuantidade.setBounds(264, 22, 86, 20);
		frmCadastrarBolo.getContentPane().add(textQuantidade);
		
		JLabel lblCobertura = new JLabel("Cobertura:");
		lblCobertura.setFont(new Font("Segoe Print", Font.BOLD, 11));
		lblCobertura.setBounds(10, 143, 60, 14);
		frmCadastrarBolo.getContentPane().add(lblCobertura);
		
		JLabel lblRecheio = new JLabel("Recheio:");
		lblRecheio.setFont(new Font("Segoe Print", Font.BOLD, 11));
		lblRecheio.setBounds(176, 143, 60, 14);
		frmCadastrarBolo.getContentPane().add(lblRecheio);
		
		textSabor = new JTextField();
		textSabor.setColumns(10);
		textSabor.setBounds(80, 98, 86, 20);
		frmCadastrarBolo.getContentPane().add(textSabor);
		
		textCobertura = new JTextField();
		textCobertura.setColumns(10);
		textCobertura.setBounds(80, 140, 86, 20);
		frmCadastrarBolo.getContentPane().add(textCobertura);
		
		textRecheio = new JTextField();
		textRecheio.setColumns(10);
		textRecheio.setBounds(264, 140, 86, 20);
		frmCadastrarBolo.getContentPane().add(textRecheio);
	}
	
	public void abreTelaMenu(ActionEvent e) {
		Menu menu = new Menu();
		menu.frmMenu.setVisible(true);
		frmCadastrarBolo.setVisible(false);
	}
	
	public void cadastrarBoloEspecialActionPerformed(ActionEvent evt) {
		try {
			JOptionPane.showInputDialog(this,	"Bolo Especial cadastrado com sucesso.");
			textCodigo.setText("");
			textQuantidade.setText("");
			textPrecoQuilo.setText("");
			textPeso.setText("");
			textSabor.setText("");
			textValidade.setText("");
			textCobertura.setText("");
			textRecheio.setText("");
		} catch (Exception e) {
			JOptionPane.showInputDialog(
							this,
							"Não foi possível cadastrar o bolo. \n"
									+ e.getMessage());
		}
	}
}
