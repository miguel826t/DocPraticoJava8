package exercicios.JavaAPI;

import java.util.ArrayList;
import java.util.List;

public class Ex21 {

	public static void main(String[] args) {
		Integer i = 10;
        List<Integer> list = new ArrayList<>();
        list.add(i);
        list.add(new Integer(i));
        list.add(i);

        list.removeIf(i -> i == 10);

        System.out.println(list);
	}

}
