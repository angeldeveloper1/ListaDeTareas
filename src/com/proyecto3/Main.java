package com.proyecto3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ListaDeTareas listaTareas = new ListaDeTareas(scanner);

        boolean condicion=true;
        while(condicion){
            System.out.println("Lista de Tareas");
            System.out.println("1. Agregar tareas");
            System.out.println("2. Editar tareas");
            System.out.println("3. Eliminar tareas");
            System.out.println("4. Marcar completados");
            System.out.println("5. Mostrar tareas");
            System.out.println("0. Salir");

            if (scanner.hasNextInt()){



                int opcion = scanner.nextInt();
                scanner.nextLine();

                if (opcion <0 || opcion >5){
                    System.out.println("Error: Ingrese una opcion valida");
                }

                if (opcion == 0){
                    System.out.println("Good bye!");
                    condicion = false;
                }

                if (opcion == 1){
                    listaTareas.agregarTarea();
                }

                if (opcion == 2){
                    listaTareas.editarTarea();
                }
                if (opcion == 3){
                    listaTareas.eliminarTarea();
                }
                if (opcion == 4){
                    listaTareas.marcarCompletado();
                }
                if (opcion == 5){
                    listaTareas.mostrarTareas();
                }

            } else {
                System.out.println("Error, ingrese un numero entero");
                scanner.next();
            }




        }

    }
}
