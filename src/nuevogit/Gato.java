

package nuevogit;

/**
 *
 * @author Tomi
 */
public class Gato {
    private String color;
    private String raza;
    private String edad;
    private String peso;

    public Gato() {
    }

    public Gato(String color, String raza, String edad, String peso) {
        this.color = color;
        this.raza = raza;
        this.edad = edad;
        this.peso = peso;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }
    
    

}
