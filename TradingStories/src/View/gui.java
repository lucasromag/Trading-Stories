package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.UIManager;

import Controller.UIcontroller;
import Model.Book;
import Model.OwlSpot;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.JEditorPane;
import javax.swing.JRadioButtonMenuItem;

public class gui {
	
	private UIcontroller uicontroller;
	private JFrame frame;
	private JTextField newUsername;
	private JTextField newPassword;
	private JTextField newFullName;
	private JTextField newAdress;
	private JTextField newPhone;
	private JTextField newEmail;
	private JTextField newNickname;
	private char newGender = 'O';
	private JTextField loginUsername;
	private JPasswordField loginPasswordField;
	private JTextField newBookTitle;
	private JTextField newBookAuthor;
	private JTextField NewBookPublisher;
	private JTextField NewBookRelease;
	private JTextField newBookGenre;
	private JTextField newBookState;
	private JTextField bookSearchQuery;
	private JTextField transactionProgressProponent;
	private JTextField transactionProgressProponentBook;
	private JTextField transactionProgressPropositionedBook;
	private JTextField transactionProgressPropositioned;
	private JTextField newAdminUsername;
	private JTextField newAdminPassword;
	private JTextField newAdminFullName;
	private JTextField newAdminAdress;
	private JTextField newAdminPhone;
	private JTextField newAdminEmail;
	private char newAdminGender = 'O';
	private JTextField newOwlspotAdress;
	private JTextField newOwlspotReference;
	private JTextField newOwlspotName;
	private JTextField userSearchQuery;
	
	private List<OwlSpot> proposableOwlspots;
	
	private int newOwlScore = 5;
	private List<Book> proposableCollection;


	/**
	 * Create the application.
	 */
	public gui(UIcontroller controller) {
		uicontroller = controller;
		initialize();
	}

	public void setVisible() {
		frame.setVisible(true);
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
		btnCriarConta.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent arg0)
				{
					uicontroller.callNewAccount();
				}
			});
		panel_landing.add(btnCriarConta);
		
		JPanel panel_1_AccountCreation = new JPanel();
		frame.getContentPane().add(panel_1_AccountCreation, "account_creation");
		panel_1_AccountCreation.setLayout(null);
		
		newUsername = new JTextField();
		newUsername.setBounds(95, 42, 86, 20);
		panel_1_AccountCreation.add(newUsername);
		newUsername.setColumns(10);
		
		newPassword = new JTextField();
		newPassword.setBounds(320, 42, 86, 20);
		panel_1_AccountCreation.add(newPassword);
		newPassword.setColumns(10);
		
		newFullName = new JTextField();
		newFullName.setBounds(95, 73, 140, 20);
		panel_1_AccountCreation.add(newFullName);
		newFullName.setColumns(10);
		
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
		
		ButtonGroup genderGroup = new ButtonGroup();
		genderGroup.add(rdbtnMasculino);
		genderGroup.add(rdbtnFeminino);
		genderGroup.add(rdbtnOutro);
		
		rdbtnMasculino.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				newGender = 'M';
			}
		});
		
		rdbtnFeminino.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				newGender = 'F';
			}
		});
		
		rdbtnOutro.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				newGender = 'O';
			}
		});
		
		
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
		
		newAdress = new JTextField();
		newAdress.setColumns(10);
		newAdress.setBounds(95, 133, 190, 20);
		panel_1_AccountCreation.add(newAdress);
		
		JTextPane txtpnTelefone = new JTextPane();
		txtpnTelefone.setEditable(false);
		txtpnTelefone.setBackground(UIManager.getColor("menu"));
		txtpnTelefone.setText("Telefone");
		txtpnTelefone.setBounds(10, 164, 79, 20);
		panel_1_AccountCreation.add(txtpnTelefone);
		
		newPhone = new JTextField();
		newPhone.setColumns(10);
		newPhone.setBounds(95, 164, 86, 20);
		panel_1_AccountCreation.add(newPhone);
		
		JTextPane txtpnEmail = new JTextPane();
		txtpnEmail.setEditable(false);
		txtpnEmail.setBackground(UIManager.getColor("menu"));
		txtpnEmail.setText("E-mail");
		txtpnEmail.setBounds(10, 195, 79, 20);
		panel_1_AccountCreation.add(txtpnEmail);
		
		newEmail = new JTextField();
		newEmail.setColumns(10);
		newEmail.setBounds(95, 195, 140, 20);
		panel_1_AccountCreation.add(newEmail);
		
		JTextPane txtpnApelido = new JTextPane();
		txtpnApelido.setEditable(false);
		txtpnApelido.setBackground(UIManager.getColor("menu"));
		txtpnApelido.setText("Apelido");
		txtpnApelido.setBounds(10, 226, 79, 20);
		panel_1_AccountCreation.add(txtpnApelido);
		
		newNickname = new JTextField();
		newNickname.setColumns(10);
		newNickname.setBounds(95, 226, 86, 20);
		panel_1_AccountCreation.add(newNickname);
		
		JButton btnCriarConta_1 = new JButton("Criar Conta");
		btnCriarConta_1.setBounds(320, 164, 89, 23);
		btnCriarConta_1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
					uicontroller.callCreateUserAccount(newUsername.getText(), newPassword.getText(), newFullName.getText(), newGender, newAdress.getText(), newPhone.getText(), newEmail.getText(), newNickname.getText());
			}
		});
		panel_1_AccountCreation.add(btnCriarConta_1);
		
		JButton btnNewButton_1 = new JButton("Cancelar");
		btnNewButton_1.setBounds(320, 223, 89, 23);
		btnNewButton_1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				uicontroller.callCancel();
			}
		});
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
		
		loginUsername = new JTextField();
		loginUsername.setBounds(169, 166, 119, 20);
		panel_2_UserLogin.add(loginUsername);
		loginUsername.setColumns(10);
		
		loginPasswordField = new JPasswordField();
		loginPasswordField.setBounds(169, 197, 119, 20);
		panel_2_UserLogin.add(loginPasswordField);
		
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
		
		newBookTitle = new JTextField();
		newBookTitle.setBounds(90, 67, 140, 20);
		panel_addBook.add(newBookTitle);
		newBookTitle.setColumns(10);
		
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
		
		newBookAuthor = new JTextField();
		newBookAuthor.setColumns(10);
		newBookAuthor.setBounds(90, 98, 140, 20);
		panel_addBook.add(newBookAuthor);
		
		JTextPane txtpnPublicadora = new JTextPane();
		txtpnPublicadora.setEditable(false);
		txtpnPublicadora.setText("Publicadora");
		txtpnPublicadora.setBackground(SystemColor.menu);
		txtpnPublicadora.setBounds(10, 129, 70, 20);
		panel_addBook.add(txtpnPublicadora);
		
		NewBookPublisher = new JTextField();
		NewBookPublisher.setColumns(10);
		NewBookPublisher.setBounds(90, 129, 140, 20);
		panel_addBook.add(NewBookPublisher);
		
		JTextPane txtpnDataDeLanamento = new JTextPane();
		txtpnDataDeLanamento.setEditable(false);
		txtpnDataDeLanamento.setText("Lan\u00E7amento");
		txtpnDataDeLanamento.setBackground(SystemColor.menu);
		txtpnDataDeLanamento.setBounds(10, 160, 70, 20);
		panel_addBook.add(txtpnDataDeLanamento);
		
		NewBookRelease = new JTextField();
		NewBookRelease.setColumns(10);
		NewBookRelease.setBounds(90, 160, 140, 20);
		panel_addBook.add(NewBookRelease);
		
		JTextPane txtpnGnero_1 = new JTextPane();
		txtpnGnero_1.setEditable(false);
		txtpnGnero_1.setText("G\u00EAnero");
		txtpnGnero_1.setBackground(SystemColor.menu);
		txtpnGnero_1.setBounds(10, 191, 70, 20);
		panel_addBook.add(txtpnGnero_1);
		
		newBookGenre = new JTextField();
		newBookGenre.setColumns(10);
		newBookGenre.setBounds(90, 191, 140, 20);
		panel_addBook.add(newBookGenre);
		
		JTextPane txtpnEstado = new JTextPane();
		txtpnEstado.setEditable(false);
		txtpnEstado.setText("Estado");
		txtpnEstado.setBackground(SystemColor.menu);
		txtpnEstado.setBounds(10, 222, 70, 20);
		panel_addBook.add(txtpnEstado);
		
		newBookState = new JTextField();
		newBookState.setColumns(10);
		newBookState.setBounds(90, 222, 140, 20);
		panel_addBook.add(newBookState);
		
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
		
		bookSearchQuery = new JTextField();
		bookSearchQuery.setBounds(10, 35, 193, 20);
		panel_searchBook.add(bookSearchQuery);
		bookSearchQuery.setColumns(10);
		
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
		
		JPanel panel_transaction = new JPanel();
		frame.getContentPane().add(panel_transaction, "transaction_start");
		panel_transaction.setLayout(null);
		
		JButton btnVoltar_3 = new JButton("Voltar");
		btnVoltar_3.setBounds(335, 228, 89, 23);
		panel_transaction.add(btnVoltar_3);
		
		JButton btnAceitar = new JButton("Aceitar");
		btnAceitar.setBounds(335, 194, 89, 23);
		panel_transaction.add(btnAceitar);
		
		JTextPane newProposalBookName = new JTextPane();
		newProposalBookName.setEditable(false);
		newProposalBookName.setBounds(68, 11, 203, 20);
		panel_transaction.add(newProposalBookName);
		
		JComboBox<String> comboBox_Owlspot = new JComboBox<String>();
		comboBox_Owlspot.setBounds(68, 124, 203, 20);
		panel_transaction.add(comboBox_Owlspot);
		
		JTextPane txtpnOwlspot = new JTextPane();
		txtpnOwlspot.setEditable(false);
		txtpnOwlspot.setBackground(SystemColor.menu);
		txtpnOwlspot.setText("OwlSpot");
		txtpnOwlspot.setBounds(10, 123, 48, 20);
		panel_transaction.add(txtpnOwlspot);
		
		JTextPane txtpnBook = new JTextPane();
		txtpnBook.setEditable(false);
		txtpnBook.setBackground(SystemColor.menu);
		txtpnBook.setText("Book");
		txtpnBook.setBounds(10, 11, 48, 20);
		panel_transaction.add(txtpnBook);
		
		JTextPane txtpnCollection = new JTextPane();
		txtpnCollection.setEditable(false);
		txtpnCollection.setBackground(SystemColor.menu);
		txtpnCollection.setText("Cole\u00E7\u00E3o");
		txtpnCollection.setBounds(10, 68, 48, 20);
		panel_transaction.add(txtpnCollection);
		
		JComboBox<String> comboBox_Collection = new JComboBox<String>();
		comboBox_Collection.setBounds(68, 68, 203, 20);
		panel_transaction.add(comboBox_Collection);
		
		JPanel panel_transactionProposal = new JPanel();
		panel_transactionProposal.setLayout(null);
		frame.getContentPane().add(panel_transactionProposal, "transaction_proposal");
		
		JButton button = new JButton("Voltar");
		button.setBounds(335, 228, 89, 23);
		panel_transactionProposal.add(button);
		
		JButton button_1 = new JButton("Aceitar");
		button_1.setBounds(335, 153, 89, 23);
		panel_transactionProposal.add(button_1);
		
		JTextPane transactionProposalBookTitle = new JTextPane();
		transactionProposalBookTitle.setBounds(68, 11, 203, 20);
		panel_transactionProposal.add(transactionProposalBookTitle);
		
		JTextPane textPane_5 = new JTextPane();
		textPane_5.setEditable(false);
		textPane_5.setText("OwlSpot");
		textPane_5.setBackground(SystemColor.menu);
		textPane_5.setBounds(10, 181, 48, 20);
		panel_transactionProposal.add(textPane_5);
		
		JTextPane txtpnLivro = new JTextPane();
		txtpnLivro.setEditable(false);
		txtpnLivro.setText("Livro");
		txtpnLivro.setBackground(SystemColor.menu);
		txtpnLivro.setBounds(10, 11, 48, 20);
		panel_transactionProposal.add(txtpnLivro);
		
		JTextPane txtpnSeuLivro = new JTextPane();
		txtpnSeuLivro.setEditable(false);
		txtpnSeuLivro.setText("Seu Livro");
		txtpnSeuLivro.setBackground(SystemColor.menu);
		txtpnSeuLivro.setBounds(10, 126, 55, 20);
		panel_transactionProposal.add(txtpnSeuLivro);
		
		JTextPane transactionProposalOwlspot = new JTextPane();
		transactionProposalOwlspot.setBounds(68, 181, 203, 20);
		panel_transactionProposal.add(transactionProposalOwlspot);
		
		JTextPane transactionProposalYourBook = new JTextPane();
		transactionProposalYourBook.setEditable(false);
		transactionProposalYourBook.setBounds(68, 126, 203, 20);
		panel_transactionProposal.add(transactionProposalYourBook);
		
		JTextPane transactionProposalUsername = new JTextPane();
		transactionProposalUsername.setBounds(68, 42, 203, 20);
		panel_transactionProposal.add(transactionProposalUsername);
		
		JTextPane txtpnUsurio_1 = new JTextPane();
		txtpnUsurio_1.setEditable(false);
		txtpnUsurio_1.setText("Usu\u00E1rio");
		txtpnUsurio_1.setBackground(SystemColor.menu);
		txtpnUsurio_1.setBounds(10, 42, 48, 20);
		panel_transactionProposal.add(txtpnUsurio_1);
		
		JTextPane transactionProposalDate = new JTextPane();
		transactionProposalDate.setBounds(68, 212, 203, 20);
		panel_transactionProposal.add(transactionProposalDate);
		
		JTextPane txtpnData = new JTextPane();
		txtpnData.setEditable(false);
		txtpnData.setText("Data");
		txtpnData.setBackground(SystemColor.menu);
		txtpnData.setBounds(10, 212, 48, 20);
		panel_transactionProposal.add(txtpnData);
		
		JButton btnRejeitar = new JButton("Rejeitar");
		btnRejeitar.setBounds(333, 187, 91, 23);
		panel_transactionProposal.add(btnRejeitar);
		
		JButton btnVisualizarPerfil_1 = new JButton("Visualizar Perfil");
		btnVisualizarPerfil_1.setBounds(327, 42, 105, 23);
		panel_transactionProposal.add(btnVisualizarPerfil_1);
		
		JPanel panel_transactionInProgress = new JPanel();
		frame.getContentPane().add(panel_transactionInProgress, "transaction_in_progress");
		panel_transactionInProgress.setLayout(null);
		
		JTextPane txtpnProponente = new JTextPane();
		txtpnProponente.setEditable(false);
		txtpnProponente.setBackground(SystemColor.menu);
		txtpnProponente.setText("Proponente");
		txtpnProponente.setBounds(10, 11, 76, 20);
		panel_transactionInProgress.add(txtpnProponente);
		
		transactionProgressProponent = new JTextField();
		transactionProgressProponent.setBounds(96, 11, 244, 20);
		panel_transactionInProgress.add(transactionProgressProponent);
		transactionProgressProponent.setColumns(10);
		
		transactionProgressProponentBook = new JTextField();
		transactionProgressProponentBook.setColumns(10);
		transactionProgressProponentBook.setBounds(96, 42, 244, 20);
		panel_transactionInProgress.add(transactionProgressProponentBook);
		
		JTextPane txtpnLivroOferecido = new JTextPane();
		txtpnLivroOferecido.setEditable(false);
		txtpnLivroOferecido.setBackground(SystemColor.menu);
		txtpnLivroOferecido.setText("Livro oferecido");
		txtpnLivroOferecido.setBounds(10, 42, 77, 20);
		panel_transactionInProgress.add(txtpnLivroOferecido);
		
		transactionProgressPropositionedBook = new JTextField();
		transactionProgressPropositionedBook.setColumns(10);
		transactionProgressPropositionedBook.setBounds(96, 135, 244, 20);
		panel_transactionInProgress.add(transactionProgressPropositionedBook);
		
		JTextPane textPane_3 = new JTextPane();
		textPane_3.setEditable(false);
		textPane_3.setBackground(SystemColor.menu);
		textPane_3.setText("Livro oferecido");
		textPane_3.setBounds(10, 135, 77, 20);
		panel_transactionInProgress.add(textPane_3);
		
		JTextPane txtpnProposicionado = new JTextPane();
		txtpnProposicionado.setEditable(false);
		txtpnProposicionado.setBackground(SystemColor.menu);
		txtpnProposicionado.setText("Proposicionado");
		txtpnProposicionado.setBounds(10, 104, 76, 20);
		panel_transactionInProgress.add(txtpnProposicionado);
		
		transactionProgressPropositioned = new JTextField();
		transactionProgressPropositioned.setColumns(10);
		transactionProgressPropositioned.setBounds(96, 104, 244, 20);
		panel_transactionInProgress.add(transactionProgressPropositioned);
		
		JButton btnVoltar_4 = new JButton("Voltar");
		btnVoltar_4.setBounds(346, 239, 91, 23);
		panel_transactionInProgress.add(btnVoltar_4);
		
		JButton btnReportar = new JButton("Reportar");
		btnReportar.setBounds(346, 205, 91, 23);
		panel_transactionInProgress.add(btnReportar);
		
		JButton btnFinalizada = new JButton("Finalizada");
		btnFinalizada.setBounds(159, 239, 91, 23);
		panel_transactionInProgress.add(btnFinalizada);
		
		JTextPane txtpnOwlscore = new JTextPane();
		txtpnOwlscore.setEditable(false);
		txtpnOwlscore.setBackground(SystemColor.menu);
		txtpnOwlscore.setText("Owlscore:");
		txtpnOwlscore.setBounds(39, 208, 51, 20);
		panel_transactionInProgress.add(txtpnOwlscore);
		
		JRadioButton radioButton_3 = new JRadioButton("1");
		radioButton_3.setBounds(96, 205, 31, 23);
		panel_transactionInProgress.add(radioButton_3);
		
		JRadioButton radioButton_4 = new JRadioButton("2");
		radioButton_4.setBounds(138, 205, 31, 23);
		panel_transactionInProgress.add(radioButton_4);
		
		JRadioButton radioButton_5 = new JRadioButton("3");
		radioButton_5.setBounds(185, 205, 31, 23);
		panel_transactionInProgress.add(radioButton_5);
		
		JRadioButton radioButton_6 = new JRadioButton("4");
		radioButton_6.setBounds(234, 205, 31, 23);
		panel_transactionInProgress.add(radioButton_6);
		
		JRadioButton radioButton_7 = new JRadioButton("5");
		radioButton_7.setBounds(281, 205, 31, 23);
		panel_transactionInProgress.add(radioButton_7);
		
		ButtonGroup owlstarGroup = new ButtonGroup();
		owlstarGroup.add(radioButton_3);
		owlstarGroup.add(radioButton_4);
		owlstarGroup.add(radioButton_5);
		owlstarGroup.add(radioButton_6);
		owlstarGroup.add(radioButton_7);
		
		radioButton_3.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				newOwlScore = 1;
			}
		});
		radioButton_4.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				newOwlScore = 2;
			}
		});
		radioButton_5.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				newOwlScore = 3;
			}
		});
		radioButton_6.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				newOwlScore = 4;
			}
		});
		radioButton_7.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				newOwlScore = 5;
			}
		});
		
		JPanel panel_mainAdmin = new JPanel();
		frame.getContentPane().add(panel_mainAdmin, "main_page_admin");
		panel_mainAdmin.setLayout(null);
		
		JTextPane textPane_10_welcomeAdmin = new JTextPane();
		textPane_10_welcomeAdmin.setText("Bem vindo, %Name");
		textPane_10_welcomeAdmin.setEditable(false);
		textPane_10_welcomeAdmin.setBackground(SystemColor.menu);
		textPane_10_welcomeAdmin.setBounds(25, 61, 105, 20);
		panel_mainAdmin.add(textPane_10_welcomeAdmin);
		
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
		
		newAdminUsername = new JTextField();
		newAdminUsername.setColumns(10);
		newAdminUsername.setBounds(95, 42, 86, 20);
		panel_AdminAccountCreation.add(newAdminUsername);
		
		newAdminPassword = new JTextField();
		newAdminPassword.setColumns(10);
		newAdminPassword.setBounds(320, 42, 86, 20);
		panel_AdminAccountCreation.add(newAdminPassword);
		
		newAdminFullName = new JTextField();
		newAdminFullName.setColumns(10);
		newAdminFullName.setBounds(95, 73, 140, 20);
		panel_AdminAccountCreation.add(newAdminFullName);
		
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

		ButtonGroup genderGroupAdmin = new ButtonGroup();
		genderGroupAdmin.add(radioButton);
		genderGroupAdmin.add(radioButton_1);
		genderGroupAdmin.add(radioButton_2);
		
		radioButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				newAdminGender = 'M';
			}
		});
		
		radioButton_1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				newAdminGender = 'F';
			}
		});
		
		radioButton_2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				newAdminGender = 'O';
			}
		});
		
		
		
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
		
		newAdminAdress = new JTextField();
		newAdminAdress.setColumns(10);
		newAdminAdress.setBounds(95, 133, 190, 20);
		panel_AdminAccountCreation.add(newAdminAdress);
		
		JTextPane textPane_18 = new JTextPane();
		textPane_18.setText("Telefone");
		textPane_18.setEditable(false);
		textPane_18.setBackground(SystemColor.menu);
		textPane_18.setBounds(10, 164, 79, 20);
		panel_AdminAccountCreation.add(textPane_18);
		
		newAdminPhone = new JTextField();
		newAdminPhone.setColumns(10);
		newAdminPhone.setBounds(95, 164, 86, 20);
		panel_AdminAccountCreation.add(newAdminPhone);
		
		JTextPane textPane_19 = new JTextPane();
		textPane_19.setText("E-mail");
		textPane_19.setEditable(false);
		textPane_19.setBackground(SystemColor.menu);
		textPane_19.setBounds(10, 195, 79, 20);
		panel_AdminAccountCreation.add(textPane_19);
		
		newAdminEmail = new JTextField();
		newAdminEmail.setColumns(10);
		newAdminEmail.setBounds(95, 195, 140, 20);
		panel_AdminAccountCreation.add(newAdminEmail);
		
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
		
		newOwlspotAdress = new JTextField();
		newOwlspotAdress.setColumns(10);
		newOwlspotAdress.setBounds(90, 67, 140, 20);
		panel_addOwlspot.add(newOwlspotAdress);
		
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
		
		newOwlspotReference = new JTextField();
		newOwlspotReference.setColumns(10);
		newOwlspotReference.setBounds(90, 98, 140, 20);
		panel_addOwlspot.add(newOwlspotReference);
		
		JTextPane txtpnNome = new JTextPane();
		txtpnNome.setText("Nome");
		txtpnNome.setEditable(false);
		txtpnNome.setBackground(SystemColor.menu);
		txtpnNome.setBounds(10, 129, 70, 20);
		panel_addOwlspot.add(txtpnNome);
		
		newOwlspotName = new JTextField();
		newOwlspotName.setColumns(10);
		newOwlspotName.setBounds(90, 129, 140, 20);
		panel_addOwlspot.add(newOwlspotName);
		
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
		
		JTextPane userProfileOwlstars = new JTextPane();
		userProfileOwlstars.setFont(new Font("Tahoma", Font.PLAIN, 38));
		userProfileOwlstars.setBounds(354, 42, 58, 52);
		panel_userProfile.add(userProfileOwlstars);
		
		JButton btnVoltar_5 = new JButton("Voltar");
		btnVoltar_5.setBounds(341, 239, 91, 23);
		panel_userProfile.add(btnVoltar_5);
		
		JTextPane userProfileUsername = new JTextPane();
		userProfileUsername.setEditable(false);
		userProfileUsername.setBounds(10, 42, 213, 20);
		panel_userProfile.add(userProfileUsername);
		
		JPanel panel_searchUser = new JPanel();
		panel_searchUser.setLayout(null);
		frame.getContentPane().add(panel_searchUser, "search_user");
		
		userSearchQuery = new JTextField();
		userSearchQuery.setColumns(10);
		userSearchQuery.setBounds(10, 35, 193, 20);
		panel_searchUser.add(userSearchQuery);
		
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
		
		JPanel panel_transactionProposals = new JPanel();
		panel_transactionProposals.setLayout(null);
		frame.getContentPane().add(panel_transactionProposals, "transaction_proposals");
		
		JTextPane txtpnPropostasDeTroca = new JTextPane();
		txtpnPropostasDeTroca.setText("Propostas de troca");
		txtpnPropostasDeTroca.setEditable(false);
		txtpnPropostasDeTroca.setBackground(SystemColor.menu);
		txtpnPropostasDeTroca.setBounds(10, 11, 154, 20);
		panel_transactionProposals.add(txtpnPropostasDeTroca);
		
		JList list_5 = new JList();
		list_5.setBounds(10, 42, 292, 209);
		panel_transactionProposals.add(list_5);
		
		JButton btnVisualizarOferta = new JButton("Visualizar oferta");
		btnVisualizarOferta.setBounds(312, 42, 120, 23);
		panel_transactionProposals.add(btnVisualizarOferta);
		
		JButton button_13 = new JButton("Voltar");
		button_13.setBounds(329, 228, 95, 23);
		panel_transactionProposals.add(button_13);
		
		JPanel panel_userProfileAdmin = new JPanel();
		panel_userProfileAdmin.setLayout(null);
		frame.getContentPane().add(panel_userProfileAdmin, "user_profile_admin");
		
		JTextPane textPane_21 = new JTextPane();
		textPane_21.setEditable(false);
		textPane_21.setText("Usu\u00E1rio:");
		textPane_21.setBackground(SystemColor.menu);
		textPane_21.setBounds(10, 11, 46, 20);
		panel_userProfileAdmin.add(textPane_21);
		
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
		
		JTextPane userProfileAdminOwlstars = new JTextPane();
		userProfileAdminOwlstars.setFont(new Font("Tahoma", Font.PLAIN, 38));
		userProfileAdminOwlstars.setBounds(354, 42, 58, 52);
		panel_userProfileAdmin.add(userProfileAdminOwlstars);
		
		JButton button_10 = new JButton("Voltar");
		button_10.setBounds(341, 239, 91, 23);
		panel_userProfileAdmin.add(button_10);
		
		JButton btnRemoverUsurio = new JButton("Remover Usu\u00E1rio");
		btnRemoverUsurio.setBounds(304, 205, 128, 23);
		panel_userProfileAdmin.add(btnRemoverUsurio);
		
		JTextPane userProfileAdminUsername = new JTextPane();
		userProfileAdminUsername.setEditable(false);
		userProfileAdminUsername.setBounds(10, 42, 214, 20);
		panel_userProfileAdmin.add(userProfileAdminUsername);
	}

	public void changePage(String page)
	{
		CardLayout cardLayout = (CardLayout) frame.getContentPane().getLayout();
		cardLayout.show(frame.getContentPane(), page);
	}
	
	public void setComboboxOwlSpots(List<OwlSpot> entry)
	{
		proposableOwlspots = entry;
	}
	public void setComboboxCollection(List<Book> entry)
	{
		 proposableCollection = entry;
	}
}
