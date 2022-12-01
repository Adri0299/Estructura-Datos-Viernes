package TrabajoClase.Semana9;

public class Main {

    public static void main(String[] args) {
       ListaDobleC Listadc= new ListaDobleC();
         Listadc.insertar(new Persona(1, "P"));
         Listadc.insertar(new Persona(4, "P"));
         Listadc.insertar(new Persona(5, "P"));
         Listadc.insertar(new Persona(2, "P"));
         Listadc.imprimirLista();
         //Listadc.existe(5);
         //Listadc.modifica(new Persona(5,"F"));
         Listadc.elimina(5);
         Listadc.imprimirLista();
    
    }
}
