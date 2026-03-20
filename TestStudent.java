public class TestStudent {
    public static void main(String[] args) {
        student s1 = new student(68, "Arisa", 4.00);
        student s2 = new student(69, "Mana", 2.95);
        student s3 = new student(70, "Piti", 4.00);
        s1.displayInfo();
        s2.displayInfo();
        s3.displayInfo();
        IO.println(s1.getInfo());
        //s1.gender = true;

        String productName = new String("Macbook Neo");
        IO.println(productName);
    }
}
