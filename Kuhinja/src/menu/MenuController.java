package menu;

import java.util.LinkedHashMap;

public interface MenuController {

    String initializeMenuName();
    LinkedHashMap<Integer, String> initializeMenuOptions();
    void onMenuOptionSelected(int menuOption);
}
