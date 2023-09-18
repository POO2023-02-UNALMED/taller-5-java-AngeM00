package gestion;
import java.util.ArrayList;

public class Zoologico{
    private String nombre;
    private String ubicacion;
    private ArrayList<Zona> zonas = new ArrayList<Zona>();

    public Zoologico(){}

    public Zoologico(String nombre, String ubicacion){
        this.nombre = nombre;
        this.ubicacion = ubicacion;
    }

    //Getters y setters 
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public ArrayList<Zona> getZonas() {
        return zonas;
    }

    //Otros

    public void agregarZonas(Zona zone){
        zonas.add(zone);
    }


    public int cantidadTotalAnimales(){
        int totalAnimales = 0;
        for (Zona zona : zonas) {
            totalAnimales += zona.cantidadAnimales();
        }
        return totalAnimales;
    }
}