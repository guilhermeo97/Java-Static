public class Personagem {
    protected int cons;
    protected int stre;
    protected int inte;
    protected int vidaMaxima;
    protected int vidaAtual;

    protected Personagem(){
        System.out.println("Personagem criado com o construtor (no-args)");
    }

    public Personagem(int cons, int stre, int inte) {
        System.out.println("Personagem criado com o construtor (cons, stre, inte)");
        this.cons = cons;
        this.stre = stre;
        this.inte = inte;
        vidaMaxima = cons * 2;
        vidaAtual = cons * 2;
    }

    public int getVidaMaxima() {
        return vidaMaxima;
    }

    public void setVidaMaxima(int vidaMaxima) {
        this.vidaMaxima = vidaMaxima;
    }

    public void tipo(){
        System.out.println("Personagem");
    }

    
}

class Mago extends Personagem{

    public Mago(int cons, int stre, int inte) {
        //ruim
        //super((int)(cons * 1.8 / 2), stre, inte); //Personagem(10, 10, 10);
        //ruim
        // this.vidaMaxima = (int)(cons * 1.8);
        // this.vidaAtual = (int)(cons * 1.8);

        super();
        this.cons = cons;
        this.stre = stre;
        this.inte = inte;
        this.vidaMaxima = (int)(cons * 1.8);
        this.vidaAtual = (int)(cons * 1.8);

        System.out.println("Mago criado com o construtor (cons, stre, inte)");
    }

    @Override
    public void tipo() {
        super.tipo();
        System.out.println("Mago");
    }
}
