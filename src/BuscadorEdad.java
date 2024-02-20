public class BuscadorEdad extends Buscador {
    private int edadBuscada;

    public BuscadorEdad(int eb) {
        this.edadBuscada = eb;
    }

    @Override
    public boolean cumple(Elfo ee) {
        return ee.getEdad() < this.edadBuscada;
    }
}