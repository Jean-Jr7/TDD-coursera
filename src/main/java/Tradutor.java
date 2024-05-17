import java.util.HashMap;
import java.util.Map;

public class Tradutor {
    private final Map <String, String> traducoes = new HashMap<>();


    public boolean estavavazio() {
        return traducoes.isEmpty();
    }


    public void addTraducao(String palavra, String traducao) {
        if (traducoes.containsKey(palavra)) {
            traducao = traduzir(palavra) + ", " + traducao;
        }
       traducoes.put(palavra, traducao);
    }

    public String traduzir(String palavra) {
        return traducoes.get(palavra);


    }

    public String traduzirFrase(String Frase) {
        String [] palavras = Frase.split(" ");
        String  FraseTraduzida = "";
        for (String palavra : palavras) {
            String traducao = traduzir(palavra);
            FraseTraduzida = PrimeiraTraducao(traducao, FraseTraduzida);
        }
        return FraseTraduzida.trim();

    }

    private String PrimeiraTraducao(String traducao, String FraseTraduzida) {
        if (traducao.contains(","))
            traducao = traducao.substring(0, traducao.indexOf(","));
        FraseTraduzida += " " + traducao;
        return FraseTraduzida;
    }
}
