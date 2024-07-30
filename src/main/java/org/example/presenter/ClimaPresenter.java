package org.example.presenter;


import org.example.model.DadoClima;
import org.example.model.EstacaoClimatica;
import org.example.view.EstatisticaClimaView;
import org.example.view.MaximasMinimasView;
import org.example.view.PainelClimaView;

import java.time.LocalDate;

public class ClimaPresenter {
    private EstacaoClimatica model;
    private EstatisticaClimaView estatisticaView;
    private MaximasMinimasView maxMinView;
    private PainelClimaView painelView;

    public ClimaPresenter(EstacaoClimatica model, EstatisticaClimaView estatisticaView, MaximasMinimasView maxMinView, PainelClimaView painelView) {
        this.model = model;
        this.estatisticaView = estatisticaView;
        this.maxMinView = maxMinView;
        this.painelView = painelView;

        this.model.adicionarObserver(estatisticaView);
        this.model.adicionarObserver(maxMinView);
        this.model.adicionarObserver(painelView);

    }

    public void adicionarDado(float temperatura, float umidade, float pressao, LocalDate data) {
        DadoClima dado = new DadoClima(temperatura, umidade, pressao, data);
        model.adicionarDado(dado);
    }

    public void removerDado(DadoClima dado) {
        model.removeDado(dado);
    }

}
