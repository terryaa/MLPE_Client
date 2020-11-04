package com.qcells.ess_client.profile;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@Configuration
@Profile(value = "develop")
@PropertySource("application-develop.properties")
public class Develop implements Profile_ESS{
    @Value("${server.ip}")
    private String target_IP;
    @Override
    public String getPath(){
        return target_IP;
    }
}