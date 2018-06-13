package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import java.awt.Choice;
import java.awt.Font;
import java.awt.Button;
import java.awt.List;

public class ViewPedido extends JFrame implements ActionListener {
	
	private static final long serialVersionUID = 1L;
	private JMenuBar barra = new JMenuBar();
	
	public static void main(String[] args) {
		 new ViewPedido();
			
		}
	private ViewPedido() {
		
		getContentPane().setLayout(null);
		add(barra);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setBackground(Color.darkGray);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		panel.setToolTipText("cv");
		getContentPane().add(panel);
		
		JMenuBar menuBar = new JMenuBar();
		panel.add(menuBar);
		
		List list = new List();
		list.setBounds(451, 264, 110, 60);
		getContentPane().add(list);
		setResizable(false);
		setSize(607,476);
		setVisible(true);
		setLocationRelativeTo(null);
		setTitle("Pedido");
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}