import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Clock;
import java.time.Instant;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class App {
    public static void main(String[] args) throws Exception {
        //FoobarJunior objBar = new FoobarJunior();
        //Mago personagem1 = new Mago(10, 10, 10);
        //System.out.println(personagem1.getVidaMaxima());
        //personagem1.tipo();

        Instant agora = Instant.now();
        System.out.println(agora.toString());
        LocalTime local = LocalTime.now();
        System.out.println(local.toString());

        LocalDate date = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd, MMMM, yyyy");
        System.out.println(formatter.format(date));
    }
}

class Foo{
    private int numero1;
    private int numero2;
    private static int numeroEstatico = 0;
    private final static int NUMEROESTATICO = 7;

    public Foo(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
        numeroEstatico++;
    }

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    public static int getNumeroEstatico() {
        return numeroEstatico;
    }

    public static void setNumeroEstatico(int numeroEstatico) {
        Foo.numeroEstatico = numeroEstatico;
    }

    public static int somaEstatica(int num1, int num2){
        return num1+num2;
    }

    public int soma(int num1, int num2){
        return num1+num2;
    }
    
}