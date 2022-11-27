/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TrabajoClase.Semana7;

/**
 *
 * @author Adriana
 */
public class list {
   
    private Node<Persona> cabeza;

    public list() {
    }
    
    public void insertar(Persona value) {
        Node<Persona> nuevoNodo = new Node<Persona>(value);
        if (cabeza == null) {
            cabeza = nuevoNodo;

        } else if (cabeza.getValue().getId() > nuevoNodo.getValue().getId()) {
            nuevoNodo.setNext(cabeza);
            cabeza = nuevoNodo;
        } else if (cabeza.getValue().getId() < nuevoNodo.getValue().getId() && cabeza.getNext() == null) {
            cabeza.setNext(nuevoNodo);

        } else {
            Node<Persona> aux = cabeza;
            while (aux.getNext() != null && aux.getNext().getValue().getId() < nuevoNodo.getValue().getId()) { //valida todos los datos para acomodar los datos
                aux = aux.getNext();
            }
            nuevoNodo.setNext(aux.getNext());
            aux.setNext(nuevoNodo);
        }
    }

    public void imprimirLista() {
      Node<Persona> aux = cabeza;
      while(aux!=null){
          System.out.println(aux.getValue().toString());
          aux=aux.getNext();
      }
    }
    
    public void eliminarPersona(int idBuscado){
        boolean encuentra=false;
        
        if(cabeza==null){
            System.out.println("No hay datos en la lista");
        }else{
            Node<Persona> aux = cabeza;
            while(aux.getNext()!=null){
                if(aux.getNext().getValue().getId()==idBuscado){
                   System.out.println("Datos eliminados" + aux.getNext().getValue().toString());
                   aux.setNext(aux.getNext().getNext());
                   encuentra=true;
                }else{
                    aux=aux.getNext();
                }
            }
               
            }if(encuentra==false){
                   System.out.println("No hay ninguna persona en la lista con el ID"); 
        }
    }
}
