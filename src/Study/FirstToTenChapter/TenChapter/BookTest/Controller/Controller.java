package Study.FirstToTenChapter.TenChapter.BookTest.Controller;

import java.util.*;

public class Controller {
    private List<Event> eventList = new LinkedList<>();
    public void addEvent(Event c){eventList.add(c);}
    public void run(){
        LinkedList<Event> eventListCopy = new LinkedList<>();
        ListIterator<Event> iterator = eventListCopy.listIterator();
        while(iterator.hasNext()){
            iterator.next().action();
            iterator.previous();
            System.out.println(iterator.next());
            }
        }
    }

