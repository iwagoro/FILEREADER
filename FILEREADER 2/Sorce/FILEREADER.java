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
import javafx.scene.layout.VBox;
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
import javafx.scene.layout.BorderPane;
import java.nio.charset.Charset;
import javafx.scene.control.Button;
import javafx.scene.control.TextInputDialog;
public class FILEREADER extends Application implements Initializable {

     @FXML ImageView Upper_img_1;
     @FXML ImageView Upper_img_2;
     @FXML ImageView Upper_img_3;
     @FXML ImageView Upper_img_4;
     @FXML ImageView Upper_img_5;
     @FXML ImageView Upper_img_6;

     @FXML ImageView Lower_img_1;
     @FXML ImageView Lower_img_2;
     @FXML ImageView Lower_img_3;
     @FXML ImageView Lower_img_4;
     @FXML ImageView Lower_img_5;
     @FXML ImageView Lower_img_6;

     @FXML BorderPane MasterPane;



     String upper_image_archive_1;
     String upper_image_archive_2;
     String upper_image_archive_3;
     String upper_image_archive_4;
     String upper_image_archive_5;
     String upper_image_archive_6;

     String lower_image_archive_1;
     String lower_image_archive_2;
     String lower_image_archive_3;
     String lower_image_archive_4;
     String lower_image_archive_5;
     String lower_image_archive_6;

     int __COUNTER__;



     @Override
     public void start(Stage stage) throws IOException {
          Parent root = FXMLLoader.load(getClass().getResource("FILEREADER.fxml"));
          Scene scene = new Scene(root);
          stage.setScene(scene);
          stage.show();

     }

     public void initialize(java.net.URL url, java.util.ResourceBundle bundle) {
          System.out.println("initialized prgram activated");
          Shuffleimg();
          Nowdays_sort();
     }

     public static void main(String[] args) {
          launch(args);
     }

     public void Shuffleimg() {
          File file = new File("/Users/gakusei058/Documents/Programing/Java/FILEREADER/Sorce/Data/User_Image");
          File[] file_list = file.listFiles();
          if (file_list != null) {
               for (int i = 0; i < file_list.length; i++) {
                    File file2 = file_list[i];
                    if (file2.isFile())
                         i++;
               }
          } else System.out.println("no image");
          shuffle(file_list);
     }

     public void shuffle(File[] array) {
          if (array.length <= 1) return;
          ArrayList < Integer > list = new ArrayList < Integer > ();
          for (int i = 0; i < array.length; i++) {
               list.add(i);
          }
          Collections.shuffle(list);
          for (int i = 0; i < array.length; i++) {
               
          }
          Lower_img_1.setImage(new Image("file:Data/User_Image/" + array[list.get(0)].getName()));
          lower_image_archive_1 = array[list.get(0)].getName();
          Lower_img_2.setImage(new Image("file:Data/User_Image/" + array[list.get(1)].getName()));
          lower_image_archive_2 = array[list.get(1)].getName();
          Lower_img_3.setImage(new Image("file:Data/User_Image/" + array[list.get(2)].getName()));
          lower_image_archive_3 = array[list.get(2)].getName();
          Lower_img_4.setImage(new Image("file:Data/User_Image/" + array[list.get(3)].getName()));
          lower_image_archive_4 = array[list.get(3)].getName();
          Lower_img_5.setImage(new Image("file:Data/User_Image/" + array[list.get(4)].getName()));
          lower_image_archive_5 = array[list.get(4)].getName();
          Lower_img_6.setImage(new Image("file:Data/User_Image/" + array[list.get(5)].getName()));
          lower_image_archive_6 = array[list.get(5)].getName();
     }
     public void Nowdays_sort() {
          try {
               BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("/Users/gakusei058/Documents/Programing/Java/FILEREADER/Sorce/最近のファイル.txt"), Charset.forName("UTF-8")));
               String text;
               while ((text = br.readLine()) != null) {
                    if (__COUNTER__ == 6) break;
                    //System.out.println("nowdays file " + __COUNTER__+ " = " + text);
                    switch (__COUNTER__) {
                         case 0:
                              upper_image_archive_1 = text.substring(11);
                              Upper_img_1.setImage(new Image("file:Data/User_Image/" + text.substring(11)));
                              break;
                         case 1:
                              upper_image_archive_2 = text.substring(11);
                              Upper_img_2.setImage(new Image("file:Data/User_Image/" + text.substring(11)));
                              break;
                         case 2:
                              upper_image_archive_3 = text.substring(11);
                              Upper_img_3.setImage(new Image("file:Data/User_Image/" + text.substring(11)));
                              break;
                         case 3:
                              upper_image_archive_4 = text.substring(11);
                              Upper_img_4.setImage(new Image("file:Data/User_Image/" + text.substring(11)));
                              break;
                         case 4:
                              upper_image_archive_5 = text.substring(11);
                              Upper_img_5.setImage(new Image("file:Data/User_Image/" + text.substring(11)));
                              break;
                         case 5:
                              upper_image_archive_6 = text.substring(11);
                              Upper_img_6.setImage(new Image("file:Data/User_Image/" + text.substring(11)));
                              break;
                    }
                    __COUNTER__++;
               }
               __COUNTER__ = 0;
          } catch (Exception ex) {}
     }

     //!---------------------------------------------------------------------------------------------------------
     //!---------------------------------------------------------------------------------------------------------
     //!---------------------------------------------------------------------------------------------------------
     //!---------------------------------------------------------------------------------------------------------
     //!---------------------------------------------------------------------------------------------------------
     //!---------------------------------------------------------------------------------------------------------

     @FXML

     public void ShowSecondWindows1(ActionEvent e) throws IOException {
          Path path = Paths.get("/Users/gakusei058/Documents/Programing/Java/FILEREADER/Sorce/最近のファイル.txt");
          try {
               String text = Files.readString(path);
               //System.out.println(text);
               Files.writeString(path, "lower.1 -> " + lower_image_archive_1 + "\n" + text);
          } catch (IOException eee) {
               System.out.println(eee);
          }
          FILEREADER2 a = new FILEREADER2();
          a.OPENSEEKER();

     }

     public void ShowSecondWindows2(ActionEvent e) throws IOException {
          Path path = Paths.get("/Users/gakusei058/Documents/Programing/Java/FILEREADER/Sorce/最近のファイル.txt");
          try {
               String text = Files.readString(path);
               //System.out.println(text);
               Files.writeString(path, "lower.2 -> " + lower_image_archive_2 + "\n" + text);
          } catch (IOException eee) {
               System.out.println(eee);
          }
          FILEREADER2 a = new FILEREADER2();
          a.OPENSEEKER();

     }

     public void ShowSecondWindows3(ActionEvent e) throws IOException {
          Path path = Paths.get("/Users/gakusei058/Documents/Programing/Java/FILEREADER/Sorce/最近のファイル.txt");
          try {
               String text = Files.readString(path);
               //System.out.println(text);
               Files.writeString(path, "lower.3 -> " + lower_image_archive_3 + "\n" + text);
          } catch (IOException eee) {
               System.out.println(eee);
          }
          FILEREADER2 a = new FILEREADER2();
          a.OPENSEEKER();

     }

     public void ShowSecondWindows4(ActionEvent e) throws IOException {
          Path path = Paths.get("/Users/gakusei058/Documents/Programing/Java/FILEREADER/Sorce/最近のファイル.txt");
          try {
               String text = Files.readString(path);
               //System.out.println(text);
               Files.writeString(path, "lower.4 -> " + lower_image_archive_4 + "\n" + text);
          } catch (IOException eee) {
               System.out.println(eee);
          }
          FILEREADER2 a = new FILEREADER2();
          a.OPENSEEKER();
     }

     public void ShowSecondWindows5(ActionEvent e) throws IOException {
          Path path = Paths.get("/Users/gakusei058/Documents/Programing/Java/FILEREADER/Sorce/最近のファイル.txt");
          try {
               String text = Files.readString(path);
               //System.out.println(text);
               Files.writeString(path, "lower.5 -> " + lower_image_archive_5 + "\n" + text);
          } catch (IOException eee) {
               System.out.println(eee);
          }
          FILEREADER2 a = new FILEREADER2();
          a.OPENSEEKER();
     }

     public void ShowSecondWindows6(ActionEvent e) throws IOException {
          Path path = Paths.get("/Users/gakusei058/Documents/Programing/Java/FILEREADER/Sorce/最近のファイル.txt");
          try {
               String text = Files.readString(path);
               //System.out.println(text);
               Files.writeString(path, "lower.6 -> " + lower_image_archive_6 + "\n" + text);
          } catch (IOException eee) {
               System.out.println(eee);
          }
          FILEREADER2 a = new FILEREADER2();
          a.OPENSEEKER();
     }



     //!---------------------------------------------------------------------------------------------------------
     //!---------------------------------------------------------------------------------------------------------
     //!---------------------------------------------------------------------------------------------------------
     //!---------------------------------------------------------------------------------------------------------
     //!---------------------------------------------------------------------------------------------------------
     //!---------------------------------------------------------------------------------------------------------

     public void ShowSecondWindows1_2(ActionEvent e) throws IOException {
          Path path = Paths.get("/Users/gakusei058/Documents/Programing/Java/FILEREADER/Sorce/最近のファイル.txt");
          try {
               String text = Files.readString(path);
               //System.out.println(text);
               Files.writeString(path, "lower.1 -> " + upper_image_archive_1 + "\n" + text);
          } catch (IOException eee) {
               System.out.println(eee);
          }
          FILEREADER2 a = new FILEREADER2();
          a.OPENSEEKER();

     }

     public void ShowSecondWindows2_2(ActionEvent e) throws IOException {
          Path path = Paths.get("/Users/gakusei058/Documents/Programing/Java/FILEREADER/Sorce/最近のファイル.txt");
          try {
               String text = Files.readString(path);
               //System.out.println(text);
               Files.writeString(path, "lower.2 -> " + upper_image_archive_2 + "\n" + text);
          } catch (IOException eee) {
               System.out.println(eee);
          }
          FILEREADER2 a = new FILEREADER2();
          a.OPENSEEKER();

     }

     public void ShowSecondWindows3_2(ActionEvent e) throws IOException {
          Path path = Paths.get("/Users/gakusei058/Documents/Programing/Java/FILEREADER/Sorce/最近のファイル.txt");
          try {
               String text = Files.readString(path);
               //System.out.println(text);
               Files.writeString(path, "lower.3 -> " + upper_image_archive_3 + "\n" + text);
          } catch (IOException eee) {
               System.out.println(eee);
          }
          FILEREADER2 a = new FILEREADER2();
          a.OPENSEEKER();

     }

     public void ShowSecondWindows4_2(ActionEvent e) throws IOException {
          Path path = Paths.get("/Users/gakusei058/Documents/Programing/Java/FILEREADER/Sorce/最近のファイル.txt");
          try {
               String text = Files.readString(path);
               //System.out.println(text);
               Files.writeString(path, "lower.4 -> " + upper_image_archive_4 + "\n" + text);
          } catch (IOException eee) {
               System.out.println(eee);
          }
          FILEREADER2 a = new FILEREADER2();
          a.OPENSEEKER();
     }

     public void ShowSecondWindows5_2(ActionEvent e) throws IOException {
          Path path = Paths.get("/Users/gakusei058/Documents/Programing/Java/FILEREADER/Sorce/最近のファイル.txt");
          try {
               String text = Files.readString(path);
               //System.out.println(text);
               Files.writeString(path, "lower.5 -> " + upper_image_archive_5 + "\n" + text);
          } catch (IOException eee) {
               System.out.println(eee);
          }
          FILEREADER2 a = new FILEREADER2();
          a.OPENSEEKER();
     }

     public void ShowSecondWindows6_2(ActionEvent e) throws IOException {
          Path path = Paths.get("/Users/gakusei058/Documents/Programing/Java/FILEREADER/Sorce/最近のファイル.txt");
          try {
               String text = Files.readString(path);
               //System.out.println(text);
               Files.writeString(path, "lower.6 -> " + upper_image_archive_6 + "\n" + text);
          } catch (IOException eee) {
               System.out.println(eee);
          }
          FILEREADER2 a = new FILEREADER2();
          a.OPENSEEKER();
     }

     //!---------------------------------------------------------------------------------------------------------
     //!---------------------------------------------------------------------------------------------------------
     //!---------------------------------------------------------------------------------------------------------
     //!---------------------------------------------------------------------------------------------------------
     //!---------------------------------------------------------------------------------------------------------
     //!---------------------------------------------------------------------------------------------------------


     public void MakeFiles(ActionEvent event) throws IOException {

          FileChooser fc = new FileChooser();


          File file = fc.showOpenDialog(null);
          //System.out.println(file);
          if (file != null) {
               fc.setInitialDirectory(new File("/Users/gakusei058/Documents/Programing/Java/FILEREADER/Data/User_Image"));
               File file2 = fc.showSaveDialog(null);
               if (file2 != null) {
                    FileInputStream fileIn = new FileInputStream(file);
                    FileOutputStream fileOut = new FileOutputStream(file2 + ".jpg");
                    byte[] buf = new byte[256];
                    int len;
                    while ((len = fileIn.read(buf)) != -1) {
                         fileOut.write(buf);
                    }
                    fileOut.flush();
                    fileOut.close();
                    fileIn.close();
               }
          }

     }

     public void MakeDirectry(ActionEvent event) throws IOException {
          TextInputDialog dialog = new TextInputDialog("ここに入力");
          dialog.setTitle("新規フォルダ名を入力");
          Optional < String > result = dialog.showAndWait();
          result.ifPresent(value -> {
               try {
                    Path path1 = Paths.get("/Users/gakusei058/Documents/Programing/Java/FILEREADER/Sorce/Data/User_Image/" + value);
                    Files.createDirectory(path1);
                    //System.out.println("aaaaa");
               } catch (IOException eee) {
                    System.err.println(eee.getMessage());
                    System.out.println("bbbbbbbb");
               }
          });


     }



}