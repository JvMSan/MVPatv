package org.example.view;

import org.example.model.DadoClima;

import java.util.List;

public interface Observer {
    void atualizar(List<DadoClima> dadoClimaList);
}
