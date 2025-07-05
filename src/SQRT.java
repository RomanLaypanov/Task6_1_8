import java.util.function.UnaryOperator;

public class SQRT {
    UnaryOperator<Integer> iUO = i -> i * i;

    public UnaryOperator<Integer> sqrt() {
        return iUO;
    }
}
