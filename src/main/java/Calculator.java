public class Calculator {

    MathProcessor sumProcessor;
    MathProcessor substProcessor;

    public Calculator(MathProcessor sumProcessor, MathProcessor substProcessor) {
        this.sumProcessor = sumProcessor;
        this.substProcessor = substProcessor;
    }

    int sum (int x , int y) {
       return sumProcessor.operation(x, y);
    }
    int subtract(int x , int y) {
        return substProcessor.operation(x, y);
    }
}
