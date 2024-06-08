package JavaTheory;

public class String {
    /*
        - Definition:
            String là 1 chuỗi các ký tự .
            String là 1 object immutable - không thể thay đổi giá trị sau khi khởi tạo.

         - Creating a String:

            String myString = new String("Hello World");

         - String Literals as Constants or Singletons:
            Ex:    String myString1 = "Hello World";
                   String myString2 = "Hello World";

                => Khi khởi tạo 2 biến với cùng 1 giá trị thì chỉ trỏ cùng tới 1 địa chỉ chứ thực tế không có biến mới được tạo
                => Gọi là Singletons
          - Các hàm thường thao tác trên String:

                  String str = new String();

            + str.charAt(index)  => trả ra ký tự tại vị trí index
            + str.substring()    => Trả về chuỗi con bắt đầu tại vị trí i đến cuối chuỗi
            + str.indexOf(String str, int fromIndex)  => Trả về vị trí xuất hiện đầu tiên của str bắt đầu từ vị trí fromIndex
            + str.lastIndexOf(String str, int fromIndex)   => Trả về vị trí cuối cùng xuất hiện của chuỗi str trong khoảng 0 đến fromIndex
            + str.trim(): Xoá các khoảng trắng ở đầu và cuối chuỗi
            + str.replace(char old, char new)  => thay thế các ký tự old thành new


         - String pool in Java:
            String pool là 1 phân vùng nhỏ nằm trong bộ nhớ heap chứa các String
            Nó được tạo ra với mục đích tối ưu lưu trữ và dùng vùng nhớ khi khai báo String từ đó giúp hạn chế tình trạng tràn bộ nhớ Heap


     */
}
