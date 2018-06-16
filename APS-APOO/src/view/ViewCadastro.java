package view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

public class ViewCadastro extends JFrame implements ActionListener {

	
	private static final long serialVersionUID = 1L;
	
	private JLabel lblCPF,lblTelefone,lblBairro,lblNome,lblRua,lblN,lblEmail;
	private JButton btOk;
	private JTextField jtxtnome,jtxtCPF,telefone,jtxtbairro,jtxtrua,jtxtn,email,jtxtCNPJ;
	private JPasswordField jpSenha;
	private JLabel lblSenha;
	private JTextField jtxCNPJ;
	public String Nome,Email,Telefone,Rua,Numero,Bairro,CPF,Senha,CNPJ;
	//private int clock1 = 0;
	//private int clock2 = 0;
	private JButton btnCfp = new JButton("CFP");
	private JButton btnCnpj = new JButton("CNPJ");
	private JLabel lblCNPJ;
	
	
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
	    lblCPF.setBounds(167,251,33,20);
	    getContentPane().add(lblCPF);
	    
	    /**
		 * Caixa de texto que pega as informa��es.
		 */
	    
	    lblSenha = new JLabel("Senha: ");
	    lblSenha.setForeground(Color.WHITE);
	    lblSenha.setBounds(162, 276, 46, 14);
	    getContentPane().add(lblSenha);
	    
	    lblCNPJ = new JLabel("CNPJ");
	    lblCNPJ.setForeground(Color.WHITE);
	    lblCNPJ.setBounds(166, 254, 46, 14);
	    getContentPane().add(lblCNPJ);
	    
	    jtxtnome = new JTextField("Nome completo");
	    jtxtnome.setBounds(210,101,220,20);
	    getContentPane().add(jtxtnome);
	    
	    jtxtCPF = new JTextField("CPF");
	    jtxtCPF.setBounds(210,251,220,20);
	    getContentPane().add(jtxtCPF);
	    
	    jtxCNPJ = new JTextField();
	    jtxCNPJ.setBounds(210, 251, 220, 20);
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
	   	  
	    this.Nome = jtxtnome.getText();
	    this.Email = jtxtCPF.getText();
	    this.Telefone = telefone.getText();
	    this.Rua = jtxtrua.getText();
	    this.Numero = jtxtn.getText();
	    this.Bairro = jtxtbairro.getText();
	    this.CPF = jtxtCPF.getText();
	    //this.CNPJ = jtxtCNPJ.getText();
	    //this.Senha = jpSenha.getText();
    
	    /**
		 * Botoes.
		 */

	    btOk = new JButton("OK");
	    btOk.setBackground(Color.white);
	    btOk.setBounds(250,312,100,20);
	    getContentPane().add(btOk);
	    JLabel lblTipo = new JLabel("Tipo :");
	    lblTipo.setForeground(Color.white);
	    lblTipo.setBounds(166, 232, 46, 14);
	    getContentPane().add(lblTipo);
	    
	    jpSenha = new JPasswordField();
	    jpSenha.setBounds(210, 276, 220, 20);
	    getContentPane().add(jpSenha);
	    
	    /**
		 * Defini��o do Frame.
		 */
	    
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setBackground(Color.darkGray);
		
		
		btnCfp.setBounds(210, 226, 100, 20);
		getContentPane().add(btnCfp);
		btnCfp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				jtxCNPJ.setVisible(false);
				jtxtCPF.setVisible(true);
				lblCPF.setVisible(true);
				lblCNPJ.setVisible(false);
			}
		});
		
		
		btnCnpj.setBounds(330, 226, 100, 20);
		btnCnpj.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				jtxCNPJ.setVisible(true);
				jtxtCPF.setVisible(false);
				lblCPF.setVisible(false);
				lblCNPJ.setVisible(true);
			}
		});
		jtxCNPJ.setVisible(false);
		jtxtCPF.setVisible(false);
		getContentPane().add(btnCnpj);
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
				new ViewLogin();
				setVisible(false);
			}
		}	
}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}