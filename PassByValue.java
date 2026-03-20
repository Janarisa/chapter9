public class PassByValue {
    public static void main() {
        int data = 100;
        AddOne(data);
        IO.println(data);
    }
    static void AddOne(int number){
        number++;
    }
}
