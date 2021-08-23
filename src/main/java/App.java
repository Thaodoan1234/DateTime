import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        getSecondFromMonthAndYear();
        secondOfYear();
    }

    //kiểm tra năm nhuận
    public static boolean isLeapYear() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter year: ");
        int year = sc.nextInt();
        if((year % 400 == 0) || (year % 4 == 0) && (year % 100 != 0)) {
            return true;
        }
        else return false;
    }

    //lấy số giây trong 1 tháng bất kỳ
    public static void getSecondFromMonthAndYear() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = sc.nextInt();
        System.out.print("\nEnter month: ");
        int month = sc.nextInt();
        int day;

        if(month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12) {
            System.out.format("Tháng %d có %d giây", month, 31*3600);
        }
        else if(month==4 || month==6 || month==9 || month==11) {
            System.out.format("Tháng %d có %d giây", month, 30*3600);
        }
        else if(month==2) {
            if((year % 400 == 0) || (year % 4 == 0) && (year % 100 != 0)) {
                System.out.format("Tháng %d có %d giây", month, 29*3600);
            }
            else {
                System.out.format("Tháng %d có %d giây", month, 28*36000);
            }
        }
        else {
            System.out.println("Tháng không hợp lệ");
        }
    }

    //lấy số giây của năm bất kỳ
    public static void secondOfYear() {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter year: ");
        int year = sc.nextInt();
        if((year % 400 == 0) || (year % 4 == 0) && (year % 100 != 0)) {
            System.out.format("Số giây của năm %d là: %d",year, 365*3600);
        }
        else {
            System.out.format("Số giây của năm %d là: %d ",year, 366*3600);
        }
    }


}
