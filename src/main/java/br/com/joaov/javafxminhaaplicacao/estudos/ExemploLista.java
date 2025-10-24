// Define que esta classe pertence ao "pacote" (uma pasta) de estudos
package br.com.joaov.javafxminhaaplicacao.estudos;

// Importações: Traz as "ferramentas" necessárias para a classe
import javafx.application.Application; // A classe base para qualquer app JavaFX
import javafx.collections.FXCollections; // Uma "fábrica" para criar listas especiais do JavaFX
import javafx.collections.ObservableList; // O tipo de lista especial do JavaFX
import javafx.scene.Scene; // A "cena" (o conteúdo dentro da janela)
import javafx.scene.control.ListView; // O componente visual da lista
import javafx.scene.layout.VBox; // Um layout que empilha coisas verticalmente
import javafx.stage.Stage; // A "janela" (o "palco")

// A sua classe principal. Ela "herda" (extends) da classe Application,
// o que a torna uma aplicação JavaFX oficial.
public class ExemploLista extends Application {

    // Este é o método principal que o JavaFX executa.
    // Pense nele como o "show" que começa quando as cortinas se abrem.
    // O "palco" (Stage) é a janela principal, dada a você pelo JavaFX.
    @Override
    public void start(Stage palco) throws Exception {

        // 1. OS DADOS (O "MODELO")

        // Declara uma variável "itens". Ela não é um ArrayList comum.
        // É uma "ObservableList", uma lista "observável".
        ObservableList<String> itens;

        // Aqui, você cria a lista.
        // FXCollections.observableArrayList(...) é um método que cria
        // uma lista observável, já preenchida com os 3 itens.
        itens = FXCollections.observableArrayList("Item 1", "Item 2", "Item 3");

        // ---- A MÁGICA DO JAVAFX ESTÁ AQUI ----
        // Por que "Observável"? Porque se você adicionar ou remover
        // um item desta lista *depois* (ex: itens.add("Item 4")),
        // qualquer componente visual (como o ListView) que estiver
        // "observando" esta lista vai se atualizar SOZINHO.
        // ------------------------------------------

        // 2. O COMPONENTE VISUAL (A "VISÃO")

        // Você cria o componente visual que sabe como desenhar uma lista.
        // Ao passar "itens" no construtor, você está dizendo:
        // "Ei, ListView, fique de olho nessa lista 'itens' e mostre tudo o que 
        // ela contém, agora e no futuro."
        ListView listView = new ListView(itens);

        // 3. O LAYOUT (O "ORGANIZADOR")

        // Você cria um layout. Um VBox é um "Vertical Box" (Caixa Vertical).
        // Ele simplesmente empilha qualquer componente, um em cima do outro.
        // Ao passar "listView" no construtor, você já está adicionando
        // o listView dentro do VBox.
        VBox layout = new VBox(listView);

        // 4. A CENA E O PALCO (O PADRÃO JAVAFX)

        // Você cria a "cena", que é o conteúdo que vai dentro da janela.
        // Você diz: "O conteúdo da minha cena é o 'layout' (o VBox)"
        // E ela deve ter 300px de largura por 200px de altura.
        Scene cena = new Scene(layout, 300, 200);

        // Você pega o "palco" (a janela principal) e define a "cena" nele.
        palco.setScene(cena);

        // Finalmente, você manda a janela aparecer na tela.
        palco.show();
    }

    // Este é o ponto de entrada da aplicação Java (o método "main" padrão).
    public static void main(String[] args) {
        // O comando "launch(args)" é o que inicia toda a
        // "mágica" do JavaFX: ele prepara o ambiente gráfico
        // e chama o método "start(Stage palco)" lá em cima.
        launch(args);
    }
}