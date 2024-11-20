package ATB7X_28072024;

public class Animal {
        String name = "LOL";
        String color;


        void walk(){}
        void talk(){}

        public static void main(String[] args) {
            Animal animalrRef  = null; // declaration of a variable
            Animal animalrRef2  = new Animal();// creating a new object with new memory
            Animal animalrRef3  = new Animal();
            Animal animalrRef4  = animalrRef2;
            System.out.println(animalrRef3.name);
        }
    }

