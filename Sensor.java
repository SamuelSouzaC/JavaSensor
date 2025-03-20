package Java21;

import java.util.Random;

public class Sensor {
       private final Random random;

       public Sensor() {
           this.random = new Random();
       }
       public void gerarLeitura(){
            float temperatura = random.nextFloat() * 125;
            float umidade = random.nextFloat() * 100;
            float luminosidade = random.nextFloat() * 100;

            // comando de condição para caso a temperatura esteja acima de 100 a umidade é zerada
           do {
               temperatura = random.nextFloat() * 125;
           } while (temperatura == 100);

           if (temperatura > 99) {
               umidade = 0;
           } else {
               umidade = random.nextFloat() * 100;
           }
            System.out.println("--------------------------");
            System.out.println("Temperatura: " + String.format("%.2f", temperatura) + "°C");
            System.out.println("Umidade: "  + String.format("%.2f", umidade) + "%");
            System.out.println("Luminosidade: " + String.format("%.2f", luminosidade) + "°");
            System.out.println("--------------------------");
       }

}
