package com.meuprojeto;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class main {
	public static void createAndShowGUI() {
		//Cria o Frame
		JFrame frame = new JFrame("Exemplo de JPanel");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400,300);

	
	// Cria um Painel
	JPanel panel = new JPanel();
	
	// Adiciona Componentes Ao Painel
	JLabel label = new JLabel("Ola Mundo");
	JButton button = new JButton("Clique Aqui");
	
    panel.add(label);
    panel.add(button);

    // Adiciona o painel ao frame
    frame.add(panel);

    // Exibe a interface gráfica
    frame.setVisible(true);
      
}

public static void main(String[] args) {
	//Assegura que a criação da GUI será feita na thread de despacho de eventos
	SwingUtilities.invokeLater(new Runnable() {
		public void run() {
			 createAndShowGUI();
		}
	});
}
}
