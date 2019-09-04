public class getclass {
    static class abc<E> {
        E x;
        public abc (E x){
            this.x = x;
        }
    }

    public static void main(String[] args){
        Object o = new Double(3);
        System.out.println(o);
        Object c = (Integer)o;
        System.out.println(c);
        
    }
}