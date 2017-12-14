package sample;

import javafx.animation.*;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.concurrent.Task;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.effect.Blend;
import javafx.scene.effect.BlendMode;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.InnerShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.image.PixelReader;
import javafx.scene.image.WritableImage;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.StrokeLineCap;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.stage.Window;
import javafx.util.Duration;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Polygon;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static java.awt.Color.BLACK;
import static java.awt.SystemColor.text;

public class Main extends Application {
    Scene scene1;
    static StackPane layout1 = new StackPane();
    List<String> images = new ArrayList<>();
    List<Button> buttons = new ArrayList<>();
    int timer = 20;
    String style = "-fx-background-color: transparent;";
    int amount = 1000;
    static int startCash = 1000;
    static Text cash;
    static Text winCash;
    List<String> cashImages = new ArrayList<>();
    static int bet = 5;
    static int lines = 1;
    static int clicks = 0;
    static int linesClicks = 0;
    String cheatWord = "";
    static Boolean jackpot = true;

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Slots!!!");

        scene1 = new Scene(layout1, 1300, 900);
        layout1.setStyle("-fx-background:#FFFFFF");

//        images.add("BAR1.png");
//        images.add("BAR2.png");
//        images.add("BAR3.png");
//        images.add("bell.png");
//        images.add("cherry.png");
//        images.add("seven.png");

        cashImages.add("cash1.png");
        cashImages.add("cash2.png");
        cashImages.add("cash3.png");
        cashImages.add("cash4.png");
        cashImages.add("cash5.png");
        cashImages.add("cash6.png");
        cashImages.add("cash7.png");
        cashImages.add("cash8.png");
        cashImages.add("cash9.png");
        cashImages.add("cash10.png");

        images.add("cherry1.png");
        images.add("seven1.png");
        images.add("plum.png");
        images.add("win.png");
        images.add("BAR2-1.png");
        images.add("BAR1-1.png");
        images.add("BAR3-1.png");
        images.add("Diamond.png");
        images.add("Lemon.png");
        images.add("bell1.png");
        images.add("ar.png");
        images.add("bananas.png");
        images.add("corn.png");
        images.add("cub.png");
        images.add("leaf.png");
        images.add("luck.png");
        images.add("pinapple.png");
        Button start = new Button("Start");
        start.setTranslateY(-layout1.getHeight() / 4 + 575);
        start.setTranslateX(-layout1.getWidth() / 4 + 600);

        Button slot_1_1 = new Button();
        slot_1_1.setTranslateY(-layout1.getHeight() / 4 + 40);
        slot_1_1.setTranslateX(-layout1.getWidth() / 4);
        slot_1_1.setMaxWidth(200);
        slot_1_1.setMaxHeight(200);

        Button slot_2_1 = new Button();
        slot_2_1.setTranslateY(-layout1.getHeight() / 4 + 200);
        slot_2_1.setTranslateX(-layout1.getWidth() / 4);
        slot_2_1.setMaxWidth(200);
        slot_2_1.setMaxHeight(200);

        Button slot_3_1 = new Button();
        slot_3_1.setTranslateY(-layout1.getHeight() / 4 + 360);
        slot_3_1.setTranslateX(-layout1.getWidth() / 4);
        slot_3_1.setMaxWidth(200);
        slot_3_1.setMaxHeight(200);

        Button slot_1_2 = new Button();
        slot_1_2.setTranslateY(-layout1.getHeight() / 4 + 40);
        slot_1_2.setTranslateX(-layout1.getWidth() / 4 + 200);
        slot_1_2.setMaxWidth(100);
        slot_1_2.setMaxHeight(100);

        Button slot_2_2 = new Button();
        slot_2_2.setTranslateY(-layout1.getHeight() / 4 + 200);
        slot_2_2.setTranslateX(-layout1.getWidth() / 4 + 200);
        slot_2_2.setMaxWidth(100);
        slot_2_2.setMaxHeight(100);

        Button slot_3_2 = new Button();
        slot_3_2.setTranslateY(-layout1.getHeight() / 4 + 360);
        slot_3_2.setTranslateX(-layout1.getWidth() / 4 + 200);
        slot_3_2.setMaxWidth(100);
        slot_3_2.setMaxHeight(100);

        Button slot_1_3 = new Button();
        slot_1_3.setTranslateY(-layout1.getHeight() / 4 + 40);
        slot_1_3.setTranslateX(-layout1.getWidth() / 4 + 400);
        slot_1_3.setMaxWidth(100);
        slot_1_3.setMaxHeight(100);

        Button slot_2_3 = new Button();
        slot_2_3.setTranslateY(-layout1.getHeight() / 4 + 200);
        slot_2_3.setTranslateX(-layout1.getWidth() / 4 + 400);
        slot_2_3.setMaxWidth(100);
        slot_2_3.setMaxHeight(100);

        Button slot_3_3 = new Button();
        slot_3_3.setTranslateY(-layout1.getHeight() / 4 + 360);
        slot_3_3.setTranslateX(-layout1.getWidth() / 4 + 400);
        slot_3_3.setMaxWidth(100);
        slot_3_3.setMaxHeight(100);

        Polygon polygonLeft = new Polygon();
        polygonLeft.getPoints().addAll(new Double[]{
                0.0, 0.0,
                -25.0, 25.0,
                0.0, 50.0});
        polygonLeft.setTranslateY(-layout1.getHeight() / 4 + 199);
        polygonLeft.setTranslateX(-layout1.getHeight() / 4 + 415);
        polygonLeft.setStroke(Color.GREEN);
        polygonLeft.setFill(Color.WHITE);
        polygonLeft.setStrokeWidth(5);

        Polygon polygonRight = new Polygon();
        polygonRight.getPoints().addAll(new Double[]{
                0.0, 0.0,
                25.0, 25.0,
                0.0, 50.0});
        polygonRight.setTranslateY(-layout1.getHeight() / 4 + 199);
        polygonRight.setTranslateX(-layout1.getHeight() / 4 - 215);
        polygonRight.setStroke(Color.GREEN);
        polygonRight.setFill(Color.WHITE);
        polygonRight.setStrokeWidth(5);

        Polygon polygonLeft1 = new Polygon();
        polygonLeft1.getPoints().addAll(new Double[]{
                0.0, 0.0,
                -25.0, 25.0,
                0.0, 50.0});
        polygonLeft1.setTranslateY(-layout1.getHeight() / 4 + 39);
        polygonLeft1.setTranslateX(-layout1.getHeight() / 4 + 415);
        polygonLeft1.setStroke(Color.GREEN);
        polygonLeft1.setFill(Color.WHITE);
        polygonLeft1.setStrokeWidth(5);

        Polygon polygonRight1 = new Polygon();
        polygonRight1.getPoints().addAll(new Double[]{
                0.0, 0.0,
                25.0, 25.0,
                0.0, 50.0});
        polygonRight1.setTranslateY(-layout1.getHeight() / 4 + 39);
        polygonRight1.setTranslateX(-layout1.getHeight() / 4 - 215);
        polygonRight1.setStroke(Color.GREEN);
        polygonRight1.setFill(Color.WHITE);
        polygonRight1.setStrokeWidth(5);

        Polygon polygonLeft2 = new Polygon();
        polygonLeft2.getPoints().addAll(new Double[]{
                0.0, 0.0,
                -25.0, 25.0,
                0.0, 50.0});
        polygonLeft2.setTranslateY(-layout1.getHeight() / 4 + 359);
        polygonLeft2.setTranslateX(-layout1.getHeight() / 4 + 415);
        polygonLeft2.setStroke(Color.GREEN);
        polygonLeft2.setFill(Color.WHITE);
        polygonLeft2.setStrokeWidth(5);

        Polygon polygonRight2 = new Polygon();
        polygonRight2.getPoints().addAll(new Double[]{
                0.0, 0.0,
                25.0, 25.0,
                0.0, 50.0});
        polygonRight2.setTranslateY(-layout1.getHeight() / 4 + 359);
        polygonRight2.setTranslateX(-layout1.getHeight() / 4 - 215);
        polygonRight2.setStroke(Color.GREEN);
        polygonRight2.setFill(Color.WHITE);
        polygonRight2.setStrokeWidth(5);

        Rectangle mainRectangle = new Rectangle();
        mainRectangle.setTranslateX(-layout1.getWidth() / 4 + 199);
        mainRectangle.setTranslateY(-layout1.getHeight() / 4 + 199);
        mainRectangle.setFill(Color.TRANSPARENT);
        mainRectangle.setStroke(Color.GREEN);
        mainRectangle.setWidth(620);
        mainRectangle.setHeight(620);
        mainRectangle.setStrokeWidth(5);
        mainRectangle.setArcHeight(25);
        mainRectangle.setArcWidth(25);

        Rectangle jackPot = new Rectangle();
        jackPot.setTranslateX(layout1.getWidth() / 4 + 40);
        jackPot.setTranslateY(layout1.getHeight() / 4 - 410);
        jackPot.setFill(Color.GREEN);
        jackPot.setStroke(Color.WHITE);
        jackPot.setWidth(300);
        jackPot.setHeight(300);
        jackPot.setStrokeWidth(5);
        jackPot.setArcHeight(25);
        jackPot.setArcWidth(25);

        ListView<String> list = new ListView<String>();
        ObservableList<String> items = FXCollections.observableArrayList(
                "Jackpot List:", "777", "Family App");
        list.setItems(items);
        list.setTranslateX(layout1.getWidth() / 4 + 40);
        list.setTranslateY(layout1.getHeight() / 4 - 410);
        list.setMaxWidth(300);
        list.setMaxHeight(300);
        list.setStyle(".list-cell:favorite {-fx-background-color: #ff0000;}");

        Button increaseBet = new Button("˄");
        increaseBet.setTranslateY(-layout1.getHeight() / 4 + 545);
        increaseBet.setTranslateX(-layout1.getWidth() / 4 + 330);
        increaseBet.setMaxWidth(100);
        increaseBet.setMaxHeight(15);
        increaseBet.setDisable(true);

        Button decreaseBet = new Button("˅");
        decreaseBet.setTranslateY(-layout1.getHeight() / 4 + 605);
        decreaseBet.setTranslateX(-layout1.getWidth() / 4 + 330);
        decreaseBet.setMaxWidth(100);
        decreaseBet.setMaxHeight(15);
        decreaseBet.setDisable(true);

        Button increaseLines = new Button("˄");
        increaseLines.setTranslateY(-layout1.getHeight() / 4 + 545);
        increaseLines.setTranslateX(-layout1.getWidth() / 4 - 60);
        increaseLines.setMaxWidth(100);
        increaseLines.setMaxHeight(15);
        increaseLines.setDisable(true);

        Button decreaseLines = new Button("˅");
        decreaseLines.setTranslateY(-layout1.getHeight() / 4 + 605);
        decreaseLines.setTranslateX(-layout1.getWidth() / 4 - 60);
        decreaseLines.setMaxWidth(100);
        decreaseLines.setMaxHeight(15);
        decreaseLines.setDisable(true);

        Text cashWord = new Text();
        cashWord.setTranslateY(-layout1.getHeight() / 4 - 140);
        cashWord.setTranslateX(-layout1.getWidth() / 4 - 50);
        cashWord.setText("CASH: ");

        Text betWord = new Text();
        betWord.setTranslateY(-layout1.getHeight() / 4 + 530);
        betWord.setTranslateX(-layout1.getWidth() / 4 + 200);
        betWord.setText("BET");
        betWord.setFont(Font.font("Verdana", FontPosture.ITALIC, 20));
        betWord.setFill(Color.web("#43df13"));
        betWord.setFont(Font.font(null, FontWeight.BOLD, 30));

        Text betDisplay = new Text();
        betDisplay.setTranslateY(-layout1.getHeight() / 4 + 575);
        betDisplay.setTranslateX(-layout1.getWidth() / 4 + 200);
        betDisplay.setText("" + bet);
        betDisplay.setFont(Font.font("Verdana", 20));
        betDisplay.setFill(Color.WHITE);

        Rectangle betRectangle = new Rectangle(30, 30, 100, 50);
        betRectangle.setTranslateY(-layout1.getHeight() / 4 + 575);
        betRectangle.setTranslateX(-layout1.getWidth() / 4 + 200);
        betRectangle.setStyle("-fx-background: green");

        betRectangle.setArcHeight(25);
        betRectangle.setArcWidth(25);
        betRectangle.setStroke(Color.WHITE);
        betRectangle.setFill(Color.GREEN);

        Text linesDisplay = new Text();
        linesDisplay.setTranslateY(-layout1.getHeight() / 4 + 575);
        linesDisplay.setTranslateX(-layout1.getWidth() / 4 + 70);
        linesDisplay.setText("" + lines);
        linesDisplay.setFont(Font.font("Verdana", 20));
        linesDisplay.setFill(Color.WHITE);

        Rectangle linesRectangle = new Rectangle(30, 30, 100, 50);
        linesRectangle.setTranslateY(-layout1.getHeight() / 4 + 575);
        linesRectangle.setTranslateX(-layout1.getWidth() / 4 + 70);
        linesRectangle.setStyle("-fx-background: green");

        linesRectangle.setArcHeight(25);
        linesRectangle.setArcWidth(25);
        linesRectangle.setStroke(Color.WHITE);
        linesRectangle.setFill(Color.GREEN);

        Text linesWord = new Text();
        linesWord.setTranslateY(-layout1.getHeight() / 4 + 530);
        linesWord.setTranslateX(-layout1.getWidth() / 4 + 70);
        linesWord.setText("LINES");
        linesWord.setFont(Font.font("Verdana", FontPosture.ITALIC, 20));
        linesWord.setFill(Color.web("#43df13"));
        linesWord.setFont(Font.font(null, FontWeight.BOLD, 30));

        Text multipleSign = new Text();
        multipleSign.setTranslateY(-layout1.getHeight() / 4 + 575);
        multipleSign.setTranslateX(-layout1.getWidth() / 4 + 135);
        multipleSign.setText("X");
        multipleSign.setFont(Font.font("Verdana", FontPosture.ITALIC, 20));
        multipleSign.setFill(Color.web("#43df13"));
        multipleSign.setFont(Font.font(null, FontWeight.BOLD, 30));

        Button enterCheats = new Button();
        enterCheats.setTranslateX(layout1.getWidth() / 4 + 150);
        enterCheats.setTranslateY(layout1.getHeight() / 4 - 240);
        enterCheats.setMaxWidth(80);
        enterCheats.setMaxHeight(40);
        enterCheats.setStyle(style);

        PasswordField cheats = new PasswordField();
        cheats.setTranslateX(layout1.getWidth() / 4);
        cheats.setTranslateY(layout1.getHeight() / 4 - 240);
        cheats.setMaxWidth(200);
        cheats.setStyle("-fx-background-color: transparent, white, transparent, white;\n" +
                "    -fx-background-radius: 0, 0, 0, 0;\n" +
                "    -fx-padding: 0.166667em;");
        cheats.setBackground(Background.EMPTY);

        winCash = new Text();
        winCash.setTranslateY(layout1.getHeight() / 6);
        winCash.setTranslateX(layout1.getWidth() / 4 + 40);
        winCash.setText("0");
        winCash.setFont(Font.font("Verdana", FontPosture.ITALIC, 30));

        Rectangle winCashRectangle = new Rectangle();
        winCashRectangle.setWidth(280);
        winCashRectangle.setHeight(50);
        winCashRectangle.setTranslateY(layout1.getHeight() / 6);
        winCashRectangle.setTranslateX(layout1.getWidth() / 4 + 40);
        winCashRectangle.setFill(Color.TRANSPARENT);
        winCashRectangle.setStroke(Color.GREEN);
        winCashRectangle.setStrokeWidth(3);
        winCashRectangle.setArcWidth(20);
        winCashRectangle.setArcHeight(20);


        cashWord.setFont(Font.font(null, FontWeight.BOLD, 30));
        cashWord.setFill(Color.web("#43df13"));

        Blend blend = new Blend();
        blend.setMode(BlendMode.MULTIPLY);

        DropShadow ds = new DropShadow();
        ds.setColor(Color.rgb(254, 235, 66, 0.3));
        ds.setOffsetX(5);
        ds.setOffsetY(5);
        ds.setRadius(5);
        ds.setSpread(0.2);

        blend.setBottomInput(ds);

        DropShadow ds1 = new DropShadow();
        ds1.setColor(Color.web("#18b000"));
        ds1.setRadius(20);
        ds1.setSpread(0.2);

        Blend blend2 = new Blend();
        blend2.setMode(BlendMode.MULTIPLY);

        InnerShadow is = new InnerShadow();
        is.setColor(Color.web("#73ff48"));
        is.setRadius(9);
        is.setChoke(0.8);
        blend2.setBottomInput(is);

        InnerShadow is1 = new InnerShadow();
        is1.setColor(Color.web("#18b000"));
        is1.setRadius(5);
        is1.setChoke(0.4);
        blend2.setTopInput(is1);

        Blend blend1 = new Blend();
        blend1.setMode(BlendMode.MULTIPLY);
        blend1.setBottomInput(ds1);
        blend1.setTopInput(blend2);

        blend.setTopInput(blend1);
        cashWord.setEffect(blend);

        cash = new Text();
        cash.setTranslateY(-layout1.getHeight() / 4 - 140);
        cash.setTranslateX(-layout1.getWidth() / 4 + 60);
        cash.setText("" + startCash);
        cash.setFont(Font.font("Verdana", FontPosture.ITALIC, 20));
        cash.setFill(Color.web("#43df13"));
        cash.setEffect(blend);
        betWord.setEffect(blend);
        linesWord.setEffect(blend);
        cash.setFont(Font.font(null, FontWeight.BOLD, 30));

        buttons.add(slot_1_1);
        buttons.add(slot_2_1);
        buttons.add(slot_3_1);
        buttons.add(slot_1_2);
        buttons.add(slot_2_2);
        buttons.add(slot_3_2);
        buttons.add(slot_1_3);
        buttons.add(slot_2_3);
        buttons.add(slot_3_3);

        for (int i = 0; i < buttons.size(); i++) {
            Image imageDecline = new Image(getClass().getResourceAsStream(images.get((int) (Math.random() * images.size()))));
            buttons.get(i).setGraphic(new ImageView(imageDecline));
        }

        Button spinButton = new Button("SPIN");
        spinButton.setTranslateY(-layout1.getHeight() / 4 + 575);
        spinButton.setTranslateX(-layout1.getWidth() / 4 + 460);
        spinButton.setMaxWidth(100);
        spinButton.setMaxHeight(80);
        spinButton.setDisable(true);
        spinButton.setStyle("");

        Button normal = new Button("N");
        normal.setTranslateY(-layout1.getHeight() / 4 + 575);
        normal.setTranslateX(-layout1.getWidth() / 4 + 700);
        normal.setMaxWidth(50);
        normal.setMaxHeight(50);
        normal.setDisable(true);

        Button normal1 = new Button("S");
        normal1.setTranslateY(-layout1.getHeight() / 4 + 575);
        normal1.setTranslateX(-layout1.getWidth() / 4 + 760);
        normal1.setMaxWidth(50);
        normal1.setMaxHeight(50);

        Button normal2 = new Button("U");
        normal2.setTranslateY(-layout1.getHeight() / 4 + 575);
        normal2.setTranslateX(-layout1.getWidth() / 4 + 820);
        normal2.setMaxWidth(50);
        normal2.setMaxHeight(50);

        ImageView imageView = new ImageView(new Image(getClass().getResourceAsStream("cash1.png")));
        imageView.setTranslateY(-layout1.getHeight() / 4 - 140);
        imageView.setTranslateX(-layout1.getWidth() / 4 - 160);

        ImageView imageView2 = new ImageView(new Image(getClass().getResourceAsStream("cash1.png")));
        imageView2.setTranslateY(-layout1.getHeight() / 4 - 140);
        imageView2.setTranslateX(-layout1.getWidth() / 4 - 140);

        ImageView imageView3 = new ImageView(new Image(getClass().getResourceAsStream("cash1.png")));
        imageView3.setTranslateY(-layout1.getHeight() / 4 - 140);
        imageView3.setTranslateX(-layout1.getWidth() / 4 - 120);

        for (Button b : buttons) {
            b.setStyle(style);
            b.toBack();
        }


        spinButton.setStyle("-fx-padding: 8 15 15 15;\n" +
                "    -fx-background-insets: 0,0 0 5 0, 0 0 6 0, 0 0 7 0;\n" +
                "    -fx-background-radius: 20;\n" +
                "    -fx-background-color: \n" +
                "        linear-gradient(from 0% 93% to 0% 100%, #008000 0%, #008000 100%),\n" +
                "        #008000,\n" +
                "        #FFFFFF,\n" +
                "        radial-gradient(center 50% 50%, radius 100%, #FFFFFF, #66b266);\n" +
                "    -fx-font-weight: bold;\n" +
                "    -fx-font-size: 1.1em;\n" +
                "   -fx-font: BOLD 22 arial;\n" +
                " -fx-text-fill: #008000\n");

        increaseBet.setStyle("-fx-padding: 8 15 15 15;\n" +
                "    -fx-background-insets: 0,0 0 5 0, 0 0 6 0, 0 0 7 0;\n" +
                "    -fx-background-radius: 8;\n" +
                "    -fx-background-color: \n" +
                "        linear-gradient(from 0% 93% to 0% 100%, #008000 0%, #008000 100%),\n" +
                "        #008000,\n" +
                "       #FFFFFF,\n" +
                "        radial-gradient(center 50% 50%, radius 100%, #FFFFFF, #66b266);\n" +
                "    -fx-font-weight: bold;\n" +
                "    -fx-font-size: 1.1em;\n" +
                "   -fx-font: BOLD 22 arial;\n" +
                " -fx-text-fill: #008000\n");

        decreaseBet.setStyle("-fx-padding: 8 15 15 15;\n" +
                "    -fx-background-insets: 0,0 0 1 0, 0 0 6 0, 0 0 7 0;\n" +
                "    -fx-background-radius: 8;\n" +
                "    -fx-background-color: \n" +
                "        linear-gradient(from 0% 93% to 0% 100%, #008000 0%, #008000 100%),\n" +
                "        #008000,\n" +
                "        #FFFFFF,\n" +
                "        radial-gradient(center 50% 50%, radius 100%, #FFFFFF, #66b266);\n" +
                "    -fx-font-weight: bold;\n" +
                "    -fx-font-size: 1.1em;\n" +
                "   -fx-font: BOLD 22 arial;\n" +
                " -fx-text-fill: #008000\n");

        increaseLines.setStyle("-fx-padding: 8 15 15 15;\n" +
                "    -fx-background-insets: 0,0 0 5 0, 0 0 6 0, 0 0 7 0;\n" +
                "    -fx-background-radius: 8;\n" +
                "    -fx-background-color: \n" +
                "        linear-gradient(from 0% 93% to 0% 100%, #008000 0%, #008000 100%),\n" +
                "        #008000,\n" +
                "       #FFFFFF,\n" +
                "        radial-gradient(center 50% 50%, radius 100%, #FFFFFF, #66b266);\n" +
                "    -fx-font-weight: bold;\n" +
                "    -fx-font-size: 1.1em;\n" +
                "   -fx-font: BOLD 22 arial;\n" +
                " -fx-text-fill: #008000\n");

        decreaseLines.setStyle("-fx-padding: 8 15 15 15;\n" +
                "    -fx-background-insets: 0,0 0 1 0, 0 0 6 0, 0 0 7 0;\n" +
                "    -fx-background-radius: 8;\n" +
                "    -fx-background-color: \n" +
                "        linear-gradient(from 0% 93% to 0% 100%, #008000 0%, #008000 100%),\n" +
                "        #008000,\n" +
                "        #FFFFFF,\n" +
                "        radial-gradient(center 50% 50%, radius 100%, #FFFFFF, #66b266);\n" +
                "    -fx-font-weight: bold;\n" +
                "    -fx-font-size: 1.1em;\n" +
                "   -fx-font: BOLD 22 arial;\n" +
                " -fx-text-fill: #008000\n");

        start.setStyle("-fx-background-color: \n" +
                "        #ecebe9,\n" +
                "        rgba(0,0,0,0.05),\n" +
                "        linear-gradient(#FF0000, #E50000),\n" +
                "        linear-gradient(#FF0000 0%, #FF0000 20%, #FF0000 80%, #E50000 100%),\n" +
                "        linear-gradient(#FF0000, #E50000);\n" +
                "    -fx-background-radius: 80;\n" +
                "    -fx-background-insets: 0,9 9 8 9,9,10,11;\n" +
                "-fx-min-width: 100px;\n" +
                "-fx-min-height: 100px;\n" +
                "-fx-max-width: 100px;\n" +
                "-fx-max-height: 100px;\n" +
                "    -fx-font-family: \"Helvetica\";\n" +
                "    -fx-font-size: 10px;\n" +
                "   -fx-font: BOLD 22 arial;\n" +
                "    -fx-text-fill: #ffffff;\n" +
                "    -fx-effect: innershadow( three-pass-box , rgba(0,0,0,0.1) , 2, 0.0 , 0 , 1)");

        normal.setStyle("-fx-background-color: \n" +
                "        #ecebe9,\n" +
                "        rgba(0,0,0,0.05),\n" +
                "        linear-gradient(#FF0000, #E50000),\n" +
                "        linear-gradient(#FF0000 0%, #FF0000 20%, #FF0000 80%, #E50000 100%),\n" +
                "        linear-gradient(#FF0000, #E50000);\n" +
                "    -fx-background-insets: 0,9 9 8 9,9,10,11;\n" +
                "    -fx-background-radius: 40;\n" +
                "    -fx-padding: 10 15 10 15;\n" +
                "    -fx-font-family: \"Helvetica\";\n" +
                "    -fx-font-size: 10px;\n" +
                "   -fx-font: BOLD 22 arial;\n" +
                "    -fx-text-fill: #ffffff;\n" +
                "    -fx-effect: innershadow( three-pass-box , rgba(0,0,0,0.1) , 2, 0.0 , 0 , 1)");

        normal1.setStyle("-fx-background-color: \n" +
                "        #ecebe9,\n" +
                "        rgba(0,0,0,0.05),\n" +
                "        linear-gradient(#FF0000, #E50000),\n" +
                "        linear-gradient(#FF0000 0%, #FF0000 20%, #FF0000 80%, #E50000 100%),\n" +
                "        linear-gradient(#FF0000, #E50000);\n" +
                "    -fx-background-insets: 0,9 9 8 9,9,10,11;\n" +
                "    -fx-background-radius: 40;\n" +
                "    -fx-padding: 10 15 10 15;\n" +
                "    -fx-font-family: \"Helvetica\";\n" +
                "    -fx-font-size: 10px;\n" +
                "   -fx-font: BOLD 22 arial;\n" +
                "    -fx-text-fill: #ffffff;\n" +
                "    -fx-effect: innershadow( three-pass-box , rgba(0,0,0,0.1) , 2, 0.0 , 0 , 1)");

        normal2.setStyle("-fx-background-color: \n" +
                "        #ecebe9,\n" +
                "        rgba(0,0,0,0.05),\n" +
                "        linear-gradient(#FF0000, #E50000),\n" +
                "        linear-gradient(#FF0000 0%, #FF0000 20%, #FF0000 80%, #E50000 100%),\n" +
                "        linear-gradient(#FF0000, #E50000);\n" +
                "    -fx-background-insets: 0,9 9 8 9,9,10,11;\n" +
                "    -fx-background-radius: 40;\n" +
                "    -fx-padding: 10 15 10 15;\n" +
                "    -fx-font-family: \"Helvetica\";\n" +
                "    -fx-font-size: 10px;\n" +
                "   -fx-font: BOLD 22 arial;\n" +
                "    -fx-text-fill: #ffffff;\n" +
                "    -fx-effect: innershadow( three-pass-box , rgba(0,0,0,0.1) , 2, 0.0 , 0 , 1)");

        layout1.getChildren().addAll(mainRectangle);
        layout1.getChildren().addAll(buttons);

        enterCheats.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                cheatWord = cheats.getText();
                if (cheatWord.equalsIgnoreCase("show")) {
                    layout1.getChildren().addAll(normal, normal1, normal2);
                } else if (cheatWord.equalsIgnoreCase("hide")) {
                    layout1.getChildren().removeAll(normal, normal1, normal2);
                    normal.fire();
                } else if (cheatWord.equalsIgnoreCase("7777")) {
                    Task<Void> task1 = new Task<Void>() {
                        @Override
                        public Void call() throws Exception {
                            Platform.runLater(() -> {
                                jackpot = false;
                                for (int j = 0; j < 9; j++) {
                                    Image imageDecline11 = new Image(getClass().getResourceAsStream("seven1.png"));
                                    buttons.get(j).setGraphic(new ImageView(imageDecline11));
                                }
                            });
                            return null;
                        }
                    };
                    new Thread(task1).start();
                } else if (cheatWord.equalsIgnoreCase("n")) {
                    Task<Void> task2 = new Task<Void>() {
                        @Override
                        public Void call() throws Exception {
                            Platform.runLater(() -> {
                                jackpot = true;
                                for (int j = 0; j < 9; j++) {
                                    int orderList = (int) (Math.random() * images.size());
                                    Image imageDecline11 = new Image(getClass().getResourceAsStream(images.get(orderList)));
                                    buttons.get(j).setGraphic(new ImageView(imageDecline11));
                                }
                            });
                            return null;
                        }
                    };
                    new Thread(task2).start();
                } else if (cheatWord.equalsIgnoreCase("mmoney")) {
                    startCash = 9999999;
                    cash.setText("" + startCash);
                }
                cheats.clear();
            }
        });

        spinButton.addEventFilter(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                spinButton.setStyle("-fx-padding: 8 15 15 15;\n" +
//                        "    -fx-background-insets: 0,0 0 5 0, 0 0 6 0, 0 0 7 0;\n" +
                        "    -fx-background-radius: 20;\n" +
                        "    -fx-background-color: \n" +
                        "        linear-gradient(from 0% 93% to 0% 100%, #008000 0%, #008000 100%),\n" +
                        "        #008000,\n" +
                        "        #FFFFFF,\n" +
                        "        radial-gradient(center 50% 50%, radius 100%, #FFFFFF, #008000);\n" +
                        "    -fx-font-weight: bold;\n" +
                        "    -fx-font-size: 1.1em;\n" +
                        "   -fx-font: BOLD 22 arial;\n" +
                        " -fx-text-fill: #ffffff\n");
                layout1.getChildren().remove(winCash);
            }
        });

        spinButton.addEventFilter(MouseEvent.MOUSE_RELEASED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                spinButton.setStyle("-fx-padding: 8 15 15 15;\n" +
                        "    -fx-background-insets: 0,0 0 5 0, 0 0 6 0, 0 0 7 0;\n" +
                        "    -fx-background-radius: 20;\n" +
                        "    -fx-background-color: \n" +
                        "        linear-gradient(from 0% 93% to 0% 100%, #008000 0%, #008000 100%),\n" +
                        "        #008000,\n" +
                        "        #FFFFFF,\n" +
                        "        radial-gradient(center 50% 50%, radius 100%, #FFFFFF, #66b266);\n" +
                        "    -fx-font-weight: bold;\n" +
                        "    -fx-font-size: 1.1em;\n" +
                        "   -fx-font: BOLD 22 arial;\n" +
                        " -fx-text-fill: #008000\n");
            }
        });

        increaseBet.addEventFilter(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                increaseBet.setStyle("-fx-padding: 8 15 15 15;\n" +
//                        "    -fx-background-insets: 0,0 0 5 0, 0 0 6 0, 0 0 7 0;\n" +
                        "    -fx-background-radius: 8;\n" +
                        "    -fx-background-color: \n" +
                        "        linear-gradient(from 0% 93% to 0% 100%, #008000 0%, #008000 100%),\n" +
                        "        #008000,\n" +
                        "        #FFFFFF,\n" +
                        "        radial-gradient(center 50% 50%, radius 100%, #FFFFFF, #008000);\n" +
                        "    -fx-font-weight: bold;\n" +
                        "    -fx-font-size: 1.1em;\n" +
                        "   -fx-font: BOLD 22 arial;\n" +
                        " -fx-text-fill: #ffffff");
            }
        });

        increaseBet.addEventFilter(MouseEvent.MOUSE_RELEASED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                increaseBet.setStyle("-fx-padding: 8 15 15 15;\n" +
                        "    -fx-background-insets: 0,0 0 5 0, 0 0 6 0, 0 0 7 0;\n" +
                        "    -fx-background-radius: 8;\n" +
                        "    -fx-background-color: \n" +
                        "        linear-gradient(from 0% 93% to 0% 100%, #008000 0%, #008000 100%),\n" +
                        "        #008000,\n" +
                        "        #FFFFFF,\n" +
                        "        radial-gradient(center 50% 50%, radius 100%, #FFFFFF, #66b266);\n" +
                        "    -fx-font-weight: bold;\n" +
                        "    -fx-font-size: 1.1em;\n" +
                        "   -fx-font: BOLD 22 arial;\n" +
                        " -fx-text-fill: #008000\n");
            }
        });

        increaseLines.addEventFilter(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                increaseLines.setStyle("-fx-padding: 8 15 15 15;\n" +
//                        "    -fx-background-insets: 0,0 0 5 0, 0 0 6 0, 0 0 7 0;\n" +
                        "    -fx-background-radius: 8;\n" +
                        "    -fx-background-color: \n" +
                        "        linear-gradient(from 0% 93% to 0% 100%, #008000 0%, #008000 100%),\n" +
                        "        #008000,\n" +
                        "        #FFFFFF,\n" +
                        "        radial-gradient(center 50% 50%, radius 100%, #FFFFFF, #008000);\n" +
                        "    -fx-font-weight: bold;\n" +
                        "    -fx-font-size: 1.1em;\n" +
                        "   -fx-font: BOLD 22 arial;\n" +
                        " -fx-text-fill: #ffffff");
            }
        });

        increaseLines.addEventFilter(MouseEvent.MOUSE_RELEASED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                increaseLines.setStyle("-fx-padding: 8 15 15 15;\n" +
                        "    -fx-background-insets: 0,0 0 5 0, 0 0 6 0, 0 0 7 0;\n" +
                        "    -fx-background-radius: 8;\n" +
                        "    -fx-background-color: \n" +
                        "        linear-gradient(from 0% 93% to 0% 100%, #008000 0%, #008000 100%),\n" +
                        "        #008000,\n" +
                        "        #FFFFFF,\n" +
                        "        radial-gradient(center 50% 50%, radius 100%, #FFFFFF, #66b266);\n" +
                        "    -fx-font-weight: bold;\n" +
                        "    -fx-font-size: 1.1em;\n" +
                        "   -fx-font: BOLD 22 arial;\n" +
                        " -fx-text-fill: #008000\n");
            }
        });

        increaseBet.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent mouseEvent) {
                clicks++;
                layout1.getChildren().remove(betDisplay);
                switch (clicks) {
                    case 0:
                        bet = 10;
                        break;
                    case 1:
                        bet = 10;
                        break;
                    case 2:
                        bet = 25;
                        break;
                    case 3:
                        bet = 50;
                        break;
                    case 4:
                        bet = 100;
                        break;
                    case 5:
                        clicks = 4;
                        break;
                }
                betDisplay.setText("" + bet);
                layout1.getChildren().add(betDisplay);
            }
        });

        decreaseBet.addEventFilter(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                decreaseBet.setStyle("-fx-padding: 8 15 15 15;\n" +
//                        "    -fx-background-insets: 0,0 0 5 0, 0 0 6 0, 0 0 7 0;\n" +
                        "    -fx-background-radius: 8;\n" +
                        "    -fx-background-color: \n" +
                        "        linear-gradient(from 0% 93% to 0% 100%, #008000 0%, #008000 100%),\n" +
                        "        #008000,\n" +
                        "        #FFFFFF,\n" +
                        "        radial-gradient(center 50% 50%, radius 100%, #FFFFFF, #008000);\n" +
                        "    -fx-font-weight: bold;\n" +
                        "    -fx-font-size: 1.1em;\n" +
                        "   -fx-font: BOLD 22 arial;\n" +
                        " -fx-text-fill: #ffffff\n");
            }
        });

        decreaseBet.addEventFilter(MouseEvent.MOUSE_RELEASED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                decreaseBet.setStyle("-fx-padding: 8 15 15 15;\n" +
                        "    -fx-background-insets: 0,0 0 5 0, 0 0 6 0, 0 0 7 0;\n" +
                        "    -fx-background-radius: 8;\n" +
                        "    -fx-background-color: \n" +
                        "        linear-gradient(from 0% 93% to 0% 100%, #008000 0%, #008000 100%),\n" +
                        "        #008000,\n" +
                        "        #FFFFFF,\n" +
                        "        radial-gradient(center 50% 50%, radius 100%, #FFFFFF, #66b266);\n" +
                        "    -fx-font-weight: bold;\n" +
                        "    -fx-font-size: 1.1em;\n" +
                        "   -fx-font: BOLD 22 arial;\n" +
                        " -fx-text-fill: #008000\n");
            }
        });

        decreaseBet.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                clicks--;
                layout1.getChildren().remove(betDisplay);
                switch (clicks) {
                    case 0:
                        bet = 5;
                        break;
                    case 1:
                        bet = 10;
                        break;
                    case 2:
                        bet = 25;
                        break;
                    case 3:
                        bet = 50;
                        break;
                    case 4:
                        bet = 100;
                        break;
                    default:
                        clicks = 0;
                        break;
                }
                System.out.println(clicks);
                betDisplay.setText("" + bet);
                layout1.getChildren().add(betDisplay);
            }
        });

        decreaseLines.addEventFilter(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                decreaseLines.setStyle("-fx-padding: 8 15 15 15;\n" +
//                        "    -fx-background-insets: 0,0 0 5 0, 0 0 6 0, 0 0 7 0;\n" +
                        "    -fx-background-radius: 8;\n" +
                        "    -fx-background-color: \n" +
                        "        linear-gradient(from 0% 93% to 0% 100%, #008000 0%, #008000 100%),\n" +
                        "        #008000,\n" +
                        "        #FFFFFF,\n" +
                        "        radial-gradient(center 50% 50%, radius 100%, #FFFFFF, #008000);\n" +
                        "    -fx-font-weight: bold;\n" +
                        "    -fx-font-size: 1.1em;\n" +
                        "   -fx-font: BOLD 22 arial;\n" +
                        " -fx-text-fill: #ffffff\n");
            }
        });

        decreaseLines.addEventFilter(MouseEvent.MOUSE_RELEASED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                decreaseLines.setStyle("-fx-padding: 8 15 15 15;\n" +
                        "    -fx-background-insets: 0,0 0 5 0, 0 0 6 0, 0 0 7 0;\n" +
                        "    -fx-background-radius: 8;\n" +
                        "    -fx-background-color: \n" +
                        "        linear-gradient(from 0% 93% to 0% 100%, #008000 0%, #008000 100%),\n" +
                        "        #008000,\n" +
                        "        #FFFFFF,\n" +
                        "        radial-gradient(center 50% 50%, radius 100%, #FFFFFF, #66b266);\n" +
                        "    -fx-font-weight: bold;\n" +
                        "    -fx-font-size: 1.1em;\n" +
                        "   -fx-font: BOLD 22 arial;\n" +
                        " -fx-text-fill: #008000\n");
            }
        });

        decreaseLines.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                linesClicks--;
                layout1.getChildren().remove(linesDisplay);
                switch (linesClicks) {
                    case -1:
                        linesClicks = 0;
                        break;
                    case 0:
                        lines = 1;
                        layout1.getChildren().removeAll(polygonLeft1, polygonRight1);
                        break;
                    case 1:
                        lines = 2;
                        layout1.getChildren().removeAll(polygonLeft2, polygonRight2);
                        break;
                    case 2:
                        lines = 3;
                        break;
                }
                linesDisplay.setText("" + lines);
                layout1.getChildren().add(linesDisplay);
            }
        });

        increaseLines.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent mouseEvent) {
                linesClicks++;
                layout1.getChildren().remove(linesDisplay);
                switch (linesClicks) {
                    case 0:
                        lines = 1;
                        break;
                    case 1:
                        lines = 2;
                        layout1.getChildren().addAll(polygonLeft1, polygonRight1);
                        break;
                    case 2:
                        lines = 3;
                        layout1.getChildren().addAll(polygonLeft2, polygonRight2);
                        break;
                    case 3:
                        linesClicks = 2;
                        break;
                }
                linesDisplay.setText("" + lines);
                layout1.getChildren().add(linesDisplay);
            }
        });

        start.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Thread thread9 = new Thread(() -> {
                    int rotate = 1;
                    while (true) {

                        try {
                            Thread.sleep(25);
                        } catch (InterruptedException exc) {
                        }
                        Platform.runLater(() -> {
                            layout1.getChildren().removeAll(imageView, imageView2, imageView3);
                        });

                        rotate++;
                        if (rotate == 10) {
                            rotate = 0;
                        }

                        imageView.setImage(new Image(getClass().getResourceAsStream(cashImages.get(rotate))));
                        imageView2.setImage(new Image(getClass().getResourceAsStream(cashImages.get(rotate))));
                        imageView3.setImage(new Image(getClass().getResourceAsStream(cashImages.get(rotate))));

                        try {
                            Thread.sleep(25);
                        } catch (InterruptedException exc) {
                        }
                        Platform.runLater(() -> {
                            layout1.getChildren().addAll(imageView, imageView2, imageView3);
                        });
                    }
                });
                thread9.setDaemon(true);
                thread9.start();

                spinButton.setDisable(false);
                increaseBet.setDisable(false);
                decreaseBet.setDisable(false);
                increaseLines.setDisable(false);
                decreaseLines.setDisable(false);

                start.setDisable(true);
            }
        });

        start.addEventFilter(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                start.setStyle("-fx-background-color: \n" +
                        "        #ecebe9,\n" +
                        "        rgba(0,0,0,0.05),\n" +
                        "        linear-gradient(#FFFFFF, #FFFFFF),\n" +
                        "        linear-gradient(#FFFFFF 0%, #FFFFFF 20%, #FFFFFF 80%, #FFFFFF 100%),\n" +
                        "        linear-gradient(#FFFFFF, #FFFFFF);\n" +
                        "    -fx-background-radius: 80;\n" +
                        "    -fx-background-insets: 0,9 9 8 9,9,10,11;\n" +
                        "    -fx-background-insets-color: #ffffff;\n" +
                        "-fx-min-width: 100px;\n" +
                        "-fx-min-height: 100px;\n" +
                        "-fx-max-width: 100px;\n" +
                        "-fx-max-height: 100px;\n" +
                        "    -fx-font-family: \"Helvetica\";\n" +
                        "    -fx-font-size: 10px;\n" +
                        "   -fx-font: BOLD 22 arial;\n" +
                        "    -fx-text-fill: #ff0000;\n" +
                        "    -fx-effect: innershadow( three-pass-box , rgba(0,0,0,0.1) , 2, 0.0 , 0 , 1)");
            }
        });

        start.addEventFilter(MouseEvent.MOUSE_RELEASED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                start.setStyle("-fx-background-color: \n" +
                        "        #ecebe9,\n" +
                        "        rgba(0,0,0,0.05),\n" +
                        "        linear-gradient(#FF0000, #E50000),\n" +
                        "        linear-gradient(#FF0000 0%, #FF0000 20%, #FF0000 80%, #E50000 100%),\n" +
                        "        linear-gradient(#FF0000, #E50000);\n" +
                        "    -fx-background-radius: 80;\n" +
                        "    -fx-background-insets: 0,9 9 8 9,9,10,11;\n" +
                        "-fx-min-width: 100px;\n" +
                        "-fx-min-height: 100px;\n" +
                        "-fx-max-width: 100px;\n" +
                        "-fx-max-height: 100px;\n" +
                        "    -fx-font-family: \"Helvetica\";\n" +
                        "    -fx-font-size: 10px;\n" +
                        "   -fx-font: BOLD 22 arial;\n" +
                        "    -fx-text-fill: #ffffff;\n" +
                        "    -fx-effect: innershadow( three-pass-box , rgba(0,0,0,0.1) , 2, 0.0 , 0 , 1)");
            }
        });

        normal1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                normal1.setDisable(true);
                normal2.setDisable(false);
                normal.setDisable(false);

                timer = 10;
            }
        });

        normal.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                normal.setDisable(true);
                normal2.setDisable(false);
                normal1.setDisable(false);

                timer = 20;
            }
        });

        normal2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                normal2.setDisable(true);
                normal.setDisable(false);
                normal1.setDisable(false);

                timer = 5;
            }
        });

//        spinButton.setOnAction(new EventHandler<ActionEvent>() {
//            @Override
//            public void handle(ActionEvent event) {
//
//
//                Thread thread = new Thread(() -> {
//                    for (int i = 0; i < 20; i++) {
//                        try {
//                            Thread.sleep(timer);
//                        } catch (InterruptedException exc) {
//                        }
//                        Platform.runLater(() -> {
//                            for (int j = 0; j < 3; j++) {
//                                layout1.getChildren().remove(buttons.get(j));
//                            }
//                            for (int j = 2; j > 0; j--) {
//                                buttons.get(j).setGraphic(buttons.get(j - 1).getGraphic());
//                                buttons.get(j).setId(buttons.get(j - 1).getId());
//                            }
//                        });
//                        try {
//                            Thread.sleep(timer);
//                        } catch (InterruptedException exc) {
//                        }
//                        Platform.runLater(() -> {
//                            int orderList = (int) (Math.random() * images.size());
//                            Image imageDecline11 = new Image(getClass().getResourceAsStream(images.get(orderList)));
//                            buttons.get(0).setGraphic(new ImageView(imageDecline11));
//                            buttons.get(0).setId(images.get(orderList));
//                        });
//                        try {
//                            Thread.sleep(timer);
//                        } catch (InterruptedException exc) {
//                        }
//                        Platform.runLater(() -> {
//                            for (int j = 0; j < 3; j++) {
//                                layout1.getChildren().add(buttons.get(j));
//                            }
//                        });
//                    }
//                    timer = 10;
//                });
//                thread.setDaemon(true);
//                thread.start();
//
//                Thread thread2 = new Thread(() -> {
//                    try {
//                        Thread.sleep(150);
//                        timer = 20;
//                        Thread.sleep(170);
//                        timer = 50;
//                    } catch (InterruptedException exc) {
//                    }
//
//                });
//                thread2.setDaemon(true);
//                thread2.start();
//
//
//                // Second Column
//
//
//                Thread thread3 = new Thread(() -> {
//                    for (int i = 0; i < 30; i++) {
//                        try {
//                            Thread.sleep(timer);
//                        } catch (InterruptedException exc) {
//                        }
//                        Platform.runLater(() -> {
//                            for (int j = 3; j < 6; j++) {
//                                layout1.getChildren().remove(buttons.get(j));
//                            }
//                            for (int j = 5; j > 3; j--) {
//                                buttons.get(j).setGraphic(buttons.get(j - 1).getGraphic());
//                                buttons.get(j).setId(buttons.get(j - 1).getId());
//                            }
//                        });
//                        try {
//                            Thread.sleep(timer);
//                        } catch (InterruptedException exc) {
//                        }
//                        Platform.runLater(() -> {
//                            int orderList1 = (int) (Math.random() * images.size());
//                            Image imageDecline21 = new Image(getClass().getResourceAsStream(images.get(orderList1)));
//                            buttons.get(3).setGraphic(new ImageView(imageDecline21));
//                            buttons.get(3).setId(images.get(orderList1));
//                        });
//                        try {
//                            Thread.sleep(timer);
//                        } catch (InterruptedException exc) {
//                        }
//                        Platform.runLater(() -> {
//                            for (int j = 3; j < 6; j++) {
//                                layout1.getChildren().add(buttons.get(j));
//                            }
//                        });
//                    }
//                    timer = 10;
//                });
//                thread3.setDaemon(true);
//                thread3.start();
//
//                Thread thread4 = new Thread(() -> {
//                    try {
//                        Thread.sleep(250);
//                        timer = 20;
//                        Thread.sleep(350);
//                        timer = 50;
//                    } catch (InterruptedException exc) {
//                    }
//
//                });
//                thread4.setDaemon(true);
//                thread4.start();
//
//                // Third Column
//
//
//                Thread thread5 = new Thread(() -> {
//                    for (int i = 0; i < 40; i++) {
//                        try {
//                            Thread.sleep(timer);
//                        } catch (InterruptedException exc) {
//                        }
//                        Platform.runLater(() -> {
//                            for (int j = 6; j < 9; j++) {
//                                layout1.getChildren().remove(buttons.get(j));
//                            }
//                            for (int j = 8; j > 6; j--) {
//                                buttons.get(j).setGraphic(buttons.get(j - 1).getGraphic());
//                                buttons.get(j).setId(buttons.get(j - 1).getId());
//                            }
//                        });
//                        try {
//                            Thread.sleep(timer);
//                        } catch (InterruptedException exc) {
//                        }
//                        Platform.runLater(() -> {
//                            int orderList2 = (int) (Math.random() * images.size());
//                            Image imageDecline31 = new Image(getClass().getResourceAsStream(images.get(orderList2)));
//                            buttons.get(6).setGraphic(new ImageView(imageDecline31));
//                            buttons.get(6).setId(images.get(orderList2));
//                        });
//                        try {
//                            Thread.sleep(timer);
//                        } catch (InterruptedException exc) {
//                        }
//                        Platform.runLater(() -> {
//                            for (int j = 6; j < 9; j++) {
//                                layout1.getChildren().add(buttons.get(j));
//
//                            }
//                        });
//                    }
//                });
//                thread5.setDaemon(true);
//                thread5.start();
//                timer = 10;
//
//                Thread thread6 = new Thread(() -> {
//                    try {
//                        Thread.sleep(350);
//                        timer = 20;
//                        Thread.sleep(450);
//                        timer = 50;
//                        Thread.sleep(1600);
//                    } catch (InterruptedException exc) {
//                    }
//
//                });
//                thread6.setDaemon(true);
//                thread6.start();
//
//
//                Thread thread7 = new Thread(() -> {
//
//                    try {
//                        Thread.sleep(2700);
//                    } catch (InterruptedException exc) {
//                    }
//                    Platform.runLater(() -> {
//                        winCash.setText(calculation(buttons));
//                        if (winCash.getText().startsWith("+")) {
//                            winCash.setStyle("-fx-fill:green");
//                            layout1.getChildren().add(winCash);
//                        } else if (winCash.getText().startsWith("0")) {
//                            winCash.setStyle("-fx-fill:black");
//                            layout1.getChildren().add(winCash);
//                        }
//                    });
//                });
//                thread7.setDaemon(true);
//                thread7.start();
//
//
//                startCash -= 20;
//                cash.setText("" + startCash);
//            }
//        });
        spinButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Task<Void> task = new Task<Void>() {
                    @Override
                    public Void call() throws Exception {
                        spinButton.setDisable(true);
                        int yValue = 40;

                        for (int i = 0; i < 96; i++) {

                            Thread.sleep(timer);

                            if (i < 48) {
                                Platform.runLater(() -> {
                                    for (int j = 0; j < 3; j++) {
                                        buttons.get(j).setTranslateY(buttons.get(j).getTranslateY() + yValue);
                                        if (buttons.get(j).getTranslateY() >= -layout1.getHeight() / 4 + 440) {
                                            int orderList = 0;
                                            if (jackpot) {
                                                orderList = (int) (Math.random() * images.size());
                                            } else {
                                                orderList = 1;
                                            }
                                            Image imageDecline11 = new Image(getClass().getResourceAsStream(images.get(orderList)));
                                            buttons.get(j).setGraphic(new ImageView(imageDecline11));
                                            buttons.get(j).setId(images.get(orderList));
                                            buttons.get(j).setTranslateY(-layout1.getHeight() / 4 - 40);
                                        }
                                    }
                                });
                            }
                            if (i < 72) {
                                Platform.runLater(() -> {
                                    for (int j = 3; j < 6; j++) {
                                        buttons.get(j).setTranslateY(buttons.get(j).getTranslateY() + yValue);
                                        if (buttons.get(j).getTranslateY() >= -layout1.getHeight() / 4 + 440) {
                                            int orderList = 0;
                                            if (jackpot) {
                                                orderList = (int) (Math.random() * images.size());
                                            } else {
                                                orderList = 1;
                                            }
                                            Image imageDecline11 = new Image(getClass().getResourceAsStream(images.get(orderList)));
                                            buttons.get(j).setGraphic(new ImageView(imageDecline11));
                                            buttons.get(j).setId(images.get(orderList));
                                            buttons.get(j).setTranslateY(-layout1.getHeight() / 4 - 40);
                                        }
                                    }
                                });
                            }

                            Platform.runLater(() -> {
                                for (int j = 6; j < 9; j++) {
                                    buttons.get(j).setTranslateY(buttons.get(j).getTranslateY() + yValue);
                                    if (buttons.get(j).getTranslateY() >= -layout1.getHeight() / 4 + 440) {
                                        int orderList = 0;
                                        if (jackpot) {
                                            orderList = (int) (Math.random() * images.size());
                                        } else {
                                            orderList = 1;
                                        }
                                        Image imageDecline11 = new Image(getClass().getResourceAsStream(images.get(orderList)));
                                        buttons.get(j).setGraphic(new ImageView(imageDecline11));
                                        buttons.get(j).setId(images.get(orderList));
                                        buttons.get(j).setTranslateY(-layout1.getHeight() / 4 - 40);
                                    }
                                }
                            });
                        }
                        System.out.println(calculation(buttons, lines, bet));
                        Thread.sleep(timer * 10);
                        spinButton.setDisable(false);
                        return null;
                    }

                };
                new Thread(task).start();
            }
        });

        layout1.addEventHandler(KeyEvent.KEY_PRESSED, ev -> {
            if (ev.getCode() == KeyCode.ENTER) {
                spinButton.setStyle("-fx-padding: 8 15 15 15;\n" +
//                        "    -fx-background-insets: 0,0 0 5 0, 0 0 6 0, 0 0 7 0;\n" +
                        "    -fx-background-radius: 20;\n" +
                        "    -fx-background-color: \n" +
                        "        linear-gradient(from 0% 93% to 0% 100%, #008000 0%, #008000 100%),\n" +
                        "        #008000,\n" +
                        "        #FFFFFF,\n" +
                        "        radial-gradient(center 50% 50%, radius 100%, #FFFFFF, #008000);\n" +
                        "    -fx-font-weight: bold;\n" +
                        "    -fx-font-size: 1.1em;\n" +
                        "   -fx-font: BOLD 22 arial;\n" +
                        " -fx-text-fill: #ffffff\n");
                layout1.getChildren().remove(winCash);
                spinButton.fire();
                spinButton.setDisable(true);
                ev.consume();
            }
        });

        layout1.addEventHandler(KeyEvent.KEY_RELEASED, ev -> {
            if (ev.getCode() == KeyCode.ENTER) {
                spinButton.setStyle("-fx-padding: 8 15 15 15;\n" +
                        "    -fx-background-insets: 0,0 0 5 0, 0 0 6 0, 0 0 7 0;\n" +
                        "    -fx-background-radius: 20;\n" +
                        "    -fx-background-color: \n" +
                        "        linear-gradient(from 0% 93% to 0% 100%, #008000 0%, #008000 100%),\n" +
                        "        #008000,\n" +
                        "        #FFFFFF,\n" +
                        "        radial-gradient(center 50% 50%, radius 100%, #FFFFFF, #008000);\n" +
                        "    -fx-font-weight: bold;\n" +
                        "    -fx-font-size: 1.1em;\n" +
                        "   -fx-font: BOLD 22 arial;\n" +
                        " -fx-text-fill: #008000\n");
                spinButton.setDisable(false);
                ev.consume();
            }
        });

        layout1.addEventHandler(KeyEvent.KEY_PRESSED, ev -> {
            if (ev.getCode() == KeyCode.UP) {
                increaseBet.setStyle("-fx-padding: 8 15 15 15;\n" +
//                        "    -fx-background-insets: 0,0 0 5 0, 0 0 6 0, 0 0 7 0;\n" +
                        "    -fx-background-radius: 8;\n" +
                        "    -fx-background-color: \n" +
                        "        linear-gradient(from 0% 93% to 0% 100%, #008000 0%, #008000 100%),\n" +
                        "        #008000,\n" +
                        "        #FFFFFF,\n" +
                        "        radial-gradient(center 50% 50%, radius 100%, #FFFFFF, #008000);\n" +
                        "    -fx-font-weight: bold;\n" +
                        "    -fx-font-size: 1.1em;\n" +
                        "   -fx-font: BOLD 22 arial;\n" +
                        " -fx-text-fill: #ffffff\n");
                increaseBet.fire();
                ev.consume();
            }
        });

        layout1.addEventHandler(KeyEvent.KEY_RELEASED, ev -> {
            if (ev.getCode() == KeyCode.UP) {
                increaseBet.setStyle("-fx-padding: 8 15 15 15;\n" +
                        "    -fx-background-insets: 0,0 0 5 0, 0 0 6 0, 0 0 7 0;\n" +
                        "    -fx-background-radius: 8;\n" +
                        "    -fx-background-color: \n" +
                        "        linear-gradient(from 0% 93% to 0% 100%, #008000 0%, #008000 100%),\n" +
                        "        #008000,\n" +
                        "        #FFFFFF,\n" +
                        "        radial-gradient(center 50% 50%, radius 100%, #FFFFFF, #008000);\n" +
                        "    -fx-font-weight: bold;\n" +
                        "    -fx-font-size: 1.1em;\n" +
                        "   -fx-font: BOLD 22 arial;\n" +
                        " -fx-text-fill: #008000\n");
                ev.consume();
            }
        });

        layout1.addEventHandler(KeyEvent.KEY_PRESSED, ev -> {
            if (ev.getCode() == KeyCode.DOWN) {
                decreaseBet.setStyle("-fx-padding: 8 15 15 15;\n" +
//                        "    -fx-background-insets: 0,0 0 5 0, 0 0 6 0, 0 0 7 0;\n" +
                        "    -fx-background-radius: 8;\n" +
                        "    -fx-background-color: \n" +
                        "        linear-gradient(from 0% 93% to 0% 100%, #008000 0%, #008000 100%),\n" +
                        "        #008000,\n" +
                        "        #FFFFFF,\n" +
                        "        radial-gradient(center 50% 50%, radius 100%, #FFFFFF, #008000);\n" +
                        "    -fx-font-weight: bold;\n" +
                        "    -fx-font-size: 1.1em;\n" +
                        "   -fx-font: BOLD 22 arial;\n" +
                        " -fx-text-fill: #ffffff\n");
                decreaseBet.fire();
                ev.consume();
            }
        });

        layout1.addEventHandler(KeyEvent.KEY_RELEASED, ev -> {
            if (ev.getCode() == KeyCode.DOWN) {
                decreaseBet.setStyle("-fx-padding: 8 15 15 15;\n" +
                        "    -fx-background-insets: 0,0 0 5 0, 0 0 6 0, 0 0 7 0;\n" +
                        "    -fx-background-radius: 8;\n" +
                        "    -fx-background-color: \n" +
                        "        linear-gradient(from 0% 93% to 0% 100%, #008000 0%, #008000 100%),\n" +
                        "        #008000,\n" +
                        "        #FFFFFF,\n" +
                        "        radial-gradient(center 50% 50%, radius 100%, #FFFFFF, #008000);\n" +
                        "    -fx-font-weight: bold;\n" +
                        "    -fx-font-size: 1.1em;\n" +
                        "   -fx-font: BOLD 22 arial;\n" +
                        " -fx-text-fill: #008000\n");
                ev.consume();
            }
        });


        layout1.getChildren().addAll(spinButton, cash, cashWord, start, increaseBet,
                decreaseBet, betRectangle, betDisplay, jackPot, list, betWord, linesRectangle,
                linesDisplay, linesWord, multipleSign, increaseLines, decreaseLines, polygonLeft, polygonRight, cheats,
                enterCheats, winCash, winCashRectangle);

        scene1.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
        primaryStage.setScene(scene1);
        primaryStage.show();
    }

    public static int calculation(List<Button> list, int lines, int bet) {

        String win = "0";

        System.out.println(lines + " lines");
        System.out.println(bet + " bet");

//        if (list.get(1).getId().equals("cherry1.png")) {
//            startCash += 20;
//            cash.setText("" + startCash);
//            return "+20";
//        } else {
//            return "0";
//        }

        return Integer.parseInt(win);
    }

    public static void main(String[] args) {
        launch(args);
    }
}