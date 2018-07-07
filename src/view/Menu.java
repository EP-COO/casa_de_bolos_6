package view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.SwingConstants;

//IMPORT FILES
import controller.BotaoAbrirTelas;
import view.CadastrarBolo;
import view.Start;

/* PARA DESCOMENTAR DEPOIS

import visualizacao.CadastroBoloEspecial;
import visualizacao.CadastroBoloSimples;
import visualizacao.CadastroCliente;
import visualizacao.CadastroFuncionario;
import visualizacao.ListarBoloEspecial;
import visualizacao.ListarBoloSimples;
import visualizacao.ListarCliente;
import visualizacao.ListarFuncionario;
import visualizacao.ListarPedidoEspecial;
import visualizacao.ListarPedidoSimples;
import visualizacao.PedidoBoloEspecial;
import visualizacao.PedidoBoloSimples;

*/

public class Menu extends BotaoAbrirTelas{
	
	protected JFrame frmMenu;
	protected JFrame frame;
	
	BotaoAbrirTelas open = new BotaoAbrirTelas();

	public Menu() {
		initialize();
	}

	private void initialize() {
		frmMenu = new JFrame();
		frmMenu.getContentPane().setFont(new Font("Segoe Print", Font.BOLD, 12));
		frmMenu.getContentPane().setBackground(new Color(255, 235, 205));
		frmMenu.getContentPane().setForeground(new Color(255, 235, 205));
		frmMenu.setTitle("Bolos Coorporation");
		frmMenu.setBounds(100, 100, 450, 300);
		frmMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMenu.setResizable(false);
		
		JMenuBar menuBar = new JMenuBar();
		frmMenu.setJMenuBar(menuBar);
		
		JMenu mnCadastrar = new JMenu("Cadastrar");
		mnCadastrar.setFont(new Font("Segoe Print", Font.BOLD, 12));
		menuBar.add(mnCadastrar);
		
		JMenuItem mntmCadastrarBolo = new JMenuItem("Bolo");
		mntmCadastrarBolo.setFont(new Font("Segoe Print", Font.BOLD, 12));
		mnCadastrar.add(mntmCadastrarBolo);
		addActionListener(mntmCadastrarBolo,  "abreTelaCadastrarBolo");
		
		
		
		
		
		
		JMenuItem mntmCadastroCliente = new JMenuItem("Cadastro Cliente");
		mntmCadastroCliente.setFont(new Font("Segoe Print", Font.BOLD, 12));
		mnCadastrar.add(mntmCadastroCliente);
		//addActionListener(mntmCadastroCliente,  "abreTelaCadastroCliente");
		
		JMenuItem mntmCadastroFuncionario = new JMenuItem("Cadastro Funcionario");
		mntmCadastroFuncionario.setFont(new Font("Segoe Print", Font.BOLD, 12));
		mnCadastrar.add(mntmCadastroFuncionario);
		//addActionListener(mntmCadastroFuncionario,  "abreTelaCadastroFuncionario");
		
		JMenu mnPedido = new JMenu("Pedido");
		mnPedido.setFont(new Font("Segoe Print", Font.BOLD, 12));
		menuBar.add(mnPedido);
		
		JMenuItem mntmPedidoBoloSimples = new JMenuItem("Pedido Bolo Simples");
		mntmPedidoBoloSimples.setFont(new Font("Segoe Print", Font.BOLD, 12));
		mnPedido.add(mntmPedidoBoloSimples);
		//addActionListener(mntmPedidoBoloSimples,  "abreTelaPedidoBoloSimples");
		
		JMenuItem mntmPedidoBoloEspecial = new JMenuItem("Pedido Bolo Especial");
		mntmPedidoBoloEspecial.setFont(new Font("Segoe Print", Font.BOLD, 12));
		mnPedido.add(mntmPedidoBoloEspecial);
		//addActionListener(mntmPedidoBoloEspecial,  "abreTelaPedidoBoloEspecial");
		
		JMenu mnListar = new JMenu("Listar");
		mnListar.setFont(new Font("Segoe Print", Font.BOLD, 12));
		menuBar.add(mnListar);
		
		JMenuItem mntmListarBolosSimples = new JMenuItem("Listar Bolos Simples");
		mntmListarBolosSimples.setFont(new Font("Segoe Print", Font.BOLD, 12));
		mnListar.add(mntmListarBolosSimples);
		//addActionListener(mntmListarBolosSimples,  "abreTelaListarBoloSimples");
		
		JMenuItem mntmListarBolosEspeciais = new JMenuItem("Listar Bolos Especiais");
		mntmListarBolosEspeciais.setFont(new Font("Segoe Print", Font.BOLD, 12));
		mnListar.add(mntmListarBolosEspeciais);
		//addActionListener(mntmListarBolosEspeciais,  "abreTelaListarBoloEspecial");
		
		JMenuItem mntmListarPedidoBoloSimples = new JMenuItem("Listar Pedido Bolo Simples");
		mntmListarPedidoBoloSimples.setHorizontalAlignment(SwingConstants.TRAILING);
		mntmListarPedidoBoloSimples.setFont(new Font("Segoe Print", Font.BOLD, 12));
		mnListar.add(mntmListarPedidoBoloSimples);
		//addActionListener(mntmListarPedidoBoloSimples,  "abreTelaListarPedidoBoloSimples");
		
		JMenuItem mntmListarPedidoBoloEspecial = new JMenuItem("Listar Pedido Bolo Especial");
		mntmListarPedidoBoloEspecial.setFont(new Font("Segoe Print", Font.BOLD, 12));
		mnListar.add(mntmListarPedidoBoloEspecial);
		//addActionListener(mntmListarPedidoBoloEspecial,  "abreTelaListarPedidoBoloEspecial");
		
		JMenuItem mntmListarFuncionarios = new JMenuItem("Listar Funcionarios");
		mntmListarFuncionarios.setFont(new Font("Segoe Print", Font.BOLD, 12));
		mnListar.add(mntmListarFuncionarios);
		//addActionListener(mntmListarFuncionarios,  "abreTelaListaFuncioanrios");
		
		JMenuItem mntmListarClientes = new JMenuItem("Listar Clientes");
		mntmListarClientes.setFont(new Font("Segoe Print", Font.BOLD, 12));
		mnListar.add(mntmListarClientes);
		frmMenu.getContentPane().setLayout(null);
		
		JLabel lblBemVindo = new JLabel("BEM VINDO \u00C0 BOLOS COORPORATION");
		lblBemVindo.setHorizontalAlignment(SwingConstants.CENTER);
		lblBemVindo.setFont(new Font("Segoe Print", Font.BOLD, 16));
		lblBemVindo.setBounds(24, 48, 379, 142);
		frmMenu.getContentPane().add(lblBemVindo);
		//addActionListener(mntmListarClientes,  "abreTelaListaClientes");
	}
	
	public void abreTelaCadastrarBolo(ActionEvent e) {
		System.out.println("START ERROS 1");
		CadastrarBolo cadastro = new CadastrarBolo();
		System.out.println("START ERROS 2");
		cadastro.frmCadastrarBolo.setVisible(true);
		frmMenu.setVisible(false);
		System.out.println("chegamos ao fim CLASSE MENU");
	}
	public void abreTela(ActionEvent e) {
		Start window = new Start();
		window.frmHome.setVisible(true);
	}

/*	
	public void abreTelaCadastroCliente(ActionEvent e) {
		CadastroCliente cadastroCliente = new CadastroCliente();
		cadastroCliente.frmCadastroCliente.setVisible(true);
		frmMenu.setVisible(false);
	}
	
	public void abreTelaCadastroFuncionario(ActionEvent e) {
		CadastroFuncionario cadastroFuncionario = new CadastroFuncionario();
		cadastroFuncionario.frmCadastroFuncionario.setVisible(true);
		frmMenu.setVisible(false);
	}
	
	public void abreTelaCadastroBoloSimples(ActionEvent e) {
		CadastroBoloSimples cadastroBoloSimples = new CadastroBoloSimples();
		cadastroBoloSimples.frmCadastraBoloSimples.setVisible(true);
		frmMenu.setVisible(false);
	}
	
	public void abreTelaPedidoBoloSimples(ActionEvent e) {
		PedidoBoloSimples pedidoBoloSimples = new PedidoBoloSimples();
		pedidoBoloSimples.frmPedidoBoloSimples.setVisible(true);
		frmMenu.setVisible(false);
	}
	
	public void abreTelaPedidoBoloEspecial(ActionEvent e) {
		PedidoBoloEspecial pedidoBoloEspecial = new PedidoBoloEspecial();
		pedidoBoloEspecial.frmPedidoBoloEspecial.setVisible(true);
		frmMenu.setVisible(false);
	}
	
	public void abreTelaListarBoloSimples(ActionEvent e) {
		ListarBoloSimples listarBoloSimples = new ListarBoloSimples();
		listarBoloSimples.frmListarBoloSimples.setVisible(true);
		frmMenu.setVisible(false);
	}
	
	public void abreTelaListarBoloEspecial(ActionEvent e) {
		ListarBoloEspecial listarBoloEspecial = new ListarBoloEspecial();
		listarBoloEspecial.frmListarBoloEspecial.setVisible(true);
		frmMenu.setVisible(false);
	}
	
	public void abreTelaListarPedidoBoloSimples(ActionEvent e) {
		ListarPedidoSimples listarPedidoBoloEspecial = new ListarPedidoSimples();
		listarPedidoBoloEspecial.frmListarPedidoBoloSimples.setVisible(true);
		frmMenu.setVisible(false);
	}
	
	public void abreTelaListarPedidoBoloEspecial(ActionEvent e) {
		ListarPedidoEspecial listarPedidoBoloEspecial = new ListarPedidoEspecial();
		listarPedidoBoloEspecial.frmListarPedidoBoloEspecial.setVisible(true);
		frmMenu.setVisible(false);
	}
	
	public void abreTelaListaFuncioanrios(ActionEvent e) {
		ListarFuncionario listaFuncionario = new ListarFuncionario();
		listaFuncionario.frmListarFuncionario.setVisible(true);
		frmMenu.setVisible(false);
	}
	
	public void abreTelaListaClientes(ActionEvent e) {
		ListarCliente listarClientes = new ListarCliente();
		listarClientes.frmListarClientes.setVisible(true);
		frmMenu.setVisible(false);
	}
*/	
}
