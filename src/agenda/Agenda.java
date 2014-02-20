package agenda;

import java.util.ArrayList;
import java.util.Scanner;

public class Agenda {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        String nombre[] = new String[1000];
        String direccion[] = new String[1000];
        String fecha[] = new String[1000];
        int menu = 0;
        int contador = 1;
        boolean bandera = true;
        while (bandera == true) {

            ArrayList telefono = new ArrayList();
            ArrayList correo = new ArrayList();
            

            System.out.println("   ***AGENDA***   \n Selecciona un numero\n1.-Agregar nuevo contacto\n2.-Modificar\n3.-Eliminar\n4.-Buscar\n5.-Salir");
            menu = t.nextInt();
            if (menu == 1) {
                System.out.println("Ingresa el nombre");
                nombre[contador] = t.nextLine();
                System.out.println("Ingresa la direccion");
                direccion[contador]=t.nextLine();

            }

        }
    }
}
