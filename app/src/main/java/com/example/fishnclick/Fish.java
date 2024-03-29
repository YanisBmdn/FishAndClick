package com.example.fishnclick;

public class Fish {
    private String name;
    private int value;
    private int clicks;
    private int logoID;
    private int level;
    private boolean enabled;
    public Fish(String name, int value,int logo) {
        this.name=name;
        this.value=value;
        this.logoID=logo;
        clicks=0;
        this.enabled=true;
    }
    public Fish(String name, int value,int logo,boolean enabled) {
        this(name,value,logo);
        this.enabled=enabled;
    }
    public Fish(String name, int value,int logo,boolean enabled,int click) {
        this(name,value,logo,enabled);
        this.clicks=clicks;
    }
    public void addClick() {
        clicks++;
    }
    public void setEnabled() {
        this.enabled=true;
    }
    public void setEnabled(boolean enabled) {this.enabled=enabled;}
    public boolean getEnabled() { return enabled;}
    public int getClicks() {
        return clicks;
    }
    public int getLogo() {
        return logoID;
    }
    @Override
    public String toString() {
        return name;
    }
    public int getValue() {
        return value;
    }
    public void levelUp(){level+=1;}
    public int getLevel(){return level;}
    public void setLevel(int lvl) {this.level=lvl;}
    public void setClicks(int clicks) {this.clicks=clicks;}
}
