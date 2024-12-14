// Flyweight
interface Forma {
    void desenhar(int x, int y, String cor);
}

// Classe concreta Flyweight
class Circulo implements Forma {
    private final String tipo = "Círculo"; // Estado intrínseco

    @Override
    public void desenhar(int x, int y, String cor) {
        System.out.println(tipo + " desenhado na posição (" + x + ", " + y + ") com a cor " + cor);
    }
}

// Flyweight Factory
import java.util.HashMap;
import java.util.Map;

class FormaFactory {
    private static final Map<String, Forma> formas = new HashMap<>();

    public static Forma getForma(String tipo) {
        Forma forma = formas.get(tipo);
        if (forma == null) {
            switch (tipo) {
                case "Círculo":
                    forma = new Circulo();
                    formas.put(tipo, forma);
                    break;
                // Outros tipos de formas podem ser adicionados aqui
            }
        }
        return forma;
    }

    public static int getTotalFormas() {
        return formas.size();
    }
}

// Teste do padrão Flyweight
public class FlyweightTest {
    public static void main(String[] args) {
        Forma circulo1 = FormaFactory.getForma("Círculo");
        circulo1.desenhar(10, 20, "Vermelho");

        Forma circulo2 = FormaFactory.getForma("Círculo");
        circulo2.desenhar(30, 40, "Azul");

        Forma circulo3 = FormaFactory.getForma("Círculo");
        circulo3.desenhar(50, 60, "Verde");

        System.out.println("\nTotal de objetos únicos criados: " + FormaFactory.getTotalFormas());
    }
}
