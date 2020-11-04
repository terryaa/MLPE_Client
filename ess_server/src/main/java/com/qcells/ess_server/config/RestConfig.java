package com.qcells.ess_server.config;

import com.qcells.ess_server.rest.DataResource;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

//Resource역할을 할 클래스 등록
//Controller를 등록한다고 생각하면된다.
@Component
public class RestConfig extends ResourceConfig {

    public RestConfig(){
        register(DataResource.class);
    }
}