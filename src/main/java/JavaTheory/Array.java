package JavaTheory;

public class Array {

    /*
        - Definition:
            Array là tập hợp các phần tử có cùng 1 kiểu dữ liệu .
            Các phần tử được quản lý bởi chỉ mục(index) , bắt đầu từ index 0 .


        - Declaring an Array Variable in Java:
                int[] intArray;

        - Instantiating an Array in Java:

            Cách 1:

                int[] intArray;
                intArray = new int[10];

            Cách 2:
                String[] stringArray = new String[10];

           Note: Khi khởi tạo mảng kích thước của nó không thể thay đổi được .


        - Multidimensional Java Arrays:

               // khai báo 1 mảng 2 chiều :

                    int[][] intArray = new int[10][20];

        - Iterating Multidimensional Arrays:

                // lặp qua các phần tử của 1 mảng 2 chiều :
                    int[][] intArray = new int[10][20];

                        for(int i=0; i < intArrays.length; i++){
                            for(int j=0; j < intArrays[i].length; j++){
                                System.out.println("i: " + i + ", j: " + j);
                            }
                        }
                // Inserting Elements Into an Array :
                        int[] ints   = new int[20];

                        int insertIndex = 10;
                        int newValue    = 123;

                        //move elements below insertion point.
                        for(int i=ints.length-1; i > insertIndex; i--){
                            ints[i] = ints[i-1];
                        }

                        //insert new value
                        ints[insertIndex] = newValue;

                        System.out.println(Arrays.toString(ints));




     */
}
