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
 * @author BarrosPedro
 */
@Entity
public class Ocorrencia implements Serializable {

    @Id
    @GeneratedValue
    private int codigo;
    @Column(length = 150)
    private String ocorrencia;
    @Column(length = 1000)
    private String descricaoOcorrencia;
    @Column(name = "DATA_OCORRENCIA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataOcorrencia;
    @Column(length = 60)
    private String efetivoDeApreensao;

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
    @Column(length = 9)
    private int qtdeArma;
    @Column(length = 9)
    private int qtdeDroga;

    @Column(length = 45)
    private String nomeImputado;
    @Column(length = 20)
    private String estadoCivilImputado;
    @Column(length = 25)
    private String profissaoImputado;
    @Column(length = 3)
    private int idadeImputado;
    @Column(length = 60)
    private String enderecoImputado;

    @Column(length = 45)
    private String nomeVitima;
    @Column(length = 20)
    private String estadoCivilVitima;
    @Column(length = 25)
    private String profissaoVitima;
    @Column(length = 3)
    private int idadeVitima;
    @Column(length = 60)
    private String enderecoVitima;

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
        return municipio;

    }

    public void setMunicipio(Municipio municipio) {
        this.municipio = municipio;
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

    public Endereco getEndereco() {
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
        return estadoCivilImputado;
    }

    public void setEstadoCivilImputado(String estadoCivilImputado) {
        this.estadoCivilImputado = estadoCivilImputado;
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

    public String getNomeVitima() {
        return nomeVitima;
    }

    public void setNomeVitima(String nomeVitima) {
        this.nomeVitima = nomeVitima;
    }

    public String getEstadoCivilVitima() {
        return estadoCivilVitima;
    }

    public void setEstadoCivilVitima(String estadoCivilVitima) {
        this.estadoCivilVitima = estadoCivilVitima;
    }

    public String getProfissaoVitima() {
        return profissaoVitima;
    }

    public void setProfissaoVitima(String profissaoVitima) {
        this.profissaoVitima = profissaoVitima;
    }

    public int getIdadeVitima() {
        return idadeVitima;
    }

    public void setIdadeVitima(int idadeVitima) {
        this.idadeVitima = idadeVitima;
    }

    public String getEnderecoVitima() {
        return enderecoVitima;
    }

    public void setEnderecoVitima(String enderecoVitima) {
        this.enderecoVitima = enderecoVitima;
    }

    public int getQtdeArma() {
        return qtdeArma;
    }

    public void setQtdeArma(int qtdeArma) {
        this.qtdeArma = qtdeArma;
    }

    public int getQtdeDroga() {
        return qtdeDroga;
    }

    public void setQtdeDroga(int qtdeDroga) {
        this.qtdeDroga = qtdeDroga;
    }

    public String getEfetivoDeApreensao() {
        return efetivoDeApreensao;
    }

    public void setEfetivoDeApreensao(String efetivoDeApreensao) {
        this.efetivoDeApreensao = efetivoDeApreensao;
    }

    public Ocorrencia() {
    }

    public Ocorrencia(int codigo, String ocorrencia, String descricaoOcorrencia, Date dataOcorrencia, String efetivoDeApreensao, String zona, Municipio municipio, Endereco endereco, Arma arma, TipoDroga droga, UnidadeDroga unidade, String outrasApreensoes, int qtdeArma, int qtdeDroga, String nomeImputado, String estadoCivilImputado, String profissaoImputado, int idadeImputado, String enderecoImputado, String nomeVitima, String estadoCivilVitima, String profissaoVitima, int idadeVitima, String enderecoVitima) {
        this.codigo = codigo;
        this.ocorrencia = ocorrencia;
        this.descricaoOcorrencia = descricaoOcorrencia;
        this.dataOcorrencia = dataOcorrencia;
        this.efetivoDeApreensao = efetivoDeApreensao;
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
        this.estadoCivilImputado = estadoCivilImputado;
        this.profissaoImputado = profissaoImputado;
        this.idadeImputado = idadeImputado;
        this.enderecoImputado = enderecoImputado;
        this.nomeVitima = nomeVitima;
        this.estadoCivilVitima = estadoCivilVitima;
        this.profissaoVitima = profissaoVitima;
        this.idadeVitima = idadeVitima;
        this.enderecoVitima = enderecoVitima;
    }

    public String dadosImputado() {
        return this.nomeImputado + ", " + this.idadeImputado + ", " + this.estadoCivilImputado + ", " + this.enderecoImputado + ", " + this.profissaoImputado;
    }

    public String dadosVitima() {
        if (this.nomeVitima == null) {
            return "NÃO HOUVE VÍTIMA";
        }
        return this.nomeVitima + ", " + this.idadeVitima + ", " + this.estadoCivilVitima + ", " + this.enderecoVitima + ", " + this.profissaoVitima;
    }

    public String dadosArma() {
        if (this.arma == null) {
            return "NENHUMA ARMA APREENDIDA";
        }
        return this.qtdeArma + " " + this.arma.getModelo() + "(" + this.arma.getTipoDeArma() + ")";
    }

    public String dadosDroga() {
        if (this.droga == null && this.unidade == null || this.droga == null || this.unidade == null) {
            return "NENHUMA DROGA APREENDIDA";
        }
        return this.qtdeDroga + " " + this.unidade.getUnidadeDroga() + " " + this.droga.getNome();
    }

    public String dadosOutrasApreensoes() {
        if (this.outrasApreensoes == null || this.outrasApreensoes.trim().isEmpty()) {
            return "NADA MAIS APREENDIDO";
        }
        return this.outrasApreensoes;
    }

    public boolean validaOcorrencia() {
        if (this.ocorrencia.length() > 150 || this.ocorrencia == null || this.ocorrencia.trim().isEmpty()) {
            return false;
        }
        return true;
    }

    public boolean validaDescricaoOcorrencia() {
        if (this.descricaoOcorrencia.length() > 1000 || this.descricaoOcorrencia == null || this.descricaoOcorrencia.trim().isEmpty()) {
            return false;
        }
        return true;
    }

    public boolean validaEfetivos() {
        if (this.efetivoDeApreensao.length() > 60 || this.efetivoDeApreensao == null || this.efetivoDeApreensao.trim().isEmpty()) {
            return false;
        }
        return true;
    }

    public boolean validaZona() {
        if (this.zona.length() > 50 || this.zona == null || this.zona.trim().isEmpty()) {
            return false;
        }
        return true;
    }

    public boolean validaMunicipio() {
        if (this.municipio == null) {
            return false;
        }
        return true;
    }

    public boolean validaEndereco() {
        if (this.endereco == null) {
            return false;
        }
        return true;
    }

    public boolean validaOutrasApreensoes() {
        if (this.ocorrencia.length() > 70) {
            return false;
        }
        return true;
    }

    public boolean validaQtdeArma() {
        if (this.qtdeArma > 999999999 || this.qtdeArma<0) {
            return false;
        }
        return true;
    }

    public boolean validaQtdeDroga() {
        if (this.qtdeDroga > 999999999 || this.qtdeDroga<0) {
            return false;
        }
        return true;
    }

    public boolean validaNomeImputado() {
        if (this.nomeImputado.length() > 45 || this.nomeImputado == null || this.nomeImputado.trim().isEmpty()) {
            return false;
        }
        return true;
    }

    public boolean validaEstadoCivilImputado() {
        if (this.estadoCivilImputado.length() > 20 || this.estadoCivilImputado == null || this.estadoCivilImputado.trim().isEmpty()) {
            return false;
        }
        return true;
    }

    public boolean validaIdadeImputado() {
        if (this.idadeImputado > 999 || this.idadeImputado <= 0) {
            return false;
        }
        return true;
    }

    public boolean validaEnderecoImputado() {
        if (this.enderecoImputado.length() > 60 || this.enderecoImputado == null || this.enderecoImputado.trim().isEmpty()) {
            return false;
        }
        return true;
    }

    public boolean validaProfissaoImputado() {
        if (this.profissaoImputado.length() > 25 || this.profissaoImputado == null || this.profissaoImputado.trim().isEmpty()) {
            return false;
        }
        return true;
    }

    public boolean validaNomeVitima() {
        if (this.nomeVitima.length() > 45) {
            return false;
        }
        return true;
    }

    public boolean validaEstadoCivilVitima() {
        if (this.estadoCivilVitima.length() > 20) {
            return false;
        }
        return true;
    }

    public boolean validaIdadeVitima() {
        if (this.idadeVitima > 999 || this.idadeVitima <= 0) {
            return false;
        }
        return true;
    }

    public boolean validaEnderecoVitima() {
        if (this.enderecoVitima.length() > 60) {
            return false;
        }
        return true;
    }

    public boolean validaProfissaoVitima() {
        if (this.profissaoVitima.length() > 25) {
            return false;
        }
        return true;
    }
}
