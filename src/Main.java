public class Main {
    public static void main(String[] args) {
        // Exercise 1
        int age = 15;

        if (age >= 18){

            System.out.println("Поздравляю с срвешеннолетием");
        }

        if (age < 18){

            System.out.println("Возраст совершеннолетия ещё не наступил, нужно немного подождать");
        }

        // Exercise 2
        int people = 25;

        if (people >= 7);
        if (people < 18){
            System.out.println("Человек ходит в школу");
        }

        if (people >= 18)
        if (people < 24){
            System.out.println("человек ходит в университет");
        }
        if (people >= 24){
            System.out.println("человек ходит на работу");
        }
        // Exercise 3
        int places = 80;

        if (places >= 1)
        if (places < 60){
            System.out.println("есть седячие места");
        }

        if (places >= 60)
        if (places <= 102){
            System.out.println("есть места только стоя");
        }

        if (places > 102){
            System.out.println("мест нет");
        }
    // Exercise 4

        int agePeople = 17;

        if(agePeople >= 18){
            System.out.println("поздравляю с совершеннолетием");
        }else{
            System.out.println("нужно немного подождать");
        }
    // Exercise 5

        if (people >= 7)
        if (people < 18){
            System.out.println("человек ходит в школу");
        } else
        if (people < 24){
            System.out.println("человек ходит в универитет");
        }else {
            System.out.println("человек ищет работу");
        }

    // Exercise 6
        if (places >= 1)
            if (places < 60){
                System.out.println("есть седячие места");
            }else
            if (places <= 102){
                System.out.println("есть места только стоя");
            }else{
            System.out.println("мест нет");
        }
    // Exercise 7
        int years = 2;
            boolean small = years >= 2 && years < 7;
            if (small){
                System.out.println("Если возраст человека равен " + years + ", то ему нужно ходить в сад");
            }else
            if (years < 18){
                System.out.println("Если возраст человека равен " + years + ", то ему нужно ходить в школу");
            } else
            if (years < 24){
                System.out.println("Если возраст человека равен " + years + ", то ему нужно ходить в университет");
            }else {
                System.out.println("Если возраст человека равен " + years + ", то ему нужно ходить на работу");
            }

        // Exercise 8

        int howManyYears = 50;

            if (howManyYears < 5){
                System.out.println("ребенку нельзя котаться а горках.");
            }else
            if (howManyYears <= 14){
                System.out.println("oн может кататься только в сопровождении взрослого.");
            }else{
                System.out.println("он может кататься без сопровождения взрослого.");
            }

        // Exercise 9
        int one = 7;
        int two = 10;
        int three = 30;

        if (one > two && one > three){
            System.out.println("число " + one + " больше остальных");
        }else
        if (two > one && two > three){
            System.out.println("число " + two + " больше остальных");
        }else
        if (three > one && three > two){
            System.out.println("число " + three + " больше остальных");

        }
    }
}