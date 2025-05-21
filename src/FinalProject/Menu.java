package FinalProject;

public class Menu {
    public static String getItemName(int code) {
        switch (code) {
            case 1: return "Burger";
            case 2: return "Fries";
            case 3: return "Drink";
            case 4: return "Salad";
            case 5: return "Shake";
            default: return "N/A";
        }
    }
}
