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
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;

import models.Lojista;
import models.Produto;
import models.ProdutoDAO;

import javax.swing.JLayeredPane;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class ViewEstoque extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;
	private JMenuBar barra = new JMenuBar();
	private JButton btnCadastrarProduto = new JButton("Cadastrar Produto");
	private JButton btnChecarEstoque = new JButton("Checar Estoque");
	private JButton btnEntregas = new JButton("Entregas");
	private JPanel JPCadastrarProduto;
	private JPanel JPEntregas = new JPanel();
	private JLabel lblNome,lblMarca,lblQuantidade,lblCNPJ,lblValor;
	private JTextField jtNomeProduto,jtMarca,jtQuantidade,jtCNPJ,jtValor;
	private JButton btCadastrar;
	private final JLayeredPane layeredPane = new JLayeredPane();
	private final JPanel JPControleEstoque = new JPanel();
	private JLabel lblImagem = new JLabel();
	private JButton btnEntregue;
	private JButton btnChecado;
	public String BuscaEstoque;
	public int NumeroFavoritos1 = 80; 
	public int NumeroFavoritos2 = 0;
	private JPanel JPListaDeFavoritos = new JPanel();
	private JScrollPane scrollFavoritos = new JScrollPane();
	public String NomeProduto,Marca,Valor,Quantidade;
	private JLabel lblBusca;
	private JTextField textBuscaEstoque;
	private JButton btnBuscar;
	

	/**
	 * Inicio das aplica��es.
	 */
	public static void main(String[] args) {
		new ViewEstoque();
	}
		
	
	public ViewEstoque() {
		
		getContentPane().setLayout(null);
		
		/**
		 * Atribuindo na barra.
		 */
		barra.setBackground(Color.WHITE);
		setJMenuBar(barra);
		btnCadastrarProduto.setBackground(Color.WHITE);
		btnCadastrarProduto.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
		btnCadastrarProduto.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent a) {
				JPCadastrarProduto.setVisible(true);
				JPControleEstoque.setVisible(false);
				JPEntregas.setVisible(false);
			}
		});
		barra.add(btnCadastrarProduto);
		btnChecarEstoque.setBackground(Color.WHITE);
		btnChecarEstoque.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
		btnChecarEstoque.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent a) {
				JPControleEstoque.setVisible(true);
				JPCadastrarProduto.setVisible(false);
				JPEntregas.setVisible(false);
				
				ListaDeProdutos();
				
				
			}
		});
		barra.add(btnChecarEstoque);
		btnEntregas.setBackground(Color.WHITE);
		btnEntregas.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
		btnEntregas.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent a) {
				JPControleEstoque.setVisible(false);
				JPCadastrarProduto.setVisible(false);
				JPEntregas.setVisible(true);
				
			}
		});
		barra.add(btnEntregas);
		
		/**
		 * Definindo JlayeredPane e o JPanel.
		 */
		JPControleEstoque.setBackground(Color.DARK_GRAY);
		layeredPane.add(JPControleEstoque);
		JPControleEstoque.setBounds(0, 0, 603, 426);
		JPControleEstoque.setVisible(false);
		JPControleEstoque.setLayout(null);
		
		btnChecado = new JButton("OK");
		btnChecado.setBounds(261, 353, 89, 23);
		btnChecado.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent a) {
				JPCadastrarProduto.setVisible(false);
				JPControleEstoque.setVisible(false);
				JPEntregas.setVisible(false);
			}
		});
		JPControleEstoque.add(btnChecado);
		btnChecado.setBackground(Color.WHITE);
		
		lblBusca = new JLabel("Busca:");
		lblBusca.setForeground(Color.WHITE);
		lblBusca.setBounds(41, 291, 46, 14);
		JPControleEstoque.add(lblBusca);
		
		textBuscaEstoque = new JTextField();
		textBuscaEstoque.setBounds(41, 307, 238, 20);
		JPControleEstoque.add(textBuscaEstoque);
		textBuscaEstoque.setColumns(10);
		
		btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				BuscaEstoque = textBuscaEstoque.getText();
				textBuscaEstoque.setText("");
				System.out.println(BuscaEstoque);
				/**
				 * Fun��o de busca.
				 */
			}
		});
		btnBuscar.setBounds(289, 306, 89, 23);
		JPControleEstoque.add(btnBuscar);
		
		/**
		 * Lista estoque.
		 */
		
		
		scrollFavoritos.setBounds(10, 25, 581, 261);
		JPControleEstoque.add(scrollFavoritos);
		
		
		JPListaDeFavoritos.setBackground(Color.WHITE);
		
		scrollFavoritos.setViewportView(JPListaDeFavoritos);
		
		
		
		JPListaDeFavoritos.setLayout(null);
		
		JPEntregas.setBackground(Color.DARK_GRAY);
		JPEntregas.setBounds(0, 0, 603, 426);
		layeredPane.add(JPEntregas);
		JPEntregas.setVisible(false);
		JPEntregas.setLayout(null);
		
		/**
		 * Caixa de texto entrega.
		*/
		
		JScrollPane scrollEntrega = new JScrollPane();
		scrollEntrega.setBounds(69, 57, 451, 258);
		JPEntregas.add(scrollEntrega);
		JTextArea textEntrega = new JTextArea();
		textEntrega.setWrapStyleWord(true);
		textEntrega.setEditable(false);
		scrollEntrega.setViewportView(textEntrega);
	
		
		
		
		btnEntregue = new JButton("OK");
		btnEntregue.setBounds(261, 353, 89, 23);
		JPEntregas.add(btnEntregue);
		btnEntregue.setBackground(Color.WHITE);
		layeredPane.setBounds(0, 0, 601, 426);
		getContentPane().add(layeredPane);
		JPCadastrarProduto = new JPanel();
		JPCadastrarProduto.setBackground(Color.DARK_GRAY);
		JPCadastrarProduto.setBounds(0, 0, 603, 426);
		layeredPane.add(JPCadastrarProduto);
		JPCadastrarProduto.setVisible(false);
		JPCadastrarProduto.setLayout(null);
		
		
		
		/**
		 * Labels.
		 */
		
		lblNome = new JLabel("Nome do Produto: ");
	    lblNome.setForeground(Color.white);
	    
	    JPCadastrarProduto.add(lblNome);
	    lblNome.setBounds(123,126,107,20);
	    
	    lblMarca= new JLabel("Marca: ");
	    lblMarca.setForeground(Color.white);
	    JPCadastrarProduto.add(lblMarca);
	    lblMarca.setBounds(178,157,107,20);
	    
	    lblQuantidade = new JLabel("Quantidade: ");
	    lblQuantidade.setForeground(Color.white);
	    JPCadastrarProduto.add(lblQuantidade);
	    lblQuantidade.setBounds(152,188,107,20);
	    
	    lblCNPJ = new JLabel("seu CNPJ: ");
	    lblCNPJ.setForeground(Color.white);
	    JPCadastrarProduto.add(lblCNPJ);
	    lblCNPJ.setBounds(152, 218, 107, 20);
	    
	    lblValor= new JLabel("Valor: R$");
	    lblValor.setForeground(Color.white);
	    JPCadastrarProduto.add(lblValor);
	    lblValor.setBounds(169,249,116,20);
	    
	    JLabel lblID = new JLabel("ID produto:");
	    lblID.setForeground(Color.white);
	    JPCadastrarProduto.add(lblID);
	    lblID.setBounds(169,279,116,20);
	    
	    
	    /**
		 * Caixa de texto que pega as informa��es.
		 */
	    
	    jtNomeProduto = new JTextField("");
	    JPCadastrarProduto.add(jtNomeProduto);
	    jtNomeProduto.setBounds(228,126,220,20);
	    
	    jtMarca = new JTextField("");
	    JPCadastrarProduto.add(jtMarca);
	    jtMarca.setBounds(228,157,220,20);
	    
	    jtQuantidade = new JTextField("");
	    JPCadastrarProduto.add(jtQuantidade);
	    jtQuantidade.setBounds(228,188,220,20);
	    
	    jtCNPJ = new JTextField("");
	    JPCadastrarProduto.add(jtCNPJ);
	    jtCNPJ.setBounds(228,219,220,20);
	    
	    jtValor = new JTextField("");
	    JPCadastrarProduto.add(jtValor);
	    jtValor.setBounds(228,249,220,20);
	    
	    JTextField jtID = new JTextField("");
	    JPCadastrarProduto.add(jtID);
	    jtID.setBounds(228,279,220,20);
	    
	    /**
		 * Botao Cadastrar.
		 */
	    
	    btCadastrar = new JButton("Cadastrar");
	    btCadastrar.setBounds(278,330,100,20);
	    btCadastrar.setBackground(Color.white);
	    btCadastrar.addActionListener(this);
	    btCadastrar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent a) {

				try {
					if(jtNomeProduto.getText().isEmpty()) {
						JOptionPane.showMessageDialog(null, "Informe o nome do produto");
					} 
					else if(jtMarca.getText().isEmpty()) {
						JOptionPane.showMessageDialog(null, "Informe a marca do produto");
					}
					else if(jtQuantidade.getText().isEmpty()) {
						JOptionPane.showMessageDialog(null, "Informe a quantidade do produto");
					}
					else if(jtCNPJ.getText().isEmpty()) {
						JOptionPane.showMessageDialog(null, "Informe o seu CNPJ");
					}
					else if(jtValor.getText().isEmpty()) {
						JOptionPane.showMessageDialog(null, "Informe o valor do produto");
					}else {
						Produto produto = new Produto();
						ProdutoDAO produtoDAO = new ProdutoDAO();
						Lojista lojista = new Lojista();
						
						produto.setNome(jtNomeProduto.getText());
						produto.setMarca(jtMarca.getText());
						produto.setQuantidade(Integer.parseInt(jtQuantidade.getText()));
						produto.setProd_id(Integer.parseInt(jtID.getText()));
						produto.setValor(Float.parseFloat(jtValor.getText()));
						lojista.setCNPJ(jtCNPJ.getText());
						// criando o produto no banco de dados
						produtoDAO.create(produto, lojista);
						JOptionPane.showMessageDialog(null, "Produto cadastrado com sucesso.");
					}
					
				}catch(Exception e) {
					JOptionPane.showMessageDialog(null, "Error:" + e);
				}

			}
		});
	    JPCadastrarProduto.add(btCadastrar);
		btnEntregas.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent a) {
				JPCadastrarProduto.setVisible(false);
				JPControleEstoque.setVisible(false);
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
		setTitle("Estoque");

	}
	
	/**
	 * Lista de Botoes produto.
	 */

	public void ListaDeProdutos() {

		for (int i = 0; i < NumeroFavoritos1 ; i++) {
			
			JButton btnNomeProdutoEmEstoque = new JButton("Nome Produto "+i);
			btnNomeProdutoEmEstoque.setBounds(0, NumeroFavoritos2, 200, 20);
			btnNomeProdutoEmEstoque.setEnabled(false);
			btnNomeProdutoEmEstoque.setBackground(Color.WHITE);
			JPListaDeFavoritos.add(btnNomeProdutoEmEstoque);
			
			JButton btnMarcaEmEstoque = new JButton("Marca "+i);
			btnMarcaEmEstoque.setBounds(200, NumeroFavoritos2, 200, 20);
			btnMarcaEmEstoque.setEnabled(false);
			btnMarcaEmEstoque.setBackground(Color.WHITE);
			JPListaDeFavoritos.add(btnMarcaEmEstoque);
			
			JButton btnQuantidadeEmEstoque = new JButton("quantidade "+i);
			btnQuantidadeEmEstoque.setBounds(400, NumeroFavoritos2, 100, 20);
			btnQuantidadeEmEstoque.setEnabled(false);
			btnQuantidadeEmEstoque.setBackground(Color.WHITE);
			JPListaDeFavoritos.add(btnQuantidadeEmEstoque);
			
			JButton btnInfo = new JButton(" alterar ");
			btnInfo.setBounds(500, NumeroFavoritos2, 90, 20);
			btnInfo.setBackground(Color.LIGHT_GRAY);
			btnInfo.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent a) {
					/**
					 * Alterar valor.
					 */
				}
			});
			JPListaDeFavoritos.add(btnInfo);
			
			NumeroFavoritos2 += 20;
		}
		JPListaDeFavoritos.setPreferredSize(new Dimension(560, NumeroFavoritos2));
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}