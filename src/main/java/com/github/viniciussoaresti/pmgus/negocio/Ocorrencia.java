package com.github.viniciussoaresti.pmgus.negocio;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

/**
 *
 * @author BarrosPedro
 */
@Entity
public class Ocorrencia {

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
    private String zona;
    @OneToOne(optional = false)
    private Municipio municipio;
    @OneToOne(optional = false)
    private Endereco endereco;

    @OneToOne(optional = false)
    private Arma arma;
    @OneToOne(optional = false)
    private TipoDroga droga;
    @OneToOne(optional = false)
    private UnidadeDroga unidade;
    @Column(length = 70)
    private String outrasApreensoes;
     @Column(length = 10)
    private String qtdeArma;
      @Column(length = 10)
    private String qtdeDroga;
    
    @Column(length = 45) 
    private String nomeImputado;
    @Column(length = 20)
    private String EstadoCivilImputado;
    @Column(length = 25)
    private String profissaoImputado;
    @Column(length = 3)
    private int idadeImputado;
    @Column(length = 60)
    private String enderecoImputado;
    
    
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

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }
    
    public Municipio getMunicipio() {
          if (municipio == null){
             municipio = new Municipio();
             }
        return municipio;
    }

    public void setMunicipio(Municipio municipio) {
        this.municipio = municipio;
    }

    public Arma getArma() {
          if (arma == null){
                arma = new Arma();
            }
        return arma;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }

    public TipoDroga getDroga() {
          if (droga == null){
            droga = new TipoDroga();
        }
        return droga;
    }

    public void setDroga(TipoDroga droga) {
        this.droga = droga;
    }

    public UnidadeDroga getUnidade() {
          if (unidade == null){
           unidade = new UnidadeDroga();
        }
        return unidade;
    }

    public void setUnidade(UnidadeDroga unidade) {
        this.unidade = unidade;
    }

    public Endereco getEndereco() {
        if (endereco == null){
           endereco = new Endereco();
        }
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getOutrasApreensoes() {
        return outrasApreensoes;
    }

    public void setOutrasApreensoes(String outrasApreensoes) {
        this.outrasApreensoes = outrasApreensoes;
    }

    public String getNomeImputado() {
        return nomeImputado;
    }

    public void setNomeImputado(String nomeImputado) {
        this.nomeImputado = nomeImputado;
    }

    public String getEstadoCivilImputado() {
        return EstadoCivilImputado;
    }

    public void setEstadoCivilImputado(String EstadoCivilImputado) {
        this.EstadoCivilImputado = EstadoCivilImputado;
    }

    public String getProfissaoImputado() {
        return profissaoImputado;
    }

    public void setProfissaoImputado(String profissaoImputado) {
        this.profissaoImputado = profissaoImputado;
    }

    public int getIdadeImputado() {
        return idadeImputado;
    }

    public void setIdadeImputado(int idadeImputado) {
        this.idadeImputado = idadeImputado;
    }

    public String getEnderecoImputado() {
        return enderecoImputado;
    }

    public void setEnderecoImputado(String enderecoImputado) {
        this.enderecoImputado = enderecoImputado;
    }

    public String getQtdeArma() {
        return qtdeArma;
    }

    public void setQtdeArma(String qtdeArma) {
        this.qtdeArma = qtdeArma;
    }

    public String getQtdeDroga() {
        return qtdeDroga;
    }

    public void setQtdeDroga(String qtdeDroga) {
        this.qtdeDroga = qtdeDroga;
    }
    

    public Ocorrencia() {
    }

    public Ocorrencia(int codigo, String ocorrencia, String descricaoOcorrencia, Date dataOcorrencia, String zona, Municipio municipio, Endereco endereco, Arma arma, TipoDroga droga, UnidadeDroga unidade, String outrasApreensoes, String qtdeArma, String qtdeDroga, String nomeImputado, String EstadoCivilImputado, String profissaoImputado, int idadeImputado, String enderecoImputado) {
        this.codigo = codigo;
        this.ocorrencia = ocorrencia;
        this.descricaoOcorrencia = descricaoOcorrencia;
        this.dataOcorrencia = dataOcorrencia;
        this.zona = zona;
        this.municipio = municipio;
        this.endereco = endereco;
        this.arma = arma;
        this.droga = droga;
        this.unidade = unidade;
        this.outrasApreensoes = outrasApreensoes;
        this.qtdeArma = qtdeArma;
        this.qtdeDroga = qtdeDroga;
        this.nomeImputado = nomeImputado;
        this.EstadoCivilImputado = EstadoCivilImputado;
        this.profissaoImputado = profissaoImputado;
        this.idadeImputado = idadeImputado;
        this.enderecoImputado = enderecoImputado;
    }
    
     
}
