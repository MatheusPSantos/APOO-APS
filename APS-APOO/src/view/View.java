package view;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class View extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;
	
	private JLabel lblImagem;
	private JButton btLogin,btCadastro;
	

	
	public static void main(String[] args) {
		new View();
		
	}
		

	public View() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		
		getContentPane().setLayout(null);
	    
	    btLogin = new JButton("Login");
	    btLogin.setBounds(47,149,100,20);
	    btLogin.setBackground(Color.white);
	    btLogin.addActionListener(this);
	    getContentPane().add(btLogin);
	    
	    btCadastro = new JButton("Cadastro");
	    btCadastro.setBounds(47,180,100,20);
	    btCadastro.setBackground(Color.white);
	    getContentPane().add(btCadastro);
	    
	    lblImagem = new JLabel();
	    lblImagem.setBounds(203,124,185,100);
	    ImageIcon imagem = new ImageIcon(View.class.getResource("/view/Icon.png"));
	    Image imag = imagem.getImage().getScaledInstance(lblImagem.getWidth(), lblImagem.getHeight(), Image.SCALE_DEFAULT);
	    lblImagem.setIcon(new ImageIcon(imag));
	    getContentPane().add(lblImagem);
	    
	    btCadastro.addActionListener(new btAcao());
	    btLogin.addActionListener(new btAcao());
	    
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setBackground(Color.darkGray);
		setResizable(false);
		setSize(607,476);
		setVisible(true);
		setLocationRelativeTo(null);
		setTitle("imarket");

	}
	private class btAcao implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			JButton c =(JButton) e.getSource();
			if (c  == btCadastro) {
				new ViewCadastro();
				setVisible(false);
			}
			if(c == btLogin) {
				new ViewLogin();
				setVisible(false);
			}
		}	
	}
}
