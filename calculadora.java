package com.meuprojeto;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class main {
    public static void createAndShowGUI() {
        //Cria o Frame
        JFrame frame = new JFrame("Criando a Calculadora");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,300);


        // Cria um Painel
        JPanel panel = new JPanel();

        // Adiciona Componentes Ao Painel
        JLabel label = new JLabel("Ola Mundo");
        JLabel label2 = new JLabel("Estou em Java");
        JButton button = new JButton("Clique Aqui");
        JButton button2 = new JButton("2");
        JButton button3 = new JButton("3");
        JButton button4 = new JButton("4");

        panel.add(label);
        panel.add(button);
        panel.add(button2);
        panel.add(button3);
        panel.add(button4);
        panel.add(label2);

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
