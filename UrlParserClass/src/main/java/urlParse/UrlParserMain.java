package urlParse;

import java.util.Arrays;

public class UrlParserMain {
    public static final String Url_To_Parse =
            "ftp://dev_1990:Eastroad@1990@192.168.10.10:19/Desktop/bin/mail?name=Dev&lastname=Bhattacharya&Age=30"
                    + "&job=SoftwareDeveloper#mysection";

    public static void main(String args[]) {
        UrlParser urlParser = new UrlParser(Url_To_Parse);
        UrlParsedClass urlParsedClass = urlParser.getParsedData();
        System.out.println("Parsed Data are as follow:" +
                "\n Protocol: " + urlParsedClass.getProtocol()
                + "\n User Name: " + urlParsedClass.getUserName()
                + "\n Password: " + urlParsedClass.getPassword()
                + "\n Host Address: " + urlParsedClass.getHostAddress()
                + "\n Path: " + urlParsedClass.getPath()
                + "\n Arguments: " + Arrays.toString(urlParsedClass.getArguments())
                + "\n Document: " + urlParsedClass.getDocument());
    }
}
