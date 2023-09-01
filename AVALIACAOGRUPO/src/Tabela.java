import javax.swing.JFrame;
import javax.swing.JTabbedPane;

public class Tabela extends JTabbedPane {
    public Tabela() {
        super();
        this.add("Calculadora 1",new Calculadora1());
        this.add("Calculadora 2",new Calculadora2());
        this.add("Calculadora 3",new Calculadora3());
    }
}
