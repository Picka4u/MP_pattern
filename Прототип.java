package прототип;

public class Прототип {

    public static void main(String[] args) {
        Воин пехотинец = new Воин(10,"Пехота");
        Воин копия = (Воин)пехотинец.copy();
        
        Созданиевоина фабрика = new Созданиевоина(копия);
        Воин к1 = фабрика.созданиекопии();
        
        фабрика.Новыйвоин(new Воин(13,"Стрелок"));
        Воин стрелок = фабрика.созданиекопии();
        System.out.println(пехотинец+"\n"+копия+"\n"+к1+"\n"+стрелок);
    }
    
}

class Воин implements Clonable{
    int lvl;
    String Класс;

    public Воин(int lvl, String Класс) {
        this.lvl = lvl;
        this.Класс = Класс;
    }

    @Override
    public String toString() {
        return "{lvl= " + lvl + ", Класс= " + Класс + '}';
    }
    
    @Override
    public Object copy() {
        Воин копия = new Воин(lvl, Класс);
        return копия;
    }
    
}

class Созданиевоина{
    Воин воин;
    
    public Созданиевоина(Воин воин){
        Новыйвоин(воин);
    }
    public void Новыйвоин (Воин воин){
        this.воин = воин;
    }
    Воин созданиекопии (){
        return (Воин)воин.copy();
    }
}
