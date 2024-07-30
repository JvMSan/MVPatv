package org.example.view;

import org.example.model.DadoClima;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class EstatisticaClimaView extends JFrame implements Observer {
    private List<DadoClima> dadosClima;
    private JTextArea estatisticaClima;

    public EstatisticaClimaView() {
        setTitle("Estatisticas Climaticas");
        setSize(400, 300);
        setLayout(new BorderLayout());

        dadosClima = new ArrayList<>();
        estatisticaClima = new JTextArea();
        add(new JScrollPane(estatisticaClima), BorderLayout.CENTER);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void atualizar(List<DadoClima> dadoClima) {
        dadosClima = dadoClima;
        exibirMedia();
    }

    private void exibirMedia() {
        float somaTemperaturas = 0;
        float somaUmidades = 0;
        float somaPressoes = 0;

        for (DadoClima dadoClima : dadosClima) {
            somaTemperaturas += dadoClima.getTemperatura();
            somaUmidades += dadoClima.getUmidade();
            somaPressoes += dadoClima.getPressao();
        }

        int tamanho = dadosClima.size();

        System.out.println("Estatísticas Clima - Média Temperatura: " + (somaTemperaturas / tamanho)
                + ", Média Umidade: " + (somaUmidades / tamanho)
                + ", Média Pressão: " + (somaPressoes / tamanho));
    }

}
