package com.prominent.crc.kernel.outputprocess;

public class MenuProcess {
    public static String menu(int selecting){
        String[] menuUnSelecting = new String[]{"N E W   G A M E","R E A D   S A V E S","S E T T I N G","Q U I T"};
        String[] menuSelecting = new String[]{"[N E W   G A M E]","[R E A D   S A V E S]","[S E T T I N G]","[Q U I T]"};
        if (selecting > 3){
            return "";
        }else{
            String disp = "";
            disp += menuSelecting[selecting] + "\n";
            for(int i = 0;i <= 3;i++){
                if(i != selecting){
                    disp += menuUnSelecting[i] + "\n";
                }
            }
            disp += ">>";
            return disp;
        }
    }
}
