package com.prominent.crc.procdata;

import java.util.Date;

public class SaveData {
    Savemap map;
    Playerdata data;
    Date dateAndTime;
    public SaveData(Savemap map, Playerdata data, Date dateAndTime){
        this.map=map;
        this.data=data;
        this.dateAndTime = dateAndTime;
    }
}
