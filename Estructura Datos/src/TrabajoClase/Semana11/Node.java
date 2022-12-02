package TrabajoClase.Semana11;

public class Node {
   private int id;
   private Node derecho;
   private Node izquierdo;

    public Node(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Node getDerecho() {
        return derecho;
    }

    public void setDerecho(Node derecho) {
        this.derecho = derecho;
    }

    public Node getIzquierdo() {
        return izquierdo;
    }

    public void setIzquierdo(Node izquierdo) {
        this.izquierdo = izquierdo;
    }
   
}
