package menu;

import utils.Color;
import utils.StringUtils;

import java.util.InputMismatchException;
import java.util.LinkedHashMap;
import java.util.Scanner;

public abstract class Menu implements MenuController {
    private LinkedHashMap<Integer, String> menuOptions;
    private String menuName;

    public Menu() {
        initMenu();
    }

    private void initMenu(){
        this.menuName = initializeMenuName();
        this.menuOptions = initializeMenuOptions();
    }

    public void showMenu() {
        formatAndShowMenu();
        Scanner scanner = new Scanner(System.in);
        int selectedOption = -1;
        while (selectedOption != 0) {
            try {
                selectedOption = scanner.nextInt();
                if (menuOptions.get(selectedOption) == null) {
                    System.out.println(StringUtils.coloredText("Invalid option!", Color.ANSI_RED));
                    showMenu();
                    break;
                }
                onMenuOptionSelected(selectedOption);
            } catch (Exception e) {
                System.out.println(StringUtils.coloredText("Invalid option!", Color.ANSI_RED));
                showMenu();
                break;
            }
        }
    }

    private void formatAndShowMenu() {
        System.out.println(menuName);
        if (menuOptions.isEmpty()) {
            System.out.println("No options available!");
        } else {
            for (int i = 0; i < menuOptions.size(); i++) {
                System.out.println("(" + menuOptions.keySet().toArray()[i] + ") " + menuOptions.values().toArray()[i]);
            }
        }
    }
}
