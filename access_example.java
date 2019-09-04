import temp.temp;

class subTemp extends temp {
    public void try(){
        x = 4;
        System.out.println("Try... x is " + x);
    }
}

public class access_example {
    public static void main(String[] args){
        temp myTemp = new temp();
        subTemp mySubTemp = new subTemp();
        
        // public
        /*
        myTemp.pub = 2;
        System.out.println("x is " + myTemp.pub);
        mySubTemp.pub = 3;
        System.out.println("x is " + mySubTemp.pub);
        mySubTemp.try();
        */

        // protected
        /*
        myTemp.prot = 2;
        System.out.println("x is " + myTemp.prot);
        mySubTemp.prot = 3;
        System.out.println("x is " + mySubTemp.prot);
        mySubTemp.try();
        */

        // default
        /*
        myTemp.def = 2;
        System.out.println("x is " + myTemp.def);
        mySubTemp.def = 3;
        System.out.println("x is " + mySubTemp.def);
        mySubTemp.try();
        */

        // private
        /*
        myTemp.priv = 2;
        System.out.println("x is " + myTemp.priv);
        mySubTemp.priv = 3;
        System.out.println("x is " + mySubTemp.priv);
        mySubTemp.try();
        */
    }
}