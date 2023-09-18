package gestion;
import java.util.ArrayList;

import zooAnimales.Animal;

public class Zona {
    private String nombre;
    private Zoologico[] zoo = new Zoologico[1];
    private ArrayList<Animal> animales = new ArrayList<Animal>();


    public Zona(){}

    public Zona(String nombre, Zoologico zoo){
        this.nombre = nombre;
        this.zoo[0] = zoo;
    }

    //Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Zoologico getZoo() {
        return zoo[0];
    }

    public void setZoo(Zoologico[] zoo) {
        this.zoo = zoo;
    }

    public ArrayList<Animal> getAnimales() {
        return animales;
    }

    //Otros

    public void agregarAnimales(Animal animal){
        animales.add(animal);
    }

    public Zoologico getZoologico(){
        return zoo[0];
    }

    public int cantidadAnimales(){
        int cantidad = 0;
        for (Animal animal : animales) {
            if(animal != null){
                cantidad += 1;
            }
        }
        return cantidad;
    }
}
