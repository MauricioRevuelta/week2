public class Week2 {
    public static String Task1(int age){
        if (age > 0 && age <= 3){
            return "baby";
        } else if (age > 3 && age <= 12){
            return "child";
        } else if (age > 12 && age <= 17) {
            return "teen";
        } else if (age > 17 && age <= 65) {
            return "adult";
        } else {
            return "elder";
        }
    }

    public static String Task2(String ageCategory){
        switch (ageCategory) {
            case "baby":
                return "Age from 0-3";
            case "child":
                return "Age from 3-12";
            case "teen":
                return "Age from 13-17";
            case "adult":
                return "Age from 18-65";
            default:
                return "Age above 65";
        }
    }

    public static void Counter(int start, int end, int increment){
        for (int i = start; i < end; i= i+increment) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        System.out.println(Week2.Task1(32) );
        System.out.println(Week2.Task2("teen") );
        Week2.Counter(2,35,5);
    }
}
