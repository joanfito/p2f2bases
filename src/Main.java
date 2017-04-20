import controller.ButtonControl;
import view.CreateView;
import view.LogView;
import view.MenuView;

/**
 * Created by joanfito on 20/4/17.
 */
public class Main {

    public static void main(String[] args) {
        LogView logView = new LogView();

        ButtonControl controller = new ButtonControl(logView);

        logView.linkController(controller);
        logView.setVisible(true);

//        MenuView menuView = new MenuView();
//        menuView.setVisible(true);

//        CreateView createView = new CreateView();
//        createView.setVisible(true);


    }
}
