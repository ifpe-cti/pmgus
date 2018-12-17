/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.viniciussoaresti.pmgus.controladores;

import java.util.Date;
import java.util.List;
import com.github.viniciussoaresti.pmgus.negocio.*;
import java.io.IOException;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

/**
 *
 * @author vinic
 */
@ManagedBean
public class RelatorioController implements Serializable {

    //filtros de arma, droga, turno, bairro -> ocorrencias, mapa e gráficos
    private static Relatorio relatorio;
    private Arma selectedArma;
    private TipoDroga selectedDroga;
    private Date selectedDate;

    //@PostConstruct
    public void init() {
        relatorio = new Relatorio();
    }

    public Arma getSelectedArma() {
        return selectedArma;
    }

    public TipoDroga getSelectedDroga() {
        return selectedDroga;
    }

    public Date getSelectedDate() {
        return selectedDate;
    }

    public Relatorio getRelatorio() {
        return relatorio;
    }

    public void setSelectedArma(Arma selectedArma) {
        this.selectedArma = selectedArma;
    }

    public void setSelectedDroga(TipoDroga selectedDroga) {
        this.selectedDroga = selectedDroga;
    }

    public void setSelectedDate(Date selectedDate) {
        this.selectedDate = selectedDate;
    }

    public void relatorioArma(List<Ocorrencia> ocorrencias) throws IOException {
        relatorio = new Relatorio();
        relatorio.relatorioArma(selectedArma, ocorrencias);
        FacesContext.getCurrentInstance().getExternalContext().redirect("relatorio.xhtml");
    }

    public void relatorioDroga(List<Ocorrencia> ocorrencias) throws IOException {
        relatorio = new Relatorio();
        relatorio.relatorioDroga(selectedDroga, ocorrencias);
        FacesContext.getCurrentInstance().getExternalContext().redirect("relatorio.xhtml");
    }
}
