package команда;

public class Команда {

    public static void main(String[] args) {
        Door d = new Door();
        human h = new human(new OpenCommand(d), new CloseCommand(d), new LockCommand(d));
        
        h.openDoor();
        h.closeDoor();
        h.lockDoor();
    }
}

interface Command{
    void execute();
}

class Door {
    void OpenDoor(){
        System.out.println("Open");
    }
    void CloseDoor(){
        System.out.println("Close");
    }
    void LockDoor(){
        System.out.println("Lock");
    }
}

class OpenCommand implements Command{
    Door door;
    public OpenCommand(Door door){this.door = door;}
    public void execute(){
        door.OpenDoor();
    }
}

class CloseCommand implements Command{
    Door door;
    public CloseCommand(Door door){this.door = door;}
    public void execute(){
        door.CloseDoor();
    }
}

class LockCommand implements Command{
    Door door;
    public LockCommand(Door door){this.door = door;}
    public void execute(){
        door.LockDoor();
    }
}

class human {
    Command open;
    Command close;
    Command lock;
    public human(Command open, Command close, Command lock) {
        this.open = open;
        this.close = close;
        this.lock = lock;
    }
    void openDoor(){
        open.execute();
    }
    void closeDoor(){
        close.execute();
    }
    void lockDoor(){
        lock.execute();
    }
}