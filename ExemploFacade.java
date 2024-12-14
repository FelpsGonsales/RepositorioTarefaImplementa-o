// Sem Facade
// Subsistemas
class Tela {
    public void abaixar() {
        System.out.println("Abaixando a tela...");
    }

    public void levantar() {
        System.out.println("Levantando a tela...");
    }
}

class Projetor {
    public void ligar() {
        System.out.println("Ligando o projetor...");
    }

    public void desligar() {
        System.out.println("Desligando o projetor...");
    }
}

class SistemaDeSom {
    public void ligar() {
        System.out.println("Ligando o sistema de som...");
    }

    public void ajustarVolume(int nivel) {
        System.out.println("Ajustando o volume para: " + nivel);
    }

    public void desligar() {
        System.out.println("Desligando o sistema de som...");
    }
}

// Com Facade
class CinemaFacade {
    private Tela tela;
    private Projetor projetor;
    private SistemaDeSom som;

    public CinemaFacade() {
        this.tela = new Tela();
        this.projetor = new Projetor();
        this.som = new SistemaDeSom();
    }

    public void iniciarSessao() {
        System.out.println("Preparando para iniciar a sessão...");
        tela.abaixar();
        projetor.ligar();
        som.ligar();
        som.ajustarVolume(5);
        System.out.println("Sessão iniciada!");
    }

    public void encerrarSessao() {
        System.out.println("Encerrando a sessão...");
        som.desligar();
        projetor.desligar();
        tela.levantar();
        System.out.println("Sessão encerrada!");
    }
}

// Teste do padrão Facade
public class CinemaTest {
    public static void main(String[] args) {
        CinemaFacade cinema = new CinemaFacade();

        // Iniciar a sessão de cinema
        cinema.iniciarSessao();

        System.out.println("\n--- Algum tempo depois ---\n");

        // Encerrar a sessão de cinema
        cinema.encerrarSessao();
    }
}
