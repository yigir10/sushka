import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        int step = 0;//переменные
        int personX;
        int personY;
        int personLive = 3;
        int sizeBoard = 5;//переменные
        personX = sizeBoard / 2;//центр игрового поля
        personY = sizeBoard / 2;
        personX = 1 + sizeBoard / 2;//ход персонажа
        personY = 1 + sizeBoard / 2;
        String person = "Hamilton";
        String monster = "Verstapen";
        String gamingField = "+ —— + —— + —— +\n"
                + "|    |    |    |\n"
                + "+ —— + —— + —— +\n"
                + "|    | " + monster + " |    |\n"
                + "+ —— + —— + —— +\n"
                + "| " + person + " |    |    |\n"
                + "+ —— + —— + —— +";
        Scanner sc = new Scanner(System.in);
        double answer = sc.nextDouble();
        if (answer.equals("ДА")) {

            // первый блок
            System.out.print
        } else if (answer.equals("НЕТ")) {
            // второй блок
        } else {
            // третий блок
        }
        }
    }
}
