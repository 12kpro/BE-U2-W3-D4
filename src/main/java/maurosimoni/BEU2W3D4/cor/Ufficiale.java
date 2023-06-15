package maurosimoni.BEU2W3D4.cor;

public abstract class Ufficiale {
    protected Ufficiale superiore;
    protected String rango;
    protected int salario;

    public void setSuperiore(Ufficiale superiore) {
        this.superiore = superiore;
    }

    public void verificaRango(int ammontare) {
        if (ammontare <= salario) {
            System.out.println(rango + " percepisce almeno: " + ammontare);
        } else if (superiore != null) {
            superiore.verificaRango(ammontare);
        }
    }
}
