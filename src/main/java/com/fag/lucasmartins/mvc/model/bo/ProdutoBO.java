package com.fag.lucasmartins.mvc.model.bo;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ProdutoBO {

    private static final int QUANTIDADE_MINIMA_ATACADO = 10;
    private static final BigDecimal DESCONTO_ATACADO = new BigDecimal("0.10");

    private Long id;

    private String nome;

    private BigDecimal precoBase;

    private Integer quantidade;

    private boolean premium;

    private BigDecimal precoFinal;

    public ProdutoBO() {
    }

    public ProdutoBO(Long id, String nome, BigDecimal precoBase, Integer quantidade, Boolean premium) {
        this.id = id;
        this.nome = nome;
        this.precoBase = precoBase;
        this.quantidade = quantidade;
        this.premium = Boolean.TRUE.equals(premium);
    }

    public ProdutoBO(Long id, String nome, BigDecimal precoBase, Integer quantidade, boolean premium, BigDecimal precoFinal) {
        this.id = id;
        this.nome = nome;
        this.precoBase = precoBase;
        this.quantidade = quantidade;
        this.premium = premium;
        this.precoFinal = precoFinal;
    }

    public void prepararParaCadastro() {
        validarProdutoPremium();
        this.precoFinal = calcularPrecoFinal();
    }

    private void validarProdutoPremium() {
        if (premium && (nome == null || !nome.toLowerCase().contains("premium"))) {
            throw new IllegalArgumentException("Produtos premium devem conter 'Premium' no nome.");
        }
    }

    private BigDecimal calcularPrecoFinal() {
        BigDecimal precoCalculado = precoBase;

        if (quantidade != null && quantidade >= QUANTIDADE_MINIMA_ATACADO) {
            precoCalculado = precoBase.multiply(BigDecimal.ONE.subtract(DESCONTO_ATACADO));
        }

        return precoCalculado.setScale(2, RoundingMode.HALF_UP);
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

    public boolean isPremium() {
        return premium;
    }

    public void setPremium(boolean premium) {
        this.premium = premium;
    }

    public BigDecimal getPrecoFinal() {
        return precoFinal;
    }

    public void setPrecoFinal(BigDecimal precoFinal) {
        this.precoFinal = precoFinal;
    }
}