/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.viniciussoaresti.pmgus.graficos;
/**
 * criando em 23/05/2010
 * @author wagner
 */
public class ConcorrenciaEleitoral {
 private String candidato;
 private int totalVotos;
 
 public ConcorrenciaEleitoral() {
 }
 
 public ConcorrenciaEleitoral(String candidato, int totalVotos) {
 this.candidato = candidato;
 this.totalVotos = totalVotos;
 }
 
 public String getCandidato() {
 return candidato;
 }
 
 public void setCandidato(String candidato) {
 this.candidato = candidato;
 }
 
 public int getTotalVotos() {
 return totalVotos;
 }
 
 public void setTotalVotos(int totalVotos) {
 this.totalVotos = totalVotos;
 }
}