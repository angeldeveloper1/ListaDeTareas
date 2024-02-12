package com.proyecto3;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Clase ListaDeTareas que tendran los metodos o funciones para el manejo de la aplicacion
 * Esta clase se utilizara para agregar, editar, modificar, etc. la lista de tareas
 */
public class ListaDeTareas{
    // Se crea el ArrayList que sera una lista de todas las Tareas. cada una de esas Tareas tendra nombre y estado
    private ArrayList<Tareas> listaTareas;
    // Se crea el Scanner para poder usar el input en los metodos
    private Scanner input;
    // Se crea el constructor que pasara la referencia de la clase Scanner
    public ListaDeTareas(Scanner input) {
        // listaTareas va a ser una nueva ArrayList de tipo Tareas
        listaTareas = new ArrayList<Tareas>();
        // input va a ser igual a la variable de instancia
        this.input = input;
    }
    // Metodo para Agregar tarea a la lista
    public void agregarTarea(){
        System.out.println("Escribre el nombre de la tarea: ");
        String nombre = input.nextLine();
        // Se crea un nuevo objeto de la clase Tareas
        // esta referencai va a ser igual a new Tareas y le pasamos el nombre del parametro y el estado sera false.
        Tareas tarea = new Tareas(nombre);
        // agregaremos la tarea
        listaTareas.add(tarea);
        System.out.println("Se ha agregado correctamente la tarea!");
    }
    // Metodo editar tarea
    public void editarTarea() {
        try {

            System.out.println("Escribe indice de tarea que quieres editar: ");
            int indice = input.nextInt();
            input.nextLine(); // consume el salto de linea

            // si indice que ha ingresado el usuario se cumple
            if (indice >= 0 && indice<listaTareas.size()){
                System.out.println("Edita e ingrese el nuevo nombre de la tarea");
                String nombre = input.nextLine();
                // Se crea objeto de tarea de la clase Tareas
                // listaTareas.get(indice) para obtener el elemento del indice que nos da el usuario
                Tareas tarea = listaTareas.get(indice);
                // convertimos el nombre de la tarea por el nuevo nombre que ha ingresado el usuario
                tarea.setNombre(nombre);
                System.out.println("Tarea editada correctamente!");
            } else {
                System.out.println("Indice incorrecto.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Error, intente nuevamente ingresar el indice del nombre de la tarea");
            input.nextLine();
        }

    }
    // Metodo eliminar tareas
    public void eliminarTarea(){
        try {
            System.out.println("Ingrese el indice de tarea que quieres eliminar");
            int indice = input.nextInt();
            input.nextLine(); // consume el salto de linea

            if (indice >=0 && indice<listaTareas.size()){
                // tarea de la clase Tareas igual a listaTareas.get(indice) para obtener el elemento de ese indice
                Tareas tarea = listaTareas.get(indice);
                // Eliminamos el elemento de la lista, del indice que nos ha dado el usuario
                listaTareas.remove(tarea);
                System.out.println("Se ha eliminado la tarea correctamente");
            } else {
                System.out.println("El indice que ha ingresado es incorrecto");
            }
        } catch (InputMismatchException e) {
            System.out.println("Error, intente nuevamente ingresar el indice del nombre de la tarea");
            input.nextLine();
        }

    }
    // Metodo para marcarCompletado
    public void marcarCompletado(){
        try {
            if (listaTareas.size() == 0){
                System.out.println("No hay ninguna tareas");
            } else {
                System.out.println("Ingrese el indice de la tarea completada");
                int indice = input.nextInt();
                input.nextLine();

                if (indice >=0 && indice<listaTareas.size()){
                    // Obtener el elemento de la lista de tareas
                    Tareas tarea = listaTareas.get(indice);
                    // Marcar la tarea como completada
                    tarea.setCompletada(true);
                    System.out.println("Tarea marcada como completada.");
                } else {
                    System.out.println("El indice es incorrecto");
                }
            }

        }catch (InputMismatchException e) {
            System.out.println("Error, intente nuevamente ingresar el indice del nombre de la tarea");
            input.nextLine();
        }

    }
    //Mostrar lista de tareas
    public void mostrarTareas(){
        // Si el tamano es igual a 0 entonces no hay tareas pendientes
        if (listaTareas.size()==0){
            System.out.println("No hay tareas pendientes");
            // De lo contrario
        } else {
            // Creamos un for
            for (int i =0; i<listaTareas.size(); i++){
                //i sera el indice osea la posicion de las tareas
                //listaTareas.get(i).toString() obtendra el elemento del indice i y ademas se convierte al metodo toString
                // toString nos imprime el nombre y el estado.
                System.out.println(i + ". " +listaTareas.get(i).toString());
            }
        }
    }



}
