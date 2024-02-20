public class Elfo {
    private String nombre;
    private int edad;
    private ArrayList<String> preferencias;
    
    public Elfo(String nn, int ee) {
        this.nombre = nn;
        this.edad = ee;
        this.preferencias = new ArrayList<String>;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nn) {
        this.nombre = nn;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int ee) {
        this.edad = ee;
    }
    
    public ArrayList<String> getPreferencias() {
        return new ArrayList<String>(this.preferencias);
    }

    public void addPreferencia(String pp) {
        if (!this.preferencias.contains(pp)) {
            this.preferencias.add(pp);
        }
    }
}