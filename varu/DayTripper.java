package varu;


public class DayTripper{

    public enum Day {MON, TUES, WED, THU, FRI, SAT, SUN};
    public static void main(String[] args){
        Day d = Day.MON;
        System.out.println("Initially d is " +d);
        d = Day.WED;
        System.out.println("Then it is d " + d);
        Day t = Day.valueOf("WED");
        System.out.println("I say d and t are same: " + (d == t));
    }

}
