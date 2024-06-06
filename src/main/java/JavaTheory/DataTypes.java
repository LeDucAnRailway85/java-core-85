package JavaTheory;

public class DataTypes {
    /*

        - Primitive Data Types:

            boolean	A binary value of either true or false
            byte	8 bit signed value, values from -128 to 127
            short	16 bit signed value, values from -32.768 to 32.767
            char	16 bit Unicode character
            int	    32 bit signed value, values from -2.147.483.648 to 2.147.483.647
            long	64 bit signed value, values from -9.223.372.036.854.775.808 to 9.223.372.036.854.775.808
            float	32 bit floating point value
            double	64 bit floating point value


        - Object Types:
            Boolean	    A binary value of either true or false
            Byte	    8 bit signed value, values from -128 to 127
            Short	    16 bit signed value, values from -32.768 to 32.767
            Character	16 bit Unicode character
            Integer	    32 bit signed value, values from -2.147.483.648 to 2.147.483.647
            Long	    64 bit signed value, values from -9.223.372.036.854.775.808 to 9.223.372.036.854.775.808
            Float	    32 bit floating point value
            Double	    64 bit floating point value
            String	    N byte Unicode string of textual data. Immutable

           Note: Dạng Obj của biến primitive là immutable .
           Tức là giá trị khởi tạo và lưu trữ ban đầu là bất biến không thể thay đổi


        - Auto boxing/unboxing:

            Java có cơ chế tự động đóng gói dữ liệu kiểu primitive bên trong biến Obj.

                Ex:     Integer myInteger = new Integer(45);

                        int myInt = myInteger;
                  => auto unboxing

                        int myInt = 45;

                        Integer myInteger = myInt;
                  => auto boxing

               Note: Khi 1 biến primitive có giá trị null thì không thể unboxing và gán lại cho biến primitive

               Ex:      Integer myInteger = null;
                        int myInt = myInteger;

                    => error: NullPointerException

     */
}
