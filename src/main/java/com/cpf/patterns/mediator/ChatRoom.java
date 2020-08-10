package com.cpf.patterns.mediator;

import java.util.Date;

/**
 * date 2020/7/12
 *
 * @author caopengflying
 */
public class ChatRoom {
    public static void showMessage(User user, String message) {
        System.out.println(new Date().toString() + "[" + user.getName() + "]" + message);
    }
}
