package Project.Morse;

import java.util.HashMap;
import java.util.Map;
/**@author bobis1888 */
class DataTable {
    DataTable(boolean active){
        if (active)
            MorseOnMap = morseOn();
        else
            MorseOffMap = morseOff();
    }
    String getOn(char oneChar){
        return MorseOnMap.get(oneChar);
    }
    char getOff(String string){
        return MorseOffMap.get(string);
    }
    private  Map<Character,String> MorseOnMap;
    private  Map<Character,String> morseOn(){
        MorseOnMap = new HashMap<>();
        MorseOnMap.put('А',"·-");            MorseOnMap.put('К',"-·-");           MorseOnMap.put('Ф',"··-·");
        MorseOnMap.put('Б',"-···");          MorseOnMap.put('Л',"·-··");          MorseOnMap.put('Х',"····");
        MorseOnMap.put('В',"·--");           MorseOnMap.put('М',"--");            MorseOnMap.put('Ц',"-·-·");
        MorseOnMap.put('Г',"--·");           MorseOnMap.put('Н',"-·");            MorseOnMap.put('Ч',"---·");
        MorseOnMap.put('Д',"-··");           MorseOnMap.put('О',"---");           MorseOnMap.put('Ш',"----");
        MorseOnMap.put('Е',"·");             MorseOnMap.put('П',"·--·");          MorseOnMap.put('Щ',"--·-");
        MorseOnMap.put('Ж',"···-");          MorseOnMap.put('Р',"·-·");           MorseOnMap.put('Ь',"-··-");
        MorseOnMap.put('З',"--··");          MorseOnMap.put('С',"···");           MorseOnMap.put('Ы',"-·--");
        MorseOnMap.put('И',"··");            MorseOnMap.put('Т',"-");             MorseOnMap.put('Ю',"··--");
        MorseOnMap.put('Й',"·---");          MorseOnMap.put('У',"··-");           MorseOnMap.put('Я',"·-·-");
        MorseOnMap.put(' ',"**");            MorseOnMap.put('Э',"··-··");         MorseOnMap.put('Ъ',"-··-");
        return MorseOnMap;
    }
    private Map<String,Character>  MorseOffMap;
    private Map<String,Character> morseOff(){
        MorseOffMap= new HashMap<>();
        MorseOffMap.put("·-",'А');         MorseOffMap.put("-·-",'К');         MorseOffMap.put("··-·",'Ф');
        MorseOffMap.put("-···",'Б');       MorseOffMap.put("·-··",'Л');        MorseOffMap.put("····",'Х');
        MorseOffMap.put("·--",'В');        MorseOffMap.put("--",'М');          MorseOffMap.put("-·-·",'Ц');
        MorseOffMap.put("--·",'Г');        MorseOffMap.put("-·",'Н');          MorseOffMap.put("---·",'Ч');
        MorseOffMap.put("-··",'Д');        MorseOffMap.put("---",'О');         MorseOffMap.put("----",'Ш');
        MorseOffMap.put("·",'Е');          MorseOffMap.put("·--·",'П');        MorseOffMap.put("--·-",'Щ');
        MorseOffMap.put("···-",'Ж');       MorseOffMap.put("·-·",'Р');         MorseOffMap.put("-··-",'Ь');
        MorseOffMap.put("--··",'З');       MorseOffMap.put("···",'С');         MorseOffMap.put("-·--",'Ы');
        MorseOffMap.put("··",'И');         MorseOffMap.put("-",'Т');           MorseOffMap.put("··--",'Ю');
        MorseOffMap.put("·---",'Й');       MorseOffMap.put("··-",'У');         MorseOffMap.put("·-·-",'Я');
        MorseOffMap.put("**",' ');         MorseOffMap.put("··-··",'Э');
        return MorseOffMap;
    }
}