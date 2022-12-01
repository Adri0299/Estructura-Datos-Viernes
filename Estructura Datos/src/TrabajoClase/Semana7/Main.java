package TrabajoClase.Semana7;

public class Main {

    public static void main(String[] args) {
         list Lista= new list();
         Lista.insertar(new Persona(1, "P"));
         Lista.insertar(new Persona(2, "P"));
         Lista.insertar(new Persona(3, "P"));
         Lista.insertar(new Persona(5, "P"));
         Lista.insertar(new Persona(4, "P"));
         Lista.imprimirLista();
         Lista.eliminarPersona(3);  
         
         ListaSimpleC Listac= new ListaSimpleC();
         Listac.insertar(new Persona(1, "P"));
         Listac.insertar(new Persona(4, "P"));
         Listac.insertar(new Persona(5, "P"));
         Listac.insertar(new Persona(2, "P"));
         Listac.imprimirLista();
    }
}
