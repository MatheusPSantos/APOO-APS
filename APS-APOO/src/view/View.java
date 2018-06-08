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
	
	private JLabel lblTitolo,lblImagem;
	private JButton btLogin,btCadastro;
	

	
	public static void main(String[] args) {
		new View();
		
	}
		

	public View() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		
		setLayout(null);
		
		
		lblTitolo = new JLabel("APS - APOO");
	    lblTitolo.setForeground(Color.black);
	    lblTitolo.setBounds(30,10,80,10);
	    add(lblTitolo);
	    
	    btLogin = new JButton("Login");
	    btLogin.setBounds(10,40,100,20);
	    btLogin.setBackground(Color.white);
	    btLogin.addActionListener(this);
	    add(btLogin);
	    
	    btCadastro = new JButton("Cadastro");
	    btCadastro.setBounds(10,60,100,20);
	    btCadastro.setBackground(Color.white);
	    add(btCadastro);
	    
	    lblImagem = new JLabel();
	    lblImagem.setBounds(150,15,100,100);
	    ImageIcon imagem = new ImageIcon(View.class.getResource("/view/Icon.png"));
	    Image imag = imagem.getImage().getScaledInstance(lblImagem.getWidth(), lblImagem.getHeight(), Image.SCALE_DEFAULT);
	    lblImagem.setIcon(new ImageIcon(imag));
	    add(lblImagem);
	    
	    btCadastro.addActionListener(new btAcao());
	    
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setBackground(Color.darkGray);
		setResizable(false);
		setSize(300,400);
		setVisible(true);
		setLocationRelativeTo(null);
		setTitle("APS - APOO");

	}
	private class btAcao implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			JButton c =(JButton) e.getSource();
			if (c  == btCadastro) {
				new TelaCadastro2();
				setVisible(false);
			}
		}
		
		
	}
}
