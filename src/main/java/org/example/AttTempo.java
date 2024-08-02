package org.example;

import javax.swing.*;

public class AttTempo extends JFrame {

    private JPanel AttTempo;
    private JLabel Temperatura;
    private JLabel Umidade;
    private JLabel Pressao;
    private JLabel Data;
    private JLabel TemperaturaValor;
    private JLabel UmidadeValor;
    private JLabel PressaoValor;
    private JLabel DataValor;

    public AttTempo() {
        setContentPane(AttTempo);
        setTitle("última atualização do tempo");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setBounds(600, 650, 500, 300);
        setVisible(true);
    }


    public static void main(String[] args) {
        new AttTempo();
    }









}
