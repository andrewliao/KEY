public class lineclient{
    public static void main(String[] argv){
        Vect2 O = new Vect2();
        Vect2 A = new Vect2(3.4,5.6);
        Vect2 B = new Vect2(-2.6,2.3);
        Vect2 C = new Vect2(-0.2,-7.9);
        Line a = new Line(B,C);
        Line b = new Line(C,A);
        Line c = new Line(A,B);
        System.out.println(a.length());
        System.out.println(b.length());
        System.out.println(c.length());
        a = a.translate(A);
        b = b.translate(B);
        c = c.translate(C);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        a = a.rotate(1.2,O);
        b = b.rotate(1.2,O);
        c = c.rotate(1.2,O);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}