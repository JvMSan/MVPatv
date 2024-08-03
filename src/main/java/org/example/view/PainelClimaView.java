package org.example.view;

import org.example.model.DadoClima;

import javax.swing.*;
import java.awt.*;
import java.time.LocalDate;
import java.util.List;

public class PainelClimaView implements Observer {
    private JTextArea painelArea;

    public PainelClimaView(){
        painelArea = new JTextArea();
    }

    @Override
    public void atualizar(List<DadoClima> dados) {
        StringBuilder sb = new StringBuilder();
        for (DadoClima dadoClima : dados) {
            if (dadoClima.getData().isEqual(LocalDate.now())) {
                sb.append("Painel Clima - Data: ").append(dadoClima.getData())
                        .append(", Temperatura: ").append(dadoClima.getTemperatura())
                        .append(", Umidade: ").append(dadoClima.getUmidade())
                        .append(", Pressão: ").append(dadoClima.getPressao()).append("\n");
            }
        }
        painelArea.setText(sb.toString());
    }

}
