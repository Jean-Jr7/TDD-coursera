import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class TradutorTeste {
    private Tradutor t = new Tradutor();

    @BeforeEach
    public void CriarTradutor(){
        t = new Tradutor();
    }

    @Test
    public void TradutorSemPalavras() {
        assertTrue(t.estavavazio());
    }
    @Test
    public void umaTraducao(){
        assertTrue(t.estavavazio());
        t.addTraducao("bom","god");
        assertEquals("god",t.traduzir("bom"));

    }
    @Test
    public void DuasTraducao(){
        assertTrue(t.estavavazio());
        t.addTraducao("bom","god");
        t.addTraducao("mal","bad");
        assertEquals("god",t.traduzir("bom"));
        assertEquals("bad",t.traduzir("mal"));

    }
    @Test
    public void DuasTraducaoMesmaPalavra(){
        assertTrue(t.estavavazio());
        t.addTraducao("bom","god");
        t.addTraducao("bom","nice");
        assertEquals("god, nice",t.traduzir("bom"));
    }
    @Test
    public void TraduzirFrase(){
        assertTrue(t.estavavazio());
        t.addTraducao("guerra","war");
        t.addTraducao("e","is");
        t.addTraducao("ruim","bad");
        assertEquals("war is bad",t.traduzirFrase("guerra e ruim"));
    }@Test

    public void TraduzirFraseCom2PalavrasMestraTraducao(){
        assertTrue(t.estavavazio());
        t.addTraducao("paz","peace");
        t.addTraducao("e","is");
        t.addTraducao("bom","god");
        t.addTraducao("bom","nice");
        assertEquals("peace is god",t.traduzirFrase("paz e bom"));
    }

}
