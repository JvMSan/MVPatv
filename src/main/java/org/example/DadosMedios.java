package org.example;

import javax.swing.*;

public class DadosMedios extends JFrame {

    private JPanel DadosMedios;
    private JLabel Umidade;
    private JLabel Temperatura;
    private JLabel Pressao;
    private JLabel Nregistros;
    private JLabel MediaTemperatura;
    private JLabel MediaUmidade;
    private JLabel MediaPressao;
    private JLabel Registros;

    public DadosMedios() {
        setContentPane(DadosMedios);
        setTitle("Dados Médios");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setAlwaysOnTop(true);

        setBounds(675, 100, 500, 300);
        setVisible(true);
    }


    public static void main(String[] args) {
        new DadosMedios();
    }

}
