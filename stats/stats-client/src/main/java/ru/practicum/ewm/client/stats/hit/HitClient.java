//package ru.practicum.ewm.client.stats.hit;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.boot.web.client.RestTemplateBuilder;
//import org.springframework.http.ResponseEntity;
//import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
//import org.springframework.stereotype.Service;
//import org.springframework.web.util.DefaultUriBuilderFactory;
//import ru.practicum.ewm.client.stats.client.BaseClient;
//import ru.practicum.ewm.dto.stats.HitDto;
//
//
//import javax.validation.Valid;
//
//
//@Service
//public class HitClient extends BaseClient {
//    private static final String API_PREFIX = "/hit";
//
//    @Autowired
//    public HitClient(@Value("${stats-client.url}") String serverUrl, RestTemplateBuilder builder) {
//        super(
//                builder
//                        .uriTemplateHandler(new DefaultUriBuilderFactory(serverUrl + API_PREFIX))
//                        .requestFactory(HttpComponentsClientHttpRequestFactory::new)
//                        .build()
//        );
//    }
//
//    public HitDto saveHit(@Valid HitDto hitDto) {
//        return (HitDto) post("", hitDto).getBody();
//    }
//}
