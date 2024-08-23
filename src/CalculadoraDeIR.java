public class CalculadoraDeIR implements CalculadoraDeImposto{

    private double taxaMinima = 0.05;
    private double taxaMaxima = 0.25;

    @Override
    public double calcularImposto(double valor){
        if(valor <= 1412){
            return (valor*taxaMinima/100);
        }
        return (valor*taxaMaxima/100);
    }
}
