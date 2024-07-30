package org.example;

import java.util.ArrayList;
import java.util.List;

public class MaximasMinimasObserver implements Painel{
    private List<DadoClima> dadosClima;

    public MaximasMinimasObserver() {
        dadosClima = new ArrayList<>();
    }
    @Override
    public void atualizar(DadoClima dadoClima) {
        dadosClima.add(dadoClima);
        exibirMaximasMinimas();
    }
    private void exibirMaximasMinimas() {
        //Obtem máximas e mínimas
    }

}
