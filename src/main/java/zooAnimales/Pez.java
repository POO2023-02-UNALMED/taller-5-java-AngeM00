package zooAnimales;

import java.util.ArrayList;

public class Pez extends Animal {
    private static ArrayList<Pez> listado = new ArrayList<Pez>();
    private static int cantidadP = 0;
    public static int salmones;
    public static int bacalaos;
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

    public Pez(String nombre, int edad, String habitat, String genero,String colorEscamas, int cantidadAletas){
        super(nombre, edad, habitat, genero);
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

    public static Pez crearSalmon(String nombre, int edad, String genero){
        salmones += 1;
        Pez salmon = new Pez(nombre, edad, "oceano", genero, "rojo", 6);
        return salmon;
    }

    public static Pez crearBacalao(String nombre, int edad, String genero){
        bacalaos += 1;
        Pez bacalao = new Pez(nombre, edad, "oceano", genero, "gris", 6);
        return bacalao;
    }
}
