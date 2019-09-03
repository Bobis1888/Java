package Study.ThinkingInJava.TenToTwentyChapter.typeinfo;

import Study.ThinkingInJava.util.TypeCounter;

import java.util.*;

class Part{
    public String toString(){
        return getClass().getSimpleName();
    }
    private static List<Class<? extends Part>> partFactories = new ArrayList<>();
    static {
        partFactories.add(FuelFilter.class);
        partFactories.add(AirFilter.class);
        partFactories.add(CabinAirFilter.class);
        partFactories.add(OilFilter.class);
        partFactories.add(FanBelt.class);
        partFactories.add(PowerSteeringBelt.class);
        partFactories.add(GeneratorBelt.class);
    }
    private static Random rand = new Random();
    static Part createRandom() throws IllegalAccessException, InstantiationException {
        int n = rand.nextInt(partFactories.size());
        return partFactories.get(n).newInstance();
    }
}

class Filter extends Part{}

class FuelFilter extends Filter{
    public static class Factory implements Study.ThinkingInJava.TenToTwentyChapter.typeinfo.Factory<FuelFilter>{
        public FuelFilter create(){return new FuelFilter();}
    }
}

class AirFilter extends Filter{
    public static class Factory implements Study.ThinkingInJava.TenToTwentyChapter.typeinfo.Factory<AirFilter>{
        public AirFilter create(){return new AirFilter();}
    }
}

class CabinAirFilter extends Filter{
    public static class Factory implements Study.ThinkingInJava.TenToTwentyChapter.typeinfo.Factory<CabinAirFilter>{
        public CabinAirFilter create(){return new CabinAirFilter();}
    }
}

class OilFilter extends Filter{
    public static class Factory implements Study.ThinkingInJava.TenToTwentyChapter.typeinfo.Factory<OilFilter>{
        public OilFilter create(){return new OilFilter();}
    }
}

class Belt extends Part{}

class FanBelt extends Belt{
    public static class Factory implements Study.ThinkingInJava.TenToTwentyChapter.typeinfo.Factory<FanBelt>{
        public FanBelt create(){return new FanBelt();}
    }
}

class GeneratorBelt extends Belt{
    public static class Factory implements Study.ThinkingInJava.TenToTwentyChapter.typeinfo.Factory<GeneratorBelt>{
        public GeneratorBelt create(){return new GeneratorBelt();}
    }
}

class PowerSteeringBelt extends Belt{
    public static class Factory implements Study.ThinkingInJava.TenToTwentyChapter.typeinfo.Factory<PowerSteeringBelt>{
        public PowerSteeringBelt create(){return new PowerSteeringBelt();}
    }
}
public class RegisteredFactories {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        TypeCounter counter = new TypeCounter(Part.class);
        List<Part> partList = new ArrayList<>();
        for (int i = 0; i < 20 ; i++) {
            partList.add(Part.createRandom());
        }
        for (Part part:partList) {
            System.out.println(part.getClass().getSimpleName() + " ");
            counter.count(part);
        }
        System.out.println(counter);
    }
}
