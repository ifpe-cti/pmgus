/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.viniciussoaresti.pmgus.graficos;

import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import org.primefaces.event.ItemSelectEvent;
import org.primefaces.model.chart.Axis;
import org.primefaces.model.chart.AxisType;
import org.primefaces.model.chart.BarChartModel;
import org.primefaces.model.chart.ChartSeries;

/**
 *
 * @author veneceo
 */
public class ChartView implements Serializable{
    private BarChartModel barModel;
    @PostConstruct
    public void init() {
         createBarModels();
    
    }
    public void itemSelect(ItemSelectEvent event) {
        FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Item selected",
                "Item Index: " + event.getItemIndex() + ", Series Index:" + event.getSeriesIndex());
 
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
 public BarChartModel getBarModel() {
        return barModel;
    }
 
 private BarChartModel initBarModel() {
        BarChartModel model = new BarChartModel();
 
        ChartSeries boys = new ChartSeries();
        boys.setLabel("Boys");
        boys.set("2004", 120);
        boys.set("2005", 100);
        boys.set("2006", 44);
        boys.set("2007", 150);
        boys.set("2008", 25);
 
        ChartSeries girls = new ChartSeries();
        girls.setLabel("Girls");
        girls.set("2004", 52);
        girls.set("2005", 60);
        girls.set("2006", 110);
        girls.set("2007", 135);
        girls.set("2008", 120);
 
        model.addSeries(boys);
        model.addSeries(girls);
 
        return model;
    }
 
    private void createBarModels() {
        createBarModel();
      
    }
 
    private void createBarModel() {
        barModel = initBarModel();
 
        barModel.setTitle("Bar Chart");
        barModel.setLegendPosition("ne");
 
        Axis xAxis = barModel.getAxis(AxisType.X);
        xAxis.setLabel("Gender");
 
        Axis yAxis = barModel.getAxis(AxisType.Y);
        yAxis.setLabel("Births");
        yAxis.setMin(0);
        yAxis.setMax(200);
    }
  
    
}
