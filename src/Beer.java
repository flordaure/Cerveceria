public class Beer {

    private String nombre;
    private float contAlc;

    public Beer(String nombre, float contAlc) {
        this.nombre = nombre;
        this.contAlc = contAlc;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getContAlc() {
        return contAlc;
    }

    public void setContAlc(float contAlc) {
        this.contAlc = contAlc;
    }

    @Override
    public String toString() {
        return "Beer{" +
                "nombre='" + nombre + '\'' +
                ", contAlc=" + contAlc +
                '}';
    }
}
