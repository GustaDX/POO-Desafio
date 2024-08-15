import java.util.Locale;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;


public class Iphone {
    Timer timer;
    static java.util.Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    public Iphone(int seconds) {
        timer = new Timer();
        timer.schedule(new RemindTask(), seconds*1000);
    }

    class RemindTask extends TimerTask {
        public void run() {
            System.err.println("\n\n\n\n\n\n\n\n\n\n");
            iphoneLigado();
            timer.cancel(); //Terminate the timer thread
        }
    }

    public static void main(String args[]) {
        new Iphone(2);
        System.out.println("Iniciando o Iphone");
    }
    public static void iphoneLigado(){
        System.out.println( "Opções:\n"+
                            "1.Musicas\n"+
                            "2.Navegador\n"+
                            "3.Telefone\n"+
                            "Digite a Opção desejada: "       
        );
        boolean verificacao = false;
        String opcao;
        while (verificacao == false) {
            opcao = scanner.next();
            if (opcao.equals("1")) {
                verificacao = true;
                musicas();
            }
            else if (opcao.equals("2")) {
                verificacao = true;
                navegador();
            }
            else if (opcao.equals("3")) {
                verificacao = true;
                ligar();
            }
            else{
                System.err.println("Opção inexistente, tente novamente\n");
            }
    
            
        }
    
    }
    public static void musicas(){
        System.out.println( "Opções:\n"+
                            "1.tocar\n"+
                            "2.pausar\n"+
                            "3.selecionarMusica\n"+
                            "Digite a Opção desejada: "       
        );
        boolean verificacao = false;
        String opcao;
        while (verificacao == false) {
            opcao = scanner.next();
            if (opcao.equals("1")) {
                verificacao = true;
                apps.ReprodutorMusical.tocar();
                new Iphone(3);
            }
            else if (opcao.equals("2")) {
                verificacao = true;
                apps.ReprodutorMusical.pausar();
                new Iphone(3);
            }
            else if (opcao.equals("3")) {
                verificacao = true;
                String nomeMusica = scanner.next();
                apps.NavegadorInternet.exibirPagina(nomeMusica);
                apps.ReprodutorMusical.selecionarMusica(nomeMusica);
                new Iphone(3);
            }
            else{
                System.err.println("Opção inexistente, tente novamente\n");
            }
    
            
        }
    
    }
    public static void ligar(){
        System.out.println( "Insira o Numero:\n");
        int telefone = scanner.nextInt();
        apps.AparelhoTelefonico.ligar(telefone);
        new Iphone(3);
    }

    public static void navegador(){
        System.out.println( "Opções:\n"+
                            "1.Exibir Pagina\n"+
                            "2.Adicionar Nova Aba\n"+
                            "3.Atualizar Pagina\n"+
                            "Digite a Opção desejada: "       
        );
        boolean verificacao = false;
        String opcao;
        while (verificacao == false) {
            opcao = scanner.next();
            if (opcao.equals("1")) {
                verificacao = true;
                System.out.println( "Insira o URL:\n");
                String URL = scanner.next();
                apps.NavegadorInternet.exibirPagina(URL);
                new Iphone(3);
            }
            else if (opcao.equals("2")) {
                verificacao = true;
                apps.NavegadorInternet.adicionarNovaAba();
                new Iphone(3);
            }
            else if (opcao.equals("3")) {
                verificacao = true;
                apps.NavegadorInternet.atualizarPagina();
                new Iphone(3);
            }
            else{
                System.err.println("Opção inexistente, tente novamente\n");
            }
    
            
        }
    
    }
}