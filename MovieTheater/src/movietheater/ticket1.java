
package movietheater;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ticket1 extends javax.swing.JFrame {
    public ticket1() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    public void seatTheater1(){
        Starter.theater1.setVisible(true);
    }
    public void thank(){
        Starter.thank.setVisible(true);
    }
}
