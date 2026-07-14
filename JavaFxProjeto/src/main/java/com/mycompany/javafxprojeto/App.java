package com.mycompany.javafxprojeto;

import java.util.Collections;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Spinner;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.input.MouseEvent;
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

        Text tLogin = new Text("Login do Sistema");

        GridPane campos = new GridPane();
        campos.setAlignment(Pos.CENTER);
        campos.setHgap(10);
        campos.setVgap(10);
        campos.add(new Label("Login:"), 0, 0);
        TextField tfLogin = new TextField();
        campos.add(tfLogin, 1, 0);
        campos.add(new Label("Senha:"), 0, 1);
        PasswordField pfSenha = new PasswordField();
        campos.add(pfSenha, 1, 1);

        ButtonBar painelBt = new ButtonBar();
        painelBt.setId("areabotoes");

        Button btCancelar = new Button("Cancelar");
        Button btConfirmar = new Button("Confirmar");
        painelBt.getButtons().addAll( btConfirmar, btCancelar);
        
        HBox caixaBotoes = new HBox(painelBt);
        caixaBotoes.setAlignment(Pos.CENTER);
        
        root.setAlignment(Pos.CENTER);
        root.setSpacing(20);
        root.getChildren().addAll(tLogin, campos, caixaBotoes);

        Scene scene = new Scene(root, 640, 480);
        scene.getStylesheets().add("/css/Style.css");
        stage.setTitle("Erro 404");
        stage.setScene(scene);
        stage.show();

        /*btConfirmar.setOnMouseClicked((new EventHandler<MouseEvent>(){
                @Override
                public void handle(MouseEvent event){
                    Alert aviso = new Alert(Alert.AlertType.CONFIRMATION);
                    aviso.setHeaderText("Tem certeza que quer instalar esse virus?");
                    aviso.show();

                }

            }));*/
        EventHandler<MouseEvent> eh = new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                Alert aviso = new Alert(Alert.AlertType.INFORMATION);
                aviso.setHeaderText("Uuario logado com sucesso");
                aviso.show();

            }

        };
        
        btConfirmar.addEventHandler(MouseEvent.MOUSE_CLICKED, eh);
        btCancelar.addEventHandler(MouseEvent.MOUSE_CLICKED, eh);
        
        EventHandler<MouseEvent> filtro = new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent t) {
                if (pfSenha.getText().length() == 0) {
                Alert aviso = new Alert(Alert.AlertType.ERROR);
                aviso.setHeaderText("Campo senha não preenchido");
                
                t.consume();
                aviso.show();    
                }
                
            }

        };EventHandler<MouseEvent> filtro3 = new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent t) {
                if (tfLogin.getText().length() == 0) {
                Alert aviso = new Alert(Alert.AlertType.ERROR);
                aviso.setHeaderText("Campo Login não preenchido");
                
                t.consume();
                aviso.show();    
                }
                
            }

        };
        
        EventHandler<MouseEvent> filtro2 = new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent t) {
                if (!tfLogin.getText().isEmpty() && !pfSenha.getText().isEmpty()) {
                Alert aviso = new Alert(Alert.AlertType.CONFIRMATION);
                aviso.setHeaderText("Tem certeza, mano? Tem certeza que quer nos dar acesso ao seu banco?");
                
                t.consume();
                aviso.show();    
                }
                
            }

        };
        painelBt.addEventFilter(MouseEvent.MOUSE_CLICKED, filtro3);
        painelBt.addEventFilter(MouseEvent.MOUSE_CLICKED, filtro);
        painelBt.addEventFilter(MouseEvent.MOUSE_CLICKED, filtro2);
    }

    public static void main(String[] args) {
        launch();
    }

}

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
 /*décimo primeiro
         
         VBox root = new VBox();
        
        Menu file = new Menu("Arquivos");
        MenuItem novoAquivo = new MenuItem("Novo");
        MenuItem abrirAquivo = new MenuItem("Abrir");
        MenuItem fecharAquivo = new MenuItem("Fechar");
        file.getItems().addAll(novoAquivo, abrirAquivo, fecharAquivo);
        
        Menu view = new Menu("Ver");
        MenuItem zoomIn = new MenuItem("Zoon In");
        MenuItem zoomOut = new MenuItem("Zoon Out");
        MenuItem zoomNormal = new MenuItem("Zoon Normal");
        view.getItems().addAll(zoomIn, zoomOut, zoomNormal);
        
        MenuBar meuMenu = new MenuBar();
        meuMenu.getMenus().addAll(file, view);
        
        Group grupoPrincipal = new Group(meuMenu);
        root.getChildren().add(grupoPrincipal);
        
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
        
        ButtonBar painelBt = new ButtonBar();
        Button btVoltar = new Button("Voltar");
        Button btConfirmar = new Button("Confirmar");
        Button btExcluir = new Button("Excluir");
        painelBt.getButtons().addAll(btVoltar, btConfirmar, btExcluir);
        
        TreeItem<String> cursos = new TreeItem<String>("Curso");
        TreeItem<String> tecnico = new TreeItem<String>("Tecnico");
        TreeItem<String> informatica = new TreeItem<String>("Informatica");
        TreeItem<String> vestuario = new TreeItem<String>("Vetuaario");
        TreeItem<String> adm = new TreeItem<String>("Administração");
        
        cursos.getChildren().add(tecnico);
        tecnico.getChildren().addAll(informatica, vestuario, adm);
        
        TreeView<String> cursosIFC = new TreeView<String>(cursos);
        
        Label textoArvoret = new Label("Árvore");
        
        HBox MesSpiner = new HBox();
        Text mesinho = new Text("Mes: ");
        Spinner<Integer> mes = new Spinner<Integer>(1, 12, 1);
        MesSpiner.getChildren().addAll(mesinho, mes);
        
        
        
        root.getChildren().addAll(atividade, leitura, ciclismo, track, corrida,
                contrato, concordo, discordo, naosei, tObservacao, observacao,
                textoArvoret, cursosIFC, minhaListagem, MesSpiner, painelBt);
        
        Scene scene = new Scene(root, 800, 600);
        stage.setTitle("Erro 404");
        stage.setScene(scene);
        stage.show();
 */
 /*decimo segundo
         VBox root = new VBox();
        
        Menu file = new Menu("Arquivos");
        MenuItem novoAquivo = new MenuItem("Novo");
        MenuItem abrirAquivo = new MenuItem("Abrir");
        MenuItem fecharAquivo = new MenuItem("Fechar");
        file.getItems().addAll(novoAquivo, abrirAquivo, fecharAquivo);
        
        Menu view = new Menu("Ver");
        MenuItem zoomIn = new MenuItem("Zoon In");
        MenuItem zoomOut = new MenuItem("Zoon Out");
        MenuItem zoomNormal = new MenuItem("Zoon Normal");
        view.getItems().addAll(zoomIn, zoomOut, zoomNormal);
        
        MenuBar meuMenu = new MenuBar();
        meuMenu.getMenus().addAll(file, view);
        
        Group grupoPrincipal = new Group(meuMenu);
        root.getChildren().add(grupoPrincipal);
        
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
        
        ButtonBar painelBt = new ButtonBar();
        Button btVoltar = new Button("Voltar");
        Button btConfirmar = new Button("Confirmar");
        Button btExcluir = new Button("Excluir");
        painelBt.getButtons().addAll(btVoltar, btConfirmar, btExcluir);
        
        TreeItem<String> cursos = new TreeItem<String>("Curso");
        TreeItem<String> tecnico = new TreeItem<String>("Tecnico");
        TreeItem<String> informatica = new TreeItem<String>("Informatica");
        TreeItem<String> vestuario = new TreeItem<String>("Vetuaario");
        TreeItem<String> adm = new TreeItem<String>("Administração");
        
        cursos.getChildren().add(tecnico);
        tecnico.getChildren().addAll(informatica, vestuario, adm);
        
        TreeView<String> cursosIFC = new TreeView<String>(cursos);
        
        Label textoArvore = new Label("Árvore");
        Label Nacimento = new Label("Data de Nacimento");
        
        HBox DataNacimento = new HBox();
        Text diazinho = new Text("Dia: ");
        Spinner<Integer> dia = new Spinner<Integer>(1, 30, 1);
        Text mesinho = new Text("Mes: ");
        Spinner<Integer> mes = new Spinner<Integer>(1, 12, 1);
        Text anozinho = new Text("Ano: ");
        Spinner<Integer> ano = new Spinner<Integer>(1900, 2026, 1900);
        DataNacimento.getChildren().addAll(diazinho, dia, mesinho, mes, anozinho, ano);
        
        
        
        root.getChildren().addAll(atividade, leitura, ciclismo, track, corrida,
                contrato, concordo, discordo, naosei, tObservacao, observacao,
                textoArvore, cursosIFC, minhaListagem, Nacimento, DataNacimento, painelBt);
        
        Scene scene = new Scene(root, 800, 600);
        scene.getStylesheets().add("/css/style.css");
        stage.setTitle("Erro 404");
        stage.setScene(scene);
        stage.show();
 */

 /*décimo terceiro
        VBox root = new VBox();
        
        Menu file = new Menu("Arquivos");
        MenuItem novoAquivo = new MenuItem("Novo");
        MenuItem abrirAquivo = new MenuItem("Abrir");
        MenuItem fecharAquivo = new MenuItem("Fechar");
        file.getItems().addAll(novoAquivo, abrirAquivo, fecharAquivo);
        
        Menu view = new Menu("Ver");
        MenuItem zoomIn = new MenuItem("Zoon In");
        MenuItem zoomOut = new MenuItem("Zoon Out");
        MenuItem zoomNormal = new MenuItem("Zoon Normal");
        view.getItems().addAll(zoomIn, zoomOut, zoomNormal);
        
        MenuBar meuMenu = new MenuBar();
        meuMenu.getMenus().addAll(file, view);
        
        Group grupoPrincipal = new Group(meuMenu);
        root.getChildren().add(grupoPrincipal);
        
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
        
        ButtonBar painelBt = new ButtonBar();
        Button btVoltar = new Button("Voltar");
        Button btConfirmar = new Button("Confirmar");
        Button btExcluir = new Button("Excluir");
        painelBt.getButtons().addAll(btVoltar, btConfirmar, btExcluir);
        
        TreeItem<String> cursos = new TreeItem<String>("Curso");
        TreeItem<String> tecnico = new TreeItem<String>("Tecnico");
        TreeItem<String> informatica = new TreeItem<String>("Informatica");
        TreeItem<String> vestuario = new TreeItem<String>("Vetuario");
        TreeItem<String> adm = new TreeItem<String>("Administração");
        
        cursos.getChildren().add(tecnico);
        tecnico.getChildren().addAll(informatica, vestuario, adm);
        
        TreeView<String> cursosIFC = new TreeView<String>(cursos);
        
        Label textoArvore = new Label("Árvore");
        Label Nacimento = new Label("Data de Nacimento");
        
        HBox DataNacimento = new HBox();
        Text diazinho = new Text("Dia: ");
        Spinner<Integer> dia = new Spinner<Integer>(1, 30, 1);
        Text mesinho = new Text("Mes: ");
        Spinner<Integer> mes = new Spinner<Integer>(1, 12, 1);
        Text anozinho = new Text("Ano: ");
        Spinner<Integer> ano = new Spinner<Integer>(1900, 2026, 1900);
        DataNacimento.getChildren().addAll(diazinho, dia, mesinho, mes, anozinho, ano);
        
        
        
        root.getChildren().addAll(atividade, leitura, ciclismo, track, corrida,
                contrato, concordo, discordo, naosei, tObservacao, observacao,
                textoArvore, cursosIFC, minhaListagem, Nacimento, DataNacimento, painelBt);
        
        Scene scene = new Scene(root, 800, 600);
        scene.getStylesheets().add("/css/style.css");
        stage.setTitle("Erro 404");
        stage.setScene(scene);
        stage.show();
        
        btConfirmar.setOnMouseClicked((new EventHandler<MouseEvent>(){
            @Override
            public void handle(MouseEvent event){
                Alert aviso = new Alert(Alert.AlertType.INFORMATION);
                aviso.setHeaderText("Usuário logado com sucesso");
                aviso.show();
                
            }
            
        }));
 */
