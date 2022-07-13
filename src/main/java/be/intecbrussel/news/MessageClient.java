package be.intecbrussel.news;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Primary;
import org.springframework.hateoas.CollectionModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Collection;

@FeignClient(value = "${backend.name:null}", url = "${backend.url:}", fallback = MessageClientFallback.class)
@Primary
public interface MessageClient {

    @GetMapping("/")
    Collection<Message> getMessages();

    @PostMapping("/")
    Message createMessage(@RequestBody Message message);

}
