package org.example;

import org.example.presenter.ClimaPresenter;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;

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
    private JLabel Pressao;

    public Telaincluirdados(ClimaPresenter presenter) {
        setContentPane(IcluirDados);
        setTitle("Dados do Tempo");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setAlwaysOnTop(true);



        setBounds(150, 100, 500, 300);
        setVisible(true);
        incluirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String temp = String.valueOf(getTextoTemperatura());
                String temp2 = String.valueOf(getTextoUmidade());
                String temp3 = String.valueOf(getTextoPressao());
                LocalDate temp4 = String.valueOf(getTextoData());
                presenter.adicionarDado(Float.parseFloat(temp),Float.parseFloat(temp2),Float.parseFloat(temp3),);
            }
        });
    }

    public JTextField getTextoData() {
        return TextoData;
    }


    public JTextField getTextoTemperatura() {
        return TextoTemperatura;
    }

    public JTextField getTextoUmidade() {
        return TextoUmidade;
    }


    public JTextField getTextoPressao() {
        return TextoPressao;
    }


}
