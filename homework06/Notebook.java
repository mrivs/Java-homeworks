package homework06;

import java.util.HashMap;

public class Notebook {
   
    private int ram;
    private int ssd;
    private int cpu;
    private String firm;
    private String color;
    private String os;

    private HashMap<String,Integer>techParams=new HashMap<>();
    private HashMap<String,String>labelParams=new HashMap<>();

    public Notebook(int ram, int ssd, int cpu, String firm, String color, String os) {
        this.ram = ram; 
        this.ssd = ssd;
        this.cpu = cpu;
        this.firm = firm;
        this.color = color;
        this.os = os;
        this.techParams.put("RAM", ram);
        this.techParams.put("SSD", ssd);
        this.techParams.put("CPU", cpu);

        this.labelParams.put("OC", os);
        this.labelParams.put("Color", color);
        this.labelParams.put("Firm", firm);
    }

    public int getTechParams(String key){
        return techParams.get(key);
    }
    public Object getLabelParams(String key){
        return labelParams.get(key);
    }
    

    public int getRam() {
        return ram;
    }
    
    public int getSsd() {
        return ssd;
    }

    public int getCpu() {
        return cpu;
    }

    public String getFirm() {
        return firm;
    }

    public String getColor() {
        return color;
    }
    public String getOs() {
        return os;
    }
    public void setOs(String os) {
        this.os = os;
        labelParams.put("OC", os);
    }

    @Override
    public String toString() {
        return "Notebook "+ firm + " ОЗУ " + ram + "; SSD " + ssd + "; CPU " + cpu +  "; Цвет: " + color
                + "; ОС: " + os + ".";
    }


    
}
