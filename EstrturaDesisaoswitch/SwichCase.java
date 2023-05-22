package EstrturaDesisaoswitch;

import java.util.Scanner;

public class SwichCase {
    Scanner sc = new Scanner(System.in);
    public void letra() {
        System.out.println("informe uma letra");
        String letraDigitada = sc.nextLine();
        switch(letraDigitada){
            case "a":
            System.out.println(letraDigitada+" é vogal");
            break;
            case "e":
            System.out.println(letraDigitada+" é vogal");
            break;
            case "i":
            System.out.println(letraDigitada+" é vogal");
            break;
            case "o":
            System.out.println(letraDigitada+" é vogal");
            break;
            case "u":
            System.out.println(letraDigitada+" é vogal");
            break;
            default:System.out.println(letraDigitada+" é consoante");
            break;
        }

    }
    public void mes() {
        System.out.println("informe o numero do mes");
        int mesdigitado = sc.nextInt();
        switch(mesdigitado){
            case 1:
            System.out.println(mesdigitado+" o mês é janeiro");
        break;
        case 2:
            System.out.println(mesdigitado+" o mês é fevereriro");
        break;
        case 3:
            System.out.println(mesdigitado+" o mês é março");
        break;
        case 4:
            System.out.println(mesdigitado+" o mês é abril");
        break;
        case 5:
            System.out.println(mesdigitado+" o mês é maio");
        break;
        case 6:
            System.out.println(mesdigitado+" o mês é junho");
        break;
        case 7:
        System.out.println(mesdigitado+" o mês é julho");
    break;
    case 8:
    System.out.println(mesdigitado+" o mês é agosto");
    break;
    case 9:
    System.out.println(mesdigitado+" o mês é setembro");
    break;
    case 10:
    System.out.println(mesdigitado+" o mês é outubro");
    break;
    case 11:
    System.out.println(mesdigitado+" o mês é novembro");
    break;
    case 12:
    System.out.println(mesdigitado+" o mês é dezembro");
    break;
    default: System.out.println(mesdigitado+" esse mês nâo existe");
 

    }
}
public void name() {
    System.out.println("informe o numero do mes");
    int mesdigitado = sc.nextInt();
    String nomemes = "";
    switch(mesdigitado){
    case 1: nomemes = "janeiro";
    break;
    default: nomemes = "esse mes nao existe";
    break;
    
}
}
}