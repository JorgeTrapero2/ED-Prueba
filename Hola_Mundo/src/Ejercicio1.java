import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduzca una palabra: ");
        String salida = "";
        String palabra = in.nextLine();        
        for (int i = 0; i < palabra.length(); i++) {
            salida = palabra.charAt(i) + salida;                
            }
        if(palabra.equals(salida)){
            System.out.println("si");
        }else{
        	System.out.print("puede");
            
        }
}
}
