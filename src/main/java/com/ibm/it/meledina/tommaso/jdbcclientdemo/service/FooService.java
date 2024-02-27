package com.ibm.it.meledina.tommaso.jdbcclientdemo.service;

import com.ibm.it.meledina.tommaso.jdbcclientdemo.dao.GreetingFormatDao;
import com.ibm.it.meledina.tommaso.jdbcclientdemo.model.RecipientKind;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class FooService {

    private final GreetingFormatDao greetingFormatDao;

    public String getGreeting(String recipient, RecipientKind recipientKind) {
        return String.format(greetingFormatDao.getGreetingTemplate(recipientKind), recipient);
    }
}
