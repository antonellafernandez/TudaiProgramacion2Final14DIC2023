public abstract class Elemento {
    private String nombre;

    public Elemento(String nn) {
        this.nombre = nn;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nn) {
        this.nombre = nn;
    }

    public ArrayList<Asiento> buscarAsientos(Buscador bb, Elfo ee);
    public ArrayList<String> getComodidades();
    public int getCantidadAsientos();
    public Elemento getCopiaRestringida(Elfo ee);
}