import br.com.fiap.fakekabum.model.Computador;
import br.com.fiap.fakekabum.model.Fabricante;
import br.com.fiap.fakekabum.model.Monitor;

public class Main {
    public static void main(String[] args) {
        Fabricante fab1 = new Fabricante("Dell", "compre@dell.com.br");
        Monitor moni = new Monitor("32 wide", 1399.99, fab1);
        Computador c = new Computador(fab1, "i7", "ASUS AORUS WIFI");
        c.setMonitor(moni);
        System.out.println(c);
    }
}