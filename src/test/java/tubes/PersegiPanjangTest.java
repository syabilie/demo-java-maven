package tubes;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PersegiPanjangTest {
    @Test
    public void testHitungLuas() {
        PersegiPanjang persegiPanjang = new PersegiPanjang(5, 3);
        double luas = persegiPanjang.hitungLuas();
        assertEquals(15.0, luas, 0);
    }
}

