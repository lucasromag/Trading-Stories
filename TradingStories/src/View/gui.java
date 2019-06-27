package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.UIManager;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import java.awt.SystemColor;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import javax.swing.JList;
import javax.swing.JComboBox;

public class gui {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JPasswordField passwordField;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					gui window = new gui();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public gui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		
		JPanel panel_landing = new JPanel();
		frame.getContentPane().add(panel_landing, "name_9011667121568");
		panel_landing.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setToolTipText("Trading Stories");
		lblNewLabel.setIcon(new ImageIcon(gui.class.getResource("/View/logo.png")));
		lblNewLabel.setBounds(147, 11, 127, 108);
		panel_landing.add(lblNewLabel);
		
		JTextPane txtpnTradingStories = new JTextPane();
		txtpnTradingStories.setBackground(UIManager.getColor("menu"));
		txtpnTradingStories.setFont(new Font("Traditional Arabic", Font.PLAIN, 36));
		txtpnTradingStories.setText("Trading Stories");
		txtpnTradingStories.setBounds(107, 108, 224, 48);
		panel_landing.add(txtpnTradingStories);
		
		JButton btnLoginDeUsurio = new JButton("Login de Usu\u00E1rio");
		btnLoginDeUsurio.setBounds(155, 167, 119, 23);
		panel_landing.add(btnLoginDeUsurio);
		
		JButton btnCriarConta = new JButton("Criar Conta");
		btnCriarConta.setBounds(169, 195, 89, 23);
		panel_landing.add(btnCriarConta);
		
		JButton btnLoginDeAdmin = new JButton("Login de Admin");
		btnLoginDeAdmin.setBounds(319, 228, 105, 23);
		panel_landing.add(btnLoginDeAdmin);
		
		JPanel panel_1_AccountCreation = new JPanel();
		frame.getContentPane().add(panel_1_AccountCreation, "name_9014715258045");
		panel_1_AccountCreation.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(95, 42, 86, 20);
		panel_1_AccountCreation.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(320, 42, 86, 20);
		panel_1_AccountCreation.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(95, 73, 140, 20);
		panel_1_AccountCreation.add(textField_2);
		textField_2.setColumns(10);
		
		JTextPane txtpnUsername = new JTextPane();
		txtpnUsername.setEditable(false);
		txtpnUsername.setBackground(UIManager.getColor("menu"));
		txtpnUsername.setText("Username");
		txtpnUsername.setBounds(10, 42, 79, 20);
		panel_1_AccountCreation.add(txtpnUsername);
		
		JTextPane txtpnSenha = new JTextPane();
		txtpnSenha.setEditable(false);
		txtpnSenha.setBackground(UIManager.getColor("menu"));
		txtpnSenha.setText("Senha");
		txtpnSenha.setBounds(278, 42, 36, 20);
		panel_1_AccountCreation.add(txtpnSenha);
		
		JTextPane txtpnNomeCompleto = new JTextPane();
		txtpnNomeCompleto.setEditable(false);
		txtpnNomeCompleto.setBackground(UIManager.getColor("menu"));
		txtpnNomeCompleto.setText("Nome completo");
		txtpnNomeCompleto.setBounds(10, 73, 79, 20);
		panel_1_AccountCreation.add(txtpnNomeCompleto);
		
		JRadioButton rdbtnMasculino = new JRadioButton("Masculino");
		rdbtnMasculino.setBounds(95, 103, 71, 23);
		panel_1_AccountCreation.add(rdbtnMasculino);
		
		JRadioButton rdbtnFeminino = new JRadioButton("Feminino");
		rdbtnFeminino.setBounds(168, 103, 67, 23);
		panel_1_AccountCreation.add(rdbtnFeminino);
		
		JRadioButton rdbtnOutro = new JRadioButton("Outro");
		rdbtnOutro.setBounds(235, 103, 109, 23);
		panel_1_AccountCreation.add(rdbtnOutro);
		
		JTextPane txtpnGnero = new JTextPane();
		txtpnGnero.setEditable(false);
		txtpnGnero.setBackground(UIManager.getColor("menu"));
		txtpnGnero.setText("G\u00EAnero");
		txtpnGnero.setBounds(10, 104, 79, 20);
		panel_1_AccountCreation.add(txtpnGnero);
		
		JTextPane txtpnCriarNovaConta = new JTextPane();
		txtpnCriarNovaConta.setEditable(false);
		txtpnCriarNovaConta.setBackground(UIManager.getColor("menu"));
		txtpnCriarNovaConta.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtpnCriarNovaConta.setText("Criar nova Conta");
		txtpnCriarNovaConta.setBounds(168, 11, 117, 20);
		panel_1_AccountCreation.add(txtpnCriarNovaConta);
		
		JTextPane txtpnEndereo = new JTextPane();
		txtpnEndereo.setEditable(false);
		txtpnEndereo.setBackground(UIManager.getColor("menu"));
		txtpnEndereo.setText("Endere\u00E7o");
		txtpnEndereo.setBounds(10, 133, 79, 20);
		panel_1_AccountCreation.add(txtpnEndereo);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(95, 133, 190, 20);
		panel_1_AccountCreation.add(textField_3);
		
		JTextPane txtpnTelefone = new JTextPane();
		txtpnTelefone.setEditable(false);
		txtpnTelefone.setBackground(UIManager.getColor("menu"));
		txtpnTelefone.setText("Telefone");
		txtpnTelefone.setBounds(10, 164, 79, 20);
		panel_1_AccountCreation.add(txtpnTelefone);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(95, 164, 86, 20);
		panel_1_AccountCreation.add(textField_4);
		
		JTextPane txtpnEmail = new JTextPane();
		txtpnEmail.setEditable(false);
		txtpnEmail.setBackground(UIManager.getColor("menu"));
		txtpnEmail.setText("E-mail");
		txtpnEmail.setBounds(10, 195, 79, 20);
		panel_1_AccountCreation.add(txtpnEmail);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(95, 195, 140, 20);
		panel_1_AccountCreation.add(textField_5);
		
		JTextPane txtpnApelido = new JTextPane();
		txtpnApelido.setEditable(false);
		txtpnApelido.setBackground(UIManager.getColor("menu"));
		txtpnApelido.setText("Apelido");
		txtpnApelido.setBounds(10, 226, 79, 20);
		panel_1_AccountCreation.add(txtpnApelido);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(95, 226, 86, 20);
		panel_1_AccountCreation.add(textField_6);
		
		JButton btnCriarConta_1 = new JButton("Criar Conta");
		btnCriarConta_1.setBounds(320, 223, 89, 23);
		panel_1_AccountCreation.add(btnCriarConta_1);
		
		JPanel panel_2_UserLogin = new JPanel();
		frame.getContentPane().add(panel_2_UserLogin, "name_9016452729042");
		panel_2_UserLogin.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(gui.class.getResource("/View/logo.png")));
		label.setToolTipText("Trading Stories");
		label.setBounds(161, 11, 127, 108);
		panel_2_UserLogin.add(label);
		
		JTextPane textPane = new JTextPane();
		textPane.setText("Trading Stories");
		textPane.setFont(new Font("Traditional Arabic", Font.PLAIN, 36));
		textPane.setBackground(SystemColor.menu);
		textPane.setBounds(107, 108, 224, 48);
		panel_2_UserLogin.add(textPane);
		
		textField_7 = new JTextField();
		textField_7.setBounds(169, 166, 119, 20);
		panel_2_UserLogin.add(textField_7);
		textField_7.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(169, 197, 119, 20);
		panel_2_UserLogin.add(passwordField);
		
		JTextPane txtpnUsurio = new JTextPane();
		txtpnUsurio.setBackground(UIManager.getColor("menu"));
		txtpnUsurio.setText("Usu\u00E1rio");
		txtpnUsurio.setBounds(117, 166, 42, 20);
		panel_2_UserLogin.add(txtpnUsurio);
		
		JTextPane txtpnSenha_1 = new JTextPane();
		txtpnSenha_1.setBackground(UIManager.getColor("menu"));
		txtpnSenha_1.setText("Senha");
		txtpnSenha_1.setBounds(117, 197, 42, 20);
		panel_2_UserLogin.add(txtpnSenha_1);
		
		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.setBounds(179, 228, 89, 23);
		panel_2_UserLogin.add(btnEntrar);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setBounds(335, 228, 89, 23);
		panel_2_UserLogin.add(btnVoltar);
		
		JPanel panel_main = new JPanel();
		frame.getContentPane().add(panel_main, "name_12560416345710");
		panel_main.setLayout(null);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setText("Trading Stories");
		textPane_1.setFont(new Font("Traditional Arabic", Font.PLAIN, 36));
		textPane_1.setBackground(SystemColor.menu);
		textPane_1.setBounds(103, 0, 224, 48);
		panel_main.add(textPane_1);
		
		JTextPane txtpnBemVindoname = new JTextPane();
		txtpnBemVindoname.setBackground(UIManager.getColor("menu"));
		txtpnBemVindoname.setText("Bem vindo, %Name");
		txtpnBemVindoname.setBounds(25, 50, 105, 20);
		panel_main.add(txtpnBemVindoname);
		
		JButton btnPesquisar = new JButton("Pesquisar");
		btnPesquisar.setBounds(315, 80, 89, 23);
		panel_main.add(btnPesquisar);
		
		JButton btnGerenciarColeo = new JButton("Gerenciar Cole\u00E7\u00E3o");
		btnGerenciarColeo.setBounds(25, 81, 125, 23);
		panel_main.add(btnGerenciarColeo);
		
		JButton btnNewButton = new JButton("Adicionar Livro");
		btnNewButton.setBounds(25, 115, 125, 23);
		panel_main.add(btnNewButton);
		
		JButton btnPropostasDeTroca = new JButton("Propostas de troca");
		btnPropostasDeTroca.setBounds(292, 114, 132, 23);
		panel_main.add(btnPropostasDeTroca);
		
		JButton btnProporOwlspot = new JButton("Sugerir Owlspot");
		btnProporOwlspot.setBounds(292, 194, 132, 23);
		panel_main.add(btnProporOwlspot);
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.setBounds(335, 228, 89, 23);
		panel_main.add(btnLogout);
		
		JPanel panel_addBook = new JPanel();
		frame.getContentPane().add(panel_addBook, "name_13530182908441");
		panel_addBook.setLayout(null);
		
		textField_8 = new JTextField();
		textField_8.setBounds(90, 67, 140, 20);
		panel_addBook.add(textField_8);
		textField_8.setColumns(10);
		
		JTextPane txtpnTtulo = new JTextPane();
		txtpnTtulo.setEditable(false);
		txtpnTtulo.setBackground(UIManager.getColor("menu"));
		txtpnTtulo.setText("T\u00EDtulo");
		txtpnTtulo.setBounds(10, 67, 70, 20);
		panel_addBook.add(txtpnTtulo);
		
		JTextPane txtpnAutor = new JTextPane();
		txtpnAutor.setEditable(false);
		txtpnAutor.setBackground(UIManager.getColor("menu"));
		txtpnAutor.setText("Autor");
		txtpnAutor.setBounds(10, 98, 70, 20);
		panel_addBook.add(txtpnAutor);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(90, 98, 140, 20);
		panel_addBook.add(textField_9);
		
		JTextPane txtpnPublicadora = new JTextPane();
		txtpnPublicadora.setEditable(false);
		txtpnPublicadora.setText("Publicadora");
		txtpnPublicadora.setBackground(SystemColor.menu);
		txtpnPublicadora.setBounds(10, 129, 70, 20);
		panel_addBook.add(txtpnPublicadora);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(90, 129, 140, 20);
		panel_addBook.add(textField_10);
		
		JTextPane txtpnDataDeLanamento = new JTextPane();
		txtpnDataDeLanamento.setEditable(false);
		txtpnDataDeLanamento.setText("Lan\u00E7amento");
		txtpnDataDeLanamento.setBackground(SystemColor.menu);
		txtpnDataDeLanamento.setBounds(10, 160, 70, 20);
		panel_addBook.add(txtpnDataDeLanamento);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(90, 160, 140, 20);
		panel_addBook.add(textField_11);
		
		JTextPane txtpnGnero_1 = new JTextPane();
		txtpnGnero_1.setEditable(false);
		txtpnGnero_1.setText("G\u00EAnero");
		txtpnGnero_1.setBackground(SystemColor.menu);
		txtpnGnero_1.setBounds(10, 191, 70, 20);
		panel_addBook.add(txtpnGnero_1);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(90, 191, 140, 20);
		panel_addBook.add(textField_12);
		
		JTextPane txtpnEstado = new JTextPane();
		txtpnEstado.setEditable(false);
		txtpnEstado.setText("Estado");
		txtpnEstado.setBackground(SystemColor.menu);
		txtpnEstado.setBounds(10, 222, 70, 20);
		panel_addBook.add(txtpnEstado);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(90, 222, 140, 20);
		panel_addBook.add(textField_13);
		
		JButton btnAdicionar = new JButton("Adicionar");
		btnAdicionar.setBounds(291, 188, 89, 23);
		panel_addBook.add(btnAdicionar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(291, 219, 89, 23);
		panel_addBook.add(btnCancelar);
		
		JTextPane txtpnAdicionarLivro = new JTextPane();
		txtpnAdicionarLivro.setEditable(false);
		txtpnAdicionarLivro.setBackground(UIManager.getColor("menu"));
		txtpnAdicionarLivro.setText("Adicionar livro \u00E0 sua cole\u00E7\u00E3o");
		txtpnAdicionarLivro.setBounds(90, 36, 150, 20);
		panel_addBook.add(txtpnAdicionarLivro);
		
		JPanel panel_manageCollection = new JPanel();
		frame.getContentPane().add(panel_manageCollection, "name_29392408567737");
		panel_manageCollection.setLayout(null);
		
		JTextPane txtpnGerencieSuaColeo = new JTextPane();
		txtpnGerencieSuaColeo.setEditable(false);
		txtpnGerencieSuaColeo.setBackground(SystemColor.menu);
		txtpnGerencieSuaColeo.setText("Gerencie sua cole\u00E7\u00E3o");
		txtpnGerencieSuaColeo.setBounds(21, 11, 107, 20);
		panel_manageCollection.add(txtpnGerencieSuaColeo);
		
		JList list = new JList();
		list.setBounds(21, 42, 304, 209);
		panel_manageCollection.add(list);
		
		JButton btnEditar = new JButton("Editar");
		btnEditar.setBounds(335, 77, 89, 23);
		panel_manageCollection.add(btnEditar);
		
		JButton btnRemover = new JButton("Remover");
		btnRemover.setBounds(335, 111, 89, 23);
		panel_manageCollection.add(btnRemover);
		
		JButton btnVoltar_1 = new JButton("Voltar");
		btnVoltar_1.setBounds(335, 228, 89, 23);
		panel_manageCollection.add(btnVoltar_1);
		
		JButton btnAdicionar_1 = new JButton("Adicionar");
		btnAdicionar_1.setBounds(335, 42, 89, 23);
		panel_manageCollection.add(btnAdicionar_1);
		
		JPanel panel_pesquisar = new JPanel();
		frame.getContentPane().add(panel_pesquisar, "name_32013350529559");
		panel_pesquisar.setLayout(null);
		
		textField_14 = new JTextField();
		textField_14.setBounds(10, 35, 193, 20);
		panel_pesquisar.add(textField_14);
		textField_14.setColumns(10);
		
		JTextPane txtpnDigiteSuaPesquisa = new JTextPane();
		txtpnDigiteSuaPesquisa.setBackground(SystemColor.menu);
		txtpnDigiteSuaPesquisa.setEditable(false);
		txtpnDigiteSuaPesquisa.setText("Digite sua pesquisa");
		txtpnDigiteSuaPesquisa.setBounds(10, 11, 154, 20);
		panel_pesquisar.add(txtpnDigiteSuaPesquisa);
		
		JButton btnPesquisar_1 = new JButton("Pesquisar");
		btnPesquisar_1.setBounds(213, 34, 89, 23);
		panel_pesquisar.add(btnPesquisar_1);
		
		JList list_1 = new JList();
		list_1.setBounds(10, 96, 292, 155);
		panel_pesquisar.add(list_1);
		
		JTextPane txtpnResultados = new JTextPane();
		txtpnResultados.setBackground(SystemColor.menu);
		txtpnResultados.setText("Resultados");
		txtpnResultados.setBounds(10, 65, 59, 20);
		panel_pesquisar.add(txtpnResultados);
		
		JButton btnProporTroca = new JButton("Propor Troca");
		btnProporTroca.setBounds(329, 93, 95, 23);
		panel_pesquisar.add(btnProporTroca);
		
		JButton btnVoltar_2 = new JButton("Voltar");
		btnVoltar_2.setBounds(329, 228, 95, 23);
		panel_pesquisar.add(btnVoltar_2);
		
		JPanel panel_trocas = new JPanel();
		frame.getContentPane().add(panel_trocas, "name_32443570121795");
		panel_trocas.setLayout(null);
		
		JButton btnVoltar_3 = new JButton("Voltar");
		btnVoltar_3.setBounds(335, 228, 89, 23);
		panel_trocas.add(btnVoltar_3);
		
		JButton btnCancelar_1 = new JButton("Cancelar");
		btnCancelar_1.setBounds(335, 194, 89, 23);
		panel_trocas.add(btnCancelar_1);
		
		JButton btnAceitar = new JButton("Aceitar");
		btnAceitar.setBounds(335, 160, 89, 23);
		panel_trocas.add(btnAceitar);
		
		JTextPane textPane_2 = new JTextPane();
		textPane_2.setBounds(68, 11, 203, 20);
		panel_trocas.add(textPane_2);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(68, 124, 203, 20);
		panel_trocas.add(comboBox);
		
		JTextPane txtpnOwlspot = new JTextPane();
		txtpnOwlspot.setBackground(SystemColor.menu);
		txtpnOwlspot.setText("OwlSpot");
		txtpnOwlspot.setBounds(10, 123, 48, 20);
		panel_trocas.add(txtpnOwlspot);
		
		JTextPane txtpnBook = new JTextPane();
		txtpnBook.setBackground(SystemColor.menu);
		txtpnBook.setText("Book");
		txtpnBook.setBounds(10, 11, 48, 20);
		panel_trocas.add(txtpnBook);
		
		JTextPane txtpnCollection = new JTextPane();
		txtpnCollection.setBackground(SystemColor.menu);
		txtpnCollection.setText("Cole\u00E7\u00E3o");
		txtpnCollection.setBounds(10, 68, 48, 20);
		panel_trocas.add(txtpnCollection);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(68, 68, 203, 20);
		panel_trocas.add(comboBox_1);
	}
}
