import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class MazeProject
{
    public static String WALL = "x";
    public static String START = "S";
    public static String END = "E";
    public static String EMPTY = " ";
    public static String PATH = "P";
    public static char[][] array = new char[7][20];
    public static int x = 6;
    public static int y = 12;

    public static void main(String[]args)
    {
        int ct = 0;

        try(Scanner scanner = new Scanner(new File("simpleMaze.txt")))
        {
            while(scanner.hasNextLine())
            {
                String line = scanner.nextLine();
                for(int z = 0; z < line.length(); z++)
                {
                    array[ct][z] = line.charAt(z);
                }
                ct++;
            }
        }
        catch(FileNotFoundException e)
        {
            e.printStackTrace();
        }
        array[6][12] = START.charAt(0);
        array[0][18] = END.charAt(0);
        printMaze();
        System.out.println();

        boolean solved = solveMaze(x, y);
        if (solved) {
            System.out.println("Maze solved!");
        } else {
            System.out.println("No solution found.");
        }
        printMaze();
    }

    public static void printMaze(){
        for (char[] chars : array) {
            for (char aChar:chars) {
                System.out.print(aChar);
            }
            System.out.println();
        }
        System.out.println();
    }

    public static boolean solveMaze(int x, int y) {
        if (array[x][y] == END.charAt(0)) {
            return true;
        }

        if (array[x][y] != EMPTY.charAt(0) && array[x][y] != START.charAt(0)) {
            return false;
        }

        array[x][y] = PATH.charAt(0);

        if (x > 0 && solveMaze(x - 1, y)) {
            return true;
        }

        if (y < array[0].length - 1 && solveMaze(x, y + 1)) {
            return true;
        }

        if (x < array.length - 1 && solveMaze(x + 1, y)) {
            return true;
        }

        return y > 0 && solveMaze(x, y - 1);
    }
}