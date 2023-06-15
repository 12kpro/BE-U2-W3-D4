package maurosimoni.BEU2W3D4.cor;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CorRunner implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        Capitano capitano = new Capitano();
        Maggiore maggiore = new Maggiore();
        Tenente tenente = new Tenente();
        Colonnello colonello = new Colonnello();
        Generale generale = new Generale();

        capitano.setSuperiore(maggiore);
        maggiore.setSuperiore(tenente);
        tenente.setSuperiore(colonello);
        colonello.setSuperiore(generale);

        int amount = 2500;
        capitano.verificaRango(amount);
    }
}
