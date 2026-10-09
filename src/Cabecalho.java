// Classe responsável pelas informações do cabeçalho do Quiz.
// É exibida na tela logo no início da execução do programa.
public class Cabecalho {
    String faculdade = "";
    String aluno = "";
    String professor = "";
    String tema = "";

    // Escreve na tela o cabeçalho com faculdade, aluno, professor e tema
    public void escrevaCabecalho(){
        System.out.println("==================================================");
        System.out.println("          QUIZ - PERGUNTAS E RESPOSTAS");
        System.out.println("==================================================");
        System.out.println("Faculdade: " + this.faculdade);
        System.out.println("Aluno:     " + this.aluno);
        System.out.println("Professor: " + this.professor);
        System.out.println("Tema:      " + this.tema);
        System.out.println("==================================================");
        System.out.println();
    }
}
