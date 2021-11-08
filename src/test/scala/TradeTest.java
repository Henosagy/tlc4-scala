import static org.junit.jupiter.api.Assertions.*;

class TradeTest {
    Trade google = new Trade("T1", "GOOG", 4, 4.5);

    @org.junit.jupiter.api.Test
    void getPrice() {
        double expected = 6.5;
        google.setPrice(6.5);
        double actual = google.getPrice();
        assertEquals(expected,actual);
    }

    @org.junit.jupiter.api.Test
    void value() {
        double expected = 4 * 4.5;
        double actual = google.value();

        assertEquals(expected,actual);
    }


}