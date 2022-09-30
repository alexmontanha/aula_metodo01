
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Média das notas da sala");

        calculaMediaImprime(20, 18, 16, 35, 1);
        calculaMediaImprime(19, 28, 45, 55, 2);
        calculaMediaImprime(0, 0, 0, 0, 0);
    }

    public static void calculaMediaImprime(double nota1, double nota2, double nota3, double nota4, int grupo) throws Exception {
        double media = calculaMedia(nota1, nota2, nota3, nota4);
        imprime(media, grupo);
    }

    public static void imprime(double media, int grupo) {
        System.out.println("A média do grupo " + grupo +": " + media);
    }

    public static double calculaMedia(double nota1, double nota2, double nota3, double nota4) {
        return (nota1 + nota2 + nota3 + nota4)/4;
    }

}
