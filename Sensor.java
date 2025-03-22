package Java21;

import java.util.Random;

public class Sensor {
    private final Random random;

    public Sensor() {
        this.random = new Random();
    }

    public void gerarLeitura() {
        float temperatura, umidade, luminosidade;

        // Garante que a temperatura nunca seja exatamente 100°C
        do {
            temperatura = random.nextFloat() * 125;
        } while (temperatura == 100);

        // Se temperatura for maior que 99°C, zera a umidade
        if (temperatura > 99) {
            umidade = 0;
        } else {
            umidade = random.nextFloat() * 100;
        }

        // Gera a luminosidade normalmente
        luminosidade = random.nextFloat() * 100;

        // ----- Controle do Ar-condicionado -----
        String statusAr = (temperatura >= 24) ? "Ligando ar" : "Ar desligado";

        // Exibe os valores no console
        System.out.println("--------------------------");
        System.out.println("Temperatura: " + String.format("%.2f", temperatura) + "°C");
        System.out.println("Umidade: " + String.format("%.2f", umidade) + "%");
        System.out.println("Luminosidade: " + String.format("%.2f", luminosidade) + "°");
        System.out.println(statusAr);
        System.out.println("--------------------------");
    }
}

