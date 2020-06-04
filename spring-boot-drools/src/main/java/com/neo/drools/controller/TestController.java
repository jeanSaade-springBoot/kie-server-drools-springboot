package com.neo.drools.controller;

import com.neo.drools.model.Card;
import com.neo.drools.model.fact.AddressCheckResult;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;


@RequestMapping("/test")
@Controller
public class TestController {

    @Resource
    private KieContainer kieContainer;

    @ResponseBody
    @RequestMapping("/card")
    public void test(String type){
        Card card = new Card();
        card.setType(type);
        KieSession kieSession = kieContainer.newKieSession();

        kieSession.insert(card);
        int ruleFiredCount = kieSession.fireAllRules();
        kieSession.destroy();
      

    }

}
