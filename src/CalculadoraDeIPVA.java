public class CalculadoraDeIPVA implements CalculadoraDeImposto{

    private double taxaDeIpva = 0.35;
    private int periodoEmMeses = 12;

    @Override
    public double calcularImposto(double valor){
        double resultado = valor+(valor*taxaDeIpva/100);
        return resultado;
    }
}
