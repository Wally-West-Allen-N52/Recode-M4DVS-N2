package com.cadastro.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cadastro.domain.Produto;
import com.cadastro.repository.ProdutoRepository;

@Service
public class DBService {

	@Autowired
	private ProdutoRepository repo;
	
	public void inicializarDB() {
		Produto produto = new Produto(0, "Notebook", " K45A", 15, 2599.00);
		repo.save(produto);
	}
}
