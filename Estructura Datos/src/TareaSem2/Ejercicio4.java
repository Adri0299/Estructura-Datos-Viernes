/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TareaSem2;

/**
 *
 * @author Adriana
 */
public class Ejercicio4 {
    
     public static int sumar2(int num){
        if(num==1){
            System.out.println(num);
            return 1;
            
        } else {
            System.out.println(num);
            return num + sumar2(num-1);
        }
    }
}
