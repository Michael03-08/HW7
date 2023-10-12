import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int toadEyesCount = 0;          //Жабьи глаза
        int ghoulTearsCount = 0;        //Слезы вурдалака
        int ravenBonesCount = 0;        //Кости ворона
        int dumplingsCount = 0;         //Пельмени(а почему, собственно нет? xD )
        boolean isCanCook = false;

        Scanner scanner = new Scanner(System.in);
        //todo реализовать ввод пользователем кол-ва ингредиентов.
        System.out.print("Ввеите колличество Жабьих глаз: ");
        toadEyesCount  = scanner.nextInt();

        System.out.print("Введите колличество Слез вурдалака: ");
        ghoulTearsCount = scanner.nextInt();

        System.out.print("Введите колличество Костей вороно: ");
        ravenBonesCount = scanner.nextInt();

        System.out.print("Введите колличество Пельмений: ");
        dumplingsCount = scanner.nextInt();

        //Рецепты Эликсиров:
        // 1. 3 Жабьих глаза + 1 кость ворона - Эликсир зоркости
        // 2. 2 кости ворона + 4 пельменя - Эликсир стойкости
        // 3. 7 слез вурдалака + 1 пельмень + 2 жабьих глаза - Эликсир скрытности
        // 4. 5 слез вурдалака + 10 пельменей + 4 жабьих глаза + 3 кости ворона - Запретный эликсир

        //todo дописать логику программы сюда

        if(toadEyesCount >= 3 && toadEyesCount >= 1){
            System.out.println("Вы сделали Элесир зоркости");
            isCanCook = true;
        }
        if (toadEyesCount >= 2 && dumplingsCount >= 4){
            System.out.println("Вы сделали Элексир стойкости");
            isCanCook = true;

        }
        if (ghoulTearsCount >= 7 && dumplingsCount >= 1 && toadEyesCount >= 2){
            System.out.println("Вы сделали Элексир срытности");
            isCanCook = true;

        }
        if (ghoulTearsCount >= 5 && dumplingsCount >= 10 && toadEyesCount >= 4 && ravenBonesCount >= 3){
            System.out.println("Вы ссделали Запретныей элексир");
            isCanCook = true;
        }
        if (isCanCook == false){
            System.out.println("Вы не можете ничего создать");
        }
    }
}
