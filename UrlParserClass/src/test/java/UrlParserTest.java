import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import urlParse.UrlParsedClass;
import urlParse.UrlParser;

public class UrlParserTest {
    public static final String Url_To_Parse =
            "http://dev_1990:Eastroad@1990@192.168.10.10:19/Desktop/bin/mail?name=Dev&lastname=Bhattacharya"
                    + "&job=SoftwareDeveloper#mysection";


    @Test
    public void getParsedData() {
        UrlParser urlParser = new UrlParser(Url_To_Parse);
        UrlParsedClass urlParsedClass = urlParser.getParsedData();
        String[] response = urlParsedClass.getArguments();

        Assertions.assertTrue(response[0].equals("name=Dev"));
        Assertions.assertTrue(response[1].equals("lastname=Bhattacharya"));
        Assertions.assertTrue(response[2].equals("job=SoftwareDeveloper"));
        Assertions.assertEquals("http", urlParsedClass.getProtocol());
        Assertions.assertEquals("dev_1990", urlParsedClass.getUserName());
        Assertions.assertEquals("Eastroad@1990", urlParsedClass.getPassword());
        Assertions.assertEquals("192.168.10.10:19", urlParsedClass.getHostAddress());
        Assertions.assertEquals("mysection", urlParsedClass.getDocument());
        Assertions.assertEquals("/Desktop/bin/mail", urlParsedClass.getPath());
    }


    @Test
    public void getParsedData_WrongProtocol() {
        UrlParser urlParser = new UrlParser("htsp://dev:password");
        IllegalArgumentException exception = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            urlParser.getParsedData();
        });
        Assertions.assertTrue(exception.getMessage().contains("Protocol is not of a valid type!!"));
    }

    @Test
    public void getParsedData_WrongUserName() {
        UrlParser urlParser = new UrlParser("http://dev.1990:password");
        IllegalArgumentException exception = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            urlParser.getParsedData();
        });
        Assertions.assertTrue(exception.getMessage().contains("User Name is not of"));
    }


    @Test
    public void getParsedData_WrongPassword() {
        UrlParser urlParser = new UrlParser("http://dev_1990:Eastroad1990");
        IllegalArgumentException exception = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            urlParser.getParsedData();
        });
        Assertions.assertTrue(exception.getMessage().contains("Password is not of"));
    }

    @Test
    public void getParsedData_WrongHostAddressWithDns() {
        UrlParser urlParser = new UrlParser("http://dev_1990:Eastroad@1990@google,com");
        IllegalArgumentException exception = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            urlParser.getParsedData();
        });
        Assertions.assertTrue(exception.getMessage().contains("Host Address is not of"));
    }

    @Test
    public void getParsedData_WrongHostAddressWithIPAndPort() {
        UrlParser urlParser = new UrlParser("http://dev_1990:Eastroad@1990@192.1.1.1");
        IllegalArgumentException exception = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            urlParser.getParsedData();
        });
        Assertions.assertTrue(exception.getMessage().contains("Host Address is not of"));
    }
}
