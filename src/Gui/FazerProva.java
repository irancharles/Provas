package Gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class FazerProva {

	JFrame frame;
	protected Object frame2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FazerProva window = new FazerProva();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public FazerProva() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 640, 480);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblFazerProva = new JLabel("Fazer Prova");
		lblFazerProva.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblFazerProva.setBounds(269, 11, 95, 14);
		frame.getContentPane().add(lblFazerProva);
		
		JLabel lblSerie = new JLabel("Serie");
		lblSerie.setBounds(10, 42, 46, 14);
		frame.getContentPane().add(lblSerie);
		
		JLabel lblAssunto = new JLabel("Assunto");
		lblAssunto.setBounds(10, 67, 56, 14);
		frame.getContentPane().add(lblAssunto);
		
		Object[] Series = {5,6,7,8,9};
		JComboBox comboBox = new JComboBox(Series);
		comboBox.setBounds(66, 39, 46, 20);
		frame.getContentPane().add(comboBox);
		
		Object[] Assunto = {"Lugar espaço e paisagem","Como se orientar na superfície terrestre","Os mapas","Escala gráfica e escala numérica","Gráficos","Movimentos da Terra","A litosfera","O relevo e suas formas","Formação e transformação do relevo (agentes externos e internos)","Recursos naturais","Águas continentais","Águas oceânicas","A atmosfera e seus fenômenos","Mudanças do tempo"};
		JComboBox comboBox_1 = new JComboBox(Assunto);
		comboBox_1.setBounds(67, 67, 557, 20);
		frame.getContentPane().add(comboBox_1);
		
		JButton btnAdicionar = new JButton("Adicionar");
		btnAdicionar.setBounds(275, 143, 89, 23);
		frame.getContentPane().add(btnAdicionar);
		
		JLabel lblQuesto = new JLabel("Quest\u00E3o");
		lblQuesto.setBounds(10, 105, 56, 14);
		frame.getContentPane().add(lblQuesto);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(66, 102, 558, 20);
		frame.getContentPane().add(comboBox_2);
	}
}
