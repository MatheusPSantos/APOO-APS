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
	public JTextField nome,CPF,telefone,bairro,rua,n,email;
	private JPasswordField pwdRr;

	
	
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
	    lblNome.setBounds(177,37,50,20);
	    getContentPane().add(lblNome);
	    
	    lblEmail = new JLabel("E-mail :");
	    lblEmail.setForeground(Color.white);
	    lblEmail.setBounds(165,62,50,20);
	    getContentPane().add(lblEmail);
	    
	    lblTelefone = new JLabel("Celular :");
	    lblTelefone.setForeground(Color.white);
	    lblTelefone.setBounds(154,87,44,20);
	    getContentPane().add(lblTelefone);
	    
	    lblRua = new JLabel("Rua :");
	    lblRua.setForeground(Color.white);
	    lblRua.setBounds(177,112,50,20);
	    getContentPane().add(lblRua);
	    
	    lblN = new JLabel("N :");
	    lblN.setForeground(Color.white);
	    lblN.setBounds(376,112,19,20);
	    getContentPane().add(lblN);
	    
	    lblBairro = new JLabel("Bairro :");
	    lblBairro.setForeground(Color.white);
	    lblBairro.setBounds(177,137,50,20);
	    getContentPane().add(lblBairro);

	    lblCPF = new JLabel("CPF :");
	    lblCPF.setForeground(Color.white);
	    lblCPF.setBounds(182,187,33,20);
	    getContentPane().add(lblCPF);
	    
	    /**
		 * Caixa de texto que pega as informações.
		 */
	    
	    nome = new JTextField("Nome completo");
	    nome.setBounds(225,37,220,20);
	    getContentPane().add(nome);
	    
	    CPF = new JTextField("");
	    CPF.setBounds(225,187,220,20);
	    getContentPane().add(CPF);
	    
	    bairro = new JTextField("");
	    bairro.setBounds(225,137,220,20);
	    getContentPane().add(bairro);
	    
	    n = new JTextField("");
	    n.setBounds(395,112,50,20);
	    getContentPane().add(n);
	    
	    rua = new JTextField("");
	    rua.setBounds(225,112,143,20);
	    getContentPane().add(rua);
	    
	    telefone = new JTextField("");
	    telefone.setBounds(225,87,220,20);
	    getContentPane().add(telefone);
	    
	    email = new JTextField("");
	    email.setBounds(225,62,220,20);
	    getContentPane().add(email);
	    
	    
	    /**
		 * Botoes.
		 */

	    btOk = new JButton("OK");
	    btOk.setBackground(Color.white);
	    btOk.setBounds(282,277,100,20);
	    getContentPane().add(btOk);
	    
	    JRadioButton rdbtnCliente = new JRadioButton("CPF");
	    rdbtnCliente.setBackground(Color.darkGray);
	    rdbtnCliente.setForeground(Color.white);
	    rdbtnCliente.setBounds(336, 164, 109, 23);
	    getContentPane().add(rdbtnCliente);
	    
	    JRadioButton rdbtnLojista = new JRadioButton("CNPJ");
	    rdbtnLojista.setBackground(Color.darkGray);
	    rdbtnLojista.setForeground(Color.white);
	    rdbtnLojista.setBounds(225, 164, 109, 23);
	    getContentPane().add(rdbtnLojista);
	    
	    JLabel lblTipo = new JLabel("Tipo :");
	    lblTipo.setForeground(Color.white);
	    lblTipo.setBounds(181, 162, 46, 14);
	    getContentPane().add(lblTipo);
	    
	    pwdRr = new JPasswordField();
	    pwdRr.setText("rr");
	    pwdRr.setBounds(225, 219, 220, 20);
	    getContentPane().add(pwdRr);
	    
	    /**
		 * Definição do Frame.
		 */
	    
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setBackground(Color.darkGray);
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