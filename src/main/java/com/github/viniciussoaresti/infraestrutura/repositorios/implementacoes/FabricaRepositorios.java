/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.viniciussoaresti.infraestrutura.repositorios.implementacoes;

import com.github.viniciussoaresti.infraestrutura.repositorios.comportamentos.RepositorioGenerico;

/**
 *
 * @author Vinícius Soares
 */
public class FabricaRepositorios {
    public static final int ARMA = 1;
    public static final int DROGA = 2;
    public static final int OCORRENCIA = 3;
    
     public static final int MEMORIA= 1;
      public static final int BANCODADOS= 2;
       public static final int ARQUIVO= 3;
       
    public static RepositorioGenerico manufactor (int tipoNegocio, int tipoPersistencia){
        if(tipoPersistencia == MEMORIA){
            if(tipoNegocio == ARMA){
                return new RepositorioArma();
            }
            if(tipoNegocio == DROGA){
//                return new RepositorioDrogas();
            }
            if(tipoNegocio == OCORRENCIA){
  //              return new RepositorioOcorrencia();
            }
        }
        
        if(tipoPersistencia == BANCODADOS){
            if(tipoNegocio == ARMA){
                return null;
            }
            if(tipoNegocio == DROGA){
                return null;
            }
            if(tipoNegocio == OCORRENCIA){
                return null;
            }    
        }
       
          if(tipoPersistencia == ARQUIVO){
            if(tipoNegocio == ARMA){
                return null;
            }
            if(tipoNegocio == DROGA){
                return null;
            }
            if(tipoNegocio == OCORRENCIA){
                return null;
            }             
    }
          return null;
    
}
}
