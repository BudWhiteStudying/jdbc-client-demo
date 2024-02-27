package com.ibm.it.meledina.tommaso.jdbcclientdemo.controller;

import com.ibm.it.meledina.tommaso.jdbcclientdemo.model.RecipientKind;
import com.ibm.it.meledina.tommaso.jdbcclientdemo.service.FooService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/foo")
@RequiredArgsConstructor
public class FooController {

    private final FooService fooService;

    @GetMapping("/greeting")
    public String getGreeting(@RequestParam(name="recipientName") String recipientName, @RequestParam(name="recipientKind") RecipientKind recipientKind) {
        return fooService.getGreeting(recipientName, recipientKind);
    }
}
