package com.fag.lucasmartins.mvc.model.service.impl;

import com.fag.lucasmartins.mvc.model.bo.ProdutoBO;
import com.fag.lucasmartins.mvc.model.repository.mapper.ProdutoRepository;
import com.fag.lucasmartins.mvc.model.service.impl.ProdutoService;
import org.springframework.stereotype.Service;

@Service
public class ProdutoServiceImpl implements ProdutoService {

    private final ProdutoRepository produtoRepository;

    public ProdutoServiceImpl(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    @Override
    public ProdutoBO cadastrarProduto(ProdutoBO produtoBO) {
        produtoBO.prepararParaCadastro();

        return produtoRepository.salvar(produtoBO);
    }
}