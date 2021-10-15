
package ejerciciogit.Entidades;


public class Quirquincho {
    
   

    private String nombre;
    private int edad;
    private boolean cola;
    private String raza;
    private String nombreDuenio;

        public Quirquincho() {
        }

        public Quirquincho(String nombre, int edad, boolean cola, String raza, String nombreDuenio) {
            this.nombre = nombre;
            this.edad = edad;
            this.cola = cola;
            this.raza = raza;
            this.nombreDuenio = nombreDuenio;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public int getEdad() {
            return edad;
        }

        public void setEdad(int edad) {
            this.edad = edad;
        }

        public boolean isCola() {
            return cola;
        }

        public void setCola(boolean cola) {
            this.cola = cola;
        }

        public String getRaza() {
            return raza;
        }

        public void setRaza(String raza) {
            this.raza = raza;
        }

        public String getNombreDuenio() {
            return nombreDuenio;
        }

        public void setNombreDuenio(String nombreDuenio) {
            this.nombreDuenio = nombreDuenio;
        }

        @Override
        public String toString() {
            return "Quirquincho{" + "nombre=" + nombre + ", edad=" + edad + ", cola=" + cola + ", raza=" + raza + ", nombreDuenio=" + nombreDuenio + '}';
        }
    }

      
    

