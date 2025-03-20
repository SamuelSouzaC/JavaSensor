package Java21;

public class Main {
     public static void main(String[] args) {
         Sensor sensor = new Sensor();

     long tempoAnterior = System.currentTimeMillis();
     while (true) {
         long tempoAtual = System.currentTimeMillis();

         if (tempoAtual - tempoAnterior >= 2000) {

             sensor.gerarLeitura();
             tempoAnterior = tempoAtual;

         }






       }




     }
}
