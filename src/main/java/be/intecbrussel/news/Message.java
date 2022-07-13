package be.intecbrussel.news;

import lombok.*;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Message {


    private Long id;

    @NotNull
    @Size(min = 1)
    private String message;

    @NotNull
    @Size(min = 1)
    private String username;

}
