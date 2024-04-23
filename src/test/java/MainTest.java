import org.example.Main;
import org.junit.jupiter.api.Test;

public class MainTest {

    @Test
    public void test1() {
        assert Main.add(1, 2) == 3;
    }
}