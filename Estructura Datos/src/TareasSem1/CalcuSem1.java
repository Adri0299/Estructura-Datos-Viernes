
package TareasSem1;

/**
 *
 * @author Adriana
 */
public class CalcuSem1 {

    public static void main(String[] args) {
        //Se llama al metodo encargado de iniciar el programa
        iniciar_sistema ();
    }
    
      //Metodo static para iniciar el sistema
    public static void iniciar_sistema (){
                
        //Se crea un objeto para llamar a la interfaz login
        Interfaz inicio= new Interfaz();
                
        //titulo para la interfaz
        inicio.setTitle("Login");
        
        //Permite centrar la interfaz en pantalla
        inicio.setLocationRelativeTo(null);
        
        //Hace visible  en pantalla
        inicio.setVisible(true);
                
    }
}
