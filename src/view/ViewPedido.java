package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JLayeredPane;
import javax.swing.JMenuBar;
import javax.swing.JTextArea;
import java.awt.Panel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;

public class ViewPedido extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;
	private JMenuBar barra = new JMenuBar();
	private JButton btnPedido = new JButton("Pedido");
	private JButton btnFavorito = new JButton("Favoritos");
	private JButton btnEntregas = new JButton("Estado de Entrega");
	private JButton btnComfirmarPedido = new JButton("Comfirmar Pedido");
	private JButton btnNewButton_1 = new JButton("Adicionar aos favoritos");
	private JButton btnEntrega;
	private JButton btnChecado;
	private JButton btnCancelar = new JButton("Cancelar");
	private JButton btnConfirmar = new JButton("Confirmar");
	private JPanel JPMercados;
	private JPanel JPEntregas = new JPanel();
	private JPanel JPListaDeFavoritos = new JPanel();
	public JPanel JPFavorito = new JPanel();
	public JLayeredPane layeredPane = new JLayeredPane();
	private JLabel lblImagem = new JLabel();
	private Panel JPlistaDeCompras = new Panel();
	private JLabel lblNewLabel_1 = new JLabel("Pedido: ");
	public String Busca,Quantidade;
	private JTextField textBusca;
	private JPanel JPListaDeMercado = new JPanel();
	private JPanel panel = new JPanel();
	private JScrollPane scrollMercados = new JScrollPane();
	private JScrollPane scrollLista = new JScrollPane();
	private JScrollPane scrollEntrega = new JScrollPane();
	private JLabel lblSuperMercados = new JLabel("Super Mercados: ");
	public int NumeroMercado1 = 2; //N�mero de Mercados.
	public int NumeroMercado2 = 0; 
	public int NumerodeProdutos1 = 30; //N�mero de produtos.
	public int NumerodeProdutos2 = 0;
	public int NumeroFavoritos1 = 10; //N�mero de favoritos.
	public int NumeroFavoritos2 = 0;
	private JScrollPane scrollFavoritos = new JScrollPane();
	private JScrollPane scrollListaDeProdutos = new JScrollPane();
	private JTextField textQuantidade;
	private JLabel lblQuantidade = new JLabel("Quantidade:");
	private final JScrollPane scrollLPedidoFavorito = new JScrollPane();
	private final JLabel lblFavoritos = new JLabel("Favoritos: ");
	
	

	/**
	 * Inicio das aplica��es.
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
		btnPedido.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
		btnPedido.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent a) {
				JPMercados.setVisible(true);
				JPFavorito.setVisible(false);
				JPEntregas.setVisible(false);
				JPlistaDeCompras.setVisible(false);
				ListaDeMercados();
			}
		});
		barra.add(btnPedido);
		btnFavorito.setBackground(Color.WHITE);
		btnFavorito.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
		btnFavorito.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent a) {
				JPFavorito.setVisible(true);
				JPMercados.setVisible(false);
				JPEntregas.setVisible(false);
				JPlistaDeCompras.setVisible(false);
				ListaDeFavoritos();
			}
		});
		barra.add(btnFavorito);
		btnEntregas.setBackground(Color.WHITE);
		btnEntregas.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
		btnEntregas.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent a) {
				JPFavorito.setVisible(false);
				JPMercados.setVisible(false);
				JPEntregas.setVisible(true);
				JPlistaDeCompras.setVisible(false);
			}
		});
		barra.add(btnEntregas);
		
		/**
		 * Definindo JlayeredPane e o JPanel.
		 */
		
		
		JPlistaDeCompras.setBounds(0, 0, 603, 426);
		JPlistaDeCompras.setLayout(null);
		JPlistaDeCompras.setVisible(false);
		JPMercados = new JPanel();
		JPMercados.setBounds(0, 0, 603, 426);
		layeredPane.add(JPMercados);
		JPMercados.setBackground(Color.DARK_GRAY);
		JPMercados.setVisible(false);
		JPMercados.setLayout(null);
		
		
		lblSuperMercados.setForeground(Color.WHITE);
		lblSuperMercados.setBounds(20, 11, 157, 14);
		JPMercados.add(lblSuperMercados);
		layeredPane.add(JPlistaDeCompras);
		
		
		
		
		scrollMercados.setBounds(10, 42, 581, 350);
		JPMercados.add(scrollMercados);
		
		/**
		 * Lista de Mercados
		 */
		
		
		JPListaDeMercado.setBackground(Color.WHITE);
		
		scrollMercados.setViewportView(JPListaDeMercado);
		
		
		JPListaDeMercado.setLayout(null);
		
		/**
		 * 
		 */
		
		
		scrollListaDeProdutos.setBounds(10, 26, 581, 219);
		JPlistaDeCompras.add(scrollListaDeProdutos);
		
		
		btnComfirmarPedido.setBackground(Color.WHITE);
		btnComfirmarPedido.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JPlistaDeCompras.setVisible(false);
				/**
				 * Adicionar uma fun��o para Comfirmar Pedido.
				 */
			}
		});
		btnComfirmarPedido.setBounds(433, 364, 138, 23);
		
		JPlistaDeCompras.add(btnComfirmarPedido);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/**
				 * Adicionar uma fun��o para adicionar pedido.
				 */
			}
		});
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.setBounds(239, 364, 184, 23);
		
		JPlistaDeCompras.add(btnNewButton_1);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setBackground(Color.WHITE);
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Busca = textBusca.getText();
				textBusca.setText("");
				System.out.println(Busca+" Buscando...");
				/**
				 * Fazer busca.
				 */
			}
		});
		btnBuscar.setBounds(507, 276, 84, 23);
		JPlistaDeCompras.add(btnBuscar);
		btnCancelar.setBackground(Color.WHITE);
		
		
		btnCancelar.setVisible(false);
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lblQuantidade.setVisible(false);
				textQuantidade.setVisible(false);
				btnCancelar.setVisible(false);
				btnConfirmar.setVisible(false);
			}
		});
		btnCancelar.setBounds(403, 330, 89, 23);
		JPlistaDeCompras.add(btnCancelar);
		btnConfirmar.setBackground(Color.WHITE);
		btnConfirmar.setVisible(false);
		btnConfirmar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				/**
				 * Quantidade de Produto.
				 */
				Quantidade = textQuantidade.getText();
				lblQuantidade.setVisible(false);
				textQuantidade.setVisible(false);
				btnCancelar.setVisible(false);
				btnConfirmar.setVisible(false);
				
			}
		});
		btnConfirmar.setVisible(false);
		btnConfirmar.setBounds(494, 330, 97, 23);
		JPlistaDeCompras.add(btnConfirmar);
		
		JLabel lblBusca = new JLabel("Busca:");
		lblBusca.setBounds(306, 261, 46, 14);
		JPlistaDeCompras.add(lblBusca);
		lblBusca.setForeground(Color.WHITE);
		
		JLabel lblPedido = new JLabel("Pedido:");
		lblPedido.setForeground(Color.WHITE);
		lblPedido.setBounds(10, 261, 60, 14);
		JPlistaDeCompras.add(lblPedido);
		
		JLabel lblProdutos = new JLabel("Produtos: ");
		lblProdutos.setForeground(Color.WHITE);
		lblProdutos.setBounds(10, 11, 73, 14);
		JPlistaDeCompras.add(lblProdutos);
		
		
		/**
		 * Lista de produtos
		 */
		
		
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(10, 263, 46, 14);
		
		
		panel.setLayout(null);
		scrollListaDeProdutos.setViewportView(panel);
		lblQuantidade.setForeground(Color.WHITE);
		lblQuantidade.setVisible(false);
		lblQuantidade.setBounds(306, 305, 285, 14);
		JPlistaDeCompras.add(lblQuantidade);
		
		textQuantidade = new JTextField();
		textQuantidade.setBounds(306, 331, 89, 20);
		textQuantidade.setVisible(false);
		JPlistaDeCompras.add(textQuantidade);
		textQuantidade.setColumns(10);
		
		textBusca = new JTextField();
		textBusca.setBounds(304, 278, 199, 20);
		JPlistaDeCompras.add(textBusca);
		textBusca.setColumns(10);
		
		/**
		 * Caixa de texto do Pedido.
		 */
		
		
		scrollLista.setBounds(10, 274, 254, 79);
		JPlistaDeCompras.add(scrollLista);
		JTextArea textLista = new JTextArea();
		textLista.setWrapStyleWord(true);
		textLista.setEditable(false);
		scrollLista.setViewportView(textLista);
		
		
		JPEntregas.setBackground(Color.DARK_GRAY);
		JPEntregas.setBounds(0, 0, 603, 426);
		layeredPane.add(JPEntregas);
		JPEntregas.setVisible(false);
		JPEntregas.setLayout(null);
		
		btnEntrega = new JButton("OK");
		btnEntrega.setBounds(261, 353, 89, 23);
		btnEntrega.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent a) {
				JPMercados.setVisible(false);
				JPFavorito.setVisible(false);
				JPEntregas.setVisible(false);
			}
		});
		JPEntregas.add(btnEntrega);
		btnEntrega.setBackground(Color.WHITE);
		
		/**
		 * Caixa de texto Entrega.
		 */
		
		
		scrollEntrega.setBounds(56, 38, 478, 293);
		JPEntregas.add(scrollEntrega);
		JTextArea textEntrega = new JTextArea();
		textEntrega.setWrapStyleWord(true);
		textEntrega.setEditable(false);
		scrollEntrega.setViewportView(textEntrega);
		JPFavorito.setBounds(0, 0, 603, 426);
		layeredPane.add(JPFavorito);
		JPFavorito.setBackground(Color.DARK_GRAY);
		JPFavorito.setVisible(false);
		JPFavorito.setLayout(null);
		scrollLPedidoFavorito.setEnabled(false);
		scrollLPedidoFavorito.setBounds(10, 274, 554, 79);
		scrollLPedidoFavorito.setLayout(null);
		JPFavorito.add(scrollLPedidoFavorito);
		
		
		scrollFavoritos.setBounds(10, 33, 581, 184);
		JPFavorito.add(scrollFavoritos);
		
		
		JPListaDeFavoritos.setBackground(Color.WHITE);
		
		scrollFavoritos.setViewportView(JPListaDeFavoritos);
		
		
		JPListaDeFavoritos.setLayout(null);
		
		btnChecado = new JButton("OK");
		btnChecado.setBounds(261, 353, 89, 23);
		btnChecado.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent a) {
				JPMercados.setVisible(false);
				JPFavorito.setVisible(false);
				JPEntregas.setVisible(false);
			}
		});
		JPFavorito.add(btnChecado);
		btnChecado.setBackground(Color.WHITE);
		lblFavoritos.setForeground(Color.WHITE);
		lblFavoritos.setBounds(10, 17, 89, 14);
		
		JPFavorito.add(lblFavoritos);
		layeredPane.setBounds(0, 0, 601, 426);
		getContentPane().add(layeredPane);
		
		/**
		 * Caixa de texto lista de favoritos.
		 */
		
		scrollLPedidoFavorito.setBounds(10, 274, 254, 79);
		JPFavorito.add(scrollLPedidoFavorito);
		JTextArea textPedidoFavorito = new JTextArea();
		textPedidoFavorito.setWrapStyleWord(true);
		textPedidoFavorito.setEditable(false);
		scrollLPedidoFavorito.setViewportView(textPedidoFavorito);
	    
	    /**
		 * Botao Cadastrar.
		 */
		btnEntregas.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent a) {
				JPMercados.setVisible(false);
				JPFavorito.setVisible(false);
				JPEntregas.setVisible(false);
			}
		});
	    
	    lblImagem.setBounds(141, 114, 325, 148);
	    layeredPane.add(lblImagem);
	    ImageIcon imagem = new ImageIcon(View.class.getResource("/assets/Icon.png"));
	    Image imag = imagem.getImage().getScaledInstance(lblImagem.getWidth(), lblImagem.getHeight(), Image.SCALE_DEFAULT);
	    lblImagem.setIcon(new ImageIcon(imag));
		
		/**
		 * Defini��o do Frame.
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
	
	/**
	 * Lista de botoes Mercados.
	 */
	
	private void ListaDeMercados() {
		
			for (int i = 0; i < NumeroMercado1 ; i++) {
			
			JButton btnNomeMercado = new JButton("Nome Mercado "+i);
			btnNomeMercado.setBounds(0, NumeroMercado2, 570, 50);
			btnNomeMercado.setBackground(Color.LIGHT_GRAY);
			btnNomeMercado.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent a) {
					
					/**
					 * Fun��o para Mercado.
					 */
					JPlistaDeCompras.setVisible(true);
					JPMercados.setVisible(false);
					ListaDeCompras();
				}
			});
			JPListaDeMercado.add(btnNomeMercado);
			
			NumeroMercado2 += 50;
		}
		JPListaDeMercado.setPreferredSize(new Dimension(560, NumeroMercado2));
	}
	
	/**
	 * Lista de Compras.
	 */
	
	private void ListaDeCompras () {
		
		
		for (int i = 0; i < NumerodeProdutos1 ; i++) {
			JButton btnNomeProduto = new JButton("NomeProduto "+i);
			btnNomeProduto.setEnabled(false);
			btnNomeProduto.setBounds(0, NumerodeProdutos2, 186, 30);
			panel.add(btnNomeProduto);
			
			JButton btnMarca = new JButton("Marca "+i);
			btnMarca.setEnabled(false);
			btnMarca.setBounds(186, NumerodeProdutos2, 186, 30);
			panel.add(btnMarca);
			
			JButton btnQuantidade = new JButton("Quantidade");
			btnQuantidade.setBackground(Color.LIGHT_GRAY);
			btnQuantidade.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent a) {
					/**
					 * fun��o quantidade.
					 */
					lblQuantidade.setVisible(false);
					textQuantidade.setVisible(false);
					btnCancelar.setVisible(false);
					btnConfirmar.setVisible(false);
					lblQuantidade.setText("Quantidade: "/*+NomeDoProduto*/);
					lblQuantidade.setVisible(true);
					textQuantidade.setVisible(true);
					btnCancelar.setVisible(true);
					btnConfirmar.setVisible(true);
					
					
				}
			});
			btnQuantidade.setBounds(457, NumerodeProdutos2, 122, 30);
			panel.add(btnQuantidade);
			
			JButton btnFavorito = new JButton("R$"+"000,00");
			btnFavorito.setBackground(Color.GRAY);
			btnFavorito.setIcon(null);
			btnFavorito.setBounds(372, NumerodeProdutos2, 89, 30);
			panel.add(btnFavorito);
			
			NumerodeProdutos2 += 30;
		}
		
		panel.setPreferredSize(new Dimension(540, NumerodeProdutos2));
	}
	/**
	 * Lista de Favoritos.
	 */
	private void ListaDeFavoritos () {
			for (int i = 0; i < NumeroFavoritos1 ; i++) {
			
			JButton btnNomeFavorito = new JButton("Nome Favorito "+i);
			btnNomeFavorito.setBounds(0, NumeroFavoritos2, 400, 50);
			btnNomeFavorito.setEnabled(false);
			btnNomeFavorito.setBackground(Color.WHITE);
			JPListaDeFavoritos.add(btnNomeFavorito);
			
			JButton btnInfo = new JButton(" Lista e Valor ");
			btnInfo.setBounds(401, NumeroFavoritos2, 200, 50);
			btnInfo.setBackground(Color.LIGHT_GRAY);
			btnInfo.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent a) {
					/**
					 * Fun��es favorito.
					 */
				}
			});
			JPListaDeFavoritos.add(btnInfo);
			
			NumeroFavoritos2 += 50;
		}
		JPListaDeFavoritos.setPreferredSize(new Dimension(560, NumeroFavoritos2));
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}