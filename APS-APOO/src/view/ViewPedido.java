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
import javax.swing.JLayeredPane;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import java.awt.Panel;

public class ViewPedido extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;
	public JMenuBar barra = new JMenuBar();
	public JMenuItem miCadastroProduto = new JMenuItem("Cadastrar produto");
	public JMenuItem miChecarEstoque = new JMenuItem("Checar Estoque");
	public JMenuItem miEntregas = new JMenuItem("Entregas");
	public JButton btnPedido = new JButton("Pedido");
	public JButton btnFavorito = new JButton("Favoritos");
	public JButton btnEntregas = new JButton("Estado de Entrega");
	public JPanel JPMercados;
	JPanel JPEntrgas = new JPanel();
	public final JLayeredPane layeredPane = new JLayeredPane();
	public final JPanel JPFavorito = new JPanel();
	public JLabel lblImagem = new JLabel();
	private JButton btnEntrega;
	private JButton btnChecado;
	private final JTextArea textEstadoDeEntrega = new JTextArea();
	private final JPanel JPlistaDEPedido = new JPanel();
	private final Panel listaDeCompras = new Panel();
	private final Panel lista = new Panel();
	private final JTextArea listaDeProdutos = new JTextArea();
	private final JLabel lblNewLabel_1 = new JLabel("Pedido: ");
	private final JButton btnNewButton_2 = new JButton("");
	private final JButton btnF = new JButton("F");
	private final JButton btnNewButton_3 = new JButton("Comfirmar Pedido");
	private final JButton btnQuantidade = new JButton("Quantidade");
	private final JButton btnSalvarPedido = new JButton("Salvar Pedido");
	

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
				JPMercados.setVisible(true);
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
				JPMercados.setVisible(false);
				JPEntrgas.setVisible(false);
			}
		});
		barra.add(btnFavorito);
		btnEntregas.setBackground(Color.WHITE);
		btnEntregas.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent a) {
				JPFavorito.setVisible(false);
				JPMercados.setVisible(false);
				JPEntrgas.setVisible(true);
			}
		});
		barra.add(btnEntregas);
		
		/**
		 * Definindo JlayeredPane e o JPanel.
		 */
		
		
		listaDeCompras.setBounds(0, 0, 603, 426);
		listaDeCompras.setLayout(null);
		listaDeCompras.setVisible(false);
		layeredPane.add(listaDeCompras);
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(10, 263, 46, 14);
		
		listaDeCompras.add(lblNewLabel_1);
		
		lista.setBounds(10, 64, 572, 193);
		lista.setLayout(null);
		listaDeCompras.add(lista);
		btnQuantidade.setBounds(481, 0, 91, 30);
		
		lista.add(btnQuantidade);
		btnNewButton_2.setEnabled(false);
		btnNewButton_2.setBounds(70, 0, 410, 30);
		
		lista.add(btnNewButton_2);
		btnF.setBounds(0, 0, 71, 30);
		
		lista.add(btnF);
		listaDeProdutos.setEditable(false);
		listaDeProdutos.setBounds(10, 276, 572, 77);
		
		listaDeCompras.add(listaDeProdutos);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				listaDeCompras.setVisible(false);
			}
		});
		btnNewButton_3.setBounds(433, 364, 122, 23);
		
		listaDeCompras.add(btnNewButton_3);
		btnSalvarPedido.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				listaDeCompras.setVisible(false);
			}
		});
		btnSalvarPedido.setBounds(306, 364, 107, 23);
		
		listaDeCompras.add(btnSalvarPedido);
		
		JComboBox comboBox = new JComboBox();
		comboBox.addItem("Doce");
		comboBox.setBounds(233, 38, 164, 20);
		listaDeCompras.add(comboBox);
		
		JLabel lblTipo = new JLabel("Tipo:");
		lblTipo.setForeground(Color.WHITE);
		lblTipo.setBounds(233, 26, 46, 14);
		listaDeCompras.add(lblTipo);
		
		JLabel lblProdutos = new JLabel("Produtos: ");
		lblProdutos.setForeground(Color.WHITE);
		lblProdutos.setBounds(10, 51, 73, 14);
		listaDeCompras.add(lblProdutos);
		JPMercados = new JPanel();
		JPMercados.setBounds(0, 0, 603, 426);
		layeredPane.add(JPMercados);
		JPMercados.setBackground(Color.DARK_GRAY);
		JPMercados.setVisible(false);
		JPMercados.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Super Mercados: ");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(20, 11, 157, 14);
		JPMercados.add(lblNewLabel);
		
		JPlistaDEPedido.setBackground(Color.WHITE);
		JPlistaDEPedido.setBounds(20, 32, 573, 364);
		JPlistaDEPedido.setLayout(null);
		JPMercados.add(JPlistaDEPedido);
		
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setLocation(0, 0);
		btnNewButton.setSize(573, 50);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			 listaDeCompras.setVisible(true);
			 JPMercados.setVisible(false);
			}
		});
		JPlistaDEPedido.add(btnNewButton);
		
		
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
				JPMercados.setVisible(false);
				JPFavorito.setVisible(false);
				JPEntrgas.setVisible(false);
			}
		});
		JPEntrgas.add(btnEntrega);
		btnEntrega.setBackground(Color.WHITE);
		textEstadoDeEntrega.setTabSize(2);
		textEstadoDeEntrega.setEditable(false);
		textEstadoDeEntrega.setBounds(85, 67, 440, 275);
		
		JPEntrgas.add(textEstadoDeEntrega);
		JPFavorito.setBounds(0, 0, 603, 426);
		layeredPane.add(JPFavorito);
		JPFavorito.setBackground(Color.DARK_GRAY);
		JPFavorito.setVisible(false);
		JPFavorito.setLayout(null);
		
		btnChecado = new JButton("OK");
		btnChecado.setBounds(261, 353, 89, 23);
		btnChecado.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent a) {
				JPMercados.setVisible(false);
				JPFavorito.setVisible(false);
				JPEntrgas.setVisible(false);
			}
		});
		JPFavorito.add(btnChecado);
		btnChecado.setBackground(Color.WHITE);
		layeredPane.setBounds(0, 0, 601, 426);
		getContentPane().add(layeredPane);
	    
	    /**
		 * Botao Cadastrar.
		 */
		btnEntregas.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent a) {
				JPMercados.setVisible(false);
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
