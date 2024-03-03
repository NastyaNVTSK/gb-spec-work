import models.*;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    private final Database database;
    private final Scanner scanner;

    public Menu(Database database) {
        this.database = database;
        scanner = new Scanner(System.in);
    }

    public void displayMenu() {
        while (true) {
            try {
                System.out.println("Меню:");
                System.out.println("1. Внести в реестр");
                System.out.println("2. Показать всех животных в реестре");
                System.out.println("3. Узнать что умеет животное");
                System.out.println("4. Обучить животинку");
                System.out.println("0. Выход");
                System.out.print("Выберите пункт меню: ");
                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1 -> addNewAnimal();
                    case 2 -> database.displayAllAnimals();
                    case 3 -> displayAnimalCommands();
                    case 4 -> teachNewCommand();
                    case 0 -> {
                        System.out.println("Ок, до свидания");
                        return;
                    }
                    default -> System.out.println("Я не знаю такую команду, выберите команду из списка");
                }
            } catch (InputMismatchException e) {
                System.out.println(e.getMessage());
                scanner.nextLine();
            }
        }
    }


    private void addNewAnimal() {
        System.out.println("Введите имя животного:");
        String name = scanner.nextLine();
        System.out.println("Введите список команд через запятую:");
        String skills = scanner.nextLine();

        System.out.println("Выберите класс животного:");
        System.out.println("1. Собака");
        System.out.println("2. Кошка");
        System.out.println("3. Хомяк");
        System.out.println("4. Осёл");
        System.out.println("5. Конь");
        int animalClass = scanner.nextInt();
        scanner.nextLine();

        Animal animal;
        switch (animalClass) {
            case 1 -> animal = new Dog(name, skills);
            case 2 -> animal = new Cat(name, skills);
            case 3 -> animal = new Humster(name, skills);
            case 4 -> animal = new Donkey(name, skills);
            case 5 -> animal = new Horse(name, skills);
            default -> {
                System.out.println("Неверный выбор класса животного.");
                return;
            }
        }

        database.addAnimal(animal);
        System.out.println("Животное успешно добавлено");
    }

    private void displayAnimalCommands() {
        System.out.println("Введите имя животного:");
        String name = scanner.nextLine();

        database.displayAnimalCommands(name);
    }

    private void teachNewCommand() {
        System.out.println("Введите имя животного:");
        String name = scanner.nextLine();
        System.out.println("Введите новые команды через запятую:");
        String command = scanner.nextLine();

        database.teachNewCommand(name, command);
        System.out.println("Команда успешно добавлена для животного.");
    }
}