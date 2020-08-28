package iAndC;

class Other {
    // public static void main(String[] args) {
    //     for (String s : args)
    //         util.p(s + ' ');
    // }
    // public void tester(Integer lists) {
    //     for (Integer i : lists)
    //         util.p(i);
    // }

    public void tester2(Integer[] numAry) {
		for (Integer num : numAry) {
            util.p(num);
        }
    }
}

public class demo4 {
    public static void main(String[] args) {
        // Other.tester(new Integer[] {123, 123, 232});
        Other o = new Other();
        o.tester2(new Integer[] {123, 234});
    }    
}