package view;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class ViewLogin extends JFrame {

	
	private static final long serialVersionUID = 1L;
	
	private JLabel lblID,lblSenha;
	private JTextField jtID;
	private JPasswordField jpSenha;
	public String ID,Senha;
	
	public static void main(String[] args) {
	 new ViewLogin();
		
	}

	public ViewLogin() {
		
		getContentPane().setLayout(null);
	    
		/**
		 * Labels.
		 */
		
	    lblID = new JLabel("ID :");
	    lblID.setForeground(Color.white);
	    lblID.setBounds(202,159,25,20);
	    getContentPane().add(lblID);
	    
	    lblSenha = new JLabel("Senha :");
	    lblSenha.setForeground(Color.white);
	    lblSenha.setBounds(182,190,45,20);
	    getContentPane().add(lblSenha);
	    
	    
	    /**
		 * Caixa de texto que pega as informações.
		 */
	    
	    jpSenha = new JPasswordField();
	    jpSenha.setBounds(237,190,220,20);
	    getContentPane().add(jpSenha);
	    
	    jtID = new JTextField("ID/E-mail");
	    jtID.setBounds(237,159,220,20);
	    getContentPane().add(jtID);
	    
	    ID = jtID.getText();
	    Senha = jpSenha.getText();
	    
	    /**
		 * Definição do Frame.
		 */
	    
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setBackground(Color.darkGray);
		setResizable(false);
		setSize(607,476);
		setVisible(true);
		setLocationRelativeTo(null);
		setTitle("Login");
	}
}
