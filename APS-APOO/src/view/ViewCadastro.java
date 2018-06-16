package view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JPasswordField;

public class ViewCadastro extends JFrame implements ActionListener {

	
	private static final long serialVersionUID = 1L;
	
	private JLabel lblCPF,lblTelefone,lblBairro,lblNome,lblRua,lblN,lblEmail;
	private JButton btOk;
	public JTextField jtxtnome,jtxtCPF,telefone,jtxtbairro,jtxtrua,jtxtn,email,jtxtCNPJ;
	private JPasswordField pwdRr;
	private JLabel lblSenha;
	private JTextField jtxttextField;
	public String Nome,Email,Telefone,Rua,Numero,Bairro,CPF,Senha,CNPJ;

	
	
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
		 * Caixa de texto que pega as informações.
		 */
	    
	    lblSenha = new JLabel("Senha: ");
	    lblSenha.setForeground(Color.WHITE);
	    lblSenha.setBounds(162, 276, 46, 14);
	    getContentPane().add(lblSenha);
	    
	    JLabel lblNewLabel = new JLabel("New label");
	    lblNewLabel.setBounds(0, 0, 46, 14);
	    getContentPane().add(lblNewLabel);
	    
	    jtxtnome = new JTextField("Nome completo");
	    jtxtnome.setBounds(210,101,220,20);
	    getContentPane().add(jtxtnome);
	    
	    jtxtCPF = new JTextField("");
	    jtxtCPF.setBounds(210,251,220,20);
	    getContentPane().add(jtxtCPF);
	    
	    jtxttextField = new JTextField();
	    jtxttextField.setBounds(210, 251, 220, 20);
	    getContentPane().add(jtxttextField);
	    jtxttextField.setColumns(10);
	    
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
	    
	    
	    
	    Nome = jtxtnome.getText();
	    Email = jtxtCPF.getText();
	    Telefone = telefone.getText();
	    Rua = jtxtrua.getText();
	    Numero = jtxtn.getText();
	    Bairro = jtxtbairro.getText();
	    CPF = jtxtCPF.getText();
	    CNPJ = jtxtCNPJ.getText();
	    
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
	    
	    pwdRr = new JPasswordField();
	    pwdRr.setBounds(210, 276, 220, 20);
	    getContentPane().add(pwdRr);
	    
	    /**
		 * Definição do Frame.
		 */
	    
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setBackground(Color.darkGray);
		
		JButton btnCfp = new JButton("CFP");
		btnCfp.setBounds(210, 226, 100, 20);
		getContentPane().add(btnCfp);
		
		JButton btnCnpj = new JButton("CNPJ");
		btnCnpj.setBounds(330, 226, 100, 20);
		getContentPane().add(btnCnpj);
		setResizable(false);
		setSize(607,476);
		setVisible(true);
		setLocationRelativeTo(null);
		setTitle("Cadastro");
		
		btOk.addActionListener(new btAcao());
	}
	
	/**
	 * Açoes dos botoes.
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