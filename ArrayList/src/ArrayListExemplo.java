import java.util.ArrayList;

public class ArrayListExemplo {
    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<String>();

        arrayList.add("A");
        arrayList.add("B");

        System.out.println(arrayList);

        arrayList.add(2, "C");
        arrayList.add(3, "D");


        System.out.println(arrayList.lastIndexOf("D"));

        arrayList.remove("A");
        System.out.println(arrayList);

    }


}

