package com.prominent.crc.localization;

import java.util.HashMap;
import java.util.Map;

public class ZhCn {
    private Map<String,String> contextMap = new HashMap<String,String>();

    public ZhCn(){
        contextMap.put("Menu_SELECTOP","你正在选择选项");
    }

    public String get(String id){
        return contextMap.get(id);
    }
}
