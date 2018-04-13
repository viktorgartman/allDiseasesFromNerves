package Interface;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private static  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        System.out.println("Добрый день, это база данных зависимостей болезней тела от состояния души!" + "\n" +
                "Навигация по меню осуществляется цифровыми кнопками от 1 до 8" + "\n" +
                "для возврата на предыдущий уровень меню нажмите символ \"*\"");

        allMenuPrint();
        menuChoiseEngine(readerUserChoise());

        return;
    }

    public static String readerUserChoise () throws IOException {

        String userChoise = br.readLine();
        return userChoise;
    }

    public static void menuChoiseEngine (String someCase) throws IOException {

        switch (someCase){
            case "1":
                firstMenu();
                break;
            case "2":
                secondMenu();
                break;
            case "3" :
                System.out.println("3. Удалить запись");
                break;
            case "4" :
                System.out.println("4. Поиск");
                break;
            case "5" :
                System.out.println("5. Вывести список всех болезней");
                break;
            case "6" :
                System.out.println("6. О программе");
                break;
            case "7" :
                System.out.println("7. Помощь");
                break;
            case "8" :
                System.out.println("8. Выход");
                System.out.println("Не болейте!");
                break;
            case "*" :
                allMenuPrint();
                menuChoiseEngine(readerUserChoise());
        }
    }

    public static void firstMenu() throws IOException {
        System.out.println("1. Название болезни" + "\n" +
                "2. Симптомы болезни" + "\n" +
                "3. Тип лечения" + "\n" +
                "4. Срок лечения" + "\n" +
                "5. Эмоциональная причина");
        switch (readerUserChoise()) {
            case "1":
                System.out.println("1. Название болезни");
                break;
            case "2":
                System.out.println("2. Симптомы болезни");
                break;
            case "3" :
                System.out.println("3. Тип лечения");
                break;
            case "4" :
                System.out.println("4. Срок лечения");
                break;
            case "5" :
                System.out.println("5. Эмоциональная причина");
                break;
            case "*" :
                allMenuPrint();
                menuChoiseEngine(readerUserChoise());
        }
    }
    public static void secondMenu() throws IOException {
        System.out.println("1. Изменить название" + "\n" +
                "2. Изменить симптомы" + "\n" +
                "3. Изменить тип лечения" + "\n" +
                "4. Изменить срок лечения" + "\n" +
                "5. Изменить эмоциональную причину");
        switch (readerUserChoise()){
            case "1" :
                System.out.println("1. Изменить название");
            case "2" :
                System.out.println("2. Изменить симптомы");
            case "3" :
                System.out.println("3. Изменить тип лечения");
            case "4":
                System.out.println("4. Изменить срок лечения");
            case "5" :
                System.out.println("5. Изменить эмоциональную причину");
            case "*":
                allMenuPrint();
                menuChoiseEngine(readerUserChoise());
        }
    }

    private static void allMenuPrint(){
        System.out.println("Главное меню:");
        System.out.println("1. Создать новую запись" + "\n" +
                "2. Изменить запись"  + "\n" +
                "3. Удалить запись"  + "\n" +
                "4. Найти запись" + "\n" +
                "5. Вывести список всех болезней" + "\n" +
                "6. О программе" + "\n" +
                "7. Помощь" + "\n" +
                "8. Выход" + "\n" +
                "Введите пункт меню:");
    }
}
