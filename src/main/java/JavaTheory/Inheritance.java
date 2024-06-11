package JavaTheory;

public class Inheritance {
    /*
        - Kế thừa (Inheritance) là một trong những khía cạnh quan trọng nhất của Lập Trình Hướng Đối Tượng (OOP).
        - Nó cho phép tạo ra các lớp mới bằng cách sử dụng thông tin và hành vi từ các lớp đã tồn tại.

            => Tính kế thừa giúp tái sử dụng mã nguồn và tạo ra cấu trúc phân cấp cho các lớp.

                  Ex :
                        class Animal {
                            void eat() {
                                System.out.println("Động vật đang ăn...");
                            }
                        }


                        class Dog extends Animal {
                            void bark() {
                                System.out.println("Chó sủa...");
                            }
                        }

                        Dog dog = new Dog();
                        dog.eat(); // Gọi phương thức từ lớp cha
                        dog.bark(); // Gọi phương thức từ lớp con


                      - Ưu điểm của tính kế thừa:

                            Tái sử dụng mã nguồn:
                                Tính kế thừa cho phép bạn sử dụng lại mã nguồn đã tồn tại trong các lớp cha,
                                    giúp giảm lặp lại mã và tiết kiệm thời gian lập trình.

                            Tạo cấu trúc phân cấp:
                                Bằng cách xây dựng các lớp con trên cơ sở của các lớp cha,
                                    bạn có thể tạo ra cấu trúc phân cấp cho các đối tượng, làm cho mã nguồn trở nên dễ quản lý hơn.

                            Mở rộng tính năng:
                                Bạn có thể thêm các phương thức và thuộc tính mới vào lớp con mà không làm ảnh hưởng đến lớp cha,
                                    giúp bạn mở rộng tính năng của ứng dụng một cách dễ dàng.


                 - Overriding Methods :
                    -Trong các subclass có thể override (redefine) các method đã được định nghĩa trong superclass.
                    - @override Annotation là để trình biên dịch phát hiện ra lỗi trong trường hợp phương thức bị xoá hoặc đổi tên.



     */

}
