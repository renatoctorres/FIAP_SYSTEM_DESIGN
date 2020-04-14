package com.fiap.contaCorrente;

import com.fiap.contaCorrente.domain.ListaConta;
import com.fiap.contaCorrente.service.ContaCorrenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ContaCorrenteApplication{

	@Autowired
	private ContaCorrenteService contaCorrenteService;
	public static void main(String[] args) {SpringApplication.run(ContaCorrenteApplication.class, args);}
}
