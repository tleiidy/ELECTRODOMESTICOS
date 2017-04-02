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
public class Informe {

    Scanner teclado = new Scanner(System.in);

    Electrodomesticos electrodomestico [] = new Electrodomesticos [10];
    Electrodomesticos electro;
    
    int opcion;
    int opcion1;
    
    public Informe() {
        
        System.out.println("Escoja el electrodomestico");
        System.out.println("1. TELEVISOR   2. LAVADORA   3. SALIR");
        opcion = teclado.nextInt();

        Electrodomesticos electrodomesticos = new Television();
      
        Television television = new Television();
        Lavadora lavadora = new Lavadora();
        
      for(int i=0; i< 10; i++){
          
        if (opcion == 1){  
            menu();
            if (opcion1 == 1){
                electro = new Television();
                electrodomestico[i] = electro;
                electrodomesticos.comprobarConsumoEnergetico();
                electrodomesticos.comprobarColor();
                television.datosDefecto();
                television.precioFinal();
            }else if (opcion1 == 2){
                electro = new Television();
                electrodomestico[i] = electro;
                electrodomesticos.comprobarConsumoEnergetico();
                electrodomesticos.comprobarColor();
                television.datos2();
                electrodomesticos.precioTamano();
                television.precioFinal();
            }else{
                electro = new Television();
                electrodomestico[i] = electro;
                electrodomesticos.comprobarConsumoEnergetico();
                electrodomesticos.comprobarColor();
                television.datos3();
                electrodomesticos.precioTamano();
                television.precioFinal();
            }
        }else if (opcion == 2){
           menu();
            if (opcion1 == 1){
                electro = new Lavadora();
                electrodomestico[i] = electro;
                electrodomesticos.comprobarConsumoEnergetico();
                electrodomesticos.comprobarColor();
                lavadora.datosDefecto();
                electrodomesticos.precioTamano();
                lavadora.precioFinal();
            }else if (opcion1 == 2){
                electro = new Lavadora();
                electrodomestico[i] = electro;
                electrodomesticos.comprobarConsumoEnergetico();
                electrodomesticos.comprobarColor();
                lavadora.datos2();
                lavadora.precioTamano();
                lavadora.precioFinal();
            }else{
                electro = new Lavadora ();
                electrodomestico[i] = electro;
                electrodomesticos.comprobarConsumoEnergetico();
                electrodomesticos.comprobarColor();
                lavadora.datos3();
                electrodomesticos.precioTamano();
                lavadora.precioFinal();
            } 
            
        }else if (opcion == 3){
            break;
        }
     }  
         for(int i=0; i< 10; i++){
             if(this.electrodomestico[i] != null) {
                this.electrodomestico[i].precioFinal();
                
             }
         }
    }
    
    public void menu(){
        
     System.out.println("Escoja los valores que desea asignar");
            System.out.println("1. VALORES POR DEFECTO");
            System.out.println("2. VALORES SEGUN PESO");
            System.out.println("3. TODOS LOS VALORES");
            opcion1 = teclado.nextInt();
    }


}
