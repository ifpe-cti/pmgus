/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.viniciussoaresti.pmgus.negocio;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
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
    private BarChartModel grafico = new BarChartModel();
    private MapModel circleModel = new DefaultMapModel();

    public List<Ocorrencia> getOcorrencias() {
        return ocorrencias;
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

    private void gerarGrafico() { //tipo e etc
        BarChartModel model = new BarChartModel();
        ChartSeries bairros = new ChartSeries();
        bairros.setLabel("Armas");
        bairros.set("severiano", ocorrencias
                .stream()
                .filter(o -> o.getEndereco().getBairro().contains("severiano"))
                .count()
        );
        bairros.set("heliopolis", ocorrencias
                .stream()
                .filter(o -> o.getEndereco().getBairro().contains("heliopolis"))
                .count());
        bairros.set("magano", ocorrencias
                .stream()
                .filter(o -> o.getEndereco().getBairro().contains("magano"))
                .count());
        bairros.set("aluisio", ocorrencias
                .stream()
                .filter(o -> o.getEndereco().getBairro().contains("aluisio"))
                .count());
        bairros.set("sao jose", ocorrencias
                .stream()
                .filter(o -> o.getEndereco().getBairro().contains("sao jose"))
                .count());
        bairros.set("francisco", ocorrencias
                .stream()
                .filter(o -> o.getEndereco().getBairro().contains("francisco"))
                .count());
        bairros.set("boa vista", ocorrencias
                .stream()
                .filter(o -> o.getEndereco().getBairro().contains("boa vista"))
                .count());
        bairros.set("santo antonio", ocorrencias
                .stream()
                .filter(o -> o.getEndereco().getBairro().contains("santo antonio"))
                .count());
        bairros.set("dom helder", ocorrencias
                .stream()
                .filter(o -> o.getEndereco().getBairro().contains("dom helder"))
                .count());
        bairros.set("jose maria", ocorrencias
                .stream()
                .filter(o -> o.getEndereco().getBairro().contains("jose maria"))
                .count());
        bairros.set("novo heliopolis", ocorrencias
                .stream()
                .filter(o -> o.getEndereco().getBairro().contains("novo heliopolis"))
                .count());
        bairros.set("dom thiago", ocorrencias
                .stream()
                .filter(o -> o.getEndereco().getBairro().contains("dom thiago"))
                .count());
        bairros.set("brasilia", ocorrencias
                .stream()
                .filter(o -> o.getEndereco().getBairro().contains("brasilia"))
                .count());
        model.addSeries(bairros);
        grafico = model;
    }

    public void overlay() {
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

        Circle severianoCirculo = new Circle(severiano, ocorrencias
                .stream()
                .filter(o -> o.getEndereco().getBairro().contains("severiano"))
                .count()*70);
        severianoCirculo.setStrokeColor("#d93c3c"); //vermelho
        severianoCirculo.setFillColor("#d93c3c");
        severianoCirculo.setFillOpacity(0.5);

        Circle heliopolisCirculo = new Circle(heliopolis, ocorrencias
                .stream()
                .filter(o -> o.getEndereco().getBairro().contains("heliopolis"))
                .count()*70);
        heliopolisCirculo.setStrokeColor("#d93c3c");
        heliopolisCirculo.setFillColor("#d93c3c");
        heliopolisCirculo.setFillOpacity(0.7);

        Circle maganoCirculo = new Circle(magano, ocorrencias
                .stream()
                .filter(o -> o.getEndereco().getBairro().contains("magano"))
                .count()*70);
        maganoCirculo.setStrokeColor("#d93c3c");
        maganoCirculo.setFillColor("#d93c3c");
        maganoCirculo.setStrokeOpacity(0.7);
        maganoCirculo.setFillOpacity(0.7);

        Circle aluisioCirculo = new Circle(aluisio, ocorrencias
                .stream()
                .filter(o -> o.getEndereco().getBairro().contains("aluisio"))
                .count()*70);
        aluisioCirculo.setStrokeColor("#d93c3c");
        aluisioCirculo.setFillColor("#d93c3c");
        aluisioCirculo.setFillOpacity(0.7);

        Circle saoJoseCirculo = new Circle(saojose, ocorrencias
                .stream()
                .filter(o -> o.getEndereco().getBairro().contains("sao jose"))
                .count()*70);
        saoJoseCirculo.setStrokeColor("#d93c3c");
        saoJoseCirculo.setFillColor("#d93c3c");
        saoJoseCirculo.setStrokeOpacity(0.7);
        saoJoseCirculo.setFillOpacity(0.7);

        Circle franciscoCirculo = new Circle(francisco, ocorrencias
                .stream()
                .filter(o -> o.getEndereco().getBairro().contains("francisco"))
                .count()*70);
        franciscoCirculo.setStrokeColor("#d93c3c");
        franciscoCirculo.setFillColor("#d93c3c");
        franciscoCirculo.setFillOpacity(0.7);

        Circle boavistaCirculo = new Circle(boavista, ocorrencias
                .stream()
                .filter(o -> o.getEndereco().getBairro().contains("boa vista"))
                .count()*70);
        boavistaCirculo.setStrokeColor("#d93c3c");
        boavistaCirculo.setFillColor("#d93c3c");
        boavistaCirculo.setFillOpacity(0.7);

        Circle santoAntonioCirculo = new Circle(santoantonio, ocorrencias
                .stream()
                .filter(o -> o.getEndereco().getBairro().contains("santo antonio"))
                .count()*70);
        santoAntonioCirculo.setStrokeColor("#d93c3c");
        santoAntonioCirculo.setFillColor("#d93c3c");
        santoAntonioCirculo.setStrokeOpacity(0.7);
        santoAntonioCirculo.setFillOpacity(0.7);

        Circle domHelderCirculo = new Circle(domhelder, ocorrencias
                .stream()
                .filter(o -> o.getEndereco().getBairro().contains("dom helder"))
                .count()*70);
        domHelderCirculo.setStrokeColor("#d93c3c");
        domHelderCirculo.setFillColor("#d93c3c");
        domHelderCirculo.setFillOpacity(0.7);

        Circle joseMariaCirculo = new Circle(josemaria, ocorrencias
                .stream()
                .filter(o -> o.getEndereco().getBairro().contains("jose maria"))
                .count()*70);
        joseMariaCirculo.setStrokeColor("#d93c3c");
        joseMariaCirculo.setFillColor("#d93c3c");
        joseMariaCirculo.setFillOpacity(0.7);

        Circle novoHeliopolisCirculo = new Circle(novoheliopolis, ocorrencias
                .stream()
                .filter(o -> o.getEndereco().getBairro().contains("novo heliopolos"))
                .count()*70);
        novoHeliopolisCirculo.setStrokeColor("#d93c3c");
        novoHeliopolisCirculo.setFillColor("#d93c3c");
        novoHeliopolisCirculo.setStrokeOpacity(0.7);
        novoHeliopolisCirculo.setFillOpacity(0.7);

        Circle domThiagoCirculo = new Circle(domthiago, ocorrencias
                .stream()
                .filter(o -> o.getEndereco().getBairro().contains("dom thiago"))
                .count()*70);
        domThiagoCirculo.setStrokeColor("#d93c3c");
        domThiagoCirculo.setFillColor("#d93c3c");
        domThiagoCirculo.setFillOpacity(0.7);

        Circle brasiliaCirculo = new Circle(brasilia, ocorrencias
                .stream()
                .filter(o -> o.getEndereco().getBairro().contains("brasilia"))
                .count()*70);
        brasiliaCirculo.setStrokeColor("#d93c3c");
        brasiliaCirculo.setFillColor("#d93c3c");
        brasiliaCirculo.setStrokeOpacity(0.7);
        brasiliaCirculo.setFillOpacity(0.7);

        circleModel.addOverlay(severianoCirculo);
        circleModel.addOverlay(heliopolisCirculo);
        circleModel.addOverlay(maganoCirculo);
        circleModel.addOverlay(aluisioCirculo);
        circleModel.addOverlay(saoJoseCirculo);
        circleModel.addOverlay(franciscoCirculo);
        circleModel.addOverlay(boavistaCirculo);
        circleModel.addOverlay(santoAntonioCirculo);
        circleModel.addOverlay(domHelderCirculo);
        circleModel.addOverlay(joseMariaCirculo);
        circleModel.addOverlay(novoHeliopolisCirculo);
        circleModel.addOverlay(domThiagoCirculo);
        circleModel.addOverlay(brasiliaCirculo);
    }

    public void onCircleSelect(OverlaySelectEvent event) {
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Circle Selected", null));
    }

    public void relatorioArma(Arma a, List<Ocorrencia> ocorrencias) {
        this.ocorrencias = ocorrencias
                .stream()
                .filter(o -> o.getArma().equals(a))
                .collect(Collectors.toList());
        overlay();
        gerarGrafico();
    }

    public void relatorioDroga(TipoDroga d, List<Ocorrencia> ocorrencias) {
        this.ocorrencias = ocorrencias
                .stream()
                .filter(o -> o.getDroga().equals(d))
                .collect(Collectors.toList());
        overlay();
        gerarGrafico();
    }
}
