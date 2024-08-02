package org.example;

import javax.swing.*;

public class Telaincluirdados extends JFrame{
    private JPanel IcluirDados;
    private JLabel Data;
    private JButton incluirButton;
    private JTextField TextoData;
    private JTextField TextoTemperatura;
    private JTextField TextoUmidade;
    private JTextField TextoPressao;
    private JLabel Temperatura;
    private JLabel Umidade;
    private JLabel Pressão;

    public Telaincluirdados() {
        setContentPane(IcluirDados);
        setTitle("Dados do Tempo");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setBounds(150, 100, 500, 300);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Telaincluirdados();
    }






}
