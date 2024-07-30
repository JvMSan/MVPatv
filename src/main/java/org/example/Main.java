package org.example;

import org.example.logging.FileLogger;
import org.example.logging.LogAdapter;
import org.example.model.EstacaoClimatica;
import org.example.presenter.ClimaPresenter;
import org.example.view.EstatisticaClimaView;
import org.example.view.MaximasMinimasView;
import org.example.view.PainelClimaView;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        LogAdapter logAdapter = new LogAdapter(new FileLogger("log.txt"));

        EstacaoClimatica model =  new EstacaoClimatica(logAdapter);

        EstatisticaClimaView estatisticaView = new EstatisticaClimaView();
        MaximasMinimasView maxiMinView = new MaximasMinimasView();
        PainelClimaView painelView = new PainelClimaView();

        ClimaPresenter presenter = new ClimaPresenter(model, estatisticaView, maxiMinView, painelView);

        presenter.adicionarDado(25.5f, 60.0f, 1013.0f, LocalDate.now());
        presenter.adicionarDado(27.8f, 65.0f, 1010.0f, LocalDate.now());

    }
}