
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
package com.github.viniciussoaresti.pmgus.graficos;

import com.github.viniciussoaresti.pmgus.controladores.OcorrenciaController;
import com.github.viniciussoaresti.pmgus.infraestrutura.dao.PersistenceDao;
import com.github.viniciussoaresti.pmgus.infraestrutura.repositorios.implementacoes.RepositorioOcorrenciaImplBD;
import com.github.viniciussoaresti.pmgus.negocio.Ocorrencia;
import java.io.Serializable;
import com.github.viniciussoaresti.pmgus.infraestrutura.repositorios.implementacoes.RepositorioOcorrenciaImplBD;
import java.util.List;
import org.primefaces.model.chart.CartesianChartModel;
import org.primefaces.model.chart.ChartSeries;

/**
 *
 * @author veneceo
 */
/*
public class RelatoriosBean implements Serializable {
   
    private CartesianChartModel model;
    
    public void relatorioOcorrencia(){
        modeloBarras();
        
    }
    public void modeloBarras(){
        model =new CartesianChartModel();
        PersistenceDao Dao = new PersistenceDao();
        RepositorioOcorrenciaImplBD repositorioOcorrencia = new RepositorioOcorrenciaImplBD();
        OcorrenciaController ocorrenciaController = new OcorrenciaController();
        List<Object[]> listaOcorrencia = Dao.read("select a from Ocorrencia a");
        ChartSeries  municipioGrafico;
        
        for(Object[] ocorrencia: listaOcorrencia){
            municipioGrafico = new ChartSeries();
            String label = String.valueOf(ocorrencia[0]);
            String qtdInicial = String.valueOf(ocorrencia[1]);
            
            if (Integer.valueOf(qtdIncial) > 1) {
                        municipioGrafico.setLabel(label);
                        //Apenas do mês estar fixo podemos alterar para
                        //receber valor de um combo.
                        cidadeGrafico.set("Jul", Integer.valueOf(qtdeIncid));
                        //Adiciona a cidade com seu valor ao gráfico
                        model.addSeries(comarca);
                     
                 }
                  
                 cidadeGrafico = null;
           }
            
            
            
        }

    }
    
}
*/