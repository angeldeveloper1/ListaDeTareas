package com.proyecto3;

import java.util.Scanner;

/**
 * Clase main
 * Interfaz de Usuario
 */
public class Main {
    public static void main(String[] args) {
        // Instanciamos listaTareas y creamos scanner
        // Ya se inicializa al crear esto
        Scanner scanner = new Scanner(System.in);
        ListaDeTareas listaTareas = new ListaDeTareas(scanner);

        // condicion true para que no termine el programa hasta que el usuario escoja la opcion 0
        boolean condicion=true;
        while(condicion){
            System.out.println("Lista de Tareas");
            System.out.println("1. Agregar tareas");
            System.out.println("2. Editar tareas");
            System.out.println("3. Eliminar tareas");
            System.out.println("4. Marcar completados");
            System.out.println("5. Mostrar tareas");
            System.out.println("0. Salir");
            // Verifica si es un numero entero de lo contrario debe ingresar nuevamente
            if (scanner.hasNextInt()){
                // lee la opcion
                int opcion = scanner.nextInt();
                scanner.nextLine(); // consume salto de linea

                // Si se escoge otro numero entero que no sea el rango, se imprime un error
                if (opcion <0 || opcion >5){
                    System.out.println("Error: Ingrese una opcion valida");
                }

                //Salir programa
                if (opcion == 0){
                    System.out.println("Good bye!");
                    condicion = false;
                }
                // Agregar tarea
                if (opcion == 1){
                    listaTareas.agregarTarea();
                }
                // Editar tarea
                if (opcion == 2){
                    listaTareas.editarTarea();
                }
                // Eliminar tarea
                if (opcion == 3){
                    listaTareas.eliminarTarea();
                }
                // Marcar completado
                if (opcion == 4){
                    listaTareas.marcarCompletado();
                }
                // Mostrar tareas
                if (opcion == 5){
                    listaTareas.mostrarTareas();
                }
            // Debera volver a ingresar el numero
            } else {
                System.out.println("Error, ingrese un numero entero");
                scanner.next();
            }
        }
    }
}
