package JavaTheory;

public class TypeCasting {
    /*
        - Phân loại:
                Có 2 loại ép kiểu trong Java:
                    + widening
                        byte -> short -> int -> long -> float -> double

                       => biến đổi kiểu này không làm mất thông tin

                    + narrowwing
                        double -> float -> int -> short -> byte

                        Ex :    double d = 100.04;
                                long l = (long) d;
                       => Kiểu biến đổi này có thể gây ra mất thông tin , không thể thực hiện ngầm định bởi trình biên dịch


        - Chuyển đổi String thành int trong java:
                int i = Integer.parseInt("200");

        - Chuyển đổi int thành String trong java:

            Cách 1: Dùng String.valueOf()

                int i = 10;
                String s = String.valueOf(i);

            Cách 2: Dùng Integer.toString();

                int  i = 10;
                String s = Integer.toString(i);

         - Chuyển đổi String thành Date trong java:

            Chuyển đổi String thành Date trong java
                bằng cách sử dụng phương thức parse() của các lớp DateFormat và SimpleDateFormat.

                Ex:   import java.text.SimpleDateFormat;
                      import java.util.Date;

                    public class StringToDateExample {
                        public static void main(String[] args) throws Exception {
                            String sDate = "17/07/2017";
                            Date date = new SimpleDateFormat("dd/MM/yyyy").parse(sDate);
                            System.out.println(sDate + "\t" + date);
                        }
                       }

     */
}
