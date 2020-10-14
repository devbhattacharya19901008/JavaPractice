package urlParse;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import urlParse.enums.Protocols;

public class UrlParser {

    // Set the url to this instance variable.
    String Url;

    public UrlParser(final String url) {
        Url = url;
    }

    /*
        Method to parse all relevant information from an URL string.
    */
    public UrlParsedClass getParsedData() {
        UrlParsedClass.UrlParsedClassBuilder builder = UrlParsedClass.builder();

        // Extract the protocol details.
        String protocol = extractProtocol();
        if (!Protocols.contains(protocol)) {
            throw new IllegalArgumentException("Protocol is not of a valid type!!" + protocol);
        } else {
            builder.protocol(protocol);
        }

        // Extract username, any string between 3 and 16 letters including "_".
        String userName = extractUserName();
        if (userName.equals("")) {
            throw new IllegalArgumentException("User Name is not of valid format!!" + userName);
        } else {
            builder.userName(userName);
        }

        // Extract password, maximum of 13 characters, at least one Uppercase, one lowercase, one number and one special character.
        String password = extractPassword();
        if (password.equals("")) {
            throw new IllegalArgumentException("Password is not of valid format!!" + password);
        } else {
            builder.password(password);
        }

        // Host name can be either dns entry or Ip:Port. Assumption, Port will follow IP.
        String hostAddress = extractHostAddress();
        if (hostAddress.equals("")) {
            throw new IllegalArgumentException("Host Address is not of valid format!!" + hostAddress);
        } else {
            builder.hostAddress(hostAddress);
        }

        // Extract the path from the Url.
        String path = extractPath();
        if (path.equals("")) {
            throw new IllegalArgumentException("Path is not of valid format!!" + path);
        } else {
            builder.path(path);
        }

        // Extract all the arguments passed in the url, arguments are separated by &, eg. name=Dev&lastname=Paul.
        String[] args = extractArguments();
        builder.arguments(args);

        //Extract the document part.
        String document = extractDocument();
        builder.document(document);

        return builder.build();
    }

    private String extractProtocol() {
        String protocolPattern = "\\w{2,6}:\\/\\/";
        Pattern pattern = Pattern.compile(protocolPattern, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(this.Url);
        if (matcher.find())
            return (matcher.group(0).replace("://", ""));
        else
            return "";
    }

    private String extractUserName() {
        String userNamePattern = "\\/\\/[a-z0-9_-]{3,16}:";
        Pattern pattern = Pattern.compile(userNamePattern, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(this.Url);
        if (matcher.find())
            return (matcher.group(0).replace(":", "")).replace("//", "");
        else
            return "";
    }

    private String extractPassword() {
        String passwordPattern = "(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,13}";
        Pattern pattern = Pattern.compile(passwordPattern, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(this.Url);
        if (matcher.find())
            return (matcher.group(0));
        else
            return "";
    }

    private String extractHostAddress() {
        String passwordPattern = "@(((\\d{1,3}.){3}\\d{1,3}:\\d+)|(\\w{2,10}\\.\\w{2,5}))";
        Pattern pattern = Pattern.compile(passwordPattern, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(this.Url);
        if (matcher.find())
            return (matcher.group(0).replace("@", ""));
        else
            return "";
    }

    private String[] extractArguments() {
        String args = this.Url.substring(this.Url.indexOf("?") + 1, this.Url.indexOf("#"));
        String[] arguments = args.split("&");
        return arguments;
    }

    private String extractDocument() {
        String docPattern = "#([^;]*)";
        Pattern pattern = Pattern.compile(docPattern, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(this.Url);

        if (matcher.find())
            return (matcher.group(0).replace("#", ""));
        else
            return "";
    }

    private String extractPath() {
        String path = ":\\/\\/.*?(\\/[a-zA-Z0-9\\/\\-\\.\\_\\~\\%]*)";
        Pattern pattern = Pattern.compile(path, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(this.Url);

        if (matcher.find())
            return (matcher.group(1));
        else
            return "";
    }
}

