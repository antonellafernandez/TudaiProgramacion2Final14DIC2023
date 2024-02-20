public class Agrupacion extends Elemento {
    private ArrayList<Elemento> elems;

    public Agrupacion(String nn) {
        super(nn);
        this.elems = new ArrayList<Elemento>;
    }

    public ArrayList<ELemento> getElems() {
        return new ArrayList<Elemento>(this.elems);
    }

    public void addElem(Elemento ee) {
        this.elems.add(ee);
    }

    @Override
    public ArrayList<Asiento> buscarAsientos(Buscador bb, Elfo ee) {
        ArrayList<Asiento> salida = new ArrayList<Asiento>;

        for (Elemento ee : this.elems) {
            salida.addAll(ee.getAsientos(bb, ee));
        }

        return salida;
    }

    @Override
    public ArrayList<String> getComodidades() {
        ArrayList<String> salida = new ArrayList<String>;

        for (Elemento ee : this.elems) {
            for (String comodidad : ee.getComodidades()) {
                if (!salida.contains(comodidad)) {
                    salida.add(comodidad);
                }
            }
        }

        return salida;
    }

    @Override
    public int getCantidadAsientos() {
        int salida = 0;

        for (Elemento ee : this.elems) {
            salida += ee.getCantidadAsientos();
        }

        return salida;
    }

    @Override
    public Elemento getCopiaRestringida(Elfo ee) {
        
    }
}