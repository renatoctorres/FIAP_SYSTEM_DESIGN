package com.fiap.contaCorrente.controller;

import com.fiap.contaCorrente.domain.ListaConta;
import com.fiap.contaCorrente.service.ContaCorrenteService;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;
import java.net.URISyntaxException;


@RestController
@RequestMapping("/contacorrente")
public class ContaCorrenteController {


    private final ContaCorrenteService ccService;

    public ContaCorrenteController(final ContaCorrenteService ccService)
    {
        this.ccService = ccService;
    }
    //GET
    @GetMapping
    public ResponseEntity<Page<ListaConta>> list()
    {
        final Page<ListaConta> listacc = this.ccService.listAll();
        return ResponseEntity.ok(listacc);
    }


    @PostMapping
    public ResponseEntity create() throws URISyntaxException {
        this.ccService.AddAll();
        return ResponseEntity.created(new URI("/contacorrente")).build();
    }
}
