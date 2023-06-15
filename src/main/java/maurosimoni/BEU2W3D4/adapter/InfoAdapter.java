package maurosimoni.BEU2W3D4.adapter;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class InfoAdapter implements DataSource{
    private Info info;

    public InfoAdapter(Info info) {
        this.info = info;
    }

    @Override
    public String getNomeCompleto() {
        return info.getNome() + " " + info.getCognome();
    }

    @Override
    public int getEta() {
        return (int) ChronoUnit.YEARS.between(info.getDataDiNascita(), LocalDate.now());
    }
}
