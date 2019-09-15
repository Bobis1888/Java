package test.task2;

import java.util.*;

public class Task2Impl implements IElementNumberAssigner {
    //printArrayTest;
    private static void printNumbers(final List<IElement> elements) {
        for (IElement e : elements) {
            System.out.println(e.getNumber());
            System.out.println(e.getId());
        }
    }
    private static final IElementNumberAssigner INSTANCE = new Task2Impl();
    //поиск порядкового номера Element с определенным serialNumber:
    private static Integer numberFinder(Map<Integer,Integer> map,int findNumber){
        for (int i = 0; i < map.size() ; i++) {
            if (map.get(i)==findNumber){
                return map.get(i);
            }
        }
        return 0;
    }
    //сохранить все Number и их порядок в Map;
    private static Map<Integer,Integer> getUnique(List<IElement> elements){
        Map<Integer, Integer> unique = new HashMap<>();
        for (int i = 0; i < elements.size(); i++) {
            unique.put(i, elements.get(i).getNumber());
        }
        return unique;
    }
    //получаем рандомное число невходящее в число значений Map
    private int getRandom(Map<Integer,Integer> map){
        Random random = new Random();
        //+2 буферные два числа
        int x = random.nextInt(map.size() + 2);
        //поиск этих двух чисел невходящих в Map
        while (map.containsValue(x)){
            x = random.nextInt(map.size() + 2);
        }
        return x;
    }

    @Override
    public void assignNumbers(final List<IElement> elements) {
        Map<Integer,Integer> unique = getUnique(elements);
        for (int serialNumber = 0; serialNumber < elements.size() ; serialNumber++) {
            //если порядковый номер не соответствует number;
            while (elements.get(serialNumber).getNumber()!= serialNumber) {
                //ищем где в списке этот serial number и меняем его на один из двух буфферных
                elements.get(numberFinder(unique,serialNumber)).setNumber(getRandom(unique));
                //присваиваем порядковый номер
                elements.get(serialNumber).setupNumber(serialNumber);
                }
            }
        }


    public static void main(String[] args) {
        final ArrayList<IElement> arrayList = new ArrayList<>();
        final ElElement elElement1 = new ElElement(0);
        final ElElement elElement2 = new ElElement(2);
        final ElElement elElement3 = new ElElement(1);
        final ElElement elElement4 = new ElElement(3);
        final ElElement elElement5 = new ElElement(6);
        final ElElement elElement6 = new ElElement(5);
        final ElElement elElement7 = new ElElement(4);
        arrayList.add(elElement1);
        arrayList.add(elElement2);
        arrayList.add(elElement3);
        arrayList.add(elElement4);
        arrayList.add(elElement5);
        arrayList.add(elElement6);
        arrayList.add(elElement7);
        //print
        printNumbers(arrayList);
        //присвоить им порядковые номера;
        INSTANCE.assignNumbers(arrayList);
        printNumbers(arrayList);
        //вывести количество вызовов setupNumber;
        System.out.println(ElElement.getCounter());
    }
}
