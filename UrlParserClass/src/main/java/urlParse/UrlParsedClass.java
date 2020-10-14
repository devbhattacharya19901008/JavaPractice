package urlParse;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Builder
public class UrlParsedClass {
    // Defines the protocol used in the url, eg. http, https etc.
    private String protocol;
    private String userName;
    private String password;
    private String hostAddress;
    private String path;
    private String[] arguments;
    private String document;
}
