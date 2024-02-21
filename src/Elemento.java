public abstract class Elemento {
    public ArrayList<Asiento> getAsientos(Elfo ee);
    public ArrayList<String> getComodidades();
    public int getCantidadAsientos();
    public Elemento getCopiaRestringida(Buscador bb);
}