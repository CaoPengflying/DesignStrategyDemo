package com.cpf.patterns.mediator;

/**
 * date 2020/7/12
 *
 * @author caopengflying
 */
public class User {
    private String name;

    public void showMessage(String message){
        ChatRoom.showMessage(this,message);

    }

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
