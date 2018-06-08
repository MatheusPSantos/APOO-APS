package view;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class ViewLogin extends JFrame {

	
	private static final long serialVersionUID = 1L;
	
	private JLabel lblID,lblLogin,lblSenha;
	private JTextField ID;
	private JPasswordField Senha;
	
	
	public static void main(String[] args) {
	 new ViewLogin();
		
	}

	public ViewLogin() {
		
		getContentPane().setLayout(null);
		
		lblLogin = new JLabel("Login");
		lblLogin.setForeground(Color.white);
	    lblLogin.setBounds(116,0,60,20);
	    getContentPane().add(lblLogin);
	    
	    lblID = new JLabel("ID :");
	    lblID.setForeground(Color.white);
	    lblID.setBounds(30,37,25,20);
	    getContentPane().add(lblID);
	    
	    ID = new JTextField("ID/E-mail");
	    ID.setBounds(55,37,220,20);
	    getContentPane().add(ID);
	    
	    lblSenha = new JLabel("Senha :");
	    lblSenha.setForeground(Color.white);
	    lblSenha.setBounds(10,62,45,20);
	    getContentPane().add(lblSenha);
	    
	    Senha = new JPasswordField();
	    Senha.setBounds(55,62,220,20);
	    getContentPane().add(Senha);
	    
	    
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setBackground(Color.darkGray);
		setResizable(false);
		setSize(300,400);
		setVisible(true);
		setLocationRelativeTo(null);
		setTitle("APS - APOO");
	}
}
