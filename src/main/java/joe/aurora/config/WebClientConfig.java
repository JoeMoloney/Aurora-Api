package joe.aurora.config;

import io.netty.channel.ChannelOption;
import io.netty.handler.timeout.ReadTimeoutHandler;
import io.netty.handler.timeout.WriteTimeoutHandler;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.client.reactive.ReactorClientHttpConnector;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.netty.http.client.HttpClient;

@Configuration
@Slf4j
public class WebClientConfig {

    @Value("${aurora-db.base-url}")
    private String dbServiceBaseURL;

    @Bean
    public WebClient webClient() {
        log.info("WebClientConfig : Building Default WebClient Using DB-Base URL: {}", dbServiceBaseURL);
        return WebClient.builder()
                .clientConnector(new ReactorClientHttpConnector(createDefaultHttpClient()))
                .defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                .baseUrl(dbServiceBaseURL)
                .build();
    }

    private static HttpClient createDefaultHttpClient() {
        log.info("WebClientConfig : Setting Default WebClient Connector Parameters");
        return HttpClient.create()
                .option(ChannelOption.CONNECT_TIMEOUT_MILLIS, 10000)
                .doOnConnected(connection -> {
                    log.info("WebClient Connected");
                    connection.addHandlerLast(new ReadTimeoutHandler(10))
                            .addHandlerLast(new WriteTimeoutHandler(10));
                });
    }
}
