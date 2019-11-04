package com.study.git.service;

import org.springframework.stereotype.Component;

import javax.websocket.*;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author TangFD@HF 2018/11/28
 */
@Component
@ServerEndpoint("/ws-git")
public class WebSocketService {
    private static final Map<String, Session> SESSION_MAP = new ConcurrentHashMap<>();
    private static final DateFormat TIME_FORMAT = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    private Session session;

    @OnOpen
    public void onOpen(Session session) throws IOException {
        this.session = session;
        SESSION_MAP.put(session.getId(), session);
    }

    @OnClose
    public void onClose() {
        System.out.println(this.session.getId());
        SESSION_MAP.remove(this.session.getId());
    }

    @OnMessage
    public void onMessage(String message, Session session) throws IOException {
    }

    @OnError
    public void onError(Session session, Throwable error) {
        error.printStackTrace();
    }

    public static void send(String message) {
        for (Session session : SESSION_MAP.values()) {
            try {
                session.getBasicRemote().sendText(TIME_FORMAT.format(new Date()) + " : " + message);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
