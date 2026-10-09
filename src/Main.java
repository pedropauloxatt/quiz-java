import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // ===== 1) CABEÇALHO =====
        Cabecalho cabecalho = new Cabecalho();
        cabecalho.faculdade = "UNIFAN";
        cabecalho.aluno = "Pedro Paulo Xavier Aguiar Teles";
        cabecalho.professor = "Brenno Pimenta da Costa";
        cabecalho.tema = "Programação e Tecnologia";
        cabecalho.escrevaCabecalho();

        // ===== 2) LISTA COM AS 15 QUESTÕES =====
        ArrayList<Questao> questoes = criarQuestoes();

        // ===== 3) APLICAÇÃO DO QUIZ =====
        int acertos = 0;

        for (int i = 0; i < questoes.size(); i++) {
            Questao questao = questoes.get(i);

            System.out.println("---------- QUESTÃO " + (i + 1) + " DE " + questoes.size() + " ----------");
            questao.escrevaQuestao();

            String resposta = questao.leiaResposta();

            // isCorreta() mostra se acertou ou errou e retorna true/false
            if (questao.isCorreta(resposta)) {
                acertos++;
            }
        }

        // ===== 4) RESULTADO FINAL =====
        // 100.0 (e não 100) para a divisão ser feita com casas decimais
        double mediaAcerto = (acertos * 100.0) / questoes.size();

        System.out.println("==================================================");
        System.out.println("                RESULTADO FINAL");
        System.out.println("==================================================");
        System.out.println("Questões acertadas: " + acertos + " de " + questoes.size());
        System.out.printf("Média de acerto: %.2f%%%n", mediaAcerto);
        System.out.println();
        System.out.println("Obrigado por participar do Quiz! Até a próxima!");
        System.out.println("==================================================");
    }

    // Cria as 15 questões do Quiz e devolve todas dentro de uma lista
    public static ArrayList<Questao> criarQuestoes() {
        ArrayList<Questao> questoes = new ArrayList<>();

        Questao q1 = new Questao();
        q1.pergunta = "Em Java, qual palavra-chave é usada para criar um novo objeto?";
        q1.opcaoA = "A) class";
        q1.opcaoB = "B) new";
        q1.opcaoC = "C) this";
        q1.opcaoD = "D) static";
        q1.opcaoE = "E) void";
        q1.correta = "B";
        questoes.add(q1);

        Questao q2 = new Questao();
        q2.pergunta = "Qual tipo primitivo do Java armazena apenas os valores verdadeiro (true) ou falso (false)?";
        q2.opcaoA = "A) int";
        q2.opcaoB = "B) String";
        q2.opcaoC = "C) char";
        q2.opcaoD = "D) boolean";
        q2.opcaoE = "E) double";
        q2.correta = "D";
        questoes.add(q2);

        Questao q3 = new Questao();
        q3.pergunta = "O que significa a sigla CPU?";
        q3.opcaoA = "A) Central Processing Unit";
        q3.opcaoB = "B) Computer Personal Unit";
        q3.opcaoC = "C) Central Program Utility";
        q3.opcaoD = "D) Control Processing User";
        q3.opcaoE = "E) Core Power Unit";
        q3.correta = "A";
        questoes.add(q3);

        Questao q4 = new Questao();
        q4.pergunta = "Qual estrutura de repetição executa o bloco de código pelo menos uma vez antes de testar a condição?";
        q4.opcaoA = "A) for";
        q4.opcaoB = "B) while";
        q4.opcaoC = "C) do-while";
        q4.opcaoD = "D) if";
        q4.opcaoE = "E) switch";
        q4.correta = "C";
        questoes.add(q4);

        Questao q5 = new Questao();
        q5.pergunta = "Qual classe do Java armazena elementos em uma lista de tamanho dinâmico?";
        q5.opcaoA = "A) int[]";
        q5.opcaoB = "B) String";
        q5.opcaoC = "C) Scanner";
        q5.opcaoD = "D) Math";
        q5.opcaoE = "E) ArrayList";
        q5.correta = "E";
        questoes.add(q5);

        Questao q6 = new Questao();
        q6.pergunta = "Quantos bits existem em um byte?";
        q6.opcaoA = "A) 4";
        q6.opcaoB = "B) 8";
        q6.opcaoC = "C) 16";
        q6.opcaoD = "D) 32";
        q6.opcaoE = "E) 64";
        q6.correta = "B";
        questoes.add(q6);

        Questao q7 = new Questao();
        q7.pergunta = "Qual método é o ponto de partida da execução de um programa Java?";
        q7.opcaoA = "A) start()";
        q7.opcaoB = "B) run()";
        q7.opcaoC = "C) init()";
        q7.opcaoD = "D) main()";
        q7.opcaoE = "E) execute()";
        q7.correta = "D";
        questoes.add(q7);

        Questao q8 = new Questao();
        q8.pergunta = "Qual sistema de numeração utiliza apenas os dígitos 0 e 1?";
        q8.opcaoA = "A) Binário";
        q8.opcaoB = "B) Decimal";
        q8.opcaoC = "C) Octal";
        q8.opcaoD = "D) Hexadecimal";
        q8.opcaoE = "E) Romano";
        q8.correta = "A";
        questoes.add(q8);

        Questao q9 = new Questao();
        q9.pergunta = "Na Programação Orientada a Objetos, como se chama o \"molde\" usado para criar objetos?";
        q9.opcaoA = "A) Método";
        q9.opcaoB = "B) Atributo";
        q9.opcaoC = "C) Classe";
        q9.opcaoD = "D) Variável";
        q9.opcaoE = "E) Pacote";
        q9.correta = "C";
        questoes.add(q9);

        Questao q10 = new Questao();
        q10.pergunta = "Qual é o resultado da expressão 10 % 3 em Java?";
        q10.opcaoA = "A) 0";
        q10.opcaoB = "B) 3";
        q10.opcaoC = "C) 3.33";
        q10.opcaoD = "D) 30";
        q10.opcaoE = "E) 1";
        q10.correta = "E";
        questoes.add(q10);

        Questao q11 = new Questao();
        q11.pergunta = "Qual memória do computador é volátil, ou seja, perde os dados quando o computador é desligado?";
        q11.opcaoA = "A) HD";
        q11.opcaoB = "B) SSD";
        q11.opcaoC = "C) Pen drive";
        q11.opcaoD = "D) Memória RAM";
        q11.opcaoE = "E) DVD";
        q11.correta = "D";
        questoes.add(q11);

        Questao q12 = new Questao();
        q12.pergunta = "Qual classe do Java é usada neste projeto para ler a resposta digitada pelo usuário?";
        q12.opcaoA = "A) Scanner";
        q12.opcaoB = "B) Math";
        q12.opcaoC = "C) String";
        q12.opcaoD = "D) ArrayList";
        q12.opcaoE = "E) Random";
        q12.correta = "A";
        questoes.add(q12);

        Questao q13 = new Questao();
        q13.pergunta = "Qual operador do Java verifica se dois valores de tipo primitivo são iguais?";
        q13.opcaoA = "A) =";
        q13.opcaoB = "B) !=";
        q13.opcaoC = "C) ==";
        q13.opcaoD = "D) =>";
        q13.opcaoE = "E) :=";
        q13.correta = "C";
        questoes.add(q13);

        Questao q14 = new Questao();
        q14.pergunta = "Qual empresa criou a linguagem Java, lançada em 1995?";
        q14.opcaoA = "A) Microsoft";
        q14.opcaoB = "B) Google";
        q14.opcaoC = "C) Apple";
        q14.opcaoD = "D) IBM";
        q14.opcaoE = "E) Sun Microsystems";
        q14.correta = "E";
        questoes.add(q14);

        Questao q15 = new Questao();
        q15.pergunta = "Qual protocolo é usado para acessar sites de forma segura, com criptografia?";
        q15.opcaoA = "A) FTP";
        q15.opcaoB = "B) HTTPS";
        q15.opcaoC = "C) SMTP";
        q15.opcaoD = "D) SSH";
        q15.opcaoE = "E) DNS";
        q15.correta = "B";
        questoes.add(q15);

        return questoes;
    }
}
