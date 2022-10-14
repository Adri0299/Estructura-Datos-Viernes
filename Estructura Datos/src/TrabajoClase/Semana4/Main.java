package TrabajoClase.Semana4;

public class Main {

    public static void main(String[] args) {
       
                
        //Colas
       Queue<Integer> Cola = new Queue<Integer>();
        Cola.enqueue(1);
        Cola.enqueue(2);
        Cola.enqueue(4);
        System.out.println(Cola.dequeue());
        System.out.println(Cola.dequeue().getValue());
        
        
        //Llenar cola con 100 elementos
       /* Queue<Integer> prueba = new Queue<Integer>();
        for (int i = 0; i < 100; i++) {
            prueba.enqueue(i);
        }

        int temp = prueba.findbyindex(6).getValue();
        Queue<Integer> prueba2 = new Queue<Integer>();
        prueba2.enqueue(temp);
        for (int i = 0; i < 100; i++) {
            prueba2.enqueue(i);*/
        }
    
    
}
