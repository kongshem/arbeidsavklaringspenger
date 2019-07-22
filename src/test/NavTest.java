import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NavTest {

    @Test
    public void testAAP_person_uten_inntekt(){
        Adult per = new Adult("Luke", "Skywalker");
        assertEquals(Nav.GRUNNBELOP*2, Nav.calculateAAP(per));
    }
}
