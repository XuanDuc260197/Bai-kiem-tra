package services;

import com.sun.tools.javac.Main;
import entities.Casher;

import java.util.ArrayList;
import java.util.Scanner;

public static class ServicesDataInfo {
    public ArrayList<Casher> Data(Casher casher){
        Scanner sc = new Scanner(System.in);
        ArrayList<Casher> cashers = new ArrayList<>();
        ServiceDisplayInfo serviceDisplayInfo = new ServiceDisplayInfo();
        Casher casher1= serviceDisplayInfo.inputInfo(Scanner sc);
        cashers.add(casher1);
        return cashers;
    }
}
