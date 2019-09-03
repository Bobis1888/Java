package Study.ThinkingInJava.TenToTwentyChapter.typeinfo;

import java.lang.reflect.*;

class DynamicProxyHandler implements InvocationHandler{
    private Object proxied;
    public DynamicProxyHandler(Object proxied){
        this.proxied = proxied;
    }
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable{
        System.out.println("**** proxy: " + proxy.getClass() +
                ", method: " + method + ", args: " + args);
        if (args!=null){
            for (Object o:args) {
                System.out.println(" " + o);
            }
        }
        return method.invoke(proxy,args);
    }
}
class SimpleDunamicProxy{
    public static void consumer(Interface iface){
        iface.doSomething();
        iface.somethingElse("bonobo");
    }

    public static void main(String[] args) {
        RealObject real = new RealObject();
        consumer(real);
        Interface proxy = (Interface)Proxy.newProxyInstance(Interface.class.getClassLoader(),
        new Class[]{Interface.class},new DynamicProxyHandler(real));
        consumer(proxy);
    }
}