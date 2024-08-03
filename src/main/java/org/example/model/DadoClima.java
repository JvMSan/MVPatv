package org.example.model;

import java.time.LocalDate;

public class DadoClima {
    private float temperatura;
    private float umidade;
    private float pressao;
    private String data;

    public DadoClima(float temperatura, float umidade, float pressao, String data) {
        this.temperatura = temperatura;
        this.umidade = umidade;
        this.pressao = pressao;
        this.data = data;
    }

    public float getTemperatura() {
        return temperatura;
    }

    public String getData() {
        return data;
    }

    public float getPressao() {
        return pressao;
    }

    public float getUmidade() {
        return umidade;
    }
}
