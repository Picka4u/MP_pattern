package composite;

import java.util.ArrayList;
import java.util.List;

public class Composite {
    int Power;
    public static void main(String[] args) {
        Archer archer = new Archer();
        Warrior war = new Warrior();
        
        CompositeWar army = new CompositeWar();
        CompositeWar army2 = new CompositeWar();
        
        for(int i=1;i<=10;++i){
            army.add(archer);
        }
        for(int i=1;i<=20;++i){
            army.add(war);
        }
        army2.add(army);
        army2.add(army);
        
        army2.Sila();
    }
    
}

class Archer implements Power{
    int Power;
    @Override
    public void Sila(){
        System.out.println("Archer");
        /*this.Power+=2;
        return Power;*/
    }
}

class Warrior implements Power{
    int Power;
    @Override
    public void Sila(){
        System.out.println("Warrior");
        /*this.Power++;
        return Power;*/
    }
}

class CompositeWar implements Power{
    private List<Power> list = new ArrayList<Power>();
    int mosh=0;
    
    public void Sila(){
        for(Power power:list){
            /*mosh =*/power.Sila();
            //System.out.println(mosh);
        }
        //return mosh;
    }
    
    public void add(Power power){
        list.add(power);
    }
    
    public void remove(Power power){
        list.remove(power);
    }
}