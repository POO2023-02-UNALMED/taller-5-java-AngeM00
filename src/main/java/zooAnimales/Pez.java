package zooAnimales;

import java.util.ArrayList;

import gestion.Zona;

public class Pez extends Animal {
    private static ArrayList<Pez> listado = new ArrayList<Pez>();
    private static int cantidadP = 0;
    public int salmones;
    public int bacalaos;
    private String colorEscamas;
    private int cantidadAletas;

    public Pez(){   
        Pez.cantidadP += 1;
        Pez.listado.add(this);
    }

    public Pez(String colorEscamas, int cantidadAletas){
        this.colorEscamas = colorEscamas;
        this.cantidadAletas = cantidadAletas;
        Pez.cantidadP += 1;
        Pez.listado.add(this);
    }

    public Pez(String nombre, int edad, String habitat, String genero, Zona zona, String colorEscamas, int cantidadAletas){
        super(nombre, edad, habitat, genero, zona);
        this.colorEscamas = colorEscamas;
        this.cantidadAletas = cantidadAletas;
        Pez.cantidadP += 1;
        Pez.listado.add(this);
    }
    //Getters y setters
    public String getColorEscamas(){
        return this.colorEscamas;
    }

    public void setColorEscamas(String color){
        this.colorEscamas = color;
    }

    public int getCantidadAletas(){
        return this.cantidadAletas;
    }

    public void setCantidadAletas(int cantidad){
        this.cantidadAletas = cantidad;
    }

    //Otros

    public static int cantidadPeces(){
        return Pez.cantidadP;
    }

    public String movimiento(){
        return "nadar";
    }

    public Pez crearSalmon(String nombre, int edad, String habitat, String genero, Zona zona){
        this.salmones += 1;
        Pez salmon = new Pez(nombre, edad, "oceano", genero, zona, "rojo", 6);
        return salmon;
    }

    public Pez crearBacalao(String nombre, int edad, String habitat, String genero, Zona zona){
        this.bacalaos += 1;
        Pez bacalao = new Pez(nombre, edad, "oceano", genero, zona, "gris", 6);
        return bacalao;
    }
}
