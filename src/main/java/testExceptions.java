import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class testExceptions {

    public static void checkLogin(String login) throws WrongCredentialsException {

        Pattern pattern = Pattern.compile("^[([a-zA-Z]+)\\_+\\d+]{2,19}$");
        Matcher matcher = pattern.matcher(login);

        try {
            if (!matcher.matches()) {
                throw new WrongCredentialsException("Login format is not valid");
            }
        } catch (WrongCredentialsException e) {
            System.out.println(e.getMessage());
        }

    }


    public static void checkPasswordOrConfirmPassword(String password, String confirmPassword) throws WrongCredentialsException {
        Pattern pattern = Pattern.compile("^[([a-zA-Z]+)\\_+\\d+]{2,19}$");
        Matcher matcher = pattern.matcher(password);
        Matcher matcher1 = pattern.matcher(confirmPassword);
        try {
            if (!matcher.matches()) {
                throw new WrongCredentialsException("Password format is not valid");
            } else if (!matcher1.matches()){
                throw new WrongCredentialsException("Confirm password format is not valid");
            }
        } catch (WrongCredentialsException e) {
            System.out.println(e.getMessage());
        }

        try {
            if (confirmPassword != password) {
                throw new WrongCredentialsException("Confirm password is not corresponds to password");
            }
        } catch (WrongCredentialsException e) {
            System.out.println(e.getMessage());
        }

    }



}

