import java.util.function.*;

public class LambdaHolder {
    private DoubleFunction<Double> lambdaFunction;

    public LambdaHolder(DoubleFunction<Double> lambdaFunction) {
        this.lambdaFunction = lambdaFunction;
    }

    public double applyLambda(double value) {
        return lambdaFunction.apply(value);
    }

    public static void main(String[] args) {
        int i=0;
        DoubleFunction<Double> myLambda = (x) -> x * i;

        
        LambdaHolder holder = new LambdaHolder(myLambda);

        
        double result = holder.applyLambda(5.0);
        System.out.println("Result of applying lambda to 5: " + result);  // Output: 10.0
    }
}
