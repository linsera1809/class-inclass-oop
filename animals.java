class Animal {
    public void Eat()
    {
        System.out.println("Eating...");
    }
}


class Dog extends Animal {
    public void Eat() {
        System.out.println("Dog is eating...");
    }
    
    public void Bark() {
        System.out.println("Bark Bark");
    }
}

class Cat extends Animal {
    public void Meow() {
        System.out.println("Meow Meow");
    }
}

public class animals
{
    public static void main (String [] args)
    {
        Dog d = new Dog();
        Animal a = (Animal)d;
        d.Eat();
        a.Eat();
        d.Bark();
        ((Dog) a).Bark();

        Cat c = new Cat();
        Animal b = (Animal)c;
        c.Eat();
        b.Eat();
        c.Meow();
        ((Cat) b).Meow();

        Dog e = (Dog) b;
    }
}
