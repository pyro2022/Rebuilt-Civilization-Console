package com.prominent.crc.procdata;

public class Building {
    int type;
    short level;
    int people;
    public Building(int type,short level,int people){// Building types with people,working or living
        this.type=type;
        this.level=level;
        this.people=people;
    }
    public Building(int type,short level){// Building types without people,such as bridge,road,abandoned building.
        this.type=type;
        this.level=level;
        this.people=0;
    }
}
