package movietheater;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ticket2 extends javax.swing.JFrame {
    private static int cnt;
    public ticket2() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    public void seatTheater2(){
        Starter.theater2.setVisible(true);
    }
    public void thank(){
        Starter.thank.setVisible(true);
    }
}
