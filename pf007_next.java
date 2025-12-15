interface SomeTest<T> {
    boolean test(T n, T m);
}
isFractor.test(10,2);
isFractor.test(10,3);
SomeTest<Double> isFractorD = (n,m) -> (n%m)==0;
isFractorD.test(10.0,3.0);
isFractorD.test(10.0,2.0);
isFractorD.test(10.0,2.5);
SomeTest<Double> isFractor = (n,m) -> (n%m)==0;
isFractor.test(10.0,2.0);
SomeTest<String> isIn = (n,m) -> n.indexOf(m) != -1;
isIn.test("","");
isIn.test("apple","pineapple");
isIn.test("pineapple","apple");
interface StringFunc{
    String func(String str);
}
static String changeStr(StringFunc sfunc, String s){
    return sfunc.func(s);
}
String inStr = "Original string";
String outStr;
StringFunc reverse = (str) -> {
    String result = "";
    for(int i = str.length() - 1; i>=0; i--){
        result += str.charAt(i);
    }
    return result;
};
outStr = changeStr(reverse, inStr);
outStr = changeStr(reverse, "Another one");
outStr = changeStr((str) -> {
    String result = "";
    char ch;
    for (int i = 0; i < str.length(); i++){
        ch = str.charAt(i);
        if(Character.isUpperCase(ch)){
            result += Character.toLowerCase(ch);
        } else {
            result +=Character.toUpperCase(ch);
        }
    }
    return result;
}, inStr);
outStr = changeStr((str) -> {
    String result = "";
    char ch;
    for (int i = 0; i < str.length(); i++){
        ch = str.charAt(i);
        if(i%2 == 0){
            result += Character.toLowerCase(ch);
        } else {
            result +=Character.toUpperCase(ch);
        }
    }
    return result;
}, inStr);
interface MyIOAction {
    boolean ioAction(Reader rdr) throws IOException;
}
MyIOAction myIO = (rdr) -> {
    int ch = rdr.read();
    System.out.println("Entered symbol: " + ch);
    return true;
};
BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
myIO.ioAction(reader)
myIO.ioAction(reader)
myIO.ioAction(reader)
myIO.ioAction(reader)
myIO.ioAction(reader)
interface MyTransform <T> {
    void transform(T[] array);
}
MyTransform<Double> sqrts = (arr) -> {
    for (int i = 0; i < arr.length; i++){
        arr[i] = Math.sqrt(arr[i]);
    }
};
Double aarayD[] = {0.9, 6.5, 226.5};
Double arrayD[] = {0.9, 6.5, 226.5};
sqrts.transform(arrayD)
arrayD
interface IntPredicate {
    boolean test(int n);
}
class MyIntPredicates{
    static boolean isPrime(int n) {
        if(n < 2) return false;
        for (int i = 2; i <= n/i; i++){
            if (n%i == 0) return false;
        }
        return true;
    }
    
    static boolean isPositive (int n) {return n>0;}
    static boolean isEven (int n) {return n%2 == 0;}
}
MyIntPredicates.isPrime(5)
MyIntPredicates.isPrime(37)
MyIntPredicates.isPrime(29)
MyIntPredicates.isPrime(39)
MyIntPredicates.isPositive(5)
MyIntPredicates.isPositive(-5)
MyIntPredicates.isPositive(0)
MyIntPredicates.isEven(5)
MyIntPredicates.isEven(2)
MyIntPredicates.isEven(-2)
static boolean numTest(IntPredicate p, int n) {
    return p.test(n);
}
boolean result = numTest(MyIntPredicates::isPrime, 17);
result = numTest(MyIntPredicates::isPrime, 18)
result = numTest(MyIntPredicates::isPositive, 18)
result = numTest(MyIntPredicates::isPositive, -18)
result = numTest(MyIntPredicates::isEven, -18)
result = numTest(MyIntPredicates::isEven, -17)
class MyIntNum {
    private int v;
    MyIntNum(int x){v = x;}
    int getNum() {return v;}
    
    boolean isFactor(int n){
        return v%n == 0;
    }
}
MyIntNum myNum = new MyIntNum(12);
MyIntNum myNum2 = new MyIntNum(16);
result = ip.test(3);
IntPredicate ip = myNum2::isFactor;
result = ip.test(3);
