package be.intecbrussel.news;



import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Collection;
import java.util.List;

@Service
public class MessageClientFallback implements MessageClient {

    @Override
    @GetMapping("/")
    public Collection<MessageDto> getMessages(){
        return List.of(new MessageDto());
    }

    @Override
    @PostMapping("/")
    public MessageDto createMessage(@RequestBody MessageDto messageDto) {
        return new MessageDto();
    }

}
