package zooAnimales;

import java.util.ArrayList;

import gestion.Zona;

public class Reptil extends Animal {
    private static ArrayList<Reptil> listado = new ArrayList<Reptil>();
    private static int cantidadR = 0;
    public int iguanas;
    public int serpientes;
    private String colorEscamas;
    private int largoCola;

    public Reptil(){
        Reptil.listado.add(this);
        Reptil.cantidadR += 1;
    }

    public Reptil(String colorEscamas, int largoCola){
        this.colorEscamas = colorEscamas;
        this.largoCola = largoCola;
        Reptil.cantidadR += 1;
        Reptil.listado.add(this);
    }

    public Reptil(String nombre, int edad, String habitat, String genero, Zona zona,String colorEscamas, int largoCola){
        super(nombre, edad, habitat, genero, zona);
        this.colorEscamas = colorEscamas;
        this.largoCola = largoCola;
        Reptil.cantidadR += 1; 
        Reptil.listado.add(this);
    }

    public String getColorEscamas(){
        return this.colorEscamas;
    }

    public void setColorEscamas(String color){
        this.colorEscamas = color;
    }

    public int getLargoCola(){
        return this.largoCola;
    }

    public void setLargoCola(int largo){
        this.largoCola = largo;
    }

    public static int cantidadReptiles(){
        return Reptil.cantidadR;
    }

    public String movimiento(){
        return "reptar";
    }

    public Reptil crearIguana(String nombre, int edad, String genero, Zona zona){
        this.iguanas += 1;
        Reptil iguana = new Reptil(nombre, edad, "humedal", genero, zona, "verde", 3);
        return iguana;
    }

    public Reptil crearSerpiente(String nombre, int edad, String genero, Zona zona){
        this.serpientes += 1;
        Reptil serpiente = new Reptil(nombre, edad, "jungla", genero, zona, "blanco", 1);
        return serpiente;
    }

}
