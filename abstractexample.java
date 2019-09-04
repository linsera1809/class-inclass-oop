abstract class animal {
    String name;
    
    public animal (String name){
        this.name = name;
    }
    
    void eat (){
        System.out.println(name + " is eating");
    }

    abstract void sound();
}

class dog extends animal {

    public dog (String name){
        super(name);
    }
    
    void sound(){
        System.out.println("Bark Bark");
    }
    
}

class cat extends animal {

    public cat (String name){
        super(name);
    }

    void sound() {
        System.out.println("Meow Meow");
    }
    
}

public class abstractexample {
    public static void main (String[] args){

        //animal myAnimal = new animal("animal");

        ///*
        dog myDog = new dog("dog");
        myDog.eat();
        myDog.sound();
        //*/

        ///*
        cat myCat = new cat("cat");
        myCat.eat();
        myCat.sound();
        //*/
    }
}