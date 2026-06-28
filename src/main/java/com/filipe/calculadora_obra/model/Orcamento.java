package com.filipe.calculadora_obra.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "tb_orcamento")
public class Orcamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numero; // Atende ao requisito do PDF: "número de orçamento"

    @Column(name = "nome_usuario", nullable = false)
    private String nomeUsuario; // Atende ao requisito do PDF: "nome do usuário"

    // Campos para guardar o resultado dos cálculos
    @Column(name = "qtd_tijolos")
    private Double quantidadeTijolos;

    @Column(name = "vol_concreto")
    private Double volumeConcreto;

    @Column(name = "data_solicitacao")
    private LocalDateTime dataSolicitacao = LocalDateTime.now();


    public Long getNumero() {
        return numero;
    }

    public void setNumero(Long numero) {
        this.numero = numero;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public Double getQuantidadeTijolos() {
        return quantidadeTijolos;
    }

    public void setQuantidadeTijolos(Double quantidadeTijolos) {
        this.quantidadeTijolos = quantidadeTijolos;
    }

    public Double getVolumeConcreto() {
        return volumeConcreto;
    }

    public void setVolumeConcreto(Double volumeConcreto) {
        this.volumeConcreto = volumeConcreto;
    }

    public LocalDateTime getDataSolicitacao() {
        return dataSolicitacao;
    }

    public void setDataSolicitacao(LocalDateTime dataSolicitacao) {
        this.dataSolicitacao = dataSolicitacao;
    }
}