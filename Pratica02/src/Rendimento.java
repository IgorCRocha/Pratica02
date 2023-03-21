import java.util.Scanner;
public class Rendimento {
    private float invInicial;
    private float txRendimento;
    private int numMes;
    private static float calcular;

    public Rendimento(){}

    public Rendimento(float invInicial, float txRendimento, int numMes) {
        this.invInicial = invInicial;
        this.txRendimento = txRendimento;
        this.numMes = numMes;
    }

    public float getinvInicial() { return invInicial; }

    public float getTxRendimento() {return txRendimento; }

    public int getNumMes() { return numMes; }

    public void setinvInicial(float invInicial) { this.invInicial = invInicial; }

    public void setNumMes(int numMes) { this.numMes = numMes; }

 public void calc (float calcular){ calcular =(invInicial* txRendimento)*numMes;
     System.out.println("Valor final é:"+ calcular);}

    public static void main(String[] args) {
        Rendimento rendimento = new Rendimento();
        Scanner scanner = new Scanner (System.in);

        System.out.println("Informe o investimento inicial:");
        float inv =scanner.nextFloat();
        rendimento.setinvInicial(inv);
        System.out.println("Informe a quntidade de meses:");
        int mes = scanner.nextInt();
        rendimento.setNumMes(mes);



    }


}
