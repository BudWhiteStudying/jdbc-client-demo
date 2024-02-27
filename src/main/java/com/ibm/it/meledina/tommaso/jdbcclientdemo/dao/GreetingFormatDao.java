package com.ibm.it.meledina.tommaso.jdbcclientdemo.dao;

import com.ibm.it.meledina.tommaso.jdbcclientdemo.model.GreetingTemplate;
import com.ibm.it.meledina.tommaso.jdbcclientdemo.model.RecipientKind;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GreetingFormatDao {

    private final JdbcClient jdbcClient;

    public String getGreetingTemplate(RecipientKind recipientKind) {
        return jdbcClient.sql("SELECT * FROM GREETING_TEMPLATE WHERE RECIPIENT_KIND = :kind")
                .param("kind", recipientKind.name())
                .query(GreetingTemplate.class)
                .single().getMessageTemplate();
    }
}
