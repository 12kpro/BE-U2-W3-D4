package maurosimoni.BEU2W3D4.adapter;

import maurosimoni.BEU2W3D4.composite.Libro;
import maurosimoni.BEU2W3D4.composite.Pagina;
import maurosimoni.BEU2W3D4.composite.Sezione;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Component
public class AdapterRunner implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        Info info = new Info();
        info.setNome("Mauro");
        info.setCognome("Simoni");
        info.setDataDiNascita(LocalDate.of(1979, 4, 10));
        DataSource dataSource = new InfoAdapter(info);
        UserData userData = new UserData();
        userData.getData(dataSource);

    }
}
