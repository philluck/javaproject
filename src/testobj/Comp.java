
package testobj;


public class Comp {
    private String name;
    
    private int ram;
    
    private int hdd;
    
    private double weight;
    
    private String factoryNumber;
    private int cpuNumber;
    private int height;
    private int wigh2t;
    
    public int getCpuNumber () {
        return cpuNumber;
    }
    
    public void setCpuNumber (){
        this.cpuNumber = cpuNumber;
    }
    
    public int getHeight () {
        return height;
    }
    
    public void setHeight (){
        this.height = height;
    }
    
     public int getwigh2t () {
        return wigh2t;
    }
    
    public void setwigh2t (){
        this.wigh2t = wigh2t;
    }
    
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
     public String getFactoryNumber () {
         if (factoryNumber==null || factoryNumber.trim().equals("")){
             return ("обишка ");
         }else{
        return factoryNumber;
         }
    }
    
    public void setFactoryNumber (String factoryNumber){
        if (factoryNumber!=null && !factoryNumber.trim().equals("")){
            this.factoryNumber= factoryNumber;
         }else{
            System.out.println("nono");
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
