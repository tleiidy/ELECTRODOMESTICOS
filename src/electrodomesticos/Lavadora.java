/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package electrodomesticos;

/**
 *
 * @author Leidy Torres
 */
public class Lavadora extends Electrodomesticos{

    private int carga;
    
    private static final int cargaL=5;
    /**
     * Constructor por defecto
     */
    public Lavadora() {
    }
    /**
     * Constructor que inicializa las variables de la clase padre Electrodomesticos
     * @param preciobase
     * @param peso 
     */
    public Lavadora(double preciobase, double peso) {
        super(preciobase, peso);
    }

    /**
     * Constructor que inicializa las variables de la clase padre y la clase hija
     * @param carga
     * @param preciobase
     * @param color
     * @param consumo
     * @param peso 
     * @param precio
     */
    public Lavadora(int carga, double preciobase, Color color, Consumo consumo, double peso) {    
        super(preciobase, color, consumo, peso);
        this.carga = carga;
    }

    /**
     * Retorna el valor de la variable carga
     * @return 
     */
    public int getCarga() {
        return carga;
    }

    /**
     * Metodo que calcula el precio segun el tamaño del electrodomestico
     */
    @Override
    public void precioTamano() {
    }
    
    
    /**
     * Metodo que calcula el precio final segun las especificaciones de la clase Lavadora
     */
    @Override
    public void precioFinal(){
        double preciot=0;        
        if(this.carga > 30){
        preciot = this.getPrecio()+ 50;
        System.out.println("PRECIO FINAL ES: " +preciot);
        } else {
        preciot = this.precio;
        }
        
    
    }
    
    protected void datosDefecto(){
        int opcion;
        System.out.println("***DATOS A INGRESAR***");
        System.out.println("CARGA");
        this.carga = teclado.nextInt();
    }
    
    protected void datos2(){
        System.out.println("***DATOS A INGRESAR***");
        System.out.println("PRECIO: ");
        this.getPrecio();
        System.out.println("PESO: ");
        this.getPeso();
    }
    
    protected void datos3(){
        int opcion;
        System.out.println("***DATOS A INGRESAR***");
        System.out.println("CARGA");
        this.carga = teclado.nextInt();
        System.out.println("***DATOS A INGRESAR***");
        System.out.println("PRECIO: ");
        this.getPrecio();
        System.out.println("PESO: ");
        this.getPeso();        
    }
    

    
    
    
    
}
