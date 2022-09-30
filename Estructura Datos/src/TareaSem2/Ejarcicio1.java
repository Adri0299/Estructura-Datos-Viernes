package TareaSem2;
//Debe tener minimo una condicion de Parada/Base y que se llame a si misma

public class Ejarcicio1 {

  public static String invertirNumeroString(int num) {
        if (num < 10) {
            return String.valueOf(num);
        } else {
            return String.valueOf(num % 10) + invertirNumeroString(num / 10);
        }
    }
}
