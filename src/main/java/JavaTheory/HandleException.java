package JavaTheory;

public class HandleException {
    /*
        - Exception là một tình trạng bất thường xảy ra trong quá trình thực thi chương trình,
            phá vỡ luồng chuẩn của chương trình.
        - Mô hình xử lý ngoại lệ của Java dựa trên ba hoạt động chính: đặc tả ngoại lệ, ném ra ngoại lệ và bắt ngoại lệ.

        - Types of Exception:
            Có 2 loại Exception chính:
                1.Checked Exception : + Đây là các ngoại lệ xảy ra tại thời điểm biên dịch
                                      + Checked Exception thường xảy ra do người dùng và không thể dự đoán được bởi lập trình viên.
                                         Ví dụ, IOException, SQLException.

                2.Unchecked Exception: + Đây là các ngoại lệ không cần kiểm tra tại thời điểm biên dịch
                                       + thường xảy ra do lỗi trong mã nguồn
                                           chẳng hạn như NullPointerException, ArithmeticException.

                3. Error: +  Là các ngoại lệ không thường được đặt bẫy, và chúng thường xảy ra do lỗi vượt quá tầm kiểm soát của lập trình viên
                          +  ví dụ: OutOfMemoryError, StackOverflowError.



              - Cấu trúc try-catch trong xử lý ngoại lệ:


                            try {
                                // Đoạn mã có thể gây ra ngoại lệ
                            } catch (ExceptionType e) {
                                // Xử lý ngoại lệ
                            }

              - Các Exception thường gặp :

                        1. ArithmeticException - Được ném khi có lỗi toán học, chẳng hạn như chia cho 0.
                        2. NullPointerException - Được ném khi một ứng dụng cố gắng sử dụng null nơi mà một đối tượng được yêu cầu.
                        3. ArrayIndexOutOfBoundsException - Được ném khi một chỉ số không hợp lệ được truy cập trong một mảng.
                        4. ClassCastException -  Được ném khi một lớp không thể được ép kiểu thành một lớp khác.
                        5. IllegalArgumentException - Được ném để chỉ ra rằng một phương thức đã nhận một đối số không hợp lệ.
                        6. NumberFormatException - Được ném để chỉ ra rằng chuỗi không thể được phân tích cú pháp thành một số.
                        7. IOException - Được ném khi có vấn đề xảy ra trong quá trình nhập hoặc xuất.
                        8. FileNotFoundException - Một lớp con của IOException, được ném khi cố gắng mở một tệp không tồn tại.
                        9. SQLException - Được ném khi có vấn đề xảy ra với cơ sở dữ liệu.
                        10. InterruptedException - Được ném khi một luồng đang ngủ hoặc chờ bị gián đoạn.



          - throws và throw trong Handle Exception:
                Nếu đã xác định được Exception và không muốn xử lý tại chỗ , có thể xử lý ở 1 cấp cao hơn .
                Dùng keyword "throws" để ném ra 1 Exception xác định .





        */
}
