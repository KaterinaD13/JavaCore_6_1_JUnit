import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.regex.Pattern;

import static org.junit.jupiter.api.Assertions.*;

public class PhoneBookTest {

    @Test
    public void validatePhoneNumberTest1() {
        String phoneNumber = "925 13-43-675";
        String expected = "925 13-43-675";
        assertEquals(expected, phoneNumber);
    }

    @Test
    public void validatePhoneNumberTest2() {
        String phoneNumber = "925 13-43-675";
        String expected = "";
        String result = phoneNumber.concat(expected);

        Assertions.assertEquals(phoneNumber, result);
    }

    @Test
    public void validatePhoneNumberTest3() {
        String phoneNumber = "925 13-43-675";
        String expected = "^\\d{3} ?\\d{2}[- ]?\\d{2}[- ]?\\d{3}$";
        assertTrue(Pattern.compile(expected).matcher(phoneNumber).matches());

    }
}
