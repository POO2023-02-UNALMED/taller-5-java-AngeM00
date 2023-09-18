package zooAnimales;

import java.util.ArrayList;

public class Ave extends Animal {
    private static ArrayList<Ave> listado = new ArrayList<Ave>();
    private static int cantidadA = 0;
    public static int halcones;
    public static int aguilas;
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

    public Ave(String nombre, int edad, String habitat, String genero, String colorPlumas){
        super(nombre, edad, habitat, genero);
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

    public static Ave crearHalcon(String nombre, int edad, String genero){
        halcones += 1;
        Ave halcon = new Ave(nombre, edad, "montanas", genero, "cafe glorioso");
        return halcon;
    }

    public static Ave crearAguila(String nombre, int edad, String genero){
        aguilas += 1;
        Ave aguila = new Ave(nombre, edad, "montanas", genero, "blanco y amarillo");
        return aguila;
    }
}
