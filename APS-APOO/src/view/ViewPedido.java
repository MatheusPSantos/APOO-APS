package view;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLayeredPane;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JComboBox;
import javax.swing.JTextArea;

public class ViewPedido extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;
	public JMenuBar barra = new JMenuBar();
	public JMenuItem miCadastroProduto = new JMenuItem("Cadastrar produto");
	public JMenuItem miChecarEstoque = new JMenuItem("Checar Estoque");
	public JMenuItem miEntregas = new JMenuItem("Entregas");
	public JButton btnPedido = new JButton("Pedido");
	public JButton btnFavorito = new JButton("Favoritos");
	public JButton btnEntregas = new JButton("Entregas");
	public JPanel JPPedido;
	JPanel JPEntrgas = new JPanel();
	public JButton btFazerPedido;
	public final JLayeredPane layeredPane = new JLayeredPane();
	public final JPanel JPFavorito = new JPanel();
	public JLabel lblImagem = new JLabel();
	private JButton btnEntrega;
	private JButton btnChecado;
	private final JComboBox listaDeSupermercados = new JComboBox();
	private final JLabel lblMercados = new JLabel("Mercados:");
	private final JComboBox tiposDeProdutos = new JComboBox();
	private final JLabel lblTiposDeProdutos = new JLabel("Tipo de Produtos");
	

	/**
	 * Inicio das aplicações.
	 */
	public static void main(String[] args) {
		new ViewPedido();
	}
		
	
	public ViewPedido() {
		
		getContentPane().setLayout(null);
		
		/**
		 * Atribuindo na barra.
		 */
		barra.setBackground(Color.WHITE);
		setJMenuBar(barra);
		btnPedido.setBackground(Color.WHITE);
		
		btnPedido.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent a) {
				JPPedido.setVisible(true);
				JPFavorito.setVisible(false);
				JPEntrgas.setVisible(false);
			}
		});
		barra.add(btnPedido);
		btnFavorito.setBackground(Color.WHITE);
		btnFavorito.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent a) {
				JPFavorito.setVisible(true);
				JPPedido.setVisible(false);
				JPEntrgas.setVisible(false);
			}
		});
		barra.add(btnFavorito);
		btnEntregas.setBackground(Color.WHITE);
		btnEntregas.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent a) {
				JPFavorito.setVisible(false);
				JPPedido.setVisible(false);
				JPEntrgas.setVisible(true);
			}
		});
		barra.add(btnEntregas);
		
		/**
		 * Definindo JlayeredPane e o JPanel.
		 */
		JPPedido = new JPanel();
		JPPedido.setBackground(Color.DARK_GRAY);
		JPPedido.setBounds(0, 0, 603, 426);
		layeredPane.add(JPPedido);
		JPPedido.setVisible(false);
		JPPedido.setLayout(null);
		
		btFazerPedido = new JButton("Comfirmar Pedido");
		btFazerPedido.setBounds(215,345,168,20);
		btFazerPedido.setBackground(Color.white);
		btFazerPedido.addActionListener(this);
		btFazerPedido.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent a) {
				JPPedido.setVisible(false);
				JPFavorito.setVisible(false);
				JPEntrgas.setVisible(false);
			}
		});
		JPPedido.add(btFazerPedido);
		listaDeSupermercados.setBounds(204, 37, 217, 20);
		
		JPPedido.add(listaDeSupermercados);
		tiposDeProdutos.setBounds(204, 73, 218, 20);
		
		JPPedido.add(tiposDeProdutos);
		lblTiposDeProdutos.setForeground(Color.WHITE);
		lblTiposDeProdutos.setBounds(204, 58, 105, 14);
		
		JPPedido.add(lblTiposDeProdutos);
		lblMercados.setForeground(Color.WHITE);
		lblMercados.setBounds(203, 22, 92, 14);
		
		JPPedido.add(lblMercados);
		JPFavorito.setBackground(Color.DARK_GRAY);
		layeredPane.add(JPFavorito);
		JPFavorito.setBounds(0, 0, 603, 426);
		JPFavorito.setVisible(false);
		JPFavorito.setLayout(null);
		
		btnChecado = new JButton("OK");
		btnChecado.setBounds(261, 353, 89, 23);
		btnChecado.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent a) {
				JPPedido.setVisible(false);
				JPFavorito.setVisible(false);
				JPEntrgas.setVisible(false);
			}
		});
		JPFavorito.add(btnChecado);
		btnChecado.setBackground(Color.WHITE);
		
		
		JPEntrgas.setBackground(Color.DARK_GRAY);
		JPEntrgas.setBounds(0, 0, 603, 426);
		layeredPane.add(JPEntrgas);
		JPEntrgas.setVisible(false);
		JPEntrgas.setLayout(null);
		
		btnEntrega = new JButton("OK");
		btnEntrega.setBounds(261, 353, 89, 23);
		btnEntrega.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent a) {
				JPPedido.setVisible(false);
				JPFavorito.setVisible(false);
				JPEntrgas.setVisible(false);
			}
		});
		JPEntrgas.add(btnEntrega);
		btnEntrega.setBackground(Color.WHITE);
		layeredPane.setBounds(0, 0, 601, 426);
		getContentPane().add(layeredPane);
	    
	    /**
		 * Botao Cadastrar.
		 */
		btnEntregas.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent a) {
				JPPedido.setVisible(false);
				JPFavorito.setVisible(false);
				JPEntrgas.setVisible(false);
			}
		});
	    
	    lblImagem.setBounds(141, 114, 325, 148);
	    layeredPane.add(lblImagem);
	    ImageIcon imagem = new ImageIcon(View.class.getResource("/assets/Icon.png"));
	    Image imag = imagem.getImage().getScaledInstance(lblImagem.getWidth(), lblImagem.getHeight(), Image.SCALE_DEFAULT);
	    lblImagem.setIcon(new ImageIcon(imag));
		
		/**
		 * Definição do Frame.
		 */
		
		getContentPane().setBackground(Color.darkGray);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setResizable(false);
		setSize(607,476);
		setVisible(true);
		setLocationRelativeTo(null);
		setTitle("Pedido");

	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
