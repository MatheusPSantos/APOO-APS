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
		setResizable(false);
		setSize(607,476);
		setVisible(true);
		setLocationRelativeTo(null);
		setTitle("Pedido");
	}
}