import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.event.EventTarget;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

/**
 * This panel is the basic panel, inside which other panels are placed. Before
 * beginning to implement, design the structure of your GUI in order to
 * understand what panels go inside which ones, and what buttons or other
 * components go in which panels.
 * 
 * @author ralexander
 *
 */
//make the main panel's layout be a VBox
public class FXMainPane extends VBox {

	// student Task #2:
	// declare five buttons, a label, and a textfield
	// declare two HBoxes
	Button b1;
	Button b2;
	Button b3;
	Button b4;
	Button b5;
	Label l1;
	TextField tf1;
	HBox hb1;
	HBox hb2;

	// student Task #4:
	// declare an instance of DataManager
	DataManager dm1;

	/**
	 * The MainPanel constructor sets up the entire GUI in this approach. Remember
	 * to wait to add a component to its containing component until the container
	 * has been created. This is the only constraint on the order in which the
	 * following statements appear.
	 */
	public FXMainPane() {
		// student Task #2:
		// instantiate the buttons, label, and textfield
		// instantiate the HBoxes
		b1 = new Button("Hello");
		b2 = new Button("Howdy");
		b3 = new Button("Chinese");
		b4 = new Button("Clear");
		b5 = new Button("Exit");

		l1 = new Label("Feedback:");

		tf1 = new TextField();

		hb1 = new HBox();
		hb2 = new HBox();

		// student Task #4:
		// instantiate the DataManager instance
		// set margins and set alignment of the components
		dm1 = new DataManager();

		hb1.setPadding(new Insets(50));
		HBox.setMargin(b1, new Insets(10));
		HBox.setMargin(b2, new Insets(10));
		HBox.setMargin(b3, new Insets(10));
		HBox.setMargin(b4, new Insets(10));
		HBox.setMargin(b5, new Insets(10));
		hb1.setAlignment(Pos.CENTER);
		hb2.setAlignment(Pos.CENTER);

		// student Task #3:
		// add the label and textfield to one of the HBoxes
		// add the buttons to the other HBox
		// add the HBoxes to this FXMainPanel (a VBox)
		hb1.getChildren().addAll(b1, b2, b3, b4, b5);
		hb2.getChildren().addAll(l1, tf1);
		getChildren().addAll(hb1, hb2);

		b1.setOnAction(new ButtonHandler());
		b2.setOnAction(new ButtonHandler());
		b3.setOnAction(new ButtonHandler());
		b4.setOnAction(new ButtonHandler());
		b5.setOnAction(new ButtonHandler());
	}

	// Task #4:
	// create a private inner class to handle the button clicks
	class ButtonHandler implements EventHandler<ActionEvent> {

		@Override
		public void handle(ActionEvent event) {
			EventTarget b = event.getTarget();

			if (b.equals(b1)) {
				tf1.setText(dm1.getHello());
			} else if (b.equals(b2)) {
				tf1.setText(dm1.getHowdy());
			} else if (b.equals(b3)) {
				tf1.setText(dm1.getChinese());
			} else if (b.equals(b4)) {
				tf1.setText("");
			} else if (b.equals(b5)) {
				Platform.exit();
				System.exit(0);
			}

		}

	}

}
