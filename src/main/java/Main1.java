public class Main1 {

    public static void main(String[] args) {


       Calculator calculator =  new Calculator(new SumProcessor(), new SubtractProcessor());

        SumProcessor sumProcessor = new SumProcessor();
        sumProcessor.operation(1,2);
        sumProcessor.otherOperation(1);

       MathProcessor sumProcessor1 = sumProcessor;
       sumProcessor1.operation(1,2);
       // no other operation

        SumProcessor s = (SumProcessor) sumProcessor1;
        s.otherOperation(1);




        MathProcessor subtractProcessor = new SubtractProcessor();
        Calculator calculator13 = new Calculator(sumProcessor, subtractProcessor);




        MathProcessor sumProcessor4 = (i1, i2) -> i1+i2;        // lambda is first class citizen


        Calculator calculator2 =  new Calculator((i1, i2) -> i1+i2, (i1, i2) -> i1-i2);



        int sum = calculator.sum(2, 5);
        int subtract = calculator.subtract(10, 3);

        System.out.println(subtract);


    }

}
