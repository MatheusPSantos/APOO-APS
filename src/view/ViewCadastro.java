package view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import models.Cliente;
import models.ClienteDAO;
import models.Lojista;
import models.LojistaDAO;

import javax.swing.JPasswordField;

public class ViewCadastro extends JFrame implements ActionListener {

	
	private static final long serialVersionUID = 1L;
	
	private JLabel lblCPF,lblTelefone,lblBairro,lblNome,lblRua,lblN,lblEmail;
	private JButton btOk;
	private JTextField jtxtnome,jtxtCPF,telefone,jtxtbairro,jtxtrua,jtxtn,email;
	private JPasswordField jpSenha;
	private JLabel lblSenha;
	private JTextField jtxCNPJ;
	public String Nome,Email,Telefone,Rua,Numero,Bairro,CPF,Senha,CNPJ,NomeMercado;
	private JLabel lblMercado = new JLabel("Mercado: ");
	private JButton btnCfp = new JButton("CFP");
	private JButton btnCnpj = new JButton("CNPJ");
	private JLabel lblCNPJ;
	private JTextField textNomeMercado;
	
	
	public static void main(String[] args) {
	 new ViewCadastro();
	}

	public ViewCadastro() {
		
		getContentPane().setLayout(null);
	    
		/**
		 * Labels.
		 */
		
	    lblNome = new JLabel("Nome :");
	    lblNome.setForeground(Color.white);
	    lblNome.setBounds(162,101,50,20);
	    getContentPane().add(lblNome);
	    
	    lblEmail = new JLabel("E-mail :");
	    lblEmail.setForeground(Color.white);
	    lblEmail.setBounds(162,126,50,20);
	    getContentPane().add(lblEmail);
	    
	    lblTelefone = new JLabel("Celular :");
	    lblTelefone.setForeground(Color.white);
	    lblTelefone.setBounds(156,151,44,20);
	    getContentPane().add(lblTelefone);
	    
	    lblRua = new JLabel("Rua :");
	    lblRua.setForeground(Color.white);
	    lblRua.setBounds(166,176,50,20);
	    getContentPane().add(lblRua);
	    
	    lblN = new JLabel("N :");
	    lblN.setForeground(Color.white);
	    lblN.setBounds(361,176,19,20);
	    getContentPane().add(lblN);
	    
	    lblBairro = new JLabel("Bairro :");
	    lblBairro.setForeground(Color.white);
	    lblBairro.setBounds(162,201,50,20);
	    getContentPane().add(lblBairro);

	    lblCPF = new JLabel("CPF :");
	    lblCPF.setForeground(Color.white);
	    lblCPF.setBounds(167,277,33,20);
	    getContentPane().add(lblCPF);
	    
	    /**
		 * Caixa de texto que pega as informa��es.
		 */
	    
	    lblSenha = new JLabel("Senha: ");
	    lblSenha.setForeground(Color.WHITE);
	    lblSenha.setBounds(162, 227, 46, 14);
	    getContentPane().add(lblSenha);
	    
	    lblCNPJ = new JLabel("CNPJ");
	    lblCNPJ.setForeground(Color.WHITE);
	    lblCNPJ.setBounds(166, 280, 46, 14);
	    getContentPane().add(lblCNPJ);
	    
	    jtxtnome = new JTextField("Nome completo");
	    jtxtnome.setBounds(210,101,220,20);
	    getContentPane().add(jtxtnome);
	    
	    jtxtCPF = new JTextField("CPF");
	    jtxtCPF.setBounds(210,277,220,20);
	    getContentPane().add(jtxtCPF);
	    
	    jtxCNPJ = new JTextField();
	    jtxCNPJ.setBounds(210, 277, 220, 20);
	    getContentPane().add(jtxCNPJ);
	    jtxCNPJ.setColumns(10);
	    
	    jtxtbairro = new JTextField("");
	    jtxtbairro.setBounds(210,201,220,20);
	    getContentPane().add(jtxtbairro);
	    
	    jtxtn = new JTextField("");
	    jtxtn.setBounds(380,176,50,20);
	    getContentPane().add(jtxtn);
	    
	    jtxtrua = new JTextField("");
	    jtxtrua.setBounds(210,176,143,20);
	    getContentPane().add(jtxtrua);
	    
	    telefone = new JTextField("");
	    telefone.setBounds(210,151,220,20);
	    getContentPane().add(telefone);
	    
	    email = new JTextField("");
	    email.setBounds(210,126,220,20);
	    getContentPane().add(email);
	   	  
    
	    /**
		 * Botoes.
		 */

	    btOk = new JButton("OK");
	    btOk.setBackground(Color.white);
	    btOk.setBounds(252,344,100,20);
	    getContentPane().add(btOk);
	    JLabel lblTipo = new JLabel("Tipo :");
	    lblTipo.setForeground(Color.white);
	    lblTipo.setBounds(166, 258, 46, 14);
	    getContentPane().add(lblTipo);
	    
	    jpSenha = new JPasswordField();
	    jpSenha.setBounds(210, 227, 220, 20);
	    getContentPane().add(jpSenha);
	    
	    /**
		 * Defini��o do Frame.
		 */
	    
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setBackground(Color.darkGray);
		
		
		btnCfp.setBounds(210, 252, 100, 20);
		getContentPane().add(btnCfp);
		btnCfp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				jtxCNPJ.setVisible(false);
				jtxtCPF.setVisible(true);
				lblCPF.setVisible(true);
				lblCNPJ.setVisible(false);
				lblMercado.setVisible(false);
				textNomeMercado.setVisible(false);
			}
		});
		
		
		btnCnpj.setBounds(330, 252, 100, 20);
		btnCnpj.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				jtxCNPJ.setVisible(true);
				jtxtCPF.setVisible(false);
				lblCPF.setVisible(false);
				lblCNPJ.setVisible(true);
				lblMercado.setVisible(true);
				textNomeMercado.setVisible(true);
				
			}
		});
		
		
		getContentPane().add(btnCnpj);
		
		textNomeMercado = new JTextField();
		textNomeMercado.setBounds(210, 302, 220, 20);
		getContentPane().add(textNomeMercado);
		textNomeMercado.setColumns(10);
		
		
		lblMercado.setForeground(Color.WHITE);
		lblMercado.setBounds(153, 305, 59, 14);
		jtxCNPJ.setVisible(false);
		jtxtCPF.setVisible(false);
		lblCPF.setVisible(false);
		lblCNPJ.setVisible(false);
		lblMercado.setVisible(false);
		textNomeMercado.setVisible(false);
		getContentPane().add(lblMercado);
		setResizable(false);
		setSize(607,476);
		setVisible(true);
		setLocationRelativeTo(null);
		setTitle("Cadastro");
		
		btOk.addActionListener(new btAcao());
	}
	/**
	 * A�oes dos botoes.
	 */
	
	private class btAcao implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			JButton c =(JButton) e.getSource();
			if (c  == btOk) {
				/**
				 * Manda os dados obtidos.
				 */
				try {
					// verificando se é CPF ou CNPJ
					if(jtxCNPJ.getText().isEmpty()) {
						
						Cliente cliente = new Cliente();// instanciando um objeto da classse Cliente
						ClienteDAO clienteDAO = new ClienteDAO(); // objeto para o acesso de dados
						cliente.setNome(jtxtnome.getText());
						cliente.setEmail(email.getText());
						cliente.setSenha(jpSenha.getText());
						cliente.setTelefone(telefone.getText());
						cliente.setCPF(jtxtCPF.getText());
						
						// passando para a criação no banco
						clienteDAO.create(cliente);
						
					} else {
						
						Lojista lojista = new Lojista(); // instanciando um objeto lojista
						LojistaDAO lojistaDAO = new LojistaDAO();	// objeto de acesso aos dados
						lojista.setNome(jtxtnome.getText());
						lojista.setEmail(email.getText());
						lojista.setSenha(jpSenha.getText());
						lojista.setTelefone(telefone.getText());
						lojista.setCNPJ(jtxCNPJ.getText());
						
						lojistaDAO.create(lojista);	// passando objeto a ser criado no BD
					}
					
					// direciona para a tela de login
					new ViewLogin();
					setVisible(false);
					
				} catch(Exception e2) {
					JOptionPane.showMessageDialog(null, "Algum campo está inválido");
				}
			}
		}	
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}