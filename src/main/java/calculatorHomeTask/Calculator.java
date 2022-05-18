package calculatorHomeTask;
import java.util.List;


public class Calculator {
    private int a;
    private int b;
    private int o;


    public int countDigitsAmongSymbols(String expression) {
        InputBuilder inputBuilder = new InputBuilder(expression);
        List<Integer> elements = inputBuilder.getElements();

        for (Integer i : elements) {
            a += i;
        }
        return a;
    }

    public int countWithoutDigits(String expression){
        InputBuilder inputBuilder = new InputBuilder(expression);
        List<Integer> withoutSymbols = inputBuilder.getDigitsWithoutSymbols();
        for (Integer r : withoutSymbols){
            o += r;
        }
        return o;
    }


    public int countOnlyDigits(String expression) {
        InputBuilder inputBuilder = new InputBuilder(expression);
        List<Integer> digitsElements = inputBuilder.getOnlyDigitsElements();

        for (Integer c : digitsElements) {
            b += c;
        }
        return b;
    }


}

