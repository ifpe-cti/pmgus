/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.viniciussoaresti.pmgus.controladores;

import com.github.viniciussoaresti.pmgus.infraestrutura.dao.PersistenceDao;
import java.util.Date;
import java.util.List;
import com.github.viniciussoaresti.pmgus.negocio.*;
import java.io.Serializable;
import java.util.ArrayList;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author vinic
 */
@ManagedBean
public class RelatorioController implements Serializable {

    //filtros de arma, droga, turno, bairro
    List<Arma> armas;
    List<TipoDroga> enderecos;
    List<Ocorrencia> ocorrencia;
    private Arma selectedArma;
    private TipoDroga selectedTipoDroga;
    private Ocorrencia selectedOcorrencia;

    /*public void armasTest() {
        helper.execute(Arma.class, streams -> {
            armas = streams.
                    where(b -> b.getCodigo()==selectedArma.getCodigo())
                    .toList();
        });
    }*/
    public void armasTest() {
        Arma a = new Arma(1, "1", "1", "1", "1");
        armas = new ArrayList<>();
        armas.add(a);
       try{
           armas = (List<Arma>)PersistenceDao.getInstance().read("select a from Arma a where a.codigo="+selectedArma.getCodigo());
       }catch(IndexOutOfBoundsException index){
       }
    }

    public List<Arma> getArmas() {
        return armas;
    }

    public void setArmas(List<Arma> armas) {
        this.armas = armas;
    }

    public List<TipoDroga> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(List<TipoDroga> enderecos) {
        this.enderecos = enderecos;
    }

    public List<Ocorrencia> getOcorrencia() {
        return ocorrencia;
    }

    public void setOcorrencia(List<Ocorrencia> ocorrencia) {
        this.ocorrencia = ocorrencia;
    }

    public Arma getSelectedArma() {
        return selectedArma;
    }

    public void setSelectedArma(Arma selectedArma) {
        this.selectedArma = selectedArma;
    }

    public TipoDroga getSelectedTipoDroga() {
        return selectedTipoDroga;
    }

    public void setSelectedTipoDroga(TipoDroga selectedTipoDroga) {
        this.selectedTipoDroga = selectedTipoDroga;
    }

    public Ocorrencia getSelectedOcorrencia() {
        return selectedOcorrencia;
    }

    public void setSelectedOcorrencia(Ocorrencia selectedOcorrencia) {
        this.selectedOcorrencia = selectedOcorrencia;
    }
}
