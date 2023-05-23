package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.ImageView;
import model.*;

public class FruitController {

    @FXML
    ImageView img1, img2, img3, img4, img5;

    @FXML
    Button btn1, btn2, btn3, btn4, btn5;

    Peri peri = new Peri();
    Coco coco = new Coco();
    Mendokoro mendokoro = new Mendokoro();
    Yabu yabu = new Yabu();
    Yakimix yakimix = new Yakimix();

    public void initialize() {

        peri.setColor("Rate ☆☆☆☆");
        peri.setTaste("mouth-watering smoky flavor");

        coco.setColor("Rate ☆☆☆");
        coco.setTaste("savory-sweet, rich and creamy with a rude amount of flavour");

        mendokoro.setColor("Rate ☆☆☆☆☆");
        mendokoro.setTaste(
                "Ramen comes in 3 kinds: Shio (salt-based), Kuro (milky base with garlic oil) and Aka (spicy).");

        yabu.setColor("Rate ☆☆☆");
        yabu.setTaste(" the Rosu and Hire Katsu Sets!");

        yakimix.setColor("Rate ☆☆");
        yakimix.setTaste("Asian foods, mostly Korean, Japanese and Chinese food");

    }

    public void showInfo(ActionEvent event) {

        Button sourceButton = (Button) event.getSource();
        Alert alert = new Alert(AlertType.INFORMATION);

        if (sourceButton.equals(btn1)) {
            alert.setContentText("Yakimix " + yakimix.getRate() + " and " + yakimix.getTaste());
        }

        if (sourceButton == btn2) {
            alert.setContentText("Peri-peri " + peri.getRate() + " and " + peri.getTaste());
        }

        if (sourceButton == btn3) {
            alert.setContentText("Coco " + coco.getRate() + " and " + coco.getTaste());
        }

        if (sourceButton == btn4) {
            alert.setContentText("Yabu " + yabu.getRate() + " and " + yabu.getTaste());
        }

        if (sourceButton == btn5) {
            alert.setContentText("Mendokoro " + mendokoro.getRate() + " and " + mendokoro.getTaste());
        }

        alert.showAndWait();

    }
}