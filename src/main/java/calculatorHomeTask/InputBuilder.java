package calculatorHomeTask;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InputBuilder {

    private Pattern pattern;
    private Matcher matcher;


    String expression;

    public InputBuilder(String expression) {
        this.expression = expression;
        pattern = Pattern.compile("(\\d+)");
        matcher = pattern.matcher(expression);

    }

    public List<Integer> getElements() {
        List<Integer> result = new ArrayList<>();
        pattern = Pattern.compile("(\\d+)");
        matcher = pattern.matcher(expression);
        while (matcher.find()){
            result.add(Integer.parseInt(matcher.group()));
        }
        return result;
    }

    public List<Integer> getOnlyDigitsElements() {
        List<Integer> resultOnlyDigits = new ArrayList<>();
        pattern = Pattern.compile("(\\d+)");
        matcher = pattern.matcher(expression);
        while (matcher.find()){
            resultOnlyDigits.add(Integer.parseInt(matcher.group()));
        }
        return resultOnlyDigits;
    }

    public List<Integer> getDigitsWithoutSymbols(){
        List<Integer> resultWithoutSymbols = new ArrayList<>();
        pattern = Pattern.compile("(\\d+)");
        matcher = pattern.matcher(expression);
        while (matcher.find()){
            resultWithoutSymbols.add(Integer.parseInt(matcher.group()));
        }
        return resultWithoutSymbols;
    }

}
