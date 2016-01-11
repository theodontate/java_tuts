package holding;

import java.util.*;

/**
 * Created by theartiste on 1/11/16.
 */
public class ListFeatures2 {
    public static void main(String[] args) {
        Random rand = new Random(47);
        List<Integer> integers = GetInts.arrayList(7);
        System.out.println("1 : " + integers);
        Integer h = new Integer(31);
        integers.add(h);
        System.out.println("2 : " + integers);
        System.out.println("3 : " + integers.contains(h));
        System.out.println("Additional : " + integers.indexOf(h));
        integers.remove(h);
        System.out.println("Additional : " + integers.indexOf(h));
        System.out.println("4 : " + integers);
        Integer temp = integers.get(0);
        System.out.println("5 : " + temp);
        integers.add(temp);
        System.out.println("6 : " + integers);
        integers.add(2,new Integer(11));
        System.out.println("7 : " + integers);
        List<Integer> integersSubList = integers.subList(0, 2);
        System.out.println("8 : " + integersSubList);
        System.out.println("9 : " + integers.containsAll(integersSubList));
        Collections.sort(integersSubList);
        System.out.println("Sorted list : " + integers);
        System.out.println("9 : " + integers.containsAll(integersSubList));
        Collections.shuffle(integersSubList);
        System.out.println("10 : " + integersSubList);
        //Order is not important in containsAll
        System.out.println("11 : " + integers.containsAll(integersSubList));
        List<Integer> copy = new ArrayList<Integer>(integers);
        integersSubList = Arrays.asList(copy.get(1), copy.get(4), copy.get(5));
        System.out.println("12 : " + integersSubList);
        copy.remove(1);
        System.out.println("13 : " + copy);
        copy.remove(integersSubList);
        System.out.println("14 : " + copy);
        copy.set(1, new Integer(100));
        System.out.println("15 : " + copy);
        copy.addAll(3, integersSubList);
        System.out.println("16 : " + copy);
        System.out.println("17 : " + integers.isEmpty());
        integers.clear();
        System.out.println("18 : " + integers.isEmpty());
        System.out.println("19 : " + integers);
        Object[] o = copy.toArray();
        System.out.println("20 : " + o[3]);
        Integer[] a = copy.toArray(new Integer[1]);
        System.out.println("21 : " + a[3]);
        System.out.println("22 : " + copy);






    }
}
