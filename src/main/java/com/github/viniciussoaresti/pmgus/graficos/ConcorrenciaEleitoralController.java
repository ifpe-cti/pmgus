/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.viniciussoaresti.pmgus.graficos;

/**
 *
 * @author veneceo
 */
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import com.github.viniciussoaresti.pmgus.graficos.ConcorrenciaEleitoral;
 
/**
 * criando em 23/05/2010
 * @author wagner
 */
@ManagedBean(name="concorrenciaEleitoral")
public class ConcorrenciaEleitoralController {
 private List<ConcorrenciaEleitoral> concorrencia = new ArrayList();
 
 public ConcorrenciaEleitoralController() {
 carregaDadosVotacao();
 }
 
 public List<ConcorrenciaEleitoral> getConcorrencia() {
 return concorrencia;
 }
 
 public void setConcorrencia(List<ConcorrenciaEleitoral> concorrencia) {
 this.concorrencia = concorrencia;
 }
 
 public void carregaDadosVotacao() {
 concorrencia.add(new ConcorrenciaEleitoral("José Serra", 650));
 concorrencia.add(new ConcorrenciaEleitoral("Dilma Rousseff", 450));
 concorrencia.add(new ConcorrenciaEleitoral("Marina Silva", 200));
 concorrencia.add(new ConcorrenciaEleitoral("Outros", 150));
 }
}

