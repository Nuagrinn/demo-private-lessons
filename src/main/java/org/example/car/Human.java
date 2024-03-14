package org.example.car;


//Задание: спроектировать объектную модель (классы, интерфейсы) автомобиля.
//
//Задание 1.1. Описать автомобиль в классе с параметрами - имя, мощность, вес, вид. Автомобили могут быть разных видов
// (легковые, пикапы, внедорожники).
//
//У автомобилей есть двигатель, который можно завести и заглушить. А так же руль, который можно покрутить
// (2 класса - Руль и Двигатель - композиция).
//Машиной можно управлять - завести двигатель, покрутить руль и заглушить двигатель.
//
//Все действия – просто вывод на консоль.

//Задание 1. 2. Написать функцию, которая принимает на вход машину,
// выводит в консоль её характеристики, заводит, едет, останавливается и глушит.

//Задание 1.3. Модифицировать модель с учётом электромобилей, которые не надо заводить.
// Использовать интерфейс и наследование, выделив Электромобиль и Автомобиль с двигателем внутреннего сгорания в отдельные классы.Протестировать оба типа автомобилей одним методом


public class Human {

    // 1. Название с заглавной, существительное
    // 2. Переменные: модификатор доступа -> static/non static (optional) -> тип данны ->  название, с маленькой буквы
    // 3. кострукторы
    // 4. геттеры, сеттеры

    private String name;
    private String sex;
    private int birthDate;
    private String birhtCountry;


    // конструктор - выглядит как метод, название совпадает с названием класса и начинается с заглавной буквы
    // не обязателен
    // что происходит, когда создается экземляр класса
    // чаще используется для инициализации переменных класса
    public Human() {
    }

    public Human(String name, String sex, int birthDate, String birhtCountry) {
        this.name = name;
        this.sex = sex;
        this.birthDate = birthDate;
        this.birhtCountry = birhtCountry;
    }

    //все поля мы инкапсулируем
    //private модификатор доступа

    //геттер: есть возвращаемый тип данных, модификатор доступа, название get + название переменной, которую хотим вернуть
    public String getName() {
        return name;
    }

    // сеттер: нет возвраемого типа данных (void), модификатор доступа, set + название переменной
    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(int birthDate) {
        this.birthDate = birthDate;
    }

    public String getBirhtCountry() {
        return birhtCountry;
    }

    public void setBirhtCountry(String birhtCountry) {
        this.birhtCountry = birhtCountry;
    }

    public static void main(String[] args) {

        Human man = new Human();

        man.setName("Josh");
        man.setBirthDate(11021198);

        System.out.println(man.getName() + " |||||| " +  man.getBirthDate());

//        Human man1 = new Human("Josh", "male", 11021998, "USA");

//        System.out.println("man #2: Name:" + man1.name);

    }
}
