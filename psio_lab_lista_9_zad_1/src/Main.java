public class Main {
    public static void main(String[] args) {
        Zbior<Integer> zbior = new Zbior<Integer>();
        zbior.add(1);
        zbior.add(2);
        zbior.add(3);
        Zbior<Integer> zbior2 = new Zbior<Integer>();
        zbior2.add(7);
        zbior2.add(6);
        zbior2.add(4);
        zbior2.add(5);
        System.out.println("zbiór 1:");
        System.out.println(zbior);
        System.out.println("zbiór 2:");
        System.out.println(zbior2);
        System.out.println("Suma zbiorów: ");
        System.out.println(zbior.getUnion(zbior2));
        System.out.println("zbiór 1:");
        System.out.println(zbior);
        System.out.println("zbiór 2:");
        System.out.println(zbior2);
        System.out.println("Iloczyn zbiorów: ");
        System.out.println(zbior.getIntersection(zbior2));
    }
}
