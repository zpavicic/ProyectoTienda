package com.example.aplicacion;

public class User {

    private String uid;
    private String nombre;
    private String correo;
    private String password;
    private String rol;
    public User(){

    }

    public User(String uid, String nombre, String correo, String password, String rol) {
        this.uid = uid;
        this.nombre = nombre;
        this.correo = correo;
        this.password = password;
        this.rol = rol;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public void makeUser(User u){
        u.setRol("user");
    }
}
