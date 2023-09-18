package zooAnimales;

import java.util.ArrayList;

public class Mamifero extends Animal {
    private static ArrayList<Mamifero> listado = new ArrayList<Mamifero>();
    private static int cantidadM = 0;
    public static int caballos;
    public static int leones;
    private boolean pelaje;
    private int patas;
    
    //Constructores

    public Mamifero(){
        Mamifero.cantidadM += 1;
        Mamifero.listado.add(this);
    }

    public Mamifero(boolean pelaje, int patas){
        this.pelaje = pelaje;
        this.patas = patas;
        Mamifero.cantidadM += 1;
        Mamifero.listado.add(this);
    }

    public Mamifero(String nombre, int edad, String habitat, String genero, boolean pelaje, int patas){
        super(nombre, edad, habitat, genero);
        this.pelaje = pelaje;
        this.patas = patas;
        Mamifero.cantidadM += 1;
        Mamifero.listado.add(this);
    }

    //Gets y setters

    public static ArrayList<Mamifero> getListado(){
        return Mamifero.listado;
    }

    public boolean isPelaje(){
        return this.pelaje;
    }

    public void setPelaje(boolean pelaje){
        this.pelaje = pelaje;
    }

    public int getPatas(){
        return this.patas;
    }

    public void setPatas(int patas){
        this.patas = patas;
    }


    //Otros

    public static int cantidadMamiferos(){
        return Mamifero.cantidadM;
    }

    public static Mamifero crearCaballo(String nombre, int edad, String genero){
        caballos += 1;
        Mamifero caballo = new Mamifero(nombre,edad,"pradera",genero,true,4);
        return caballo;
    }

    public static Mamifero crearLeon(String nombre, int edad, String genero){
        leones += 1;
        Mamifero leon = new Mamifero(nombre, edad,"selva", genero,true, 4);
        return leon;
    }

}
