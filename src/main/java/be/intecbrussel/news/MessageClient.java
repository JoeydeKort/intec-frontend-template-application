package be.intecbrussel.news;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Primary;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Collection;

@FeignClient(value = "messages backend", url = "http://localhost:8082", fallback = MessageClientFallback.class)
@Primary
public interface MessageClient {

    @GetMapping("/")
    Collection<MessageDto> getMessages();

    @PostMapping("/")
    MessageDto createMessage(@RequestBody MessageDto messageDto);

}
