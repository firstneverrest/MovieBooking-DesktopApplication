package movietheater;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ticket3 extends javax.swing.JFrame {
    private static int cnt; 
    public ticket3() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    public void seatTheater3(){
        Starter.theater3.setVisible(true);
    }
    public void thank(){
        Starter.thank.setVisible(true);
    }
}
