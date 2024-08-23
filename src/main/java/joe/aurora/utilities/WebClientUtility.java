package joe.aurora.utilities;

import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;

import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

@Slf4j
public class WebClientUtility {
    public static Consumer<HttpHeaders> extractHeaders(HttpServletRequest httpServletRequest) {
        HttpHeaders headers = new HttpHeaders();

        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));

        Collections.list(httpServletRequest.getHeaderNames())
                .forEach(headerName -> {
                    List<String> headerValues = Collections.list(httpServletRequest.getHeaders(headerName));
                    headers.addAll(headerName, headerValues);
                });
        return httpHeaders -> httpHeaders.addAll(headers);
    }
}
