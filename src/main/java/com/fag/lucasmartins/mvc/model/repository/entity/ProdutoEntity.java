package com.fag.lucasmartins.mvc.model.repository.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name = "tb_produtos")
public class ProdutoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal precoBase;

    @Column(nullable = false)
    private Integer quantidade;

    @Column(nullable = false)
    private boolean premium;

    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal precoFinal;

    public ProdutoEntity() {
    }

    public ProdutoEntity(Long id, String nome, BigDecimal precoBase, Integer quantidade, boolean premium, BigDecimal precoFinal) {
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