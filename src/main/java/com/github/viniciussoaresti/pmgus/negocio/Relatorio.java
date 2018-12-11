/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.viniciussoaresti.pmgus.negocio;

import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import org.primefaces.event.ItemSelectEvent;
import org.primefaces.event.map.OverlaySelectEvent;
import org.primefaces.model.chart.BarChartModel;
import org.primefaces.model.chart.ChartSeries;
import org.primefaces.model.map.Circle;
import org.primefaces.model.map.DefaultMapModel;
import org.primefaces.model.map.LatLng;
import org.primefaces.model.map.MapModel;

/**
 *
 * @author vinicius
 */
public class Relatorio {

    //filtros de arma, droga, turno, bairro -> ocorrencias, mapa e gráficos
    private List<Ocorrencia> ocorrencias;
    private BarChartModel grafico;
    private MapModel circleModel;

    public List<Ocorrencia> getOcorrencias() {
        return ocorrencias;
    }

    @PostConstruct
    public void init() {
        createBarModel();
        createMapModel();
    }

    public void itemSelect(ItemSelectEvent event) {
        FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Item selected",
                "Item Index: " + event.getItemIndex() + ", Series Index:" + event.getSeriesIndex());

        FacesContext.getCurrentInstance().addMessage(null, msg);
    }

    public BarChartModel getBarModel() {
        return grafico;
    }

    public MapModel getCircleModel() {
        return circleModel;
    }

    private void createBarModel() {
        grafico = initBarModel();
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

    public void createMapModel() {
        circleModel = new DefaultMapModel();
        LatLng severiano = new LatLng(-8.877546, -36.467807);
        LatLng heliopolis = new LatLng(-8.884082, -36.481302);
        LatLng magano = new LatLng(-8.885331, -36.501434);
        LatLng aluisio = new LatLng(-8.901304, -36.498361);
        LatLng saojose = new LatLng(-8.883687, -36.494725);
        LatLng francisco = new LatLng(-8.907574, -36.4826);
        LatLng boavista = new LatLng(-8.899357, -36.492438);
        LatLng santoantonio = new LatLng(-8.891217, -36.495693);
        LatLng domhelder = new LatLng(-8.864822, -36.503866);
        LatLng josemaria = new LatLng(-8.876184, -36.476164);
        LatLng novoheliopolis = new LatLng(-8.87216, -36.462442);
        LatLng domthiago = new LatLng(-8.878143, -36.485508);
        LatLng brasilia = new LatLng(-8.882855, -36.496897);
        Circle circle1 = new Circle(severiano, 200);

        circle1.setStrokeColor("#d93c3c"); //vermelho
        circle1.setFillColor("#d93c3c");
        circle1.setFillOpacity(0.5);

        Circle circle2 = new Circle(heliopolis, 210);
        circle2.setStrokeColor("#d93c3c");
        circle2.setFillColor("#d93c3c");
        circle2.setFillOpacity(0.7);

        Circle circle3 = new Circle(magano, 220);
        circle3.setStrokeColor("#d93c3c");
        circle3.setFillColor("#d93c3c");
        circle3.setStrokeOpacity(0.7);
        circle3.setFillOpacity(0.7);

        Circle circle4 = new Circle(aluisio, 230);
        circle4.setStrokeColor("#d93c3c");
        circle4.setFillColor("#d93c3c");
        circle4.setFillOpacity(0.7);

        Circle circle5 = new Circle(saojose, 220);
        circle5.setStrokeColor("#d93c3c");
        circle5.setFillColor("#d93c3c");
        circle5.setStrokeOpacity(0.7);
        circle5.setFillOpacity(0.7);

        Circle circle6 = new Circle(francisco, 210);
        circle6.setStrokeColor("#d93c3c");
        circle6.setFillColor("#d93c3c");
        circle6.setFillOpacity(0.7);

        Circle circle7 = new Circle(boavista, 200);
        circle7.setStrokeColor("#d93c3c");
        circle7.setFillColor("#d93c3c");
        circle7.setFillOpacity(0.7);

        Circle circle8 = new Circle(santoantonio, 190);
        circle8.setStrokeColor("#d93c3c");
        circle8.setFillColor("#d93c3c");
        circle8.setStrokeOpacity(0.7);
        circle8.setFillOpacity(0.7);

        Circle circle9 = new Circle(domhelder, 180);
        circle9.setStrokeColor("#d93c3c");
        circle9.setFillColor("#d93c3c");
        circle9.setFillOpacity(0.7);

        Circle circle10 = new Circle(josemaria, 170);
        circle10.setStrokeColor("#d93c3c");
        circle10.setFillColor("#d93c3c");
        circle10.setFillOpacity(0.7);

        Circle circle11 = new Circle(novoheliopolis, 160);
        circle11.setStrokeColor("#d93c3c");
        circle11.setFillColor("#d93c3c");
        circle11.setStrokeOpacity(0.7);
        circle11.setFillOpacity(0.7);

        Circle circle12 = new Circle(domthiago, 90);
        circle12.setStrokeColor("#d93c3c");
        circle12.setFillColor("#d93c3c");
        circle12.setFillOpacity(0.7);

        Circle circle13 = new Circle(brasilia, 120);
        circle13.setStrokeColor("#d93c3c");
        circle13.setFillColor("#d93c3c");
        circle13.setStrokeOpacity(0.7);
        circle13.setFillOpacity(0.7);

        circleModel.addOverlay(circle1);
        circleModel.addOverlay(circle2);
        circleModel.addOverlay(circle3);
        circleModel.addOverlay(circle4);
        circleModel.addOverlay(circle5);
        circleModel.addOverlay(circle6);
        circleModel.addOverlay(circle7);
        circleModel.addOverlay(circle8);
        circleModel.addOverlay(circle9);
        circleModel.addOverlay(circle10);
        circleModel.addOverlay(circle11);
        circleModel.addOverlay(circle12);
        circleModel.addOverlay(circle13);
    }

    public void onCircleSelect(OverlaySelectEvent event) {
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Circle Selected", null));
    }
}
