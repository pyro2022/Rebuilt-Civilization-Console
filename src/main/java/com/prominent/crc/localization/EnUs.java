package com.prominent.crc.localization;

import java.util.HashMap;
import java.util.Map;

public class EnUs {
    private Map<String,String> contextMap = new HashMap<String,String>();

    public EnUs(){
        contextMap.put("Menu_SELECTOP","You are choosing option ");
    }

    public String get(String id){
        return contextMap.get(id);
    }
}
