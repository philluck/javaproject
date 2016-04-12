
package testobj;


public class Comp {
    private String name;
    
    private int ram;
    
    private int hdd;
    
    private double weight;
    
    public String getName () {
        return name;
    };
    
    public void setName (String newName){
        name = newName;
    }
    
    public int getRam () {
        return ram;
    }
    
    public void setRam (int newRam){
        if (newRam>0){
            ram = newRam;
        }else{
            System.out.println("не может быть меньше 0"+newRam);
        }
        
    }
     public int getHdd () {
        return hdd;
    }
    
    public void setHdd (int newHdd){
        if (newHdd>0){
            hdd = newHdd;
        }else{
            System.out.println("не может быть меньше 0"+newHdd);
        }
        
    }
    
    public void on () {
        System.out.println("я включился "+name);
    }
     public void off () {
        System.out.println("я выключился ");
     }
      public void load () {
        System.out.println("я загружаюсь "+hdd+" GB");
    }
    
}
