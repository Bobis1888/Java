package Study.FirstToTenChapter.Interface.InterfaceRealization;

import Study.FirstToTenChapter.Interface.*;

public class InterfaceRealization implements Interface {
    public void tostring() {
        System.out.println("tostring()");
    }

    public int toint() {
        return 10;
    }

    public void todo() {
        System.out.println("todo()");
        System.out.println("toint(" + toint() + ")");
    }

    public static void main(String[] args) {
        InterfaceRealization interfaceRealization = new InterfaceRealization();

        interfaceRealization.todo();
        interfaceRealization.tostring();
    }
}
