//class TwoGen<T extends Number, V extends String> {
//
//    T ob1;
//    V ob2;
//    TwoGen(T o1, V o2){
//        ob1 = o1;
//        ob2 = o2;
//    }
//    void showTypes(){
//        System.out.println("Type of T is "+ ob1.getClass().getName());
//        //System.out.println("getMethods "+ ob1.getClass().getMethods());
//        //System.out.println("isAnonymousClass "+ ob1.getClass().isAnonymousClass());
//
//        System.out.println("Type of V is "+ ob2.getClass().getName());
//
//    }
//    T getOb1(){
//        return ob1;
//    }
//    V getOb2(){
//        return ob2;
//    }
//}
//class GenericsWithTwoTypeParameters{
//    public static void main(String args[]){
//        TwoGen<Double, String > twoGen = new TwoGen<>(6636316336302.0, "Geneerics with two type parameteres");
//        twoGen.showTypes();
//        Double n = twoGen.getOb1();
//        System.out.print("Value: "+ n );
//
//        String str = twoGen.getOb2();
//        System.out.println("   String : "+ str);
//    }
//}