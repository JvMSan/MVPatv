package org.example;

import org.example.logging.FileLogger;
import org.example.logging.LogAdapter;
import org.example.logging.Logger;
import org.example.logging.XmlFileLogger;
import org.example.logging.JsonFileLogger;
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
//        LogAdapter logAdapter = new LogAdapter(new FileLogger("log.txt"));
        Logger jsonLogger = new JsonFileLogger("log.json");
        Logger xmlLogger = new XmlFileLogger("log.xml");

        LogAdapter jsonLogAdapter = new LogAdapter(jsonLogger);
        LogAdapter xmlLogAdapter = new LogAdapter(xmlLogger);

        EstacaoClimatica model =  new EstacaoClimatica();

        EstatisticaClimaView estatisticaView = new EstatisticaClimaView();
        MaximasMinimasView maxiMinView = new MaximasMinimasView();
//        PainelClimaView painelView = new PainelClimaView();

        ClimaPresenter presenter = new ClimaPresenter(model, estatisticaView, maxiMinView, painelView);

        presenter.adicionarDado(25.5f, 60.0f, 1013.0f, LocalDate.now());
        jsonLogAdapter.logOperacao("Inclusao");
        presenter.adicionarDado(27.8f, 65.0f, 1010.0f, LocalDate.now());
        xmlLogAdapter.logOperacao("Inclusao");


    }
}