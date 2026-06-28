package com.filipe.calculadora_obra.bean;

import com.filipe.calculadora_obra.dto.ArestaRequest;
import com.filipe.calculadora_obra.dto.ConcretoRequest;
import com.filipe.calculadora_obra.dto.TijoloRequest;
import com.filipe.calculadora_obra.model.Orcamento;
import com.filipe.calculadora_obra.repository.OrcamentoRepository;
import com.filipe.calculadora_obra.service.ConcretoService;
import com.filipe.calculadora_obra.service.TijoloService;
import jakarta.annotation.PostConstruct;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Named
@ViewScoped
public class OrcamentoBean implements Serializable {

    @Autowired
    private OrcamentoRepository repository;

    @Autowired
    private TijoloService tijoloService;

    @Autowired
    private ConcretoService concretoService;

    private String termoBusca;
    private List<Orcamento> listaOrcamentos;
    private Orcamento novoOrcamento;

    private Double alturaParede;
    private Double alturaTijolo;
    private Double comprimentoTijolo;
    private Double larguraConcreto;
    private Double alturaConcreto;

    private List<ArestaRequest> arestas;

    @PostConstruct
    public void init() {
        novoOrcamento = new Orcamento();
        listaOrcamentos = repository.findAll();

        arestas = new ArrayList<>();
        arestas.add(new ArestaRequest());
    }

    public void adicionarParede() {
        arestas.add(new ArestaRequest());
    }

    public void removerParede(ArestaRequest arestaParaRemover) {
        arestas.remove(arestaParaRemover);
    }

    public void buscar() {
        if (termoBusca != null && !termoBusca.trim().isEmpty()) {
            try {
                Long numero = Long.parseLong(termoBusca);
                Optional<Orcamento> orcamento = repository.findById(numero);

                if (orcamento.isPresent()) {
                    listaOrcamentos = new ArrayList<>();
                    listaOrcamentos.add(orcamento.get());
                } else {
                    listaOrcamentos = new ArrayList<>();
                }
            } catch (NumberFormatException e) {
                listaOrcamentos = repository.findByNomeUsuarioContainingIgnoreCase(termoBusca);
            }
        } else {
            listaOrcamentos = repository.findAll();
        }
    }

    public String salvar() {
        TijoloRequest requestTijolo = new TijoloRequest();

        requestTijolo.setAlturaParede(alturaParede);
        requestTijolo.setAlturaTijolo(alturaTijolo);
        requestTijolo.setComprimentoTijolo(comprimentoTijolo);
        requestTijolo.setArestas(arestas);

        ConcretoRequest requestConcreto = new ConcretoRequest();
        requestConcreto.setAltura(alturaConcreto);
        requestConcreto.setLargura(larguraConcreto);
        requestConcreto.setArestas(arestas);

        double volumeCalculado = concretoService.calcularVolume(requestConcreto);
        int quantidadeTijolosCalculada = tijoloService.calcularQuantidade(requestTijolo);

        novoOrcamento.setVolumeConcreto(volumeCalculado);
        novoOrcamento.setQuantidadeTijolos((double) quantidadeTijolosCalculada);

        repository.save(novoOrcamento);
        return "index.xhtml?faces-redirect=true";
    }

    public String getTermoBusca() {
        return termoBusca;
    }

    public void setTermoBusca(String termoBusca) {
        this.termoBusca = termoBusca;
    }

    public List<Orcamento> getListaOrcamentos() {
        return listaOrcamentos;
    }

    public void setListaOrcamentos(List<Orcamento> listaOrcamentos) {
        this.listaOrcamentos = listaOrcamentos;
    }

    public Orcamento getNovoOrcamento() {
        return novoOrcamento;
    }

    public void setNovoOrcamento(Orcamento novoOrcamento) {
        this.novoOrcamento = novoOrcamento;
    }

    public Double getAlturaParede() {
        return alturaParede;
    }

    public void setAlturaParede(Double alturaParede) {
        this.alturaParede = alturaParede;
    }

    public Double getAlturaTijolo() {
        return alturaTijolo;
    }

    public void setAlturaTijolo(Double alturaTijolo) {
        this.alturaTijolo = alturaTijolo;
    }

    public Double getComprimentoTijolo() {
        return comprimentoTijolo;
    }

    public void setComprimentoTijolo(Double comprimentoTijolo) {
        this.comprimentoTijolo = comprimentoTijolo;
    }

    public Double getLarguraConcreto() {
        return larguraConcreto;
    }

    public void setLarguraConcreto(Double larguraConcreto) {
        this.larguraConcreto = larguraConcreto;
    }

    public Double getAlturaConcreto() {
        return alturaConcreto;
    }

    public void setAlturaConcreto(Double alturaConcreto) {
        this.alturaConcreto = alturaConcreto;
    }

    public List<ArestaRequest> getArestas() {
        return arestas;
    }

    public void setArestas(List<ArestaRequest> arestas) {
        this.arestas = arestas;
    }
}