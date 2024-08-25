package org.example;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import org.example.style_iron_crome.base.Cyberware;
import org.example.style_iron_crome.base.CyberwareSearch;

import java.util.List;

public class CyberwareSearchApp extends Application {
    private Stage detailsStage;


    @Override
    public void start(Stage primaryStage) {
        // Criar elementos da interface gráfica
        Label searchLabel = new Label("Digite o que deseja pesquisar:");
        TextField searchField = new TextField();
        Button searchButton = new Button("Pesquisar");
        ListView<Cyberware> listView = new ListView<>();

        List<Cyberware> allCyberwares = CyberwareSearch.allCyberwareForApp();
        ObservableList<Cyberware> allCyberwaresResultList = FXCollections.observableArrayList(allCyberwares);
        listView.setItems(allCyberwaresResultList);

        // Configurar a ação do botão de pesquisa
        searchButton.setOnAction(event -> {
            String searchText = searchField.getText().trim();

            if (!searchText.isEmpty()) {
                // Chamar o método de pesquisa e atualizar a lista de resultados
                List<Cyberware> results = CyberwareSearch.searchCyberwareForApp(searchText);

                ObservableList<Cyberware> resultsList = FXCollections.observableArrayList(results);
                listView.setItems(resultsList);

            } else {
                // Se o campo de pesquisa estiver vazio, limpar a lista de resultados
                listView.setItems(allCyberwaresResultList);
            }
        });

        // Configurar a exibição dos detalhes ao selecionar um item da lista
        listView.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue != null) {
                String details = "[NAME]: " + newValue.getCyberwareName() + "\n" +
                        "[INSTALL]: " + newValue.getCyberwareInstall() + "\n" +
                        "[FUNDATIONAL?]: " + newValue.isFundational() + "\n" +
                        "[SLOTS NUMBER]: " + newValue.getCyberwareOptionSlots() + "\n" +
                        "[DESCRIPTION]: " + newValue.getCyberwareDescription() + "\n" +
                        "[PRICE]: " + newValue.getCyberwarePrice() + "eb" + "\n" +
                        "[HUMANITY LOST]: " + newValue.getCyberwareHumanityLost();

                String imagePath = newValue.getIllustration(); // Caminho da imagem (hardcoded)

                showDetailsWindow(details, imagePath, primaryStage);
            }
        });

        // Configurar a exibição de texto na ListView
        listView.setCellFactory(lv -> new ListCell<>() {
            @Override
            protected void updateItem(Cyberware item, boolean empty) {
                super.updateItem(item, empty);
                if (empty || item == null) {
                    setText(null);
                } else {
                    setText(item.getCyberwareName() + " - " + item.getCategory());
                }
            }
        });

        // Criar o layout da cena principal
        VBox root = new VBox(10, searchLabel, searchField, searchButton, listView);
        root.setPadding(new Insets(10));
        Scene scene = new Scene(root, 400, 500);

        // Configurar o palco principal
        primaryStage.setTitle("Cyberware Search");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void showDetailsWindow(String details, String imagePath, Stage ownerStage) {
        if (detailsStage == null) {
            detailsStage = new Stage();
            detailsStage.initStyle(StageStyle.UNDECORATED);
            detailsStage.initOwner(ownerStage);
        }

        TextArea detailsArea = new TextArea(details);
        detailsArea.setEditable(false);
        detailsArea.setWrapText(true);

        ImageView imageView = new ImageView(new Image(imagePath));
        imageView.setFitWidth(300); // Ajuste a largura da imagem conforme necessário
        imageView.setPreserveRatio(true);

        VBox root = new VBox(30, new HBox(30, imageView, detailsArea));
        root.setAlignment(Pos.CENTER);
        root.setPadding(new Insets(10));
        Scene scene = new Scene(root, 800, 400);

        detailsStage.setScene(scene);
        detailsStage.setX(ownerStage.getX() + ownerStage.getWidth() + 10);
        detailsStage.setY(ownerStage.getY());
        detailsStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
