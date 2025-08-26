
public class Main {
    public static void main(String[] args) {
        //Criando objetos da classe Carro
        Carro carroA = new Carro();

        //Preenchendo as popriedades de CarroA
        carroA.cor = "Azul";
        carroA.fabricante = "VW";
        carroA.modelo = "Fusca";
        carroA.preco = 80.000f;
        carroA.kilometragem = 100000;

        //Utilizando os métodos
        carroA.acelerar();
        carroA.frear();


    }
}