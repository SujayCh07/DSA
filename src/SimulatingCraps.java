public class SimulatingCraps {
    private static int houseWin = 0;
    private static int playerWin = 0;

    public static void main(String[] args) {
        for(int i=0;i<10000;i++){
            boolean result = playGame();
            if(!result){
                houseWin++;
            }
            else{
                playerWin++;
            }
        }
        System.out.println("The player won " + playerWin + " out of 10000 games " + (playerWin/100.0) + "%");
        System.out.println("The house won " + houseWin + " out of 10000 games " + (houseWin/100.0) + "%");
    }

    public static boolean playGame(){
        int total = 0;
        int roll = 0;
        int result = 0;

        do{
            total = (((int)(6*Math.random()))+1) + (((int)(6*Math.random()))+1);
            if (total == 2 || total == 3 || total == 12){
                result = 1;
                break;
            }
            else if ((total == 7) || total == 11 || total == roll) {
                result = 2;
                break;
            }
            else{
                roll = total;
            }
        }
        while (result != 0);
        if(result == 1){
            return false;
        }
        return true;
    }
}
