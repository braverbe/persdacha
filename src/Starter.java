public class Starter {
    public static void main(String[] args) {
        Rectangle re = new Rectangle(3, 5);

        CacheObserver r1 = new CacheObserver(re);


        test(re);
        test(r1);
        test(r1);


    }

    public static void test(Areable ar){
        System.out.println(ar.getArea());
    }
}
