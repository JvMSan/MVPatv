package org.example.model;

import org.example.view.Observer;
import org.example.logging.LogAdapter;

import java.util.ArrayList;
import java.util.List;

/*Model*/

public class EstacaoClimatica {
    private List<Observer> observers;
    private List<DadoClima> dadosClima;
    private LogAdapter logAdapter;


    public EstacaoClimatica(LogAdapter logAdapter) {
        this.observers = new ArrayList<>();
        this.dadosClima = new ArrayList<>();
        this.logAdapter = logAdapter;
    }

    public void adicionarDado(DadoClima dadoClima) {
        dadosClima.add(dadoClima);
        notificarObservers();
        logAdapter.logOperacao("Inclusão");
    }

    public void removeDado(DadoClima dadoClima) {
        dadosClima.remove(dadoClima);
        notificarObservers();
        logAdapter.logOperacao("Remoção");
    }

    public void adicionarObserver(Observer observer) {
        observers.add(observer);
    }

    private void notificarObservers() {
        for (Observer observer : observers) {
            observer.atualizar(dadosClima);
        }
    }

}
