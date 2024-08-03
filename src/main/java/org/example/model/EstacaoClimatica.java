package org.example.model;

import org.example.view.Observer;
import org.example.logging.LogAdapter;

import java.util.ArrayList;
import java.util.List;

/*Model*/

public class EstacaoClimatica {
    private List<Observer> observers;
    private List<DadoClima> dadosClima;



    public EstacaoClimatica() {
        this.observers = new ArrayList<>();
        this.dadosClima = new ArrayList<>();

    }

    public void adicionarDado(DadoClima dadoClima) {
        dadosClima.add(dadoClima);
        notificarObservers();
    }

    public void removeDado(DadoClima dadoClima) {
        dadosClima.remove(dadoClima);
        notificarObservers();
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
