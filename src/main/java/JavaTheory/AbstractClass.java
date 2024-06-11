package JavaTheory;

public class AbstractClass {
    /*
       - Tính trừu tượng (Abstraction) là một trong những khía cạnh quan trọng nhất của Lập Trình Hướng Đối Tượng (OOP).
       - Nó cho phép bạn tạo ra các lớp và đối tượng trừu tượng, tập trung vào các tính năng quan trọng
             mà bạn quan tâm và che giấu chi tiết phức tạp bên trong
       - Các subclass phải triển khai tất cả các abstract method và có thể được ghi đè nếu cần.
       - Subclass không cần triển khai các abstract method  khi nó là abstractClass và kế thừa Abstract superclass


       - Declaring an Abstract Class in Java:
                    public abstract class MyAbstractClass {

                    }


             Ex:
                    // Lớp trừu tượng "Động Vật"
                        abstract class Animal {
                            abstract void sound(); // Phương thức trừu tượng
                        }

                        // Lớp con "Chó" kế thừa từ "Động Vật"
                        class Dog extends Animal {
                            void sound() {
                                System.out.println("Gâu gâu!");
                            }
                        }

                        // Lớp con "Mèo" kế thừa từ "Động Vật"
                        class Cat extends Animal {
                            void sound() {
                                System.out.println("Meo meo!");
                            }
                        }

                        Animal myDog = new Dog();
                        Animal myCat = new Cat();

                        myDog.sound(); // In ra "Gâu gâu!"
                        myCat.sound(); // In ra "Meo meo!"

     */
}
