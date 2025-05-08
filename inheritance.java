public class inheritance {
    public static void main(String[] args) {
       Puppy obj=new Puppy();
       obj.bark();
       obj.cute();
       obj.eat(); 
       Cat c=new Cat();
       c.meow();
    }
}
class Animal{
    void eat(){
        System.out.println("pedigree");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("boww voww");
    }
}
class Puppy extends Dog {
    void cute(){
        System.out.println("cutiepieeee");
    }
}
class Cat extends Animal{
    void meow(){
        System.out.println("wi wi wii");
    }
}
