package com.proyecto3;

/**
 * Programa que te permite agregar, editar, eliminar y marcar como completadas tareas en una lista.
 * También te permite ver la lista completa de tareas con su información asociada.
 * Clase Tareas que tendra el nombre de la tarea y el estado, getters y setters.
 */
public class Tareas {
    //Atributo nombre de la tarea
    private String nombre;
    //Atributo Completada para verificar si una tarea esta terminado o no.
    //Si es true se marcara una [X] de lo contrario no se marcara la [X].
    private boolean completada;
    /*Constructor Tareas con un parametro (nombre tipo String). Inicializamos tambien completada a false
    * Cada vez que llamamos este constructor se le asignara al arrayList el nombre, que lo pasariamos como parametro
    * Y completada seria false, osea que no tendria la casilla [] marcada con X al agregar primera vez la tarea.
    * */
    public Tareas(String nombre){
        this.nombre=nombre;
        completada=false;
    }
    //get de nombre
    public String getNombre() {
        return nombre;
    }
    // set de nombre para poder editar una tarea de la lista del arrayList
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    // Metodo para retornar si es verdadero o falso
    // Se utilizara en el metodo de toString para comparar el estado de una tarea
    public boolean estaCompletada() {
        return completada;
    }
    // set de completada para poder asignar true a una lista de tarea
    // Si es true se marcara la [X] al mostrar la lista, de lo contrario no se marcara la casilla
    public void setCompletada(boolean completada) {
        this.completada = completada;
    }
    /*
    Metodo toString para hacer el procedimiento del estado de una tarea.
    Si estaCompletada() es true se marca [X] si es false no se marcara la X e imprimira solo los corchetes [ ]
    Se utiliza un if shortcut para hacer la comparacion
     */
    @Override
    public String toString() {
        String estado = estaCompletada() ? "[X]" : "[ ]";
        // Para cada lista se imprimira el nombre con el estado.
        return nombre + " " + estado;
    }
}