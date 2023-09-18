package zooAnimales;

import java.util.ArrayList;

import gestion.Zona;

public class Anfibio extends Animal {  
    private static ArrayList<Anfibio> listado = new ArrayList<Anfibio>();
    private static int cantidadAnf = 0;
    public int ranas;
    public int salamandras;
    private String colorPiel;
    private boolean venenoso;

    public Anfibio(){
       Anfibio.listado.add(this);
       Anfibio.cantidadAnf += 1;
    }

    public Anfibio(String colorPiel, boolean venenoso){
        this.colorPiel = colorPiel;
        this.venenoso = venenoso;
        Anfibio.listado.add(this);
        Anfibio.cantidadAnf += 1;
    }

    public Anfibio(String nombre, int edad, String habitat, String genero, Zona zona, String colorPiel, boolean venenoso){
        super(nombre, edad, habitat, genero, zona);
        this.colorPiel = colorPiel;
        this.venenoso = venenoso;
        Anfibio.listado.add(this);
        Anfibio.cantidadAnf += 1;
    }

    //Get y set
    public static ArrayList<Anfibio> getListado(){
        return Anfibio.listado;
    }

    public String getColorPiel(){
        return this.colorPiel;
    }

    public void setColorPiel(String color){
        this.colorPiel = color;
    }

    public boolean getVenenoso(){
        return this.venenoso;
    }

    public void setVenenoso(boolean venenoso){
        this.venenoso = venenoso;
    }

    //Otros

    public static int cantidadAnfibios(){
        return Anfibio.cantidadAnf;
    }

    public String movimiento(){
        return "saltar";
    }

    public Anfibio crearRana(String nombre, int edad, String habitat, String genero, Zona zona){
        this.ranas += 1;
        Anfibio rana = new Anfibio(nombre, edad, "selva", genero, zona, "rojo", true);
        return rana;
    }

    public Anfibio crearSalamandra(String nombre, int edad, String habitat, String genero, Zona zona){
        this.salamandras += 1;
        Anfibio salamandra = new Anfibio(nombre, edad, "selva", genero, zona, "negro y amarillo", false);
        return salamandra;
    }
}
