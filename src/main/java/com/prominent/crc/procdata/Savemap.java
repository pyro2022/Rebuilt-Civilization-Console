package com.prominent.crc.procdata;

import java.util.ArrayList;

public class Savemap {
    ArrayList<ArrayList<Unit>> units;
    public Savemap(ArrayList<ArrayList<Unit>> units){//The inner layer is x,the outer layer is y.
        this.units=units;
    }
}
