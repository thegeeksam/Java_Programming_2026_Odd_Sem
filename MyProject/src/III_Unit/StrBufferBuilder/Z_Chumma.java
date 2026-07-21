package III_Unit.StrBufferBuilder;

public class Z_Chumma {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        System.out.println(sb.length());
        System.out.println(sb.capacity());
        // StringBuffer sb1 = new StringBuffer();
        // sb1.append("Hello");
        // System.out.println(sb1.capacity());
        // System.out.println(sb.length());
        sb.append("Hello");
        System.out.println(sb.length());
        System.out.println(sb.capacity());
        sb.append("Hello");
        System.out.println(sb.length());
        System.out.println(sb.capacity());
        sb.append("Hello");
        System.out.println(sb.length());
        System.out.println(sb.capacity());
        sb.append("Hello");
        System.out.println(sb.length());
        System.out.println(sb.capacity());

    }
}