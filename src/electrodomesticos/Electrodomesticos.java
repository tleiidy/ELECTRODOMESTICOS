/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package electrodomesticos;
import java.util.Scanner;

/**
 *
 * @author Leidy Torres
 */
public abstract class Electrodomesticos implements Metodos {

    Scanner teclado = new Scanner(System.in);
    
    private double preciobase;
    private Color color;
    private Consumo consumo;
    private double peso;
    double precio;
    double precioTa=0;
    
    /**
     * Asigno valor a variables constantes
     */
    private static final double precioBaseDefecto = 100;
    private static final double pesoDefecto = 5;
    /**
     * Constructor que inicializa las variables constantes
     */
    public Electrodomesticos() {
        this.preciobase = precioBaseDefecto;
        this.color = color.BLANCO;
        this.consumo = consumo.F;
        this.peso = pesoDefecto;
    } 
    
    /**
     * Constructor que inicializa las varibles
     * @param preciobase
     * @param peso
     */    
    public Electrodomesticos(double preciobase, double peso) {
        this.preciobase = preciobase;
        this.color = color.BLANCO;
        this.consumo = consumo.F;
        this.peso = peso;
    }

    /**
     * Constructor que inicializa todos los atributos de la clase
     * @param preciobase
     * @param color
     * @param consumo
     * @param peso 
     */
    public Electrodomesticos(double preciobase, Color color, Consumo consumo, double peso) {
        this.preciobase = preciobase;
        this.color = color;
        this.consumo = consumo;
        this.peso = peso;
    }
    
    
    /**
     * Metodo que comprueba que la letra es correcta y calcula el precio de cada letra
     */
    @Override
    public void comprobarConsumoEnergetico() {
        
        char opcion;
        System.out.println("Seleccione el consumo energetico");
        System.out.println("A.    B.    C.    D.    E.    F.");
        opcion = teclado.next().charAt(0);
        switch(opcion){
            case 'A': 
                System.out.println("LA LETRA ES CORRECTA");
                precio = this.getPreciobase() + 100 ;
                System.out.println("PRECIO LETRA: "+precio);
            break;
            case 'B':
                System.out.println("LA LETRA ES CORRECTA");
                precio = this.getPreciobase() + 80 ;
                System.out.println("PRECIO LETRA: "+precio);
            break;
            case 'C':
                System.out.println("LA LETRA ES CORRECTA");
                precio = this.getPreciobase() +  60 ;
                System.out.println("PRECIO LETRA: "+precio);
            break;
            case 'D':
                System.out.println("LA LETRA ES CORRECTA");
                precio = this.getPreciobase() + 50 ;
                System.out.println("PRECIO LETRA: "+precio);
            break;
            case 'E':
                System.out.println("LA LETRA ES CORRECTA");
                precio = this.getPreciobase() + 30 ;
                System.out.println("PRECIO LETRA: "+precio);
            break;
            case 'F':
                System.out.println("LA LETRA ES CORRECTA");
                precio = this.getPreciobase() +  10 ;
                System.out.println("PRECIO LETRA: "+precio);
            break;
            default: 
                System.out.println("OPCION NO VALIDA");
            break;
        }
    }
    
    /**
     * Metodo que comprueba si el color es correcto
     */
    @Override
    public void comprobarColor(){

        int opcion1;
        System.out.println("Seleccione el color del electrodomestico");
        System.out.println("1.BLANCO    2. NEGRO   3.ROJO    4.AZUL    5.GRIS");
        opcion1 = teclado.nextInt();
        switch (opcion1){
            case 1: 
                System.out.println("EL COLOR ES CORRECTO");
            break;
            case 2: 
                System.out.println("EL COLOR ES CORRECTO");
            break;
            case 3: 
                System.out.println("EL COLOR ES CORRECTO");
            break;
            case 4: 
                System.out.println("EL COLOR ES CORRECTO");
            break;
            case 5: 
                System.out.println("EL COLOR ES CORRECTO");
            break;
            default:
                System.out.println("EL COLOR NO EXISTE");
        }
        
        
    }
    
    /**
     * Metodo que calcula el precio final base de electrodomesticos
    */ 
    @Override
    public void precioFinal(){ 
        
    }
    
    
    /**
     * Metodo que calcula el preciobase + el precio segun el peso del electrodomestico
     */
    
    @Override
    public void precioTamano(){
        int peso2;
        
        System.out.println("Seleccione una opcion si el peso esta dentro de alguno de los sig. rangos");
        System.out.println("1.Entre 0 y 19 kg ");
        System.out.println("2.Entre 20 y 49 kg");
        System.out.println("3.Entre 50 y 79 kg");
        System.out.println("4.Mayor de 80 kg");
        peso2 = teclado.nextInt();
        switch (peso2){
            case 1: 
                precioTa = this.getPrecio() +  10;
                System.out.println("PRECIO TAMANO: "+precioTa);
            break;
            case 2:
                precioTa = this.getPrecio() + 50;
                System.out.println("PRECIO TAMANO: "+precioTa);
            break;
            case 3:
                precioTa = this.getPrecio() + 80;
                System.out.println("PRECIO TAMANO: "+precioTa);
            break;
            case 4:
                precioTa = this.getPrecio() + 100;
                System.out.println("PRECIO TAMANO: "+precioTa);
            break;
            default: System.out.println("OPCION NO VALIDA");
        
        }            
    }
    
    /**
     * Retorna el valor de preciobase
     * @return 
     */
    public double getPreciobase() {
        return preciobase;
    }

    /**
     * Modifica el valor de preciobase
     * @param preciobase 
     */
    public void setPreciobase(double preciobase) {
        this.preciobase = preciobase;
    }
    
    /**
     * Retorna el valor de la clase enum Color
     * @return 
     */
    public Color getColor() {
        return color;
    }

    /**
     * Modifica el valor de la clase enum Color
     * @param color 
     */
    public void setColor(Color color) {
        this.color = color;
    }

    /**
     * Retorna el valor de la clase enum Consumo
     * @return 
     */
    public Consumo getConsumo() {    
        return consumo;
    }

    /**
     * Modifica el valor de la clase enum Consumo
     * @param consumo 
     */
    public void setConsumo(Consumo consumo) {    
        this.consumo = consumo;
    }

    /**
     * Retorna el valor de la variable Peso
     * @return 
     */
    public double getPeso() {
        return peso;
    }

    /**
     * Modifica el valor de la varible Peso
     * @param peso 
     */
    public void setPeso(double peso) {
        this.peso = peso;
    }

    /**
     * Retorna el valor de la variable precio
     * @return 
     */
   public double getPrecio() {
        return precio;
    }

    /**
     * Modifica el valor de la variable precio
     * @param precio 
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    
    
    
    
    
    
    
}

