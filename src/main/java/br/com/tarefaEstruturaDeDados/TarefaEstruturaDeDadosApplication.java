package br.com.tarefaEstruturaDeDados;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.tarefaEstruturaDeDados.principal.Principal;

@SpringBootApplication
public class TarefaEstruturaDeDadosApplication {

	public static void main(String[] args) {
		SpringApplication.run(TarefaEstruturaDeDadosApplication.class, args);
		Principal main = new Principal();
		main.exibirMenu();
	}
	


}
