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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.JEditorPane;
import javax.swing.JRadioButtonMenuItem;

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
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_24;
	private JTextField textField_25;
	private JTextField textField_26;
	private JTextField textField_27;
	private JTextField textField_28;
	private JTextField textField_29;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Throwable e) {
			e.printStackTrace();
		}
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
		frame.setTitle("Trading Stories");
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		
		JPanel panel_landing = new JPanel();
		frame.getContentPane().add(panel_landing, "landing");
		panel_landing.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setToolTipText("Trading Stories");
		lblNewLabel.setIcon(new ImageIcon(gui.class.getResource("/View/logo.png")));
		lblNewLabel.setBounds(155, 11, 127, 108);
		panel_landing.add(lblNewLabel);
		
		JTextPane txtpnTradingStories = new JTextPane();
		txtpnTradingStories.setEditable(false);
		txtpnTradingStories.setBackground(UIManager.getColor("menu"));
		txtpnTradingStories.setFont(new Font("Traditional Arabic", Font.PLAIN, 36));
		txtpnTradingStories.setText("Trading Stories");
		txtpnTradingStories.setBounds(107, 108, 224, 48);
		panel_landing.add(txtpnTradingStories);
		
		JButton btnLoginDeUsurio = new JButton("Login de Usu\u00E1rio");
		btnLoginDeUsurio.setBounds(155, 167, 119, 23);
		btnLoginDeUsurio.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent arg0)
				{
					uicontroller.callUserLogin();
				}
			});
		panel_landing.add(btnLoginDeUsurio);
		
		JButton btnCriarConta = new JButton("Criar Conta");
		btnCriarConta.setBounds(169, 195, 89, 23);
		panel_landing.add(btnCriarConta);
		
		JPanel panel_1_AccountCreation = new JPanel();
		frame.getContentPane().add(panel_1_AccountCreation, "account_creation");
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
		btnCriarConta_1.setBounds(320, 164, 89, 23);
		panel_1_AccountCreation.add(btnCriarConta_1);
		
		JButton btnNewButton_1 = new JButton("Cancelar");
		btnNewButton_1.setBounds(320, 223, 89, 23);
		panel_1_AccountCreation.add(btnNewButton_1);
		
		JPanel panel_2_UserLogin = new JPanel();
		frame.getContentPane().add(panel_2_UserLogin, "user_login");
		panel_2_UserLogin.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(gui.class.getResource("/View/logo.png")));
		label.setToolTipText("Trading Stories");
		label.setBounds(161, 11, 127, 108);
		panel_2_UserLogin.add(label);
		
		JTextPane textPane = new JTextPane();
		textPane.setEditable(false);
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
		frame.getContentPane().add(panel_main, "main_page");
		panel_main.setLayout(null);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setText("Trading Stories");
		textPane_1.setFont(new Font("Traditional Arabic", Font.PLAIN, 36));
		textPane_1.setBackground(SystemColor.menu);
		textPane_1.setBounds(103, 0, 224, 48);
		panel_main.add(textPane_1);
		
		JTextPane txtpnBemVindoname = new JTextPane();
		txtpnBemVindoname.setEditable(false);
		txtpnBemVindoname.setBackground(UIManager.getColor("menu"));
		txtpnBemVindoname.setText("Bem vindo, %Name");
		txtpnBemVindoname.setBounds(25, 50, 105, 20);
		panel_main.add(txtpnBemVindoname);
		
		JButton btnPesquisar = new JButton("Pesquisar Livro");
		btnPesquisar.setBounds(281, 80, 151, 23);
		panel_main.add(btnPesquisar);
		
		JButton btnGerenciarColeo = new JButton("Gerenciar Cole\u00E7\u00E3o");
		btnGerenciarColeo.setBounds(25, 81, 125, 23);
		panel_main.add(btnGerenciarColeo);
		
		JButton btnNewButton = new JButton("Adicionar Livro");
		btnNewButton.setBounds(25, 115, 125, 23);
		panel_main.add(btnNewButton);
		
		JButton btnPropostasDeTroca = new JButton("Propostas de troca");
		btnPropostasDeTroca.setBounds(281, 114, 151, 23);
		panel_main.add(btnPropostasDeTroca);
		
		JButton btnProporOwlspot = new JButton("Sugerir Owlspot");
		btnProporOwlspot.setBounds(292, 194, 132, 23);
		panel_main.add(btnProporOwlspot);
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.setBounds(335, 228, 89, 23);
		panel_main.add(btnLogout);
		
		JButton btnTrocasEmAndamento = new JButton("Trocas em andamento");
		btnTrocasEmAndamento.setBounds(281, 148, 151, 23);
		panel_main.add(btnTrocasEmAndamento);
		
		JButton btnPesquisarUsurio = new JButton("Pesquisar Usu\u00E1rio");
		btnPesquisarUsurio.setBounds(25, 194, 125, 23);
		panel_main.add(btnPesquisarUsurio);
		
		JPanel panel_addBook = new JPanel();
		frame.getContentPane().add(panel_addBook, "add_book");
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
		frame.getContentPane().add(panel_manageCollection, "manage_collection");
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
		
		JPanel panel_searchBook = new JPanel();
		frame.getContentPane().add(panel_searchBook, "search_book");
		panel_searchBook.setLayout(null);
		
		textField_14 = new JTextField();
		textField_14.setBounds(10, 35, 193, 20);
		panel_searchBook.add(textField_14);
		textField_14.setColumns(10);
		
		JTextPane txtpnDigiteSuaPesquisa = new JTextPane();
		txtpnDigiteSuaPesquisa.setBackground(SystemColor.menu);
		txtpnDigiteSuaPesquisa.setEditable(false);
		txtpnDigiteSuaPesquisa.setText("Digite sua pesquisa");
		txtpnDigiteSuaPesquisa.setBounds(10, 11, 154, 20);
		panel_searchBook.add(txtpnDigiteSuaPesquisa);
		
		JButton btnPesquisar_1 = new JButton("Pesquisar");
		btnPesquisar_1.setBounds(213, 34, 89, 23);
		panel_searchBook.add(btnPesquisar_1);
		
		JList list_1 = new JList();
		list_1.setBounds(10, 96, 292, 155);
		panel_searchBook.add(list_1);
		
		JTextPane txtpnResultados = new JTextPane();
		txtpnResultados.setEditable(false);
		txtpnResultados.setBackground(SystemColor.menu);
		txtpnResultados.setText("Resultados");
		txtpnResultados.setBounds(10, 65, 59, 20);
		panel_searchBook.add(txtpnResultados);
		
		JButton btnProporTroca = new JButton("Propor Troca");
		btnProporTroca.setBounds(312, 96, 120, 23);
		panel_searchBook.add(btnProporTroca);
		
		JButton btnVoltar_2 = new JButton("Voltar");
		btnVoltar_2.setBounds(329, 228, 95, 23);
		panel_searchBook.add(btnVoltar_2);
		
		JPanel panel_exchange = new JPanel();
		frame.getContentPane().add(panel_exchange, "exchange_start");
		panel_exchange.setLayout(null);
		
		JButton btnVoltar_3 = new JButton("Voltar");
		btnVoltar_3.setBounds(335, 228, 89, 23);
		panel_exchange.add(btnVoltar_3);
		
		JButton btnAceitar = new JButton("Aceitar");
		btnAceitar.setBounds(335, 194, 89, 23);
		panel_exchange.add(btnAceitar);
		
		JTextPane textPane_2 = new JTextPane();
		textPane_2.setBounds(68, 11, 203, 20);
		panel_exchange.add(textPane_2);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(68, 124, 203, 20);
		panel_exchange.add(comboBox);
		
		JTextPane txtpnOwlspot = new JTextPane();
		txtpnOwlspot.setEditable(false);
		txtpnOwlspot.setBackground(SystemColor.menu);
		txtpnOwlspot.setText("OwlSpot");
		txtpnOwlspot.setBounds(10, 123, 48, 20);
		panel_exchange.add(txtpnOwlspot);
		
		JTextPane txtpnBook = new JTextPane();
		txtpnBook.setEditable(false);
		txtpnBook.setBackground(SystemColor.menu);
		txtpnBook.setText("Book");
		txtpnBook.setBounds(10, 11, 48, 20);
		panel_exchange.add(txtpnBook);
		
		JTextPane txtpnCollection = new JTextPane();
		txtpnCollection.setEditable(false);
		txtpnCollection.setBackground(SystemColor.menu);
		txtpnCollection.setText("Cole\u00E7\u00E3o");
		txtpnCollection.setBounds(10, 68, 48, 20);
		panel_exchange.add(txtpnCollection);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(68, 68, 203, 20);
		panel_exchange.add(comboBox_1);
		
		JPanel panel_exchangeProposal = new JPanel();
		panel_exchangeProposal.setLayout(null);
		frame.getContentPane().add(panel_exchangeProposal, "exchange_proposal");
		
		JButton button = new JButton("Voltar");
		button.setBounds(335, 228, 89, 23);
		panel_exchangeProposal.add(button);
		
		JButton button_1 = new JButton("Aceitar");
		button_1.setBounds(335, 153, 89, 23);
		panel_exchangeProposal.add(button_1);
		
		JTextPane textPane_4 = new JTextPane();
		textPane_4.setBounds(68, 11, 203, 20);
		panel_exchangeProposal.add(textPane_4);
		
		JTextPane textPane_5 = new JTextPane();
		textPane_5.setEditable(false);
		textPane_5.setText("OwlSpot");
		textPane_5.setBackground(SystemColor.menu);
		textPane_5.setBounds(10, 181, 48, 20);
		panel_exchangeProposal.add(textPane_5);
		
		JTextPane txtpnLivro = new JTextPane();
		txtpnLivro.setEditable(false);
		txtpnLivro.setText("Livro");
		txtpnLivro.setBackground(SystemColor.menu);
		txtpnLivro.setBounds(10, 11, 48, 20);
		panel_exchangeProposal.add(txtpnLivro);
		
		JTextPane txtpnSeuLivro = new JTextPane();
		txtpnSeuLivro.setEditable(false);
		txtpnSeuLivro.setText("Seu Livro");
		txtpnSeuLivro.setBackground(SystemColor.menu);
		txtpnSeuLivro.setBounds(10, 126, 55, 20);
		panel_exchangeProposal.add(txtpnSeuLivro);
		
		JTextPane textPane_8 = new JTextPane();
		textPane_8.setBounds(68, 181, 203, 20);
		panel_exchangeProposal.add(textPane_8);
		
		JTextPane textPane_9 = new JTextPane();
		textPane_9.setBounds(68, 126, 203, 20);
		panel_exchangeProposal.add(textPane_9);
		
		JTextPane textPane_6 = new JTextPane();
		textPane_6.setBounds(68, 42, 203, 20);
		panel_exchangeProposal.add(textPane_6);
		
		JTextPane txtpnUsurio_1 = new JTextPane();
		txtpnUsurio_1.setEditable(false);
		txtpnUsurio_1.setText("Usu\u00E1rio");
		txtpnUsurio_1.setBackground(SystemColor.menu);
		txtpnUsurio_1.setBounds(10, 42, 48, 20);
		panel_exchangeProposal.add(txtpnUsurio_1);
		
		JTextPane textPane_7 = new JTextPane();
		textPane_7.setBounds(68, 212, 203, 20);
		panel_exchangeProposal.add(textPane_7);
		
		JTextPane txtpnData = new JTextPane();
		txtpnData.setEditable(false);
		txtpnData.setText("Data");
		txtpnData.setBackground(SystemColor.menu);
		txtpnData.setBounds(10, 212, 48, 20);
		panel_exchangeProposal.add(txtpnData);
		
		JButton btnRejeitar = new JButton("Rejeitar");
		btnRejeitar.setBounds(333, 187, 91, 23);
		panel_exchangeProposal.add(btnRejeitar);
		
		JButton btnVisualizarPerfil_1 = new JButton("Visualizar Perfil");
		btnVisualizarPerfil_1.setBounds(327, 42, 105, 23);
		panel_exchangeProposal.add(btnVisualizarPerfil_1);
		
		JPanel panel_exchangeInProgress = new JPanel();
		frame.getContentPane().add(panel_exchangeInProgress, "exchange_in_progress");
		panel_exchangeInProgress.setLayout(null);
		
		JTextPane txtpnProponente = new JTextPane();
		txtpnProponente.setEditable(false);
		txtpnProponente.setBackground(SystemColor.menu);
		txtpnProponente.setText("Proponente");
		txtpnProponente.setBounds(10, 11, 76, 20);
		panel_exchangeInProgress.add(txtpnProponente);
		
		textField_15 = new JTextField();
		textField_15.setBounds(96, 11, 244, 20);
		panel_exchangeInProgress.add(textField_15);
		textField_15.setColumns(10);
		
		textField_16 = new JTextField();
		textField_16.setColumns(10);
		textField_16.setBounds(96, 42, 244, 20);
		panel_exchangeInProgress.add(textField_16);
		
		JTextPane txtpnLivroOferecido = new JTextPane();
		txtpnLivroOferecido.setEditable(false);
		txtpnLivroOferecido.setBackground(SystemColor.menu);
		txtpnLivroOferecido.setText("Livro oferecido");
		txtpnLivroOferecido.setBounds(10, 42, 77, 20);
		panel_exchangeInProgress.add(txtpnLivroOferecido);
		
		textField_17 = new JTextField();
		textField_17.setColumns(10);
		textField_17.setBounds(96, 135, 244, 20);
		panel_exchangeInProgress.add(textField_17);
		
		JTextPane textPane_3 = new JTextPane();
		textPane_3.setEditable(false);
		textPane_3.setBackground(SystemColor.menu);
		textPane_3.setText("Livro oferecido");
		textPane_3.setBounds(10, 135, 77, 20);
		panel_exchangeInProgress.add(textPane_3);
		
		JTextPane txtpnProposicionado = new JTextPane();
		txtpnProposicionado.setEditable(false);
		txtpnProposicionado.setBackground(SystemColor.menu);
		txtpnProposicionado.setText("Proposicionado");
		txtpnProposicionado.setBounds(10, 104, 76, 20);
		panel_exchangeInProgress.add(txtpnProposicionado);
		
		textField_18 = new JTextField();
		textField_18.setColumns(10);
		textField_18.setBounds(96, 104, 244, 20);
		panel_exchangeInProgress.add(textField_18);
		
		JButton btnVoltar_4 = new JButton("Voltar");
		btnVoltar_4.setBounds(346, 239, 91, 23);
		panel_exchangeInProgress.add(btnVoltar_4);
		
		JButton btnReportar = new JButton("Reportar");
		btnReportar.setBounds(346, 205, 91, 23);
		panel_exchangeInProgress.add(btnReportar);
		
		JButton btnFinalizada = new JButton("Finalizada");
		btnFinalizada.setBounds(159, 239, 91, 23);
		panel_exchangeInProgress.add(btnFinalizada);
		
		JTextPane txtpnOwlscore = new JTextPane();
		txtpnOwlscore.setEditable(false);
		txtpnOwlscore.setBackground(SystemColor.menu);
		txtpnOwlscore.setText("Owlscore:");
		txtpnOwlscore.setBounds(39, 208, 51, 20);
		panel_exchangeInProgress.add(txtpnOwlscore);
		
		JRadioButton radioButton_3 = new JRadioButton("1");
		radioButton_3.setBounds(96, 205, 31, 23);
		panel_exchangeInProgress.add(radioButton_3);
		
		JRadioButton radioButton_4 = new JRadioButton("2");
		radioButton_4.setBounds(138, 205, 31, 23);
		panel_exchangeInProgress.add(radioButton_4);
		
		JRadioButton radioButton_5 = new JRadioButton("3");
		radioButton_5.setBounds(185, 205, 31, 23);
		panel_exchangeInProgress.add(radioButton_5);
		
		JRadioButton radioButton_6 = new JRadioButton("4");
		radioButton_6.setBounds(234, 205, 31, 23);
		panel_exchangeInProgress.add(radioButton_6);
		
		JRadioButton radioButton_7 = new JRadioButton("5");
		radioButton_7.setBounds(281, 205, 31, 23);
		panel_exchangeInProgress.add(radioButton_7);
		
		JPanel panel_mainAdmin = new JPanel();
		frame.getContentPane().add(panel_mainAdmin, "main_page_admin");
		panel_mainAdmin.setLayout(null);
		
		JTextPane textPane_10 = new JTextPane();
		textPane_10.setText("Bem vindo, %Name");
		textPane_10.setEditable(false);
		textPane_10.setBackground(SystemColor.menu);
		textPane_10.setBounds(25, 61, 105, 20);
		panel_mainAdmin.add(textPane_10);
		
		JButton btnGerenciarOwlspots = new JButton("Gerenciar Owlspots");
		btnGerenciarOwlspots.setBounds(25, 92, 140, 23);
		panel_mainAdmin.add(btnGerenciarOwlspots);
		
		JTextPane textPane_11 = new JTextPane();
		textPane_11.setEditable(false);
		textPane_11.setText("Trading Stories");
		textPane_11.setFont(new Font("Traditional Arabic", Font.PLAIN, 36));
		textPane_11.setBackground(SystemColor.menu);
		textPane_11.setBounds(103, 11, 224, 48);
		panel_mainAdmin.add(textPane_11);
		
		JButton btnCriarContaDe = new JButton("Criar conta de admin");
		btnCriarContaDe.setBounds(279, 91, 153, 23);
		panel_mainAdmin.add(btnCriarContaDe);
		
		JButton btnVisualizarReclamaes = new JButton("Visualizar Reclama\u00E7\u00F5es");
		btnVisualizarReclamaes.setBounds(281, 159, 151, 23);
		panel_mainAdmin.add(btnVisualizarReclamaes);
		
		JButton button_8 = new JButton("Logout");
		button_8.setBounds(335, 239, 89, 23);
		panel_mainAdmin.add(button_8);
		
		JButton btnPesquisarUsurio_1 = new JButton("Pesquisar usu\u00E1rio");
		btnPesquisarUsurio_1.setBounds(25, 159, 140, 23);
		panel_mainAdmin.add(btnPesquisarUsurio_1);
		
		JPanel panel_AdminAccountCreation = new JPanel();
		panel_AdminAccountCreation.setLayout(null);
		frame.getContentPane().add(panel_AdminAccountCreation, "account_creation_admin");
		
		textField_20 = new JTextField();
		textField_20.setColumns(10);
		textField_20.setBounds(95, 42, 86, 20);
		panel_AdminAccountCreation.add(textField_20);
		
		textField_21 = new JTextField();
		textField_21.setColumns(10);
		textField_21.setBounds(320, 42, 86, 20);
		panel_AdminAccountCreation.add(textField_21);
		
		textField_22 = new JTextField();
		textField_22.setColumns(10);
		textField_22.setBounds(95, 73, 140, 20);
		panel_AdminAccountCreation.add(textField_22);
		
		JTextPane textPane_12 = new JTextPane();
		textPane_12.setText("Username");
		textPane_12.setEditable(false);
		textPane_12.setBackground(SystemColor.menu);
		textPane_12.setBounds(10, 42, 79, 20);
		panel_AdminAccountCreation.add(textPane_12);
		
		JTextPane textPane_13 = new JTextPane();
		textPane_13.setText("Senha");
		textPane_13.setEditable(false);
		textPane_13.setBackground(SystemColor.menu);
		textPane_13.setBounds(278, 42, 36, 20);
		panel_AdminAccountCreation.add(textPane_13);
		
		JTextPane textPane_14 = new JTextPane();
		textPane_14.setText("Nome completo");
		textPane_14.setEditable(false);
		textPane_14.setBackground(SystemColor.menu);
		textPane_14.setBounds(10, 73, 79, 20);
		panel_AdminAccountCreation.add(textPane_14);
		
		JRadioButton radioButton = new JRadioButton("Masculino");
		radioButton.setBounds(95, 103, 71, 23);
		panel_AdminAccountCreation.add(radioButton);
		
		JRadioButton radioButton_1 = new JRadioButton("Feminino");
		radioButton_1.setBounds(168, 103, 67, 23);
		panel_AdminAccountCreation.add(radioButton_1);
		
		JRadioButton radioButton_2 = new JRadioButton("Outro");
		radioButton_2.setBounds(235, 103, 109, 23);
		panel_AdminAccountCreation.add(radioButton_2);
		
		JTextPane textPane_15 = new JTextPane();
		textPane_15.setText("G\u00EAnero");
		textPane_15.setEditable(false);
		textPane_15.setBackground(SystemColor.menu);
		textPane_15.setBounds(10, 104, 79, 20);
		panel_AdminAccountCreation.add(textPane_15);
		
		JTextPane txtpnCriarNovaConta_1 = new JTextPane();
		txtpnCriarNovaConta_1.setText("Criar nova Conta de admin");
		txtpnCriarNovaConta_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtpnCriarNovaConta_1.setEditable(false);
		txtpnCriarNovaConta_1.setBackground(SystemColor.menu);
		txtpnCriarNovaConta_1.setBounds(144, 11, 170, 20);
		panel_AdminAccountCreation.add(txtpnCriarNovaConta_1);
		
		JTextPane textPane_17 = new JTextPane();
		textPane_17.setText("Endere\u00E7o");
		textPane_17.setEditable(false);
		textPane_17.setBackground(SystemColor.menu);
		textPane_17.setBounds(10, 133, 79, 20);
		panel_AdminAccountCreation.add(textPane_17);
		
		textField_23 = new JTextField();
		textField_23.setColumns(10);
		textField_23.setBounds(95, 133, 190, 20);
		panel_AdminAccountCreation.add(textField_23);
		
		JTextPane textPane_18 = new JTextPane();
		textPane_18.setText("Telefone");
		textPane_18.setEditable(false);
		textPane_18.setBackground(SystemColor.menu);
		textPane_18.setBounds(10, 164, 79, 20);
		panel_AdminAccountCreation.add(textPane_18);
		
		textField_24 = new JTextField();
		textField_24.setColumns(10);
		textField_24.setBounds(95, 164, 86, 20);
		panel_AdminAccountCreation.add(textField_24);
		
		JTextPane textPane_19 = new JTextPane();
		textPane_19.setText("E-mail");
		textPane_19.setEditable(false);
		textPane_19.setBackground(SystemColor.menu);
		textPane_19.setBounds(10, 195, 79, 20);
		panel_AdminAccountCreation.add(textPane_19);
		
		textField_25 = new JTextField();
		textField_25.setColumns(10);
		textField_25.setBounds(95, 195, 140, 20);
		panel_AdminAccountCreation.add(textField_25);
		
		JButton button_2 = new JButton("Criar Conta");
		button_2.setBounds(320, 195, 89, 23);
		panel_AdminAccountCreation.add(button_2);
		
		JButton button_12 = new JButton("Cancelar");
		button_12.setBounds(320, 229, 89, 23);
		panel_AdminAccountCreation.add(button_12);
		
		JPanel panel_manageOwlspots = new JPanel();
		panel_manageOwlspots.setLayout(null);
		frame.getContentPane().add(panel_manageOwlspots, "manage_owlspots");
		
		JTextPane txtpnGerencieOsOwlspots = new JTextPane();
		txtpnGerencieOsOwlspots.setText("Gerencie os Owlspots");
		txtpnGerencieOsOwlspots.setEditable(false);
		txtpnGerencieOsOwlspots.setBackground(SystemColor.menu);
		txtpnGerencieOsOwlspots.setBounds(21, 11, 115, 20);
		panel_manageOwlspots.add(txtpnGerencieOsOwlspots);
		
		JList list_2 = new JList();
		list_2.setBounds(21, 42, 304, 209);
		panel_manageOwlspots.add(list_2);
		
		JButton button_4 = new JButton("Remover");
		button_4.setBounds(335, 111, 89, 23);
		panel_manageOwlspots.add(button_4);
		
		JButton button_5 = new JButton("Voltar");
		button_5.setBounds(335, 228, 89, 23);
		panel_manageOwlspots.add(button_5);
		
		JButton button_6 = new JButton("Adicionar");
		button_6.setBounds(335, 42, 89, 23);
		panel_manageOwlspots.add(button_6);
		
		JPanel panel_addOwlspot = new JPanel();
		panel_addOwlspot.setLayout(null);
		frame.getContentPane().add(panel_addOwlspot, "add_owlspots");
		
		textField_26 = new JTextField();
		textField_26.setColumns(10);
		textField_26.setBounds(90, 67, 140, 20);
		panel_addOwlspot.add(textField_26);
		
		JTextPane txtpnEndereo_1 = new JTextPane();
		txtpnEndereo_1.setText("Endere\u00E7o");
		txtpnEndereo_1.setEditable(false);
		txtpnEndereo_1.setBackground(SystemColor.menu);
		txtpnEndereo_1.setBounds(10, 67, 70, 20);
		panel_addOwlspot.add(txtpnEndereo_1);
		
		JTextPane txtpnReferncia = new JTextPane();
		txtpnReferncia.setText("Refer\u00EAncia");
		txtpnReferncia.setEditable(false);
		txtpnReferncia.setBackground(SystemColor.menu);
		txtpnReferncia.setBounds(10, 98, 70, 20);
		panel_addOwlspot.add(txtpnReferncia);
		
		textField_27 = new JTextField();
		textField_27.setColumns(10);
		textField_27.setBounds(90, 98, 140, 20);
		panel_addOwlspot.add(textField_27);
		
		JTextPane txtpnNome = new JTextPane();
		txtpnNome.setText("Nome");
		txtpnNome.setEditable(false);
		txtpnNome.setBackground(SystemColor.menu);
		txtpnNome.setBounds(10, 129, 70, 20);
		panel_addOwlspot.add(txtpnNome);
		
		textField_28 = new JTextField();
		textField_28.setColumns(10);
		textField_28.setBounds(90, 129, 140, 20);
		panel_addOwlspot.add(textField_28);
		
		JButton button_3 = new JButton("Adicionar");
		button_3.setBounds(291, 188, 89, 23);
		panel_addOwlspot.add(button_3);
		
		JButton button_7 = new JButton("Cancelar");
		button_7.setBounds(291, 219, 89, 23);
		panel_addOwlspot.add(button_7);
		
		JTextPane txtpnAdicionarNovoOwlspot = new JTextPane();
		txtpnAdicionarNovoOwlspot.setText("Adicionar novo Owlspot");
		txtpnAdicionarNovoOwlspot.setEditable(false);
		txtpnAdicionarNovoOwlspot.setBackground(SystemColor.menu);
		txtpnAdicionarNovoOwlspot.setBounds(90, 36, 150, 20);
		panel_addOwlspot.add(txtpnAdicionarNovoOwlspot);
		
		JPanel panel_userProfile = new JPanel();
		frame.getContentPane().add(panel_userProfile, "user_profile");
		panel_userProfile.setLayout(null);
		
		JTextPane txtpnUsurio_2 = new JTextPane();
		txtpnUsurio_2.setEditable(false);
		txtpnUsurio_2.setBackground(SystemColor.menu);
		txtpnUsurio_2.setText("Usu\u00E1rio:");
		txtpnUsurio_2.setBounds(10, 11, 46, 20);
		panel_userProfile.add(txtpnUsurio_2);
		
		JEditorPane editorPane = new JEditorPane();
		editorPane.setBounds(10, 42, 284, 20);
		panel_userProfile.add(editorPane);
		
		JList list_3 = new JList();
		list_3.setBounds(10, 114, 284, 148);
		panel_userProfile.add(list_3);
		
		JTextPane txtpnCatlogo = new JTextPane();
		txtpnCatlogo.setEditable(false);
		txtpnCatlogo.setText("Cat\u00E1logo:");
		txtpnCatlogo.setBackground(SystemColor.menu);
		txtpnCatlogo.setBounds(10, 83, 68, 20);
		panel_userProfile.add(txtpnCatlogo);
		
		JTextPane txtpnOwlstars = new JTextPane();
		txtpnOwlstars.setEditable(false);
		txtpnOwlstars.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtpnOwlstars.setBackground(SystemColor.menu);
		txtpnOwlstars.setText("Owlstars");
		txtpnOwlstars.setBounds(354, 94, 58, 20);
		panel_userProfile.add(txtpnOwlstars);
		
		JTextPane textPane_16 = new JTextPane();
		textPane_16.setText("5.0");
		textPane_16.setFont(new Font("Tahoma", Font.PLAIN, 38));
		textPane_16.setBounds(354, 42, 58, 52);
		panel_userProfile.add(textPane_16);
		
		JButton btnVoltar_5 = new JButton("Voltar");
		btnVoltar_5.setBounds(341, 239, 91, 23);
		panel_userProfile.add(btnVoltar_5);
		
		JPanel panel_searchUser = new JPanel();
		panel_searchUser.setLayout(null);
		frame.getContentPane().add(panel_searchUser, "search_user");
		
		textField_29 = new JTextField();
		textField_29.setColumns(10);
		textField_29.setBounds(10, 35, 193, 20);
		panel_searchUser.add(textField_29);
		
		JTextPane txtpnPesquisarUsurio = new JTextPane();
		txtpnPesquisarUsurio.setText("Pesquisar Usu\u00E1rio:");
		txtpnPesquisarUsurio.setEditable(false);
		txtpnPesquisarUsurio.setBackground(SystemColor.menu);
		txtpnPesquisarUsurio.setBounds(10, 11, 154, 20);
		panel_searchUser.add(txtpnPesquisarUsurio);
		
		JButton button_9 = new JButton("Pesquisar");
		button_9.setBounds(213, 34, 89, 23);
		panel_searchUser.add(button_9);
		
		JList list_4 = new JList();
		list_4.setBounds(10, 96, 292, 155);
		panel_searchUser.add(list_4);
		
		JTextPane textPane_22 = new JTextPane();
		textPane_22.setEditable(false);
		textPane_22.setText("Resultados");
		textPane_22.setBackground(SystemColor.menu);
		textPane_22.setBounds(10, 65, 59, 20);
		panel_searchUser.add(textPane_22);
		
		JButton btnVisualizarPerfil = new JButton("Visualizar perfil");
		btnVisualizarPerfil.setBounds(312, 96, 120, 23);
		panel_searchUser.add(btnVisualizarPerfil);
		
		JButton button_11 = new JButton("Voltar");
		button_11.setBounds(329, 228, 95, 23);
		panel_searchUser.add(button_11);
		
		JPanel panel_exchangeProposals = new JPanel();
		panel_exchangeProposals.setLayout(null);
		frame.getContentPane().add(panel_exchangeProposals, "exchange_proposals");
		
		JTextPane txtpnPropostasDeTroca = new JTextPane();
		txtpnPropostasDeTroca.setText("Propostas de troca");
		txtpnPropostasDeTroca.setEditable(false);
		txtpnPropostasDeTroca.setBackground(SystemColor.menu);
		txtpnPropostasDeTroca.setBounds(10, 11, 154, 20);
		panel_exchangeProposals.add(txtpnPropostasDeTroca);
		
		JList list_5 = new JList();
		list_5.setBounds(10, 42, 292, 209);
		panel_exchangeProposals.add(list_5);
		
		JButton btnVisualizarOferta = new JButton("Visualizar oferta");
		btnVisualizarOferta.setBounds(312, 42, 120, 23);
		panel_exchangeProposals.add(btnVisualizarOferta);
		
		JButton button_13 = new JButton("Voltar");
		button_13.setBounds(329, 228, 95, 23);
		panel_exchangeProposals.add(button_13);
		
		JPanel panel_userProfileAdmin = new JPanel();
		panel_userProfileAdmin.setLayout(null);
		frame.getContentPane().add(panel_userProfileAdmin, "user_profile_admin");
		
		JTextPane textPane_21 = new JTextPane();
		textPane_21.setEditable(false);
		textPane_21.setText("Usu\u00E1rio:");
		textPane_21.setBackground(SystemColor.menu);
		textPane_21.setBounds(10, 11, 46, 20);
		panel_userProfileAdmin.add(textPane_21);
		
		JEditorPane editorPane_1 = new JEditorPane();
		editorPane_1.setBounds(10, 42, 284, 20);
		panel_userProfileAdmin.add(editorPane_1);
		
		JList list_6 = new JList();
		list_6.setBounds(10, 114, 284, 148);
		panel_userProfileAdmin.add(list_6);
		
		JTextPane textPane_23 = new JTextPane();
		textPane_23.setEditable(false);
		textPane_23.setText("Cat\u00E1logo:");
		textPane_23.setBackground(SystemColor.menu);
		textPane_23.setBounds(10, 83, 68, 20);
		panel_userProfileAdmin.add(textPane_23);
		
		JTextPane textPane_24 = new JTextPane();
		textPane_24.setEditable(false);
		textPane_24.setText("Owlstars");
		textPane_24.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textPane_24.setBackground(SystemColor.menu);
		textPane_24.setBounds(354, 94, 58, 20);
		panel_userProfileAdmin.add(textPane_24);
		
		JTextPane textPane_25 = new JTextPane();
		textPane_25.setText("5.0");
		textPane_25.setFont(new Font("Tahoma", Font.PLAIN, 38));
		textPane_25.setBounds(354, 42, 58, 52);
		panel_userProfileAdmin.add(textPane_25);
		
		JButton button_10 = new JButton("Voltar");
		button_10.setBounds(341, 239, 91, 23);
		panel_userProfileAdmin.add(button_10);
		
		JButton btnRemoverUsurio = new JButton("Remover Usu\u00E1rio");
		btnRemoverUsurio.setBounds(304, 205, 128, 23);
		panel_userProfileAdmin.add(btnRemoverUsurio);
	}

	public void changePage(String page)
	{
		CardLayout cardLayout = (CardLayout) frame.getContentPane().getLayout();
		cardLayout.show(frame.getContentPane(), page);
	}
}
