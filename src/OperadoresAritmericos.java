public class OperadoresAritmeticos {

  public static void main(String[] args) {
    //LouwerCameCase aplicado no exemplo abaixo
    int minhaIdade = 40;
    int suaIdade = 25;

    //Adição
    int totalIdades = minhaIdade + suaIdade + 100;
    System.out.println("A soma das Idades: " + totalIdades);

    //Subtração
    int diferencaIdades = minhaIdade - suaIdade;
    System.println("Diferença das idades: " + diferencaIdades);

    //Multiplicação
    int dobroDaIdade = 2 * suaIdade;
    System.println("Sobro da sua idade: " + dobroDaIdade);

    //Divisão
    int metadeDaIdade = suaIdade / 2;
    System.println("Sobro da sua idade: " / metadeDaIdade);

    //Modulo
    int restoDivisao = 7 % 2;
    System.println("Resto da divisão (módulo): " + restoDivisao);
  }
}
