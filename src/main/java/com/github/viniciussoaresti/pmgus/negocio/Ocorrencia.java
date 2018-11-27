package com.github.viniciussoaresti.pmgus.negocio;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author vinic
 */
@Entity
public class Ocorrencia implements Serializable {

    @Id
    @GeneratedValue
    private int codigo;
    @Column(length = 150)
    private String ocorrencia;
    @Column(length = 600)
    private String descricaoOcorrencia;
    @Column(name = "DATA_OCORRENCIA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataOcorrencia;
    @Column(length = 50)
    private String flagrante;
    @OneToOne(optional = false)
    private Endereco endereco;
    @OneToOne(optional = false)
    private Vitima vitima;
    @OneToOne(optional = false)
    private Arma arma;
    @OneToOne(optional = false)
    private TipoDroga droga;
    @OneToOne(optional = false)
    private UnidadeDroga unidade;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getOcorrencia() {
        return ocorrencia;
    }

    public void setOcorrencia(String ocorrencia) {
        this.ocorrencia = ocorrencia;
    }

    public String getDescricaoOcorrencia() {
        return descricaoOcorrencia;
    }

    public void setDescricaoOcorrencia(String descricaoOcorrencia) {
        this.descricaoOcorrencia = descricaoOcorrencia;
    }

    public Date getDataOcorrencia() {
        return dataOcorrencia;
    }

    public void setDataOcorrencia(Date dataOcorrencia) {
        this.dataOcorrencia = dataOcorrencia;
    }

    public String getFlagrante() {
        return flagrante;
    }

    public void setFlagrante(String flagrante) {
        this.flagrante = flagrante;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Vitima getVitima() {
        return vitima;
    }

    public void setVitima(Vitima vitima) {
        this.vitima = vitima;
    }

    public Arma getArma() {
        return arma;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }

    public TipoDroga getDroga() {
        return droga;
    }

    public void setDroga(TipoDroga droga) {
        this.droga = droga;
    }

    public UnidadeDroga getUnidade() {
        return unidade;
    }

    public void setUnidade(UnidadeDroga unidade) {
        this.unidade = unidade;
    }

    public Ocorrencia() {

    }

    public Ocorrencia(int codigo, String ocorrencia, String descricaoOcorrencia, Date dataOcorrencia, String flagrante, Endereco endereco, Vitima vitima, Arma arma, TipoDroga droga, UnidadeDroga unidade) {
        this.codigo = codigo;
        this.ocorrencia = ocorrencia;
        this.descricaoOcorrencia = descricaoOcorrencia;
        this.dataOcorrencia = dataOcorrencia;
        this.flagrante = flagrante;
        this.endereco = endereco;
        this.vitima = vitima;
        this.arma = arma;
        this.droga = droga;
        this.unidade = unidade;
    }
}
