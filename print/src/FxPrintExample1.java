/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author xahidICE
 */

import javafx.application.Application;
import javafx.collections.ObservableSet;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.print.Printer;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class FxPrintExample1 extends Application
{
	public static void main(String[] args) 
	{
		Application.launch(args);
	}
	
	@Override
	public void start(Stage stage)
	{
		// Create the TextArea
		final TextArea textArea = new TextArea();
		// Create the Button
		Button button = new Button("Get all Printers");

		// Create the Event-Handlers for the Buttons
		button.setOnAction(new EventHandler <ActionEvent>() 
		{
            public void handle(ActionEvent event) 
            {
            	//Get all Printers
        		ObservableSet<Printer> orinters = Printer.getAllPrinters();
        		
        		for(Printer printer : orinters) 
        		{
        			textArea.appendText(printer.getName()+"\n");
        		}		
            }
        });
		
		// Create the VBox with a 10px spacing
		VBox root = new VBox(10);	
		// Add the Children to the VBox
		root.getChildren().addAll(button,textArea);	
		// Set the Size of the VBox
		root.setPrefSize(400, 250);		
		// Set the Style-properties of the VBox
		root.setStyle("-fx-padding: 10;" +
				"-fx-border-style: solid inside;" +
				"-fx-border-width: 2;" +
				"-fx-border-insets: 5;" +
				"-fx-border-radius: 5;" +
				"-fx-border-color: blue;");
		
		// Create the Scene
		Scene scene = new Scene(root);
		// Add the scene to the Stage
		stage.setScene(scene);
		// Set the title of the Stage
		stage.setTitle("Showing all Printers");
		// Display the Stage
		stage.show();		
	}
}

