package com.proyecto3;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ListaDeTareas{

    private ArrayList<Tareas> listaTareas;
    private Scanner input;

    public ListaDeTareas(Scanner input) {
        listaTareas = new ArrayList<Tareas>();
        this.input = input;
    }

    public void agregarTarea(){
        System.out.println("Escribre el nombre de la tarea: ");
        String nombre = input.nextLine();
        Tareas tarea = new Tareas(nombre);
        listaTareas.add(tarea);
        System.out.println("Se ha agregado correctamente la tarea!");
    }

    public void editarTarea() {
        try {
            System.out.println("Escribe indice de tarea que quieres editar: ");
            int indice = input.nextInt();
            input.nextLine();

            if (indice >= 0 && indice<listaTareas.size()){
                System.out.println("Edita e ingrese el nuevo nombre de la tarea");
                String nombre = input.nextLine();
                Tareas tarea = listaTareas.get(indice);
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
    public void eliminarTarea(){
        try {
            System.out.println("Ingrese el indice de tarea que quieres eliminar");
            int indice = input.nextInt();
            input.nextLine();

            if (indice >=0 && indice<listaTareas.size()){
                Tareas tarea = listaTareas.get(indice);
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

    public void marcarCompletado(){
        try {
            if (listaTareas.size() == 0){
                System.out.println("No hay ninguna tareas");
            } else {
                System.out.println("Ingrese el indice de la tarea completada");
                int indice = input.nextInt();
                input.nextLine();

                if (indice >=0 && indice<listaTareas.size()){
                    Tareas tarea = listaTareas.get(indice);
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

    public void mostrarTareas(){
        if (listaTareas.size()==0){
            System.out.println("No hay tareas pendientes");
        } else {
            for (int i =0; i<listaTareas.size(); i++){
                System.out.println(i + ". " +listaTareas.get(i).toString());
            }
        }
    }



}
