import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("Matrix");
        meuFilme.setAnoDeLancamento(2001);
        meuFilme.setDuracaoEmMinutos(150);

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(10);
        meuFilme.avalia(9);

        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacao());
        System.out.println(meuFilme.pegaMedia());

        Serie lost = new Serie();
        lost.setNome("LOST");
        lost.setAnoDeLancamento(2001);
        lost.exibeFichaTecnica();
        lost.setDuracaoEmMinutos(10);
        lost.setEpisodiosPorTemporada(12);

    }
}