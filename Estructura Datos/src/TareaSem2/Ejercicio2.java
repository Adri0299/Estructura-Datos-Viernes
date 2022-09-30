/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TareaSem2;

/**
 *
 * @author Adriana
 */
public class Ejercicio2 {
    
     public static int palabra2(int contador){
       String s= "mañana";
       
       if(contador==5){
          System.out.println(s.charAt((contador)));
          return 0;
           
       }else{
           
        System.out.println(s.charAt((contador)));
        contador ++;
        return palabra2(contador);
    }
    }
}
