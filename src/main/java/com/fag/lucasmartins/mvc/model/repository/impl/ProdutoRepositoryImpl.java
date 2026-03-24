package com.fag.lucasmartins.mvc.model.repository.impl;

import com.fag.lucasmartins.mvc.model.bo.ProdutoBO;
import com.fag.lucasmartins.mvc.model.repository.mapper.ProdutoRepository;
import com.fag.lucasmartins.mvc.model.repository.entity.ProdutoEntity;
import com.fag.lucasmartins.mvc.model.repository.jpa.ProdutoJpaRepository;
import com.fag.lucasmartins.mvc.model.repository.mapper.ProdutoEntityMapper;
import org.springframework.stereotype.Component;

@Component
public class ProdutoRepositoryImpl implements ProdutoRepository {

    private final ProdutoJpaRepository jpaRepository;

    public ProdutoRepositoryImpl(ProdutoJpaRepository jpaRepository) {
        this.jpaRepository = jpaRepository;
    }

    @Override
    public ProdutoBO salvar(ProdutoBO bo) {
        ProdutoEntity entity = ProdutoEntityMapper.toEntity(bo);

        ProdutoEntity produtoSalvo = jpaRepository.save(entity);

        return ProdutoEntityMapper.toBo(produtoSalvo);
    }
}