public class Main {
    public static void main(String[] args) {
        System.out.println("Exercício 1:");
        String text1 = "42 = A resposta para a vida, para o universo e para tudo o mais";
        String text2 = "42 = A resposta para a vida, para o universo e para tudo o mais";

        if(text1.equals(text2)){
            System.out.println("Os textos são iguais");
        } else {
            System.out.println("Os texto não são iguais");
        }

        System.out.println("-------------------------------------------------");
        System.out.println("Exercício 2:");
        Integer num1, num2;

        num1 = 69;
        num2 = 70;

        if(num1.compareTo(num2) > 0){
            System.out.println("O número " + num1 + " é maior do que o " + num2);
        } else if(num1.equals(num2)) {
            System.out.println("O número " + num1 + " é igual a " + num2);
        } else {
            System.out.println("O número " + num1 + " é menor do que o " + num2);
        }
    }
}