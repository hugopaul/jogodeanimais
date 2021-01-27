package br.com.jogoanimais.jogodeanimais;

import br.com.jogoanimais.jogodeanimais.controller.Start;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JogodeanimaisApplication {

	public static void main(String[] args) {
		Start start = new Start();
		SpringApplication.run(start.start(), args);
	}

}
