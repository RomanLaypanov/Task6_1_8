import java.util.function.UnaryOperator;

public class  Sqrt {
    public UnaryOperator<Integer> sqrt() {
        return num -> num * num;
    }
}

