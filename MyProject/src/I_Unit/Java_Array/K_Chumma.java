package Java_Array;

public class K_Chumma {
    public static void main(String[] args) {
        double[] iArr1 = { 10.6, 20.6, 30.3 };

        System.out.println(iArr1.getClass());

        System.out.println(
                iArr1.getClass().getName());

        System.out.println(iArr1.hashCode());

        System.out.println(
                Integer.toHexString(
                        iArr1.hashCode()));

        System.out.println(iArr1);
        System.out.println(iArr1.toString());
    }

}
