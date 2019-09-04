public class subtypepolymorphism {
    static Number add (Number x, Number y){
        System.out.println("Number");
        if (x instanceof Integer && y instanceof Integer){
            return x.intValue() + y.intValue();
        }
        return x.floatValue() + y.floatValue();
    }

    static String add (String x, String y){
        System.out.println("String");
        return x + y;
    }

    public static void main(String[] args){
        int a = 2, b = 3;
        double j = 4.5, k = 5.5;
        String y = "9", z = "0";

        System.out.println("Int add is " + add(a,b));
        System.out.println("Double add is " + add(j,k));
        System.out.println("Mixed number add is " + add(a,k));
        //System.out.println("String add is " + add(y,z));
        //System.out.println("Mixed string add is " + add(y,a));
    }
}