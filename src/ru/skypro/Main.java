package ru.skypro;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
	// Задание 1 и Задание 2

        String firstName = "Ivan "; // Объявляем три строки: имя, отчество и фамилия
        String middleName = "Ivanovich ";
        String lastName = "Ivanov ";
        String fullName = lastName + firstName + middleName; // С помощью конкатенации объединяем строки
        System.out.println(fullName);

        String fullNameUp = fullName.toUpperCase(); // С помощью метода toUpperCase все символы строки fullName перейдут в верхний регистр
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullNameUp);

        StringBuilder fullNameNew = new StringBuilder("Ivanov Ivan Ivanovich");
        fullNameNew.delete(7, ' ');
        fullNameNew.append("Семён Семёнович");
        System.out.println(fullNameNew);


        fullName = "Иванов Семён Семёныч";

        String fullNameReplace = fullName.replace('ё', 'е');
        System.out.println("Данные ФИО сотрудника " + fullNameReplace);
        System.out.println("Данные ФИО сотрудника " + fullNameReplace);

        }
}
