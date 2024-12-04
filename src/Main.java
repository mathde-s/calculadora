import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double resultado = 0;

        System.out.println("digite dois números");
        double number1 = scanner.nextDouble();
        double number2 = scanner.nextDouble();

        System.out.println("agora escolha uma operação para ser feita");
        System.out.println("1: adição | 2: subtração | 3: multiplicação | 4: divisão");
        int operador = scanner.nextInt();
        switch (operador){
            case 1:
                resultado = number1 + number2;
                break;
            case 2:
                resultado = number1 - number2;
                break;
            case 3:
                resultado = number1 * number2;
                break;
            case 4:
                if (number2 == 0)
                    System.out.println("não é possivel fazer a divisão por 0");
                else
                    resultado = number1 / number2;
                break;
            default:
                System.out.println("opção de operação inválida");
                return;
        }
        System.out.println("o resultado da operação é: "+ resultado);
    }
}