package AulaCollections;

import java.util.ArrayList;
import java.util.List;

public class ExemploList {
    public static void main(String[] args) {
        //Dada uma lista com sete notas [7, 8.5, 9.3, 5, 7, 0, 3.6] de um aluno faça:

        System.out.println("Crie uma lista e adicione as sete notas: ");
        List<Double> notas = new ArrayList<>();
        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.6);

        System.out.println(notas);

        System.out.println("Exiba a posição da nota 5.0: ");
        //Para exibir a posição de um elemento dentro de uma lista, usa o método abaixo:
        System.out.println("R: O numero 5.0 está na posição: " + notas.indexOf(5.0));
        System.out.println("----------------------------------------------------------------");
        System.out.println("Adicione na lista a nota 8.0 na posição 4: ");
        //Para adicionar um elemento na lista usa-se o método abaixo:
        notas.add(4, 8d);
        System.out.println(notas);

        System.out.println("Substitua a nota 5.0 pela nota 6.0: ");
        //método de substituição logo abaixo:
        notas.set(notas.indexOf(5.0), 6.0);
        System.out.println(notas);

        System.out.println("Confira se a nota 5.0 está na lista: " + notas.contains(5.0));

        /*System.out.println("Exiba todas as notas na ordem em que foram informadas: ");
        for (Double nota : notas) System.out.println(nota);*/






    }
}
