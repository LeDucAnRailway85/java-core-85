package com.vti;

public class APeekElement {

//    1.Find a peak element which is not smaller than its neighbours

//    public int findElement(int[] arr){
////        xử lí nếu mảng rỗng hoặc null thì trả về -1
//        if(arr == null || arr.length == 0)
//            return -1;
//
////        xử lí phần tử ở đầu hoặc cuối
//        int n = arr.length;
//
////        nếu mảng có 1 phần tử duy nhất hoặc phần tử đầu tiên thoả mãn không nhỏ hơn số bên cạnh
//        if(n == 1 || arr[0] >= arr[1]){
//            return arr[0];
//        }
//
////        nếu mảng có 1 phần tử duy nhất hoặc phần tử cuối cùng thoả mãn không nhỏ hơn số bên cạnh
//        if(n == 1 || arr[n-1] >= arr[n-2]){
//            return arr[n-1];
//        }
//
//       for(int i = 1; i <= n-2; i++){
//           if(arr[i] >= arr[i-1] && arr[i] >= arr[i+1]){
//               return arr[i];
//           }
//       }
//        return -1;
//    }


//    2. Find a peek element using by Binary Search & recursive
    /*     Ý tưởng : */

    public static int findAPeekElementWithBinarySearch(int[] arr, int l, int r, int n) {
//        tìm chỉ số ở giữa Array
        int mid = l + (r - l) / 2;

//        Nếu số ở value tại mid lớn hơn 2 số liền kề thì return mid và exist.
        if (mid == 0 || arr[mid] >= arr[mid - 1]
                && (mid == n - 1 || arr[mid] >= arr[mid + 1])
        ) {
            return mid;
        } else if (mid > 0 && arr[mid] <= arr[mid - 1]) {
            return findAPeekElementWithBinarySearch(arr, l, mid - 1, n);
        } else {
            return findAPeekElementWithBinarySearch(arr, mid + 1, r, n);
        }
    }

    //     hàm đệ quy
    public static int findE(int[] arr, int n) {
        return findAPeekElementWithBinarySearch(arr, 0, n - 1, n);
    }

    public static void main(String[] args) {
//        APeekElement bt1 = new APeekElement();
//        int result =  bt1.findElement(new int[]{1, 1, 1, 1});
//
//
//        if(result != -1) {
//            System.out.println("A Peek Element is " + result);
//        }else
//            System.out.println("A Peek Element is not present");
//    }
        int[] arr = {1, 2, 7, 3, 4, 5, 6, 8, 7};
        int n = arr.length;

        System.out.println("index of a peek number is: " + findE(arr, n));
    }

}