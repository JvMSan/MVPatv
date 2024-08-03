package org.example.view;

import org.example.model.DadoClima;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class EstatisticaClimaView  implements Observer {
    private List<DadoClima> dadosClima;
    private JTextArea estatisticaClima;

    public EstatisticaClimaView() {
        dadosClima = new ArrayList<>();
        estatisticaClima = new JTextArea();
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
