package apps;
import java.util.Random;

public class AparelhoTelefonico {
    public static void ligar(int telefone){
        System.err.println("ligando para " + telefone);
        Random random = new Random();
        int sorteio = random.nextInt(2);
        if (sorteio == 1) {
            atender();
        }
        else{
            iniciarCorreioVoz();
        }
    }
    public static void atender(){
        System.err.println("Telefone atendido");
    }
    public static void iniciarCorreioVoz(){
        System.err.println("Caixa postal");
    }
}
