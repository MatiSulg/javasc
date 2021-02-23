import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
public class RingTests {

    private Ring ring;

    @BeforeEach
    public void setUp() throws Exception {
        ring = new Ring();
    }

    @Test
    public void positiveTestUmbermoot(){
        assertEquals(5, Ring.umbermoot(2));
    }

    @Test
    public void stringTestUmbermoot(){
        //assertEquals(error, Ring.umbermoot("2"));
    }

    @Test
    public void negativeTestUmbermoot(){
        //assertEquals(error, Ring.umbermoot(-2));
    }

    @Test
    public void zeroTestUmbermoot(){
        assertEquals(0, Ring.umbermoot(0));
    }

    @Test
    public void positiveTestPindala(){
        assertEquals(5, Ring.pindala(2));
    }

    @Test
    public void stringTestPindala(){
        //assertEquals(error, Ring.pindala("2"));
    }

    @Test
    public void negativeTestPindala(){
        //assertEquals(error, Ring.pindala(-2));
    }

    @Test
    public void zeroTestPindala(){
        assertEquals(0, Ring.pindala(0));
    }



}
