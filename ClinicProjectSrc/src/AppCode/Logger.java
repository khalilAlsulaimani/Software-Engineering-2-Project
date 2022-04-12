/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AppCode;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author khalil
 */
public class Logger {
    private DateTimeFormatter time = DateTimeFormatter.ofPattern("HH:mm:ss");
    private DateTimeFormatter date = DateTimeFormatter.ofPattern("yyy-MM-dd");
    private LocalDateTime now = LocalDateTime.now();
    
    public void logOutLog(String username) throws IOException {
        
        File file = new File("../logs/" + date.format(now) + ".txt");

        FileWriter fileWrite = new FileWriter(file, true);
        try (BufferedWriter writer = new BufferedWriter(fileWrite)) {
            writer.write(username + ": " + " Logged Out At " + time.format(now) + "\n---------------------------------\n");
        }catch(Exception ex){
            
        }
       
    }
    
     public void loginLog(String username) {

        try {
            File file = new File("../logs/" + date.format(now) + ".txt");

            FileWriter fileWrite = new FileWriter(file, true);
            BufferedWriter writer = new BufferedWriter(fileWrite);
            writer.write(username + ": " + " Logged In At " + time.format(now) + "\n---------------------------------\n");
            writer.close();

        } catch (IOException ex) {
            System.out.println("Log Error");
        }

    }
    
}
