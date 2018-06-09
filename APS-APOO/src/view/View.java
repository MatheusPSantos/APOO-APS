package view;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class View extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;
	
	private JLabel lblImagem;
	private JButton btLogin,btCadastro;
	

	/**
	 * Inicio das aplicações.
	 */
	public static void main(String[] args) {
		new View();
		
	}
		
	
	public View() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		
		getContentPane().setLayout(null);
	    
		/**
		 * Botoes.
		 */
		
	    btLogin = new JButton("Login");
	    btLogin.setBounds(173,180,100,20);
	    btLogin.setBackground(Color.white);
	    btLogin.addActionListener(this);
	    getContentPane().add(btLogin);
	    btLogin.addActionListener(new btAcao());
	    
	    btCadastro = new JButton("Cadastro");
	    btCadastro.setBounds(173,211,100,20);
	    btCadastro.setBackground(Color.white);
	    getContentPane().add(btCadastro);
	    
	    /**
		 * Imagem imarket.
		 */
	    
	    lblImagem = new JLabel();
	    lblImagem.setBounds(360,149,185,100);
	    ImageIcon imagem = new ImageIcon(View.class.getResource("/view/Icon.png"));
	    Image imag = imagem.getImage().getScaledInstance(lblImagem.getWidth(), lblImagem.getHeight(), Image.SCALE_DEFAULT);
	    lblImagem.setIcon(new ImageIcon(imag));
	    getContentPane().add(lblImagem);
	    btCadastro.addActionListener(new btAcao());
	    
	    /**
		 * Definição do Frame.
		 */
	    
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setBackground(Color.darkGray);
		setResizable(false);
		setSize(607,476);
		setVisible(true);
		setLocationRelativeTo(null);
		setTitle("imarket");

	}
	
	/**
	 * Açoes dos botoes.
	 */
	
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

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
