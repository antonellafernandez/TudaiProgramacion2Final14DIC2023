public class BuscadorNOT extends Buscador {
    private Buscador bb;

    public BuscadorOR(Buscador bb) {
        this.bb = bb;
    }

    @Override
    public boolean cumple(Elfo ee) {
        return !bb.cumple(ee);
    }
}