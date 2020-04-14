package com.fiap.contaCorrente.service;

import com.fiap.contaCorrente.domain.ListaConta;
import com.fiap.contaCorrente.repository.ContaCorrenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class ContaCorrenteService {

    private final ContaCorrenteRepository contaCorrenteRepository;

    @Autowired
    public ContaCorrenteService(final ContaCorrenteRepository contaCorrenteRepository)
    {
        this.contaCorrenteRepository = contaCorrenteRepository;
    }

    @Transactional
    public ListaConta add(String tipoItem, String recebidoDeEnvioPara, double valor, String data) {
        return contaCorrenteRepository.save(new ListaConta()
                .setTipoItem(tipoItem)
                .setRecebidoDeEnvioPara(recebidoDeEnvioPara)
                .setValor(valor).setData(data));
    }

    public Page<ListaConta> listAll()
    {
        Page<ListaConta> lista = contaCorrenteRepository.findAll(PageRequest.of(0,100));
        return lista;
    }

    public void AddAll()
    {
        for (int i = 0; i < 20; i++)
        {
            if (i%2 == 0) add("Transferencia Realizada","Contato "+i, (i+i)*i,"hoje");
            if (i%3 == 0)
                add("Transferencia Recebida","Contato "+i, i*i,"ontem");
            if (i%7 == 0)
                add("Compra no Débito","Contato "+i, i*i*i,"Quinta-feira");
        }

    }

}
