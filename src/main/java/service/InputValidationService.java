package service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Ostap Vdovychyn
 */
public class InputValidationService {

    private static final String EMAIL_REGEX = "^[\\w-\\+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a-z]{2,})$";

    private String message;

    private static Pattern pattern;

    private Matcher matcher;

    public boolean isValidEmailAddress(String email) {
        boolean result = true;
        pattern = Pattern.compile(EMAIL_REGEX, Pattern.CASE_INSENSITIVE);
        matcher = pattern.matcher(email);
        if (!matcher.matches()) {
            setMessage("incorrect email format");
            result = false;
        }
        return result;
    }

    public boolean isValidInput(String row) {
        boolean result = true;
        if (row == null || row.equals("null")) {
            setMessage("row must be not null");
            result = false;
        }

        if (row.length() == 0) {
            setMessage("row is empty");
            result = false;

        }

        if (row.length() > 30) {
            setMessage("row must be less than 30 characters");
            result = false;
        }
        return result;
    }

    private void setMessage(String message) {

        this.message = message;
    }

    public String getMessage() {
        return message;
    }

}
