package Basic;

public class AddNumbers {
    public int addNum(int a,int b){
        return a+b;
    }


    public static void main(String[] args) {
        AddNumbers a = new  AddNumbers();
        System.out.println(a.addNum(2,2));
    }
}
