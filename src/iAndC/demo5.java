package iAndC;

public class demo5 {
    public enum Spiciness {
        HI, BYE
    }

   public static void main(String[] args) {
    Spiciness howHi = Spiciness.BYE;
    util.p(howHi);

    for (Spiciness s : Spiciness.values()) {
        util.p(s + " " + s.ordinal());
    }
   } 
}