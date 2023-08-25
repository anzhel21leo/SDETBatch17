package class10;
public class PhoneTester {
    public static void main(String[] args) {
        Phone android=new Phone();
        android.brand="Samsung";
        android.model="s23 Ultra";
        android.year=2023;
        android.memory=256;
        System.out.println(android.brand);
        System.out.println(android.model);
        System.out.println(android.year);
        System.out.println(android.memory);
        android.ring();
        android.ringtone2();
        android.text();
        android.screen();

        System.out.println();
        Phone apple=new Phone();
        apple.brand="Apple";
        apple.model="iPhone14 ProMax";
        apple.year=2023;
        apple.memory=256;
        System.out.println(apple.brand);
        System.out.println(apple.model);
        System.out.println(apple.year);
        System.out.println(apple.memory);
        apple.ring();
        apple.ringtone();
        apple.text();
        apple.screen();

        System.out.println();
        Phone pixel=new Phone();
        pixel.brand="Pixel";
        pixel.model="GooglePixelFold";
        pixel.year=2023;
        pixel.memory=256;
        System.out.println(pixel.brand);
        System.out.println(pixel.model);
        System.out.println(pixel.year);
        System.out.println(pixel.memory);
        pixel.ring();
        pixel.ringtone2();
        pixel.text();
        pixel.screen();
    }
}
