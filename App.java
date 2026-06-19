import java.util.Arrays;

public class App {

    public static void main(String[] args) {
        String[] nomes = {
            "Ana", "Beatriz", "Carlos", "Daniel", "Eduarda", 
            "Fabio", "Gabriela", "Heitor", "Igor", "Julia"
        };

        // 1. Ordem alfabética default
        String[] nomesAlfabeticos = nomes.clone();
        Arrays.sort(nomesAlfabeticos, new AlphabeticalComparator());
        System.out.print("Sort_padrao -> ");
        imprimirComInfo(nomesAlfabeticos, "padrao");

        // 2. Ordem por tamanho da palavra
        String[] nomesPorTamanho = nomes.clone();
        Arrays.sort(nomesPorTamanho, new LengthComparator());
        System.out.print("Sort_tamanho -> ");
        imprimirComInfo(nomesPorTamanho, "tamanho");

        // 3. Ordem pela última letra
        String[] nomesPorUltimaLetra = nomes.clone();
        Arrays.sort(nomesPorUltimaLetra, new LastLetterComparator());
        System.out.print("Sort_ultima_letra -> ");
        imprimirComInfo(nomesPorUltimaLetra, "ultima_letra");
    }

    private static void imprimirComInfo(String[] arr, String criterio) {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            sb.append(s);
            if ("tamanho".equals(criterio)) {
                sb.append(" (").append(s.length()).append(")");
            } else if ("ultima_letra".equals(criterio)) {
                char last = s.isEmpty() ? '\0' : s.charAt(s.length() - 1);
                sb.append(" (").append(last).append(")");
            }
            if (i < arr.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        System.out.println(sb.toString());
    }
}
