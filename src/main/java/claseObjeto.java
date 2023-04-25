import java.util.Scanner;

public class claseObjeto {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Crear telefono");
        System.out.println("Ingrese modelo del telefono");
        String modelo = teclado.next();
        System.out.println("Ingrese marca del telefono");
        String marca = teclado.next();
    Telefono telefono1 = new Telefono (modelo,marca);


    telefono1.llamar();
    telefono1.reproducir();
    }
}
