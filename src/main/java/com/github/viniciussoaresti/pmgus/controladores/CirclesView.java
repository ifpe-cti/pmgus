package com.github.viniciussoaresti.pmgus.controladores;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import org.primefaces.event.map.OverlaySelectEvent;
import org.primefaces.model.map.DefaultMapModel;
import org.primefaces.model.map.LatLng;
import org.primefaces.model.map.MapModel;
import org.primefaces.model.map.Circle;
@ManagedBean
public class CirclesView implements Serializable {
  
    private MapModel circleModel;
      
    @PostConstruct
    public void init() {
         
        circleModel = new DefaultMapModel();
  
        //Shared coordinates
        LatLng severiano = new LatLng(-8.877546, -36.467807);
        LatLng heliopolis = new LatLng(-8.884082,-36.481302);
        LatLng magano = new LatLng(-8.885331,-36.501434);
        LatLng aluisio = new LatLng(-8.901304,-36.498361);
        LatLng saojose = new LatLng(-8.883687,-36.494725);
        LatLng francisco = new LatLng(-8.907574,-36.4826);
        LatLng boavista = new LatLng(-8.899357,-36.492438);
        LatLng santoantonio = new LatLng(-8.891217,-36.495693);
        LatLng domhelder = new LatLng(-8.864822,-36.503866);
        LatLng josemaria = new LatLng(-8.876184,-36.476164);
        LatLng novoheliopolis = new LatLng(-8.87216,-36.462442);
        LatLng domthiago = new LatLng(-8.878143,-36.485508);
        LatLng brasilia = new LatLng(-8.882855,-36.496897);
 
        //Circle
        Circle circle1 = new Circle(severiano, 500);
        circle1.setStrokeColor("#d93c3c");
        circle1.setFillColor("#d93c3c");
        circle1.setFillOpacity(0.5);
 
        Circle circle2 = new Circle(heliopolis, 300);
        circle2.setStrokeColor("#00ff00");
        circle2.setFillColor("#00ff00");
        circle2.setStrokeOpacity(0.7);
        circle2.setFillOpacity(0.7);
        
        Circle circle3 = new Circle(magano, 100);
        circle2.setStrokeColor("#00ff00");
        circle2.setFillColor("#00ff00");
        circle2.setStrokeOpacity(0.7);
        circle2.setFillOpacity(0.7);
        
        Circle circle4 = new Circle(aluisio, 600);
        circle2.setStrokeColor("#00ff00");
        circle2.setFillColor("#00ff00");
        circle2.setStrokeOpacity(0.7);
        circle2.setFillOpacity(0.7);
        
        Circle circle5 = new Circle(saojose, 700);
        circle2.setStrokeColor("#00ff00");
        circle2.setFillColor("#00ff00");
        circle2.setStrokeOpacity(0.7);
        circle2.setFillOpacity(0.7);
        
        Circle circle6 = new Circle(francisco, 200);
        circle2.setStrokeColor("#00ff00");
        circle2.setFillColor("#00ff00");
        circle2.setStrokeOpacity(0.7);
        circle2.setFillOpacity(0.7);
        
        Circle circle7 = new Circle(boavista, 100);
        circle2.setStrokeColor("#00ff00");
        circle2.setFillColor("#00ff00");
        circle2.setStrokeOpacity(0.7);
        circle2.setFillOpacity(0.7);
        
        Circle circle8 = new Circle(santoantonio, 500);
        circle2.setStrokeColor("#00ff00");
        circle2.setFillColor("#00ff00");
        circle2.setStrokeOpacity(0.7);
        circle2.setFillOpacity(0.7);
        
        Circle circle9 = new Circle(domhelder, 400);
        circle2.setStrokeColor("#00ff00");
        circle2.setFillColor("#00ff00");
        circle2.setStrokeOpacity(0.7);
        circle2.setFillOpacity(0.7);
        
        Circle circle10 = new Circle(josemaria, 300);
        circle2.setStrokeColor("#00ff00");
        circle2.setFillColor("#00ff00");
        circle2.setStrokeOpacity(0.7);
        circle2.setFillOpacity(0.7);
        
        Circle circle11 = new Circle(novoheliopolis, 200);
        circle2.setStrokeColor("#00ff00");
        circle2.setFillColor("#00ff00");
        circle2.setStrokeOpacity(0.7);
        circle2.setFillOpacity(0.7);
        
        Circle circle12 = new Circle(domthiago, 50);
        circle2.setStrokeColor("#00ff00");
        circle2.setFillColor("#00ff00");
        circle2.setStrokeOpacity(0.7);
        circle2.setFillOpacity(0.7);
        
        Circle circle13 = new Circle(brasilia, 200);
        circle2.setStrokeColor("#00ff00");
        circle2.setFillColor("#00ff00");
        circle2.setStrokeOpacity(0.7);
        circle2.setFillOpacity(0.7);
 
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
  
    public MapModel getCircleModel() {
        return circleModel;
    }
  
    public void onCircleSelect(OverlaySelectEvent event) {
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Circle Selected", null));
    }
}