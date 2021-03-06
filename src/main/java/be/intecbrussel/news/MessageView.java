package be.intecbrussel.news;

import com.vaadin.flow.component.ReconnectDialogConfiguration;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.router.Route;
import org.springframework.beans.factory.annotation.Autowired;

@Route("")
public class MessageView extends HorizontalLayout {

    @Autowired
    private MessageClient client;


    public MessageView() {
        ReconnectDialogConfiguration configuration = UI.getCurrent().getReconnectDialogConfiguration();
        configuration.setDialogText("Please wait...");
        configuration.setReconnectInterval(1000);

        setWidth("100%");
        setSpacing(false);
        final var messages = client.getMessages();
        messages.forEach(message -> {
            add(new Span(message.getMessage()));
        });

    }

}
