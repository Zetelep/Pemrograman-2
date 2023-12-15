package MODUL6;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;

public class TableMahasiswa extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
    TableView tbv = new TableView();
    TableColumn<String,Mahasiswa> cl1 = new TableColumn<>("NIM");
    cl1.setCellValueFactory(new PropertyValueFactory<>("NIM"));

    TableColumn<String,Mahasiswa> cl2 = new TableColumn<>("Nama");
    cl2.setCellValueFactory(new PropertyValueFactory<>("name"));

    tbv.getColumns().add(cl1);
    tbv.getColumns().add(cl2);


    //10 data mahasiswa
        List<Mahasiswa> listMahasiswa = new ArrayList<>();

        listMahasiswa.add(new Mahasiswa(1, "John Doe", "12345"));
        listMahasiswa.add(new Mahasiswa(2, "Jane Doe", "54321"));
        listMahasiswa.add(new Mahasiswa(3, "Bob Smith", "67890"));
        listMahasiswa.add(new Mahasiswa(4, "Alice Johnson", "98765"));
        listMahasiswa.add(new Mahasiswa(5, "Charlie Brown", "23456"));
        listMahasiswa.add(new Mahasiswa(6, "Eve Williams", "87654"));
        listMahasiswa.add(new Mahasiswa(7, "Frank White", "45678"));
        listMahasiswa.add(new Mahasiswa(8, "Grace Davis", "78901"));
        listMahasiswa.add(new Mahasiswa(9, "Henry Miller", "34567"));
        listMahasiswa.add(new Mahasiswa(10, "Ivy Robinson", "89012"));


        for (Mahasiswa i: listMahasiswa) {
            tbv.getItems().add(i);
        }

        VBox vbox = new VBox();
        vbox.getChildren().addAll(tbv);
        vbox.setSpacing(10);
        vbox.setAlignment(Pos.CENTER);
        Scene scene = new Scene(vbox);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}
