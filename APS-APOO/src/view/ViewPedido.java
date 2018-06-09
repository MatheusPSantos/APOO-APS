package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.JPasswordField;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JList;
import javax.swing.JMenuItem;
import java.awt.Choice;
import java.awt.Font;

public class ViewPedido extends JFrame implements ActionListener {
	
	private static final long serialVersionUID = 1L;
	
	public static void main(String[] args) {
		 new ViewPedido();
			
		}
	private ViewPedido() {
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnPedido = new JMenu("Pedido");
		menuBar.add(mnPedido);
		
		JMenu mnFavoritos = new JMenu("Favoritos");
		menuBar.add(mnFavoritos);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setBackground(Color.darkGray);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		panel.setToolTipText("cv");
		getContentPane().add(panel, BorderLayout.CENTER);
		
		Choice Produto = new Choice();
		Produto.setForeground(Color.BLACK);
		Produto.setBackground(Color.WHITE);
		Produto.setFont(new Font("Arial", Font.PLAIN, 12));
		panel.add(Produto);
		setResizable(false);
		setSize(607,476);
		setVisible(true);
		setLocationRelativeTo(null);
		setTitle("Pedido");
	}
}