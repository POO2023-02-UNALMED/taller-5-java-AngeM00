package zooAnimales;

import gestion.Zona;

public class Animal {
    private static int totalAnimales = 0;
    protected String nombre;
    protected int edad;
    protected String habitat;
    protected String genero;
    protected Zona[] zona = new Zona[1];

    public Animal(){
        Animal.totalAnimales += 1;
    }

    public Animal(String nombre, int edad, String habitat, String genero){
        this.nombre = nombre;
        this.edad = edad;
        this.habitat = habitat;
        this.genero = genero;
        Animal.totalAnimales += 1;
    }

    //Getters and setter

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Zona[] getZona() {
        return zona;
    }

    public void setZona(Zona[] zona) {
        this.zona = zona;
    }

    public static int getTotalAnimales(){
        return Animal.totalAnimales;
    }

    //Otros

    public String movimiento(){
        return "desplazarse";
    }

    public static String totalPorTipo(){
        int cantidadMamiferos = Mamifero.cantidadMamiferos();
        int cantidadAves = Ave.cantidadAves();
        int cantidadReptiles = Reptil.cantidadReptiles();
        int cantidadPeces = Pez.cantidadPeces();
        int cantidadAnfibios = Anfibio.cantidadAnfibios();

        return "Mamiferos: "+cantidadMamiferos+"\nAves: "+cantidadAves+"\nReptiles: "+cantidadReptiles+
        "\nPeces: "+cantidadPeces+"\nAnfibios: "+cantidadAnfibios;
    }

    public String toString(){
        String zonZoo = "";
        if(zona[0] != null && zona[0].getZoologico() != null){
            zonZoo = ", la zona en la que me ubico es "+this.zona[0]+", en el "+ this.zona[0].getZoologico();
        }
        return "Mi nombre es " + this.nombre + ", tengo una edad de "+this.edad+
        ", habito en " + this.habitat + " y mi genero es " + this.genero + zonZoo;
    }
}
