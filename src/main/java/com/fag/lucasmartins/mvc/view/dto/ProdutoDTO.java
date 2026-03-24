package com.fag.lucasmartins.mvc.view.dto;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

public class ProdutoDTO {

    private Long id;

    @NotBlank(message = "O nome do produto é obrigatório.")
    private String nome;

    @NotNull(message = "O preço base do produto é obrigatório.")
    @DecimalMin(value = "0.01", message = "O preço base deve ser maior que zero.")
    @Digits(integer = 10, fraction = 2, message = "O preço base deve ter no máximo 10 inteiros e 2 casas decimais.")
    private BigDecimal precoBase;

    @NotNull(message = "A quantidade do produto é obrigatória.")
    @Min(value = 1, message = "A quantidade deve ser de pelo menos 1 unidade.")
    private Integer quantidade;

    @NotNull(message = "É necessário informar se o produto é premium.")
    private Boolean premium;

    private BigDecimal precoFinal;

    public ProdutoDTO() {
    }

    public ProdutoDTO(Long id, String nome, BigDecimal precoBase, Integer quantidade, Boolean premium, BigDecimal precoFinal) {
        this.id = id;
        this.nome = nome;
        this.precoBase = precoBase;
        this.quantidade = quantidade;
        this.premium = premium;
        this.precoFinal = precoFinal;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public BigDecimal getPrecoBase() {
        return precoBase;
    }

    public void setPrecoBase(BigDecimal precoBase) {
        this.precoBase = precoBase;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Boolean getPremium() {
        return premium;
    }

    public void setPremium(Boolean premium) {
        this.premium = premium;
    }

    public BigDecimal getPrecoFinal() {
        return precoFinal;
    }

    public void setPrecoFinal(BigDecimal precoFinal) {
        this.precoFinal = precoFinal;
    }
}