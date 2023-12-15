package com.example.warenkorb;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.TextField;

public class WarenkorbController {
    LinkedList<OrderItem> orderedItems = new LinkedList<OrderItem>();
    @FXML
    private ComboBox<Product> comboBoxProducts;
    @FXML
    private TextField AnzahlProdukten;
    @FXML
    private Label anzahlWarenkorbProdukte;


    @FXML
    public void initialize() throws SQLException {
        holeProdukteVonDatenbank();

    }
    @FXML
    protected void zumWarenkorbHinzufügen() throws SQLException {



        Product orderedProduct = comboBoxProducts.getValue();

        OrderItem item = new OrderItem();

        int anzahl = Integer.parseInt(AnzahlProdukten.getText());
        String gotQuantity = item.getQuantity(anzahl);


        item.setProduct(orderedProduct);
        item.setQuantity(anzahl);

        orderedItems.add(item);
        //Product selectedProduct = (Product)comboBoxProducts.getValue();

        for (int i = 0; i < orderedItems.size(); i++) {
            OrderItem oi = orderedItems.get(i);
            String s = oi.getProduct().getName();
            String objectCounter = String.valueOf(anzahl);
            anzahlWarenkorbProdukte.setText(objectCounter);
            s += " wurde " + oi.getQuantity(anzahl) + "x bestellt";
            System.out.println(s);
            oi.getAmountOfObjects++;
        }
    }

    protected void holeProdukteVonDatenbank() throws SQLException {

            String connectionString = "jdbc:sqlserver://mssql1.webland.ch;encrypt=true;databaseName=d041e_blj;user=d041e_blj;password=BljDbPw_01";
                Connection connection = DriverManager.getConnection(connectionString);

                Statement statement = connection.createStatement();
                ResultSet rs = statement.executeQuery("select * from products");

                while (rs.next()) {
                    Product p = new Product();

                    String productName = rs.getString("product_name");
                    double productPrice = rs.getDouble("price");
                    int productId = rs.getInt("id");

                    p.setName(productName);
                    p.setPrice(productPrice);
                    p.setId(productId);

                    comboBoxProducts.getItems().add(p);

            }
    }

}