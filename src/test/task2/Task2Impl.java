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
    //сохранить все Number и их порядок в Map;
    private static Integer numberFinder(Map<Integer,Integer> map,int findNumber){
        for (int i = 0; i < map.size() ; i++) {
            if (map.get(i)==findNumber){
                return map.get(i);
            }
        }
        return 0;
    }
    //поиск порядкового номера Element с определенным serialNumber:
    private static Map<Integer,Integer> getUnique(List<IElement> elements){
        Map<Integer, Integer> unique = new HashMap<>();
        for (int i = 0; i < elements.size(); i++) {
            unique.put(i, elements.get(i).getNumber());
        }
        return unique;
    }

    @Override
    public void assignNumbers(final List<IElement> elements) {
        Random random = new Random();
        int buffer = 0;
        Map<Integer,Integer> unique = getUnique(elements);
        for (int serialNumber = 0; serialNumber < elements.size() ; serialNumber++) {
            //если порядковый номер не соответствует number;
            while (elements.get(serialNumber).getNumber()!= serialNumber){
                //есть ли гдето еще этот порядковый номер;
                if (unique.containsValue(serialNumber)){
                    //чтобы небыло повторов проверяем есть ли в unique такое рандомное значение;
                    while (!unique.containsValue(buffer)){
                        buffer = random.nextInt();
                    }
                    //если все ОК то присваееваем ему рандомое значение;
                    elements.get(numberFinder(unique,serialNumber)).setNumber(buffer);
                }
                elements.get(serialNumber).setupNumber(serialNumber);
            }
        }

    }
    public static void main(String[] args) {
        //создать лист с рандомными значениями;
        ArrayList<IElement> arrayList = (ArrayList<IElement>) ElElement.returnTestList(10);
        //присвоить им порядковые номера;
        printNumbers(arrayList);
        INSTANCE.assignNumbers(arrayList);
        printNumbers(arrayList);
        //вывести количество вызовов setupNumber;
        System.out.println(ElElement.getCounter());
    }
}
