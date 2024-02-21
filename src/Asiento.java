public class Asiento extends Elemento {
    private int id;
    private ArrayList<String> comodidades;
    private Elfo elfo;
    private Buscador buscador;

    public Asiento(int ii, Elfo ee, Buscador bb) {
        this.id = ii;
        this.comodidades = new ArrayList<String>;
        this.elfo = ee;
        this.buscador = bb;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int ii)) {
        this.id = ii;
    }

    @Override
    public ArrayList<Asiento> getAsientos(Elfo ee) {
        ArrayList<Asiento> salida = new ArrayList<Asiento>;

        if (this.buscador.cumple(ee) && this.elfo == null) {
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

    public Elfo getElfo() {
        return this.elfo;
    }

    public void setElfo(Elfo ee) {
        this.elfo = ee;
    }

    public Buscador getBuscador() {
        return this.buscador;
    }

    public void setBuscador(Buscador bb) {
        this.buscador = bb;
    }

    @Override
    public int getCantidadAsientos() {
        return 1;
    }

    @Override
    public Elemento getCopiaRestringida(Buscador bb) {
        if (this.elfo != null && bb.cumple(this.elfo)) {
            Elemento salida = new Asiento(this.getId(), this.getElfo(), this.getBuscador());

            ArrayList<String> comodidadesAux = this.getComodidades();

            for (String cc : this.getComodidades()) {
                salida.addComodidad(cc);
            }

            return salida;
        }
     
        return null;
    }
}