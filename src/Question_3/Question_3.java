package Question_3;

public class Question_3 {

    public static void main(String[] args) {


        SpecialStack s = new SpecialStack();

        s.push(11);
        s.push(20);
        s.push(30);
        s.push(12);
        s.push(13);
        s.push(19);

        System.out.println(s.getMin());
    }
}
