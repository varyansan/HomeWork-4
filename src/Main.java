public class Main {
    public static void main(String[] args) {

        System.out.println("Задание №1");
        int age = 20;

        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний.");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг" +
                    " совершеннолетния, нужно немного подождать.");
        }

        System.out.println("Задание №2");
        int temperature = 3;

        if (temperature < 5) {
            System.out.println("На улице " + temperature + " градусов. На улице холодно, " +
                    "нужно надеть шапку.");
        } else {
            System.out.println("На улице " + temperature + " градусов. Сегодня тепло, " +
                    "можно идти без шапки.");
        }

        System.out.println("Задание №3");
        int speed = 60;

        if (speed > 60) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф!");
        } else {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно!");
        }

        System.out.println("Задание №4");
        int yearsOld = 25;

        boolean kindergarten = yearsOld >= 2 && yearsOld <= 6;
        boolean school = yearsOld >= 7 && yearsOld <= 17;
        boolean university = yearsOld >= 18 && yearsOld <= 24;
        boolean work = yearsOld > 24;

        if (kindergarten) {
            System.out.println("Если возраст человека равен " + yearsOld + ", то ему нужно ходить в детский сад.");
        }
        if (school) {
            System.out.println("Если возраст человека равен " + yearsOld + ", то ему нужно ходить в школу.");
        }
        if (university) {
            System.out.println("Если возраст человека равен " + yearsOld + ", то ему нужно ходить в университет.");
        }
        if (work) {
            System.out.println("Если возраст человека равен " + yearsOld + ", то ему пора ходить на работу.");
        }

        System.out.println("Задание №5");
        int childAge = 4;

        boolean youngAge = childAge < 5;
        boolean averageAge = childAge >= 5 && childAge <= 14;
        boolean oldAge = childAge > 14;

        if (youngAge) {
            System.out.println("Если возраст ребенка равен " + childAge + ", то ему нельзя кататься на аттракционе.");
        }
        if (averageAge) {
            System.out.println("Если возраст ребенка равен " + childAge + ", то ему " +
                    "можно кататься на аттракционе в сопровождении взрослого.");
        }
        if (oldAge) {
            System.out.println("Если возраст ребенка равен " + childAge + ", то ему можно кататься на аттракционе " +
                    "без сопровождения взрослого.");
        }

        System.out.println("Задание №6");
        int numberOfPersons = 70;
        int carriageCapacity = 102;
        int seatPlace = 60;

        if (numberOfPersons <= seatPlace) {
            System.out.println("Есть сидячие места.");
        } else if (numberOfPersons > seatPlace && numberOfPersons < carriageCapacity){
            System.out.println("Остались только стоячие места.");
        } else {
            System.out.println("Мест в вагоне нет!");
        }

        System.out.println("Задание №7");
        int one = 159;
        int two = 357;
        int three = 958;

        boolean firstNumberIsGreater = one > two && one > three;
        boolean secondNumberIsGreater = two > three && two > one;

        if (firstNumberIsGreater) {
            System.out.println("Число " + one + " самое больше из всех предложенных.");
        } else if (secondNumberIsGreater) {
            System.out.println("Число " + two + " самое большое из всех предложенных.");
        } else {
            System.out.println("Число " + three + " самое большое из всех предложенных.");
        }

    }
}




