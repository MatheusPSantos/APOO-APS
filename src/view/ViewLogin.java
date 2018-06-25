package view;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import models.ClienteDAO;
import models.LojistaDAO;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class ViewLogin extends JFrame implements ActionListener{

	
	private static final long serialVersionUID = 1L;
	
	private JLabel lblID,lblSenha;
	private JTextField jtID;
	private JPasswordField jpSenha;

	private JButton btnLoging;
	
	public static void main(String[] args) {
	 new ViewLogin();
	}

	public ViewLogin() {
		
		getContentPane().setLayout(null);
	    
		/**
		 * Labels.
		 */
		
	    lblID = new JLabel("CPF/CNPJ: ");
	    lblID.setForeground(Color.white);
	    lblID.setBounds(182,159,100,20);
	    getContentPane().add(lblID);
	    
	    lblSenha = new JLabel("Senha :");
	    lblSenha.setForeground(Color.white);
	    lblSenha.setBounds(182,190,45,20);
	    getContentPane().add(lblSenha);
	    
	    
	    /**
		 * Caixa de texto que pega as informa��es.
		 */
	    
	    jpSenha = new JPasswordField();
	    jpSenha.setBounds(237,190,220,20);
	    getContentPane().add(jpSenha);
	    
	    jtID = new JTextField();
	    jtID.setBounds(237,159,220,20);
	    getContentPane().add(jtID);

	    /**
		 * Defini��o do Frame.
		 */
	    
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setBackground(Color.darkGray);
		
		
		
		btnLoging = new JButton("Login");
		btnLoging.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// verificacao de usuario cliente
				ClienteDAO clienteDAO = new ClienteDAO();
				LojistaDAO lojistaDAO = new LojistaDAO();
				if(clienteDAO.checkLoginCliente(jtID.getText(), jpSenha.getText())) {
					new ViewPedido().setVisible(true);
				} else
					try {
						if(lojistaDAO.checkLoginLojista(jtID.getText(), jpSenha.getText())) {

							new ViewEstoque().setVisible(true);
						}
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						JOptionPane.showMessageDialog(null, "erro: "+e1);
					}
			}
		});
		btnLoging.setBounds(279, 231, 89, 23);
		getContentPane().add(btnLoging);
		setResizable(false);
		setSize(607,476);
		setVisible(true);
		setLocationRelativeTo(null);
		setTitle("Login");
	}

		@Override
		public void actionPerformed(ActionEvent e) {

		}
}