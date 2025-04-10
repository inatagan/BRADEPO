package com.inatagan.ex03;

import java.time.Duration;
import java.time.Instant;

public class CalculaHoras implements ICalculaHoras {
    private Instant hora_inicial, hora_final;
    private double total_horas;

    public CalculaHoras(Instant hora_inicial, Instant hora_final) {
        this.hora_inicial = hora_inicial;
        this.hora_final = hora_final;
    }

    public double calcularHorasTotal(Instant hora_inicial, Instant hora_final) {
        Instant inicio = hora_inicial;
        Instant fim = hora_final;
        Duration tempo_decorrido = Duration.between(inicio, fim);
        return Double.valueOf(tempo_decorrido.toString());
    }

    @Override
    public void connect(IGeraPagamento componente) {
        double total_horas = calcularHorasTotal(hora_inicial, hora_final);
        componente.update(total_horas);
    }

    public Instant getHora_inicial() {
        return hora_inicial;
    }

    public void setHora_inicial(Instant hora_inicial) {
        this.hora_inicial = hora_inicial;
    }

    public Instant getHora_final() {
        return hora_final;
    }

    public void setHora_final(Instant hora_final) {
        this.hora_final = hora_final;
    }

    public double getTotal_horas() {
        return total_horas;
    }

    public void setTotal_horas(double total_horas) {
        this.total_horas = total_horas;
    }
}
