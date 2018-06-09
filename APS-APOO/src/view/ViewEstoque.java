package view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLayeredPane;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class ViewEstoque extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;
	JMenuBar barra = new JMenuBar();
	JMenu JMOpcoes = new JMenu("Op\u00E7\u00F5es");
	JMenuItem miCadastroProduto = new JMenuItem("Cadastrar produto");
	JMenuItem miChecarEstoque = new JMenuItem("Checar Estoque");
	JMenuItem miEntregas = new JMenuItem("Entregas");
	JPanel JPCadastrarProduto;
	JLabel lblNome,lblMarca,lblQuantidade,lblValor;
	JTextField jtNomeProduto,jtMarca,jtQuantidade,jtValor;
	JButton btCadastrar;
	private final JLayeredPane layeredPane = new JLayeredPane();
	private final JPanel JPControleEstoque = new JPanel();

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
		setJMenuBar(barra);
		barra.add(miCadastroProduto);
		barra.add(miChecarEstoque);
		barra.add(miEntregas);
		
		/**
		 * Definindo JlayeredPane e o JPanel.
		 */
		JPControleEstoque.setBackground(Color.DARK_GRAY);
		layeredPane.add(JPControleEstoque);
		layeredPane.setBounds(0, 0, 601, 426);
		getContentPane().add(layeredPane);
		JPCadastrarProduto = new JPanel();
		JPCadastrarProduto.setBackground(Color.DARK_GRAY);
		JPCadastrarProduto.setBounds(0, 0, 603, 426);
		layeredPane.add(JPCadastrarProduto);
		JPControleEstoque.setBounds(0, 0, 603, 426);
		JPCadastrarProduto.setVisible(false);
		JPControleEstoque.setVisible(false);
		JPCadastrarProduto.setLayout(null);
		JPControleEstoque.setLayout(null);
		
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
	    
	    /**
		 * Botao Cadastrar.
		 */
	    
	    btCadastrar = new JButton("Cadastar");
	    btCadastrar.setBounds(278,270,100,20);
	    btCadastrar.setBackground(Color.white);
	    btCadastrar.addActionListener(this);
	    JPCadastrarProduto.add(btCadastrar);
	   btCadastrar.addActionListener(new btAcao2());
		
		/**
		 * Açoes Barra de menu.
		 */
		
		miCadastroProduto.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent a) {
				JPCadastrarProduto.setVisible(true);
				JPControleEstoque.setVisible(false);
			}
		});
		miChecarEstoque.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent a) {
				JPControleEstoque.setVisible(true);
				JPCadastrarProduto.setVisible(false);
			}
		});
		
		
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
	
	/**
	 * Açoes dos botoes.
	 */
	
	private class btAcao2 implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			JButton c =(JButton) e.getSource();
			if (c  == btCadastrar) {
				JPCadastrarProduto.setVisible(false);
			}
			
		}	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
