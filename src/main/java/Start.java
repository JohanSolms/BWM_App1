//Johan Solms, 2021/06/23

public class Start {
    public static void main(String[] args){
        Stack stackOne = new Stack();
        stackOne.push(2);
        stackOne.push(3);
        stackOne.push(66);
        stackOne.count();
        stackOne.empty();
        System.out.println(stackOne.toString());
        stackOne.pop();
        System.out.println(stackOne.toString());
        stackOne.pop();
        stackOne.pop();
        stackOne.pop();
        System.out.println(stackOne.toString());
    }
}
