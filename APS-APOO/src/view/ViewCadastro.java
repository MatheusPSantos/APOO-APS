package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.JPasswordField;

public class ViewCadastro extends JFrame {

	
	private static final long serialVersionUID = 1L;
	
	private JLabel lblCadastro,lblCPF,lblTelefone,lblBairro,lblNome,lblHoraio,lblRua,lblN,lblEmail;
	private JButton btOk;
	private JTextField nome,CPF,telefone,bairro,horario,rua,n,email;
	private JPasswordField pwdRr;

	
	
	public static void main(String[] args) {
	 new ViewCadastro();
		
	}

	public ViewCadastro() {
		
		getContentPane().setLayout(null);
		
		lblCadastro = new JLabel("Cadastro");
		lblCadastro.setForeground(Color.white);
	    lblCadastro.setBounds(116,0,60,20);
	    getContentPane().add(lblCadastro, BorderLayout.NORTH);
	    
	    lblNome = new JLabel("Nome :");
	    lblNome.setForeground(Color.white);
	    lblNome.setBounds(5,37,50,20);
	    getContentPane().add(lblNome);
	    
	    nome = new JTextField("Nome completo");
	    nome.setBounds(55,37,220,20);
	    getContentPane().add(nome);
	    
	    lblEmail = new JLabel("E-mail :");
	    lblEmail.setForeground(Color.white);
	    lblEmail.setBounds(5,62,50,20);
	    getContentPane().add(lblEmail);
	    
	    email = new JTextField("");
	    email.setBounds(55,62,220,20);
	    getContentPane().add(email);
	    
	    lblTelefone = new JLabel("Celular :");
	    lblTelefone.setForeground(Color.white);
	    lblTelefone.setBounds(5,87,50,20);
	    getContentPane().add(lblTelefone);
	    
	    telefone = new JTextField("");
	    telefone.setBounds(55,87,220,20);
	    getContentPane().add(telefone);
	    
	    lblRua = new JLabel("Rua :");
	    lblRua.setForeground(Color.white);
	    lblRua.setBounds(5,112,50,20);
	    getContentPane().add(lblRua);
	    
	    rua = new JTextField("");
	    rua.setBounds(55,112,143,20);
	    getContentPane().add(rua);
	    
	    lblN = new JLabel("N :");
	    lblN.setForeground(Color.white);
	    lblN.setBounds(208,112,19,20);
	    getContentPane().add(lblN);
	    
	    n = new JTextField("");
	    n.setBounds(225,112,50,20);
	    getContentPane().add(n);
	    
	    lblBairro = new JLabel("Bairro :");
	    lblBairro.setForeground(Color.white);
	    lblBairro.setBounds(5,137,50,20);
	    getContentPane().add(lblBairro);
	    
	    bairro = new JTextField("");
	    bairro.setBounds(55,137,220,20);
	    getContentPane().add(bairro);

	    lblCPF = new JLabel("CPF :");
	    lblCPF.setForeground(Color.white);
	    lblCPF.setBounds(5,162,50,20);
	    getContentPane().add(lblCPF);
	    
	    CPF = new JTextField("");
	    CPF.setBounds(55,162,220,20);
	    getContentPane().add(CPF);

	    btOk = new JButton("OK");
	    btOk.setBackground(Color.white);
	    btOk.setBounds(98,263,100,20);
	    getContentPane().add(btOk);
	    
	    JRadioButton rdbtnCliente = new JRadioButton("Cliente");
	    rdbtnCliente.setBackground(Color.darkGray);
	    rdbtnCliente.setForeground(Color.white);
	    rdbtnCliente.setBounds(166, 200, 109, 23);
	    getContentPane().add(rdbtnCliente);
	    
	    JRadioButton rdbtnLojista = new JRadioButton("Lojista");
	    rdbtnLojista.setBackground(Color.darkGray);
	    rdbtnLojista.setForeground(Color.white);
	    rdbtnLojista.setBounds(55, 200, 109, 23);
	    getContentPane().add(rdbtnLojista);
	    
	    JLabel lblTipo = new JLabel("Tipo :");
	    lblTipo.setForeground(Color.white);
	    lblTipo.setBounds(5, 204, 46, 14);
	    getContentPane().add(lblTipo);
	    
	    pwdRr = new JPasswordField();
	    pwdRr.setText("rr");
	    pwdRr.setBounds(55, 232, 220, 20);
	    getContentPane().add(pwdRr);
	    
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setBackground(Color.darkGray);
		setResizable(false);
		setSize(300,400);
		setVisible(true);
		setLocationRelativeTo(null);
		setTitle("APS - APOO");
	}
}
