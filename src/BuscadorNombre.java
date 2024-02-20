public class BuscadorNombre extends Buscador {
    private String nombreBuscado;

    public BuscadorNombre(String nb) {
        this.nombreBuscado = nb;
    }

    @Override
    public boolean cumple(Elfo ee) {
        return ee.getNombre().equals(this.nombreBuscado);
    }
}