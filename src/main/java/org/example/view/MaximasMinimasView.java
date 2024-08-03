package org.example.view;

import org.example.model.DadoClima;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class MaximasMinimasView implements Observer {
    private List<DadoClima> dadosClima;
    private JTextArea maxMinArea;

    public MaximasMinimasView() {
        dadosClima = new ArrayList<>();
        maxMinArea = new JTextArea();

    }
    @Override
    public void atualizar(List<DadoClima> dados) {
        dadosClima = dados;
        exibirMaximasMinimas();
    }
    private void exibirMaximasMinimas() {
        float maxTemp = Float.MIN_VALUE;
        float minTemp = Float.MAX_VALUE;
        float maxUmidade = Float.MIN_VALUE;
        float minUmidade = Float.MAX_VALUE;
        float maxPressao = Float.MIN_VALUE;
        float minPressao = Float.MAX_VALUE;

        for (DadoClima dadoClima : dadosClima) {
            if (dadoClima.getTemperatura() > maxTemp) maxTemp = dadoClima.getTemperatura();
            if (dadoClima.getTemperatura() < minTemp) minTemp = dadoClima.getTemperatura();
            if (dadoClima.getUmidade() > maxUmidade) maxUmidade = dadoClima.getUmidade();
            if (dadoClima.getUmidade() < minUmidade) minUmidade = dadoClima.getUmidade();
            if (dadoClima.getPressao() > maxPressao) maxPressao = dadoClima.getPressao();
            if (dadoClima.getPressao() < minPressao) minPressao = dadoClima.getPressao();
        }

        maxMinArea.setText("Máximas e Mínimas Climáticas - Máx Temperatura: " + maxTemp
                + ", Mín Temperatura: " + minTemp
                + ", Máx Umidade: " + maxUmidade
                + ", Mín Umidade: " + minUmidade
                + ", Máx Pressão: " + maxPressao
                + ", Mín Pressão: " + minPressao);
    }
}
