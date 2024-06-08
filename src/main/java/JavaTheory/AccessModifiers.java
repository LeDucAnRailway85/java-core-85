package JavaTheory;

public class AccessModifiers {
    /*
        Access Modifiers cung cấp quyền truy cập cho lớp , constructor, fields, và method.
        4 trạng thái truy cập :
            private
            default (package)
            protected
            public

         1. Private
            Nếu 1 biến hoăc 1 method ở trạng thái private thì chỉ có code trong cùng 1 class mới có thể truy cập
            Không có private class . Vì trạng thái private không cho phép chia sẻ thông tin trong class với các class khác
                như vậy thì class tạo ra không đươc sử dụng

             - Khi áp dụng private với các fields( biến ) thì để lấy thông tin chia sẻ cho các class khác ta sử dụng Getter và Setter

                Ex:     public class Clock {
                        private long time = 0;

                        public long getTime() {
                            return this.time;
                        }

                        public void setTime(long theTime) {
                            this.time = theTime;
                        }
                    }

                - private constructor : không thể tạo instance của class bên ngoài nó

           2.Default
                - Nếu không khai báo modifier thì đó chính là trạng thái default .
                - Default Access Modifier là chỉ được phép truy cập trong cùng package.

           3.Protected
               - Protected access modifier được truy cập bên trong package
               - subclass có thể kế thừa fields và method từ superclass cho dù khác package
               - Không có class protected

           4. Public
               - Public access modifier được truy cập ở mọi nơi.



     */
}
