package TrabajoClase.Semana11;

public class Arbol {
     private Node raiz;
    private int altura;

    public void inserta(int value) {
        if (raiz == null) {
            raiz = new Node(value);
        } else {
            insertar(raiz, value);
        }
    }

    public void insertar(Node nodo, int value) {
        if (value <= nodo.getId()) {
            if (nodo.getIzquierdo() == null) {
                nodo.setIzquierdo(new Node(value));
            } else {
                insertar(nodo.getIzquierdo(), value);
            }
        } else {
            if (nodo.getDerecho() == null) {
                nodo.setDerecho(new Node(value));
            } else {
                insertar(nodo.getDerecho(), value);
            }
        }
    }

  public void inOrden(){
      if(raiz != null){
          inOrdenRecorrer(raiz);
      }else{
         System.out.println("Arbol esta vacio");
      }
  }
  
  public void inOrdenRecorrer(Node nodo){
      if(nodo != null){
         inOrdenRecorrer(nodo.getIzquierdo());
         System.out.println(nodo.getId()+" , ");
         inOrdenRecorrer(nodo.getDerecho());
      }
  }
  
  private void retornarAltura(Node nodo, int nivel){
      if(nodo !=null){
      retornarAltura(nodo.getIzquierdo(), nivel + 1);
      if(nivel > altura){
          altura = nivel;
      }
      System.out.println("En este momento, gire a la derecha" + nodo.getId());
      retornarAltura(nodo.getDerecho(), nivel + 1);
  }
  }
  
  public int retornarAltura(){
      altura = 0;
      retornarAltura(raiz, 1);
      System.out.println(altura);
      return altura;
  }
}
