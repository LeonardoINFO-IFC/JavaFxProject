package com.mycompany.javafxprojeto;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * JavaFX App
 */
public class App extends Application {
    
    @Override
    public void start(Stage stage) {
        
        VBox root = new VBox();
        
        Label atividade = new Label("Atividade");
        
        CheckBox leitura = new CheckBox("Leitura");
        CheckBox ciclismo = new CheckBox("Ciclismo");
        CheckBox track = new CheckBox("Track");
        CheckBox corrida = new CheckBox("Corrida");
        
        Label contrato = new Label("Concorda com o contato?");
        RadioButton concordo = new RadioButton("Concordo");
        RadioButton discordo = new RadioButton("Discordo");
        RadioButton naosei = new RadioButton("Não sei");
        
        ToggleGroup contratoGrup = new ToggleGroup();
        concordo.setToggleGroup(contratoGrup);
        discordo.setToggleGroup(contratoGrup);
        naosei.setToggleGroup(contratoGrup);
        
        Label tObservacao = new Label("Observação");
        TextArea observacao = new TextArea();
        observacao.setPrefSize(400, 300);        
        observacao.setWrapText(true);
        
        ObservableList<String> lista = FXCollections.observableArrayList("Informatica", "Administração", "Veste");
        ListView<String> minhaListagem = new ListView<String>(lista);
        
        ButtonBar botoes = new ButtonBar();
        Button confirmar = new Button("Confirmar");
        Button cancelar = new Button("Cancelar");
        botoes.getButtons().addAll(confirmar, cancelar);
         
        
        root.getChildren().addAll(atividade, leitura, ciclismo, track, corrida, contrato, concordo, discordo, naosei, tObservacao, observacao, minhaListagem, botoes);
        Scene scene = new Scene(root, 800, 600);
        stage.setTitle("Erro 404");
        stage.setScene(scene);
        stage.show();
        

        /* Código inicial
        var javaVersion = SystemInfo.javaVersion();
        var javafxVersion = SystemInfo.javafxVersion();

        var label = new Label("Hello, JavaFX " + javafxVersion + ", running on Java " + javaVersion + ".");
        var scene = new Scene(new StackPane(label), 640, 480);
        stage.setScene(scene);
        stage.show();*/
 /* Primeiro código
        Group bandeira = new Group();

        Rectangle verde = new Rectangle(0, 0, 200, 150);
        verde.setFill(Color.GREEN);
        bandeira.getChildren().add(verde);

        root.getChildren().add(bandeira);

        Polygon amarelo = new Polygon();
        amarelo.getPoints().addAll(new Double[]{
            20.0, 75.0,
            100.0, 10.0,
            180.0, 75.0,
            100.0, 140.0,});
        amarelo.setFill(Color.YELLOW);
        bandeira.getChildren().add(amarelo);

        Circle azul = new Circle(100, 75, 40);
        azul.setFill(Color.BLUE);
        bandeira.getChildren().add(azul);

        stage.setScene(scene);

        stage.setTitle("Sistema de teste");
        stage.show();*/
 /*HBox root = new HBox(); horizontal*/
 /*VBox root = new VBox(); vertical*/
 /* Segundo código
        Pane root = new Pane();
        Scene scene = new Scene(root, 640, 480);
        stage.setScene(scene);

        Label texto1 = new Label("Texto1");
        texto1.setLayoutX(100);
        texto1.setLayoutY(50);

        Label texto2 = new Label("Texto2");
        texto2.setLayoutX(100);
        texto2.setLayoutY(100);

        root.getChildren().add(texto1);
        root.getChildren().add(texto2);

        stage.setTitle("Sistema de teste");
        stage.show();
    }
         */
 /* Terceiro código
        BorderPane root = new BorderPane();

        Scene scene = new Scene(root, 640, 480);
        stage.setScene(scene);

        root.setTop(new Label("Topo da janela"));
        root.setBottom(new Label("Inferior da janela"));
        root.setCenter(new Label("Centro da janela"));
        root.setLeft(new Label("Equerda da janela"));
        root.setRight(new Label("Direita da janela"));

        stage.setTitle("Sistema de teste");
        stage.show();
    }
         */
 /* Quarto código - Grades
        GridPane root = new GridPane();

        Scene scene = new Scene(root, 67, 480);
        stage.setScene(scene);

        root.add(new Label("Topo da janela"), 0, 0);
        root.add(new Label("Inferior da janela"), 1, 1);
        root.add(new Label("Centro da janela"), 2, 2);
        root.add(new Label("Equerda da janela"), 3, 3);
        root.add(new Label("Direita da janela"), 4, 4);

        stage.setTitle("Sistema de teste");
        stage.show();
         */
 /* Quinto código
        AnchorPane root = new AnchorPane();

        Scene scene = new Scene(root, 640, 480);
        stage.setScene(scene);
       
        Text component = new Text("Componente1");
        AnchorPane.setRightAnchor(component, 50.0);
        AnchorPane.setTopAnchor(component, 100.0);
       
        root.getChildren().add(component);

        stage.setTitle("Sistema de teste");
        stage.show();
    }
         */
 /* Sexto código
        FlowPane root = new FlowPane();

        Scene scene = new Scene(root, 640, 480);
        stage.setScene(scene);
       
        root.setOrientation(Orientation.HORIZONTAL);
        root.setOrientation(Orientation.VERTICAL);
        root.getChildren().add(new Text("Componente1"));
        root.getChildren().add(new Text("Componente2"));
        root.getChildren().add(new Text("Componente3"));

        stage.setTitle("67Sistema de teste");
        stage.show();
         */
 /* Códigos de alinhamento e espaçamento

        root.setAlignment(Pos.CENTER);
        root.setHgap(20);
        root.setVgap(20);
         */
 /* Sétimo código
        TilePane root = new TilePane();

        Scene scene = new Scene(root, 800, 67);
        stage.setScene(scene);
       
        root.getChildren().add(new Text("Componente1"));
        root.getChildren().add(new Text("Componente2"));
        root.getChildren().add(new Text("Componente3"));
        root.getChildren().add(new Text("Componente4"));
       
        root.setTileAlignment(Pos.CENTER);
         */
 /* Oitavo código
        SplitPane root = new SplitPane();

        Scene scene = new Scene(root, 800, 67);
        stage.setScene(scene);
       
        root.setOrientation(Orientation.VERTICAL);
        root.setOrientation(Orientation.HORIZONTAL);
        root.getItems().add(new Text("Componente1"));
        root.getItems().add(new Text("Componente2"));
        root.getItems().add(new Text("Componente3"));
        root.getItems().add(new Text("Componente4"));
         */
 /* Nono código
        BorderPane root = new BorderPane();
       
        Scene scene = new Scene(root, 640, 480);
        stage.setScene(scene);
       
        root.setTop(new Text("Componente1"));
       
        GridPane campos = new GridPane();
        campos.add(new Label("Login:"), 0, 0);
        campos.add(new TextField(), 1, 0);
        campos.add(new Label("Senha:"), 0, 1);
        campos.add(new TextField(), 1, 1);
       
        root.setCenter(campos);
       
        HBox botoes = new HBox();
        botoes.getChildren().add(new Button("Login"));
        botoes.getChildren().add(new Button("Cancelar"));
        root.setBottom(botoes);
         */
 
         /*decimo codigo
        BorderPane root = new BorderPane();
        
        Font fTitulo = Font.font("Verdana", FontWeight.BOLD, FontPosture.REGULAR, 30);
        Font fCampo = Font.font("Verdana", FontWeight.NORMAL, FontPosture.ITALIC, 20);
        Font fInput = Font.font("Verdana", FontWeight.NORMAL, FontPosture.REGULAR, 10);
        
        Text titulo = new Text("Login");
        Label usuario = new Label("Usuario:");
        Label senha = new Label("Senha:");
        
        
        
        Scene scene = new Scene(root, 640, 480);
        stage.setScene(scene);
        root.setTop(titulo);
        
        GridPane campos = new GridPane();
        campos.add(usuario, 0, 0);
        campos.add(senha, 0, 1);
        
        TextField campoUsuario = new TextField();
        campoUsuario.setFont(fInput);
        campos.add(campoUsuario, 1, 0);
        
        PasswordField campoSenha = new PasswordField();
        campoSenha.setFont(fInput);
        campos.add(campoSenha, 1, 1);
        
        titulo.setFont(fTitulo);
        usuario.setFont(fCampo);
        senha.setFont(fCampo);
        senha.setTextFill(Color.RED);
        
        root.setCenter(campos);
        
        HBox botoes = new HBox();
        botoes.getChildren().add(new Button("Login"));
        botoes.getChildren().add(new Button("Cancelar"));
        root.setBottom(botoes);
        stage.setTitle("67 67 67 67 67 67 67 67 67");
        stage.setScene(scene);
        stage.show();
        */
    }
    
    public static void main(String[] args) {
        launch();
    }
    
}