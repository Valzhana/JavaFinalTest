import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        LapTop lapTop = new LapTop("Xiaomi", "Xiaomi RedmiBook 15",20065599, 34999.0, 15.6, "Intel Core i3 1115G4", 8, 256, "Windows 11", "black", 1.8, true);

        LapTop lapTop1 = new LapTop("Asus", "ASUS TUF F15",20067509, 79999.0, 15.6, "Intel Core i5-11400H", 8, 512, "Windows 11", "gray", 2.3, true);

        LapTop lapTop2 = new LapTop("Asus", "ASUS TUF Gaming A15",21367509, 59999.0, 15.6, "AMD Ryzen 5 4600H", 8, 512, "Windows 11", "gray", 2.3, false);

        LapTop lapTop3 = new LapTop("Apple", "Apple MacBook Air 13",21367400, 78999.0, 13.3, "Apple M1", 8, 256, "MacOS", "gold", 1.7, true);

        LapTop lapTop4 = new LapTop("Lenovo", "Lenovo V15 G2",21447480, 39999.0, 15.6, "AMD Ryzen 5 5500U", 8, 256, "Windows 11", "black", 1.7, true);

        LapTop lapTop5 = new LapTop("Haier", "Haier P1510SD",21547770, 29999.0, 15.6, "Intel Pentium N5030", 8, 256, "Windows 11", "black", 1.65, true);

        LapTop lapTop6 = new LapTop("Huawei", "HUAWEI MateBook X Pro i7-1260P",28977770, 140999.0, 14.2, "Intel Iris Xe Graphics", 16, 1024, "Windows 11", "white", 1.38, false);

        LapTop lapTop7 = new LapTop("Acer", "Acer Extensa EX2540-32NQ",28927670, 25999.0, 15.6, "Intel Core i3-6006U", 4, 1024, "Linux", "white", 2.4, false);


        lapTop.printInfo();
        System.out.println(lapTop1);

        System.out.println("______________________________________________________________");
        List<LapTop> lapTopList = List.of(lapTop, lapTop1, lapTop2, lapTop3, lapTop4, lapTop5, lapTop6, lapTop7);
        System.out.println(lapTopList);

        System.out.println("______________________________________________________________");
        for (LapTop item: lapTopList) {
            if (item.getInStock() == true && item.getDiagonal() == 15.6) {
                System.out.println(item);
            }
        }

        System.out.println("_______________________________________________________________");
        for (LapTop item: lapTopList) {
            if (item.getBrand().equals("Acer")) {
                System.out.println(item);
            }
        }

        System.out.println("_______________________________________________________________");
        for (LapTop item: lapTopList) {
            if (item.getPrice() <= 30000.0 && item.getRAM() >= 8) {
                System.out.println(item);
            }
        }

        System.out.println("_______________________________________________________________");
        for (LapTop item: lapTopList) {
            if (item.getCPU().contains("Intel")) {
                System.out.println(item);
            }
        }

        System.out.println("________________________________________________________________");
        for (LapTop item: lapTopList) {
            if (!item.getColor().equalsIgnoreCase("black")) {
                System.out.println(item);
            }
        }
    }
}
