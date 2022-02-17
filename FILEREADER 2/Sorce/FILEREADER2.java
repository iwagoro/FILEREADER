import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.fxml.FXML;
import javafx.scene.Parent;
import java.nio.charset.StandardCharsets;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.util.Optional;
import javafx.event.ActionEvent;
import java.util.stream.Stream;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.FileInputStream;
import java.util.List;
import javafx.event.EventHandler;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.FileOutputStream;
import javafx.scene.paint.Color;
import javafx.stage.FileChooser;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import java.io.File;
import java.util.Collections;
import java.util.ArrayList;
import javafx.geometry.Pos;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import java.nio.charset.Charset;
import javafx.scene.control.Button;
import javafx.scene.control.TextInputDialog;

public class FILEREADER2  implements Initializable { 
     

     @FXML ImageView seeker;

     public void OPENSEEKER() throws IOException {
          Parent root = FXMLLoader.load(getClass().getResource("FILEREADER2.fxml"));
          Scene scene = new Scene(root);
          Stage stage = new Stage();
          stage.setScene(scene);
          stage.show();
     }

     @Override

     public void initialize(java.net.URL Url, java.util.ResourceBundle Bundle) {
          System.out.println("initialized prgram activated");
          try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("/Users/gakusei058/Documents/Programing/Java/FILEREADER/Sorce/最近のファイル.txt"), Charset.forName("UTF-8"))) ){
          String text = br.readLine();
          seeker.setImage(new Image("file:Data/User_Image/" + text.substring(11)));
          } catch (Exception ex){ }

     }

}