package com.example.aplicacion;

public class User {

    private String nombre;
    private String apellido;
    private int edad;
    private String role;

    public User(String nombre, String apellido, int edad, String role) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.role = role;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
