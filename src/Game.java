public class Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int step = 0;//переменные
        int personX;
        int personY;
        int personLive = 3;
        int sizeBoard = 5;//переменные
        personX = sizeBoard / 2;//центр игрового поля
        personY = sizeBoard / 2;
        personX = 1 + sizeBoard / 2;//ход персонажа
        personY = 1 + sizeBoard / 2;
        String person = "H";
        String monster = "V";
        String gamingField = "+ —— + —— + —— +\n"
                + "|    |    |    |\n"
                + "+ —— + —— + —— +\n"
                + "|    | " + monster + " |    |\n"
                + "+ —— + —— + —— +\n"
                + "| " + person + " |    |    |\n"
                + "+ —— + —— + —— +";
        String begin = "|    | |";
        String end = " |    |";
        String full = begin + monster + end; // |    | Мм |    |
        System.out.println("Привет! Ты готов начать играть в игру? (Напиши: ДА или НЕТ)");
        String answer = String.valueOf(scanner.nextDouble());
        if (answer.equals("ДА")) {
            // первый блок
            System.out.println("Ехала!");
        } else {
            // второй блок
            System.out.println("Как так то?");
            int step = 0;
            int personX = 3;
            int personY = 1;
            Scanner scanner = new Scanner(System.in);
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            // personX == 3, personY == 1
            if (x != personX && y != personY) {
                System.out.println("Некорректный ход");
            }  else if (Math.abs(x - personX) == 1){
                personX = x;
                step += 1;
            }   else if (Math.abs(y - personY) == 1 ){
                personY = y;
                step += 1;
            }
            else  {
                System.out.println("корды не изменены");
                Scanner scanner = new Scanner(System.in, "UTF-8");
                System.out.println("Привет! Ты готов начать играть в игру? (Напиши: ДА или НЕТ)");
                String answer = scanner.nextLine();
                if (answer.equalsIgnoreCase("ДА")) {
                    // первый блок
                    System.out.println("Ехала!");
                } else if (answer.equalsIgnoreCase("НЕТ")) {
                    // второй блок
                    System.out.println("Как так то?");
                } else {
                    System.out.println("Есть всего два ответа");
                }
            }
        }