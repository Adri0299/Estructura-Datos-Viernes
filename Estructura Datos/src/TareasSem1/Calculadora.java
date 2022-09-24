/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TareasSem1;
import javax.swing.JOptionPane;
/**
 *
 * @author Adriana
 */

//Definición de clase publica
public class Calculadora {
     // Atributos publicos del programa 
    public double num1;
    public double num2;
    public double result;

   // Constructor donde ya están inicializados los atributos
    public Calculadora(double num1, double num2, double result) {
        this.num1 = num1;
        this.num2 = num2;
        this.result = result;
    }
    // Constructor vacío
    public Calculadora() {
        this.num1 = 0;
        this.num2 = 0;
        this.result = 0;
    }
    // GET y SET
    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }
    
    
    //Definición de Metodos 
    public void ingresar_info(){
        this.num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el primer número"));
        this.num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el segundo número"));
    }
    
    public void suma(){
        result= num1+num2;
    }
    
    public void resta(){
        result= num1-num2;
    }
    
    public void dividir(){
        result= num1/num2;
    }
    
    public void multiplicar(){
        result= num1*num2;
    }
    
    public void resultado(){
        JOptionPane.showMessageDialog(null, "El resultado de la operación es: " + this.result);
        
    }
}
 