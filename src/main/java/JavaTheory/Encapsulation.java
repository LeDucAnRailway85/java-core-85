package JavaTheory;

public class Encapsulation {
    /*
        Tính đóng gói (Encapsulation) là một trong những nguyên tắc quan trọng trong Lập Trình Hướng Đối Tượng (OOP).
         Nguyên tắc này đề cập đến việc che giấu thông tin và hành vi bên trong đối tượng,
          chỉ tiết lộ những gì cần thiết và quy định cách truy cập thông qua các phương thức công khai.

        Tính đóng gói giúp bảo vệ dữ liệu và tránh truy cập trực tiếp đến các thuộc tính của đối tượng từ bên ngoài.

    Ex:
                    public class Person {
                        private String name;  // Thuộc tính name là private
                        private int age;      // Thuộc tính age là private

                        // Phương thức khởi tạo
                        public Person(String name, int age) {
                            this.name = name;
                            this.age = age;
                        }

                        // Phương thức công khai để lấy tên
                        public String getName() {
                            return name;
                        }

                        // Phương thức công khai để lấy tuổi
                        public int getAge() {
                            return age;
                        }

                        // Phương thức công khai để thay đổi tuổi
                        public void setAge(int age) {
                            if (age >= 0) {
                                this.age = age;
                            }
                        }
                    }
     */
}
