import java.util.Scanner;

public class AppSystem {

    public static void runSystem(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite valor para simulação: ");
        double valorBase = scanner.nextDouble();
        System.out.println("Qual tipo de simulação: \n Digite 1 para IPVA \n 2 Para IR");
        int opcao = scanner.nextInt();

        CalculadoraDeImposto calculadora;
        if (opcao == 1){
            calculadora = new CalculadoraDeIPVA();
        } else if (opcao == 2) {
            calculadora = new CalculadoraDeIR();
        }else {
            throw new RuntimeException("Opção invalida");
        }

        simularImposto(valorBase, calculadora);
    }


    private static void simularImposto(Double valorBaseDaSimulacao, CalculadoraDeImposto calculadoraDeImposto){
        double resultado = calculadoraDeImposto.calcularImposto(valorBaseDaSimulacao);

        String texto = "O valor simulado do calculo é: " + resultado;

        System.out.println(texto);
    }
}
