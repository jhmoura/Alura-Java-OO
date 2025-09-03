public class Filme {
    String nome;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    double somaDasAvaliacoes;
    int totalDeAvaliacao;
    int duracaoEmMinutos;

    void exibeFichaTecnica(){
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lancamento: " + anoDeLancamento);

    }

    void avalia(double nota){
        totalDeAvaliacao++;
        somaDasAvaliacoes += nota;
    }

    double pegaMedia(){
        return somaDasAvaliacoes / totalDeAvaliacao;
    }
}
