package oo.Calculadora;

public class AplicaçãoCalculadora {

    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();
        int resultadoSoma = calculadora.soma(5,6);
        System.out.println(resultadoSoma);

        int resultadoSubtracao = calculadora.subtracao(5,6);
        System.out.println(resultadoSubtracao);

        int resultadoMultiplicacao = calculadora.multiplicacao(5,6);
        System.out.println(resultadoMultiplicacao);

        int resultadoDivisao = calculadora.divisao(5,6);
        System.out.println(resultadoDivisao);

    }

}
