public class ElementoCompuesto extends Elemento {
    private String nombre;
    private ArrayList<Elemento> elems;

    public ElementoCompuesto(String nn) {
        this.nombre = nn;
        this.elems = new ArrayList<Elemento>;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nn) {
        this.nombre = nn;
    }

    public ArrayList<ELemento> getElems() {
        return new ArrayList<Elemento>(this.elems);
    }

    public void addElem(Elemento ee) {
        this.elems.add(ee);
    }

    @Override
    public ArrayList<Asiento> getAsientos(Elfo ee) {
        ArrayList<Asiento> salida = new ArrayList<Asiento>;

        for (Elemento ee : this.elems) {
            salida.addAll(ee.getAsientos(ee));
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
    public Elemento getCopiaRestringida(Buscador bb) {
        ArrayList<Elemento> copiaElementos = new ArrayList<Elemento>;

        for (Elemento ee : this.elems) {
            Elemento eCopia = ee.getCopiaRestringida(bb);

            if (eCopia != null) {
                copiaElementos.add(eCopia);
            }
        }

        if (!copiaElementos.isEmpty()) {
            Elemento salida = new ElementoCompuesto(this.getNombre());

            for (Elemento ee : copiaElementos) {
                salida.addElem(ee);
            }

            return salida;
        }
     
        return null;
    }
}