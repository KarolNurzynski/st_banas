public class  SumProcessor implements MathProcessor {

    @Override
    public int operation(int i1, int i2) {
        return i1+i2;
    }

    public String otherOperation(int i1) {
        return "aaaa";
    }
}
