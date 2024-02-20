public class BuscadorPreferencia extends Buscador {
    private String preferenciaBuscada;

    public BuscadorPreferencia(String pb) {
        this.preferenciaBuscada = pb;
    }

    @Override
    public boolean cumple(Elfo ee) {
        return ee.getPreferencias().contains(this.preferenciaBuscada);
    }
}