package com.ibm.it.meledina.tommaso.jdbcclientdemo.model;

import lombok.Data;

@Data
public class GreetingTemplate {
    private String messageTemplate;
    private RecipientKind recipientKind;
}
