import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MatadorTest {

    /** 1 **/

    @Test
    void testIfNameTheSame()  {
        String player1name = "Hans";
        String player2name = "Hans";
        boolean result = Matador.testIfEquals(player1name,player2name);
        assertTrue(result);
    }
    @Test
    void testIfNameNotTheSame() {
        String player1name = "Hans";
        String player2name = "Grethe";
        boolean result = Matador.testIfEquals(player1name,player2name);
        assertFalse(result);

    }

}


