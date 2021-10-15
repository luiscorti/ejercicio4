/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciogit.Entidades;

/**
 *
 * @author luisc
 */
public class Elefante {
    


    
    private String id;
    private String nombre;
    private Integer edad;
    private Integer peso;
    private String raza;

    public Elefante() {
    }

    public Elefante(String id, String nombre, Integer edad, Integer peso, String raza) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.raza = raza;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "Elefante{" + "id=" + id + ", nombre=" + nombre + ", edad=" + edad + ", peso=" + peso + ", raza=" + raza + '}';
    }

    
    
    
}


