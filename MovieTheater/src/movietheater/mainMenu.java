package movietheater;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class mainMenu extends javax.swing.JFrame {
    private int mousepX;
    private int mousepY;
    public static String firstTime;
    public static String firstTime2;
    public static String firstTime3;
    private static int cnt1;
    private static int cnt2;
    private static int cnt3;
    public static ArrayList<Theater1> t1 = new ArrayList<>();
    public static int cntt1;
    public static ArrayList<Theater2> t2 = new ArrayList<>();
    public static int cntt2;
    public static ArrayList<Theater3> t3 = new ArrayList<>();
    public static int cntt3;
       
    public mainMenu() {
        
        initComponents();
        this.setLocationRelativeTo(null); // set center
        
    }
    public void seatTheater1(Theater1 t1){       
        t1.setVisible(true);       
    }
    public void seatTheater2(Theater2 t2){
        t2.setVisible(true);
    }
    public void seatTheater3(Theater3 t3){
        t3.setVisible(true);
    }
    public void startPage(){
        Starter.start.setVisible(true);         
    }
    
}
