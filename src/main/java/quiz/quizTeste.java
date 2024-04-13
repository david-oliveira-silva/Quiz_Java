package quiz;

import java.util.Scanner;

public class quizTeste {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        cabecalho cabecalho1 = new cabecalho();
        cabecalho1.setNome("David Oliveira");
        cabecalho1.setIdade(19);
        cabecalho1.setCurso("Engenharia de Software");
        cabecalho1.escreverCabecalho();

        int acertos = 0;



        perguntas perguntas1 = new perguntas();

        perguntas1.setPerguntas("Qual e o maior campeao da copa do brasil");
        perguntas1.setOp1("a-)flamengo");
        perguntas1.setOp2("b-)São paulo");
        perguntas1.setOp3("c-)Cruzeiro");
        perguntas1.setOp4("d-)Gremio");
        perguntas1.escrevePerguntas();
        perguntas1.getResposta();
        String resposta = leia.nextLine();
        perguntas1.setResposta(resposta);
        perguntas1.opcaoCorreta("c");

        if ( resposta.equals(perguntas1.getCorreta())) {
            acertos++;
            System.out.println("acertos : " + acertos);
        }

        perguntas perguntas2 = new perguntas();

        perguntas2.setPerguntas("Qual e o maior campeao da copa da copa do mundo ?");
        perguntas2.setOp1("a-)Brasil");
        perguntas2.setOp2("b-)Espanha");
        perguntas2.setOp3("c-)França");
        perguntas2.setOp4("d-)Alemanha");
        perguntas2.escrevePerguntas();
        perguntas2.getResposta();
        String resposta2 = leia.nextLine();
        perguntas2.setResposta(resposta2);
        perguntas2.opcaoCorreta(resposta2);
        if ( resposta2.equals(perguntas2.getCorreta())) {
            acertos++;
            System.out.println("acertos : " + acertos);


        }



        perguntas perguntas3 = new perguntas();

        perguntas3.setPerguntas("Qual e o jogar com mais bola de ouro ?");
        perguntas3.setOp1("a-)Pele");
        perguntas3.setOp2("b-)Cristiano Ronaldo");
        perguntas3.setOp3("c-)Neymar");
        perguntas3.setOp4("d-)Messi");
        perguntas3.escrevePerguntas();
        perguntas3.getResposta();
        String resposta3 = leia.nextLine();
        perguntas3.setResposta(resposta3);
        perguntas3.opcaoCorreta("d");

        if ( resposta3.equals(perguntas3.getCorreta())) {
            acertos++;
            System.out.println("acertos : " + acertos);

        }

        perguntas perguntas4 = new perguntas();

        perguntas4.setPerguntas("Qual e o SEGUNDO time com mais champions league ?");
        perguntas4.setOp1("a-)Real madrid");
        perguntas4.setOp2("b-)Barcelona");
        perguntas4.setOp3("c-)Milan");
        perguntas4.setOp4("d-)PSG");
        perguntas4.escrevePerguntas();
        perguntas4.getResposta();
        String resposta4 = leia.nextLine();
        perguntas4.setResposta(resposta4);
        perguntas4.opcaoCorreta("c");

        if ( resposta4.equals(perguntas4.getCorreta())) {
            acertos++;
            System.out.println("acertos : " + acertos);

        }

        System.out.println("  ");
        System.out.println("FIM DO QUIZ========================================================");
        System.out.println("numero total de acertos : " + acertos);
    }
}
