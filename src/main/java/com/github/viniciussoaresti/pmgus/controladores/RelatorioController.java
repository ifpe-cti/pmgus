/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.viniciussoaresti.pmgus.controladores;

import java.util.Date;
import java.util.List;
import com.github.viniciussoaresti.pmgus.negocio.*;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author vinic
 */
@ManagedBean
public class RelatorioController implements Serializable {

    //filtros de arma, droga, turno, bairro -> ocorrencias, mapa e gráficos
    private List<Ocorrencia> ocorrencias;
    private Arma selectedArma;
    private TipoDroga selectedDroga;
    private Date selectedDate;
    
}
