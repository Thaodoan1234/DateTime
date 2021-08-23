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
        int day, second;

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                day = 31;
                System.out.format("Tháng có %d giây ", 31*3600);
            case 4:
            case 6:
            case 9:
            case 11:
                day = 30;
                System.out.format("Tháng có %d giây ", 30*3600);
            case 2:
                if ((year % 400 == 0) || (year % 4 == 0) && (year % 100 != 0)) {
                    day = 29;
                    System.out.format("Tháng có %d giây ", 29*3600);
                } else {
                    day = 28;
                    System.out.format("Tháng có %d giây ", 28*3600);
                }
            default:
                   System.out.println("bạn nhập không đúng");
        }
    }

    //lấy số giây của năm bất kỳ
    public static void secondOfYear() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = sc.nextInt();
        if((year % 400 == 0) || (year % 4 == 0) && (year % 100 != 0)) {
            System.out.format("Số giây của năm %d là: %d",year, 365*3600);
        }
        else {
            System.out.format("Số giây của năm %d là: %d ",year, 366*3600);
        }
    }


}
