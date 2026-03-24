package com.fag.lucasmartins.mvc.controller.mapper;

import com.fag.lucasmartins.mvc.controller.mapper.ProdutoDTOMapper;
import com.fag.lucasmartins.mvc.model.bo.ProdutoBO;
import com.fag.lucasmartins.mvc.model.service.impl.ProdutoService;
import com.fag.lucasmartins.mvc.view.dto.ProdutoDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {

    private final ProdutoService produtoService;

    public ProdutoController(ProdutoService produtoService) {
        this.produtoService = produtoService;
    }

    @PostMapping
    public ResponseEntity<ProdutoDTO> cadastrarProduto(@Valid @RequestBody ProdutoDTO dto) {
        ProdutoBO produtoBO = ProdutoDTOMapper.toBo(dto);

        ProdutoBO produtoCriadoBO = produtoService.cadastrarProduto(produtoBO);

        ProdutoDTO produtoCriadoDTO = ProdutoDTOMapper.toDto(produtoCriadoBO);

        return ResponseEntity
                .status(201)
                .body(produtoCriadoDTO);
    }
}