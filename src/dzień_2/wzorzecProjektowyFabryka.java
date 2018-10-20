package dzień_2;

interface Animal {
    String makeNoise();
}

class Dog implements Animal {

    @Override
    public String makeNoise() {
        return "WoofWoof";
    }
}

class Cat implements Animal {
    @Override
    public String makeNoise() {
        return "MiauMiau";
    }
}

class Horse implements Animal {
    @Override
    public String makeNoise() {
        return "pffffffff";
    }
}

class AnimalFabric {
    public static Animal chooseAnimal(String noise) {
        Animal animal = null;

        switch (noise) {
            case "WoofWoof":
                animal = new Dog();
                break;
            case "MiauMiau":
                animal = new Cat();
                break;
            case "pffffffff":
                animal = new Horse();
                break;
            default:
                System.out.println("I have no idea what is this.");
        }
        return animal;
    }


}

public class wzorzecProjektowyFabryka {
    public static void main(String[] args) {
        Animal animal = AnimalFabric.chooseAnimal("pffffffff");
        Animal animall =  AnimalFabric.chooseAnimal("MiauMiau");
        Animal animalll =  AnimalFabric.chooseAnimal("WoofWoof");

        System.out.println(animal.getClass().toString());
        System.out.println(animall.getClass().toString());
        System.out.println(animalll.getClass().toString());
    }


}
