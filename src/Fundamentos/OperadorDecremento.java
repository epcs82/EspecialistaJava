public class OperadorDecremento {

  public static void main(String[] args) {
    int limiteTentativasLogin = 10;

    //limiteTentativasLogin--;
    //int novoLimiteTentativasLogin = limiteTentativasLogin--;//metodo pós fixada
    int novoLimiteTentativasLogin = --limiteTentativasLogin; //metodo pré fixada

    System.out.println(
      "Limite de tentativas de Login: " + limiteTentativasLogin
    );
    System.out.println(
      "Novo Limite de tentativas de Login: " + limiteTentativasLogin
    );
  }
}
