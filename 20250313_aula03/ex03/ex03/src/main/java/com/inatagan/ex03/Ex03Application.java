package com.inatagan.ex03;

import java.time.Instant;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Ex03Application {

	public static void main(String[] args) {
		SpringApplication.run(Ex03Application.class, args);
		final Instant hora_ini = Instant.parse("2025-01-01T07:00:00");
		final Instant hora_fim = Instant.parse("2025-01-01T18:00:00");
		double valor_hora = 18;
		double valor_final;

		ICalculaHoras ch = new CalculaHoras(hora_ini, hora_fim);
		IGeraPagamento gp = new GeraPagamento(total_horas, valor_hora);
		ch.connect(gp);

		System.out.println(valor_final);
	}

}
