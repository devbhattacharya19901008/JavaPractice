package urlParse.enums;

import java.util.HashMap;
import java.util.Map;

// List of known protocols
public enum Protocols {
    HTTP("http"),
    HTTPS("https"),
    FTP("ftp"),
    TCP("tcp"),
    UDP("udp"),
    SMTP("smtp");

    final private String name;

    Protocols(final String name){this.name = name;}

    private static final Map<String, Protocols> STRING_TO_ENUM =
            new HashMap<String, Protocols>();

    static {
        for (Protocols item : values()) {
            STRING_TO_ENUM.put(item.toString(), item);
        }
    }

    @Override
    public String toString() {
        return this.name;
    }

    public static Protocols fromString(final String name) {
        return STRING_TO_ENUM.get(name);
    }

    public static boolean contains(final String name) {
        return STRING_TO_ENUM.containsKey(name);
    }

}
