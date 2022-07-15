package be.intecbrussel.news;

import be.intecbrussel.bericht.commons.Message;


public class MessageDto implements Message {


    private Long joeyId;

    private String message;

    private String username;

    @Override
    public Long getId() {
        return this.joeyId;
    }

    @Override
    public String getMessage() {
        return this.message;
    }

    @Override
    public String getUsername() {
        return this.username;
    }

    @Override
    public void setId(Long aLong) {

    }

    @Override
    public void setMessage(String s) {

    }

    @Override
    public void setUsername(String s) {

    }
}
