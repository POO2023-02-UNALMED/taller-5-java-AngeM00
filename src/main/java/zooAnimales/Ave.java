package zooAnimales;

import java.util.ArrayList;

import gestion.Zona;

public class Ave extends Animal {
    private static ArrayList<Ave> listado = new ArrayList<Ave>();
    private static int cantidadA = 0;
    public int halcones;
    public int aguilas;
    private String colorPlumas;

    //Constructores

    public Ave(){
        cantidadA += 1;
        Ave.listado.add(this);
    }

    public Ave(String colorPlumas){
        this.colorPlumas = colorPlumas;
        Ave.cantidadA += 1;
        Ave.listado.add(this);
    }

    public Ave(String nombre, int edad, String habitat, String genero, Zona zona, String colorPlumas){
        super(nombre, edad, habitat, genero, zona);
        this.colorPlumas = colorPlumas;
        Ave.cantidadA += 1;
        Ave.listado.add(this);
    }

    //Gets y setters
    public String getColorPlumas(){
        return this.colorPlumas;
    }

    public void setColorPlumas(String color){
        this.colorPlumas = color;
    }

    //Otros

    public static int cantidadAves(){
        return Ave.cantidadA;
    }

    public String movimiento(){
        return "volar";
    }

    public Ave crearHalcon(String nombre, int edad, String genero, Zona zona){
        this.halcones += 1;
        Ave halcon = new Ave(nombre, edad, "montanas", genero, zona, "cafe glorioso");
        return halcon;
    }

    public Ave crearAguila(String nombre, int edad, String genero, Zona zona){
        this.aguilas += 1;
        Ave aguila = new Ave(nombre, edad, "montanas", genero, zona, "blanco y amarillo");
        return aguila;
    }
}
