package maurosimoni.BEU2W3D4.adapter;

public class UserData {
    private String nomeCompleto;
    private int eta;
    public void getData(DataSource ds) {
        nomeCompleto = ds.getNomeCompleto ();
        eta = ds.getEta();
        System.out.println(nomeCompleto + " ha " + eta + " anni");
    }
}
