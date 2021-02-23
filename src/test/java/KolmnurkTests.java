import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class KolmnurkTests {
    private Kolmnurk kolmnurk;

    @BeforeEach
    public void setUp() throws Exception {
        kolmnurk = new Kolmnurk();
    }

    @Test
    public void positiveTestUmbermoot(){
        assertEquals(9, Kolmnurk.umbermoot(2, 3, 4));
    }

    @Test
    public void stringTestUmbermoot(){
        //assertEquals(error, Kolmnurk.umbermoot("2", "3", "4"));
    }

    @Test
    public void negativeTestUmbermoot(){
        //assertEquals(error, Kolmnurk.umbermoot(-2, -3, -4));
    }

    @Test
    public void zeroTestUmbermoot(){
        assertEquals(0, Kolmnurk.umbermoot(0, 0, 0));
    }

    @Test
    public void positiveTestPindala(){
        assertEquals(9, Kolmnurk.pindala(2, 2, 3, 4));
    }

    @Test
    public void stringTestPindala(){
        //assertEquals(error, Kolmnurk.pindala("2", "2", "3", "4"));
    }

    @Test
    public void negativeTestPindala(){
        //assertEquals(error, Kolmnurk.pindala(2, 2, 3, 4));
    }

    @Test
    public void zeroTestPindala(){
        assertEquals(0, Kolmnurk.pindala(0, 0, 0, 0));
    }

}
