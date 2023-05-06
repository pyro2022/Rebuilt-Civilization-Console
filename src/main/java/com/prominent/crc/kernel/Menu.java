package com.prominent.crc.kernel;

import com.prominent.crc.kernel.outputprocess.MenuProcess;
import com.prominent.crc.localization.ZhCn;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        ZhCn cn = new ZhCn();
        int selecting = 0;
        while (true){
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
            System.out.println(cn.get("Menu_SELECTOP")+selecting);
            System.out.println(MenuProcess.menu(selecting));
            Scanner scIn=new Scanner(System.in);
            String input = scIn.next();
            if(input.equalsIgnoreCase( "up")){
                if(selecting != 3){
                    selecting = selecting + 1;
                }
            }
            if(input.equalsIgnoreCase( "dn")){
                if(selecting != 0){
                    selecting = selecting - 1;
                }
            }
            if(input.equalsIgnoreCase( "sel")){
                if(selecting == 0){
                    NewGame.generateNewSaveAndRun();
                }
            }
        }
    }
}
