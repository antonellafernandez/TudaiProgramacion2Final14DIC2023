public class Vagon extends Elemento {
    private ArrayList<Asiento> asientos;

    public Vagon(String nn) {
        super(nn);
        this.asientos = new ArrayList<Asiento>;
    }

    public ArrayList<Asiento> getAsientos() {
        return new ArrayList<Asiento>(this.asientos);
    }

    public void addAsiento(Asiento aa) {
        if (!this.asientos.contains(aa)) {
            this.asientos.add(aa);
        }
    }

    @Override
    public ArrayList<Asiento> buscarAsientos(Buscador bb, Elfo ee) {
        ArrayList<Asiento> salida = new ArrayList<Asiento>;

        for (Asiento aa : this.asientos) {
            if (bb.cumple(ee) && aa.getLibre()) {
                salida.add(aa);
            }
        }
        
        return salida;
    }

    @Override
    public ArrayList<String> getComodidades() {
        ArrayList<String> salida = new ArrayList<String>;

        for (Asiento aa : this.asientos) {
            for (String comodidad : aa.getComodidades()) {
                if (!salida.contains(comodidad)) {
                    salida.add(comodidad);
                }
            }
        }

        return salida;
    }

    @Override
    public int getCantidadAsientos() {
        return this.asientos.size();
    }

    @Override
    public Elemento getCopiaRestringida(Elfo ee) {
        
    }
}