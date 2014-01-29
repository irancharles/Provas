package Gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

import java.awt.Font;

import javax.swing.JTextPane;
import javax.swing.border.BevelBorder;

import java.awt.Color;

import javax.swing.JButton;

import Classes.Questoes;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class InserirQuestoes {

	JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InserirQuestoes window = new InserirQuestoes();
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
	public InserirQuestoes() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 640, 480);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);
		
		JLabel lblInserirQuestes = new JLabel("Inserir quest\u00F5es");
		lblInserirQuestes.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblInserirQuestes.setBounds(268, 11, 122, 17);
		frame.getContentPane().add(lblInserirQuestes);
		
		JLabel lblSerie = new JLabel("Serie");
		lblSerie.setBounds(10, 48, 46, 14);
		frame.getContentPane().add(lblSerie);
		
		JLabel lblAssunto = new JLabel("Assunto");
		lblAssunto.setBounds(10, 79, 57, 14);
		frame.getContentPane().add(lblAssunto);
		
		Object[] Series = {5,6,7,8,9};
		final JComboBox comboBox = new JComboBox(Series);
		comboBox.setBounds(66, 45, 57, 17);
		frame.getContentPane().add(comboBox);
		
		Object[] Assunto = {"Lugar espaço e paisagem","Como se orientar na superfície terrestre","Os mapas","Escala gráfica e escala numérica","Gráficos","Movimentos da Terra","A litosfera","O relevo e suas formas","Formação e transformação do relevo (agentes externos e internos)","Recursos naturais","Águas continentais","Águas oceânicas","A atmosfera e seus fenômenos","Mudanças do tempo"};
		final JComboBox comboBox_1 = new JComboBox(Assunto);
		comboBox_1.setBounds(66, 76, 548, 20);
		frame.getContentPane().add(comboBox_1);
		
		JLabel lblQuesto = new JLabel("Quest\u00E3o");
		lblQuesto.setBounds(10, 124, 57, 14);
		frame.getContentPane().add(lblQuesto);
		
		JLabel lblResposta = new JLabel("Resposta");
		lblResposta.setBounds(10, 315, 57, 14);
		frame.getContentPane().add(lblResposta);
		
		final JTextPane textPane = new JTextPane();
		textPane.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.BLACK, Color.BLACK, null, null));
		textPane.setBounds(66, 124, 548, 180);
		frame.getContentPane().add(textPane);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.BLACK, Color.BLACK, null, null));
		textPane_1.setBounds(66, 315, 548, 92);
		frame.getContentPane().add(textPane_1);
		
		JButton btnAdicionar = new JButton("Adicionar");
		btnAdicionar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Questoes questoes = new Questoes();
				questoes.setSerie((Integer)comboBox.getSelectedItem());
				questoes.setAssunto((String)comboBox_1.getSelectedItem());
				questoes.setQuestao(textPane.getText());
				
				JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso"); 
			}
		});
		btnAdicionar.setActionCommand("");
		btnAdicionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnAdicionar.setBounds(267, 418, 89, 23);
		frame.getContentPane().add(btnAdicionar);
	}
}
