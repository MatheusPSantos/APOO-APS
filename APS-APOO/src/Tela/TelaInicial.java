package Tela;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class TelaInicial extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblTitolo,lblImagem;
	private JButton btLogin,btCadastro;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaInicial frame = new TelaInicial();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public TelaInicial() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		setLayout(null);
		
		lblTitolo = new JLabel("APS - APOO");
	    lblTitolo.setForeground(Color.black);
	    lblTitolo.setBounds(30,10,80,10);
	    add(lblTitolo);
	    
	    btLogin = new JButton("Login");
	    btLogin.setBounds(10,40,100,20);
	    btLogin.setBackground(Color.white);
	    add(btLogin);
	    
	    btCadastro = new JButton("Cadastro");
	    btCadastro.setBounds(10,60,100,20);
	    btCadastro.setBackground(Color.white);
	    add(btCadastro);
	    
	    lblImagem = new JLabel();
	    lblImagem.setBounds(150,15,100,100);
	    ImageIcon imagem = new ImageIcon(TelaPrincipal.class.getResource("/Tela/Icon.png"));
	    Image imag = imagem.getImage().getScaledInstance(lblImagem.getWidth(), lblImagem.getHeight(), Image.SCALE_DEFAULT);
	    lblImagem.setIcon(new ImageIcon(imag));
	    add(lblImagem);
	    
	}

}
