import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập bán kính hình tròn:");
        int r = sc.nextInt();
        Circle hinhTron = new Circle();
        hinhTron = new Circle(r, "red");
        System.out.println("Thông tin hình tròn: ");
        System.out.println(hinhTron);

        System.out.println("Nhập chiều cao hình tròn:");
        int h = sc.nextInt();
        Cylinder hinhTru = new Cylinder();
        hinhTru = new Cylinder(hinhTron.getRadius(),"blue",h);
        System.out.println("Thông tin hình trụ:");
        System.out.println(hinhTru);
    }
}