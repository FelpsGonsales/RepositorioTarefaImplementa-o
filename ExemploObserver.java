// Interface Observer
interface Observer {
    void update(String mensagem);
}

// Classe Subject (Observável)
import java.util.ArrayList;
import java.util.List;

class CanalNotificacao {
    private List<Observer> observadores = new ArrayList<>();

    public void adicionarObservador(Observer observador) {
        observadores.add(observador);
    }

    public void removerObservador(Observer observador) {
        observadores.remove(observador);
    }

    public void notificarObservadores(String mensagem) {
        for (Observer observador : observadores) {
            observador.update(mensagem);
        }
    }
}

// Classe concreta Observer
class Usuario implements Observer {
    private String nome;

    public Usuario(String nome) {
        this.nome = nome;
    }

    @Override
    public void update(String mensagem) {
        System.out.println(nome + " recebeu a mensagem: " + mensagem);
    }
}

// Teste do padrão Observer
public class ObserverTest {
    public static void main(String[] args) {
        CanalNotificacao canal = new CanalNotificacao();

        // Criando usuários (observadores)
        Usuario usuario1 = new Usuario("Alice");
        Usuario usuario2 = new Usuario("Bob");
        Usuario usuario3 = new Usuario("Carlos");

        // Registrando os observadores no canal
        canal.adicionarObservador(usuario1);
        canal.adicionarObservador(usuario2);

        // Enviar notificação
        canal.notificarObservadores("Nova mensagem disponível!");

        System.out.println("\n--- Adicionando mais um usuário ---\n");

        // Adicionando outro observador
        canal.adicionarObservador(usuario3);
        canal.notificarObservadores("Atualização importante no sistema.");

        System.out.println("\n--- Removendo um usuário ---\n");

        // Removendo um observador
        canal.removerObservador(usuario2);
        canal.notificarObservadores("Notificação final do dia.");
    }
}
