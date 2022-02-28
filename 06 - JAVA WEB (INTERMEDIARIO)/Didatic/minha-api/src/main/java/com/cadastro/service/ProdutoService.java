package com.cadastro.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cadastro.domain.Produto;
import com.cadastro.repository.ProdutoRepository;
import com.dastro.service.exception.ObjectNotFoundException;

@Service
public class ProdutoService {

	@Autowired
	private ProdutoRepository repo;
	
	public Produto findById(Integer id) {
		Optional<Produto> produto = repo.findById(id);
		return produto.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado id: " + id + "Tipo: " + Produto.class.getName()));
	}
	
	// ============= List method ===============
	public List<Produto> findAll() {
		return repo.findAll();
	}
	
	// ============= Save method ================
	public Produto save(Produto produto) {
		produto.setId(0); // NO MOODLE ESTA COMO "NULL"
		return repo.save(produto);
	}
	
	// ============== Update method ===============
	public Produto update(Produto produto) {
		Produto newProduto = findById(produto.getId());
		updateProduto(produto, newProduto);
		return repo.save(newProduto);
	}
	
	// ============== Delete method ================
	public void delete(Integer id) {
		repo.deleteById(id);
	}
	
	private void updateProduto(Produto oldProduto, Produto newProduto) {
		newProduto.setNome(oldProduto.getNome());
		newProduto.setModelo(oldProduto.getModelo());
		newProduto.setQuantidade(oldProduto.getQuantidade());
		newProduto.setValor(oldProduto.getValor());
	}
}
