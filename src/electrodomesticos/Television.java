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
public class Television extends Electrodomesticos {

    private int resolucion;
    private boolean sintonizador;

   double preciot = 0;
    
    private static final int resolucionTv = 20;
    private static final boolean sintonizadorTdt = false;

    /**
     * Constructor que inicializa las variables constantes
     */
    public Television() {
        super();
        this.resolucion = resolucionTv;
        this.sintonizador = sintonizadorTdt;
    }
   
    
    /**
     * Constructor que inicializa las variables de la clase padre
     *
     * @param preciobase
     * @param peso
     */
    public Television(double preciobase, double peso) {
        super(preciobase, peso);
        this.resolucion = resolucionTv;
        this.sintonizador = sintonizadorTdt;
    }

    /**
     * Constructor que inicializa las variables de la clase padre y la clase
     * hija
     *
     * @param resolucion
     * @param sintonizador
     * @param preciobase
     * @param color
     * @param consumo
     * @param peso
     * @param precio
     */
    public Television(int resolucion, boolean sintonizador, double preciobase, Color color, Consumo consumo, double peso) {
        super(preciobase, color, consumo, peso);
        this.resolucion = resolucion;
        this.sintonizador = sintonizador;
    }

    /**
     * Retorna el valor de la variable resolucion
     *
     * @return
     */
    public static int getResolucion() {
        return resolucionTv;
    }

    /**
     * Retorna el valor de la variable sintonizador
     *
     * @return
     */
    public static boolean isSintonizador() {
        return sintonizadorTdt;
    }

    public double getPreciot() {
        return preciot;
    }

    
    
    
    public void cambiarDatos(){
        this.setPrecio(this.getPrecio());
    }

    /**
     * Metodo que da el precio final segun las especificaciones de la clase
     * Television
     */
    @Override 
    public void precioFinal() {
         
        if ((this.resolucion > 40) & (this.sintonizador == true)) {
            preciot =(((this.getPrecio() * 30) / 100) + (50));
            System.out.println("1.EL PRECIO FINAL ES: " + preciot);            
        }
        if (this.resolucion > 40) {
            preciot = this.getPreciot() * 30 / 100;
            System.out.println("2. EL PRECIO FINAL ES: " + preciot);
        }
        if (this.sintonizador == true) {
            preciot = this.getPreciot() + 50;
            System.out.println("3. EL PRECIO FINAL ES: " + preciot);
        } else {
            preciot = this.getPrecio();
            System.out.println("4. EL PRECIO FINAL ES: " + preciot);
        }
    }

    protected void datosDefecto() {
        int opcion;
        System.out.println("***DATOS A INGRESAR***");
        System.out.println("RESOLUCION");
        this.resolucion = teclado.nextInt();
        System.out.println("RESOLUCION: " + this.resolucion);
        System.out.println("SINTONIZADOR");
        System.out.println("Escoja 1. TRUE    2. FALSE");
        opcion = teclado.nextInt();
        switch (opcion) {
            case 1:
                this.sintonizador = true;
                break;
            case 2:
                this.sintonizador = false;
                break;
            default:
                System.out.println("LA OPCION NO ES VALIDA");
        }
    }

    protected void datos2() {
        System.out.println("***DATOS A INGRESAR***");
    }

    protected void datos3() {
        int opcion;
        int opcion1;
        System.out.println("***DATOS A INGRESAR***");
        System.out.println("RESOLUCION");
        this.resolucion = teclado.nextInt();
        System.out.println("RESOLUCION: " + this.resolucion);
        System.out.println("SINTONIZADOR");
        System.out.println("Seleccione  1. TRUE    2. FALSE");
        opcion = teclado.nextInt();
        switch (opcion) {
            case 1:
                this.sintonizador = true;
                break;
            case 2:
                this.sintonizador = false;
                break;
            default:
                System.out.println("LA OPCION NO ES VALIDA");
        }
    }



}
