package TareaSem3;

public class Pila<T> {
    private Node<T> top;
    int talla=0;
    
    public void push(T value){
      Node<T> newNode = new Node<T>(value);
      if(top==null){
          top=newNode;
      }else{
          newNode.setNext(top);
          top=newNode;
      }
    }
    public T pop(){ 
        Node<T> pop_value = top; 
        if(top!=null){
            talla++;
            top=top.getNext();
            
         return pop_value.getValue(); 
         
        }else{
            System.out.println("No hay productos en la pila de camisas");
            return null;
            
        }
    }   
}
