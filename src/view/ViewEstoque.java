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

public class ViewEstoque extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;
	public JMenuBar barra = new JMenuBar();
	public JMenuItem miCadastroProduto = new JMenuItem("Cadastrar produto");
	public JMenuItem miChecarEstoque = new JMenuItem("Checar Estoque");
	public JMenuItem miEntregas = new JMenuItem("Entregas");
	public JButton btnCadastrarProduto = new JButton("Cadastrar Produto");
	public JButton btnChecarEstoque = new JButton("Checar Estoque");
	public JButton btnEntregas = new JButton("Entregas");
	public JPanel JPCadastrarProduto;
	JPanel JPEntrgas = new JPanel();
	public JLabel lblNome,lblMarca,lblQuantidade,lblValor;
	public JTextField jtNomeProduto,jtMarca,jtQuantidade,jtValor;
	public JButton btCadastrar;
	public final JLayeredPane layeredPane = new JLayeredPane();
	public final JPanel JPControleEstoque = new JPanel();
	public JLabel lblImagem = new JLabel();
	private JButton btnEntregue;
	private JButton btnChecado;
	public String NomeProduto,Marca,Valor,Quantidade;
	

	/**
	 * Inicio das aplicações.
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
		
		btnCadastrarProduto.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent a) {
				JPCadastrarProduto.setVisible(true);
				JPControleEstoque.setVisible(false);
				JPEntrgas.setVisible(false);
			}
		});
		barra.add(btnCadastrarProduto);
		btnChecarEstoque.setBackground(Color.WHITE);
		btnChecarEstoque.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent a) {
				JPControleEstoque.setVisible(true);
				JPCadastrarProduto.setVisible(false);
				JPEntrgas.setVisible(false);
			}
		});
		barra.add(btnChecarEstoque);
		btnEntregas.setBackground(Color.WHITE);
		btnEntregas.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent a) {
				JPControleEstoque.setVisible(false);
				JPCadastrarProduto.setVisible(false);
				JPEntrgas.setVisible(true);
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
				JPEntrgas.setVisible(false);
			}
		});
		JPControleEstoque.add(btnChecado);
		btnChecado.setBackground(Color.WHITE);
		
		JTextArea Produtos = new JTextArea();
		Produtos.setBounds(22, 109, 540, 233);
		JPControleEstoque.add(Produtos);
		
		JComboBox comboBox = new JComboBox();
		//for (int i = 0; ; i++) {
			comboBox.addItem("Tipos");
		//}
		
		comboBox.setBounds(178, 54, 249, 25);
		JPControleEstoque.add(comboBox);
		
		JLabel lblTiposDeProduto = new JLabel("Tipos de Produto:");
		lblTiposDeProduto.setForeground(Color.WHITE);
		lblTiposDeProduto.setBounds(178, 40, 112, 14);
		JPControleEstoque.add(lblTiposDeProduto);
		
		JLabel lblAlteraEstoque = new JLabel("Altera Estoque:");
		lblAlteraEstoque.setForeground(Color.WHITE);
		lblAlteraEstoque.setBounds(22, 95, 108, 14);
		JPControleEstoque.add(lblAlteraEstoque);
		
		
		JPEntrgas.setBackground(Color.DARK_GRAY);
		JPEntrgas.setBounds(0, 0, 603, 426);
		layeredPane.add(JPEntrgas);
		JPEntrgas.setVisible(false);
		JPEntrgas.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(69, 57, 451, 258);
		JPEntrgas.add(textArea);
		
		btnEntregue = new JButton("OK");
		btnEntregue.setBounds(261, 353, 89, 23);
		JPEntrgas.add(btnEntregue);
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
	    
	    lblValor= new JLabel("Valor: R$");
	    lblValor.setForeground(Color.white);
	    JPCadastrarProduto.add(lblValor);
	    lblValor.setBounds(169,219,116,20);
	    
	    
	    /**
		 * Caixa de texto que pega as informações.
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
	    
	    jtValor = new JTextField("");
	    JPCadastrarProduto.add(jtValor);
	    jtValor.setBounds(228,219,220,20);
	    
	    NomeProduto = jtNomeProduto.getText();
	    Marca = jtMarca.getText();
	    Quantidade = jtQuantidade.getText();
	    Valor = jtValor.getText();
	    
	    /**
		 * Botao Cadastrar.
		 */
	    
	    btCadastrar = new JButton("Cadastar");
	    btCadastrar.setBounds(278,270,100,20);
	    btCadastrar.setBackground(Color.white);
	    btCadastrar.addActionListener(this);
	    btCadastrar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent a) {
				JPCadastrarProduto.setVisible(false);
				JPControleEstoque.setVisible(false);
				JPEntrgas.setVisible(false);
			}
		});
	    JPCadastrarProduto.add(btCadastrar);
		btnEntregas.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent a) {
				JPCadastrarProduto.setVisible(false);
				JPControleEstoque.setVisible(false);
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
		setTitle("Estoque");

	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
