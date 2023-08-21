package org.yeardream.java.oop;

public class Main {

    static class Animal{
        String name;

        Animal(String name){
            this.name = name;
        }
        public void cry(){
            System.out.println(name + " is crying");
        }
    }

    static class Giraffe extends Animal{
        public Giraffe(String name) {
            super(name);
        }

        @Override
        public void cry(){
            super.cry();
            System.out.println(name + " cannot cry");
        }
    }

    static class Dog extends Animal {
//        Dog(String name) {
//            super(name);
//        }

        String breed;
        Dog(String name, String breed){
            super(name);
            this.breed = breed;
        }

        public void bark(){

            System.out.println(name + " is barking");
        }
    }

    public static void main(String[] args){
        Dog dog = new Dog("koko", "huski");
        dog.cry();
        dog.bark();

        Animal animal = dog;
        animal.cry();
        //animal.bark();

        Animal giraffe = new Giraffe("girin");
        giraffe.cry();

    }
}
