package POOHeranca;

public class App {
    public static void main(String[] args) {
        Quadrado Figura1 = new Quadrado(6);
        System.out.println(" area= "+Figura1.getArea()+" perimetro= "+Figura1.getPerimetro()+" "+Figura1.getNomeFigura());
        
        Retangulo figura2 = new Retangulo(10, 5);
        System.out.println(" area= "+figura2.getArea()+" perimetro= "+figura2.getPerimetro()+" "+figura2.getNomeFigura());

        Trapezio Figura3 = new Trapezio(4, 10, 8, 5, 5);
        System.out.println(" area= "+Figura3.getArea()+" perimetro= "+Figura3.getPerimetro()+" "+Figura3.getNomeFigura());

    }
}
