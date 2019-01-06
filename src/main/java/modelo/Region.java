package modelo;

import java.util.ArrayList;


public class Region  {

    public Linea linea;
    private ArrayList<Linea> lineas = new ArrayList<Linea>();

    public Region() {
    }


   

    @Override
    public String toString() {
        return "Region{" + "linea=" + linea + ", lineas=" + lineas + '}';
    }

    
   
}
