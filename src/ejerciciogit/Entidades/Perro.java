package ejerciciogit.Entidades;

import java.util.Objects;

public class Perro {

    private String nombre;
    private int edad;
    private boolean cola;
    private String raza;
    private String nombreDuenio;

    public Perro() {
    }

    public Perro(String nombre, int edad, boolean cola, String raza, String nombreDuenio) {
        this.nombre = nombre;
        this.edad = edad;
        this.cola = cola;
        this.raza = raza;
        this.nombreDuenio = nombreDuenio;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isCola() {
        return this.cola;
    }

    public boolean getCola() {
        return this.cola;
    }

    public void setCola(boolean cola) {
        this.cola = cola;
    }

    public String getRaza() {
        return this.raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getNombreDuenio() {
        return this.nombreDuenio;
    }

    public void setNombreDuenio(String nombreDuenio) {
        this.nombreDuenio = nombreDuenio;
    }

    public Perro nombre(String nombre) {
        setNombre(nombre);
        return this;
    }

    public Perro edad(int edad) {
        setEdad(edad);
        return this;
    }

    public Perro cola(boolean cola) {
        setCola(cola);
        return this;
    }

    public Perro raza(String raza) {
        setRaza(raza);
        return this;
    }

    public Perro nombreDuenio(String nombreDuenio) {
        setNombreDuenio(nombreDuenio);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Perro)) {
            return false;
        }
        Perro perro = (Perro) o;
        return Objects.equals(nombre, perro.nombre) && edad == perro.edad && cola == perro.cola
                && Objects.equals(raza, perro.raza) && Objects.equals(nombreDuenio, perro.nombreDuenio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, edad, cola, raza, nombreDuenio);
    }

    @Override
    public String toString() {
        return "{" + " nombre='" + getNombre() + "'" + ", edad='" + getEdad() + "'" + ", cola='" + isCola() + "'"
                + ", raza='" + getRaza() + "'" + ", nombreDuenio='" + getNombreDuenio() + "'" + "}";
    }

}