public class Asiento extends Elemento {
    private int id;
    private ArrayList<String> comodidades;
    private boolean libre;

    public Asiento(int ii) {
        this.id = ii;
        this.comodidades = new ArrayList<String>;
        this.libre = true;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int ii)) {
        this.id = ii;
    }

    @Override
    public ArrayList<Asiento> buscarAsientos(Buscador bb, Elfo ee) {
        ArrayList<Asiento> salida = new ArrayList<Asiento>;

        if (bb.cumple(ee) && this.libre) {
            salida.add(this);
        }

        return salida;
    }

    @Override
    public ArrayList<String> getComodidades() {
        return new ArrayList<String>(this.comodidades);
    }

    public void addComodidad(String pp) {
        if (!this.comodidades.contains(pp)) {
            this.comodidades.add(pp);
        }
    }

    public boolean getLibre() {
        return this.libre;
    }

    public void setLibre() {
        if (this.libre) {
            this.libre = false;
        } else {
            this.libre = true;
        }
    }

    @Override
    public int getCantidadAsientos() {
        return 1;
    }
}
