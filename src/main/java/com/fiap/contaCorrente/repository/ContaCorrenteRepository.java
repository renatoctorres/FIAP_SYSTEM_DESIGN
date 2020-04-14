package com.fiap.contaCorrente.repository;

import com.fiap.contaCorrente.domain.ListaConta;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ContaCorrenteRepository extends PagingAndSortingRepository<ListaConta,Long> {
}

