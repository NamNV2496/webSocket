package com.websocket.domain;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Message {
    String from;
    String text;
}
