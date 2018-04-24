package com.myapplicationdev.android.tw_listview;

public class Module {
    private String name;
    private boolean icon;
    public Module(String name, boolean icon) {
        this.name = name;
        this.icon = icon;
    }
    public String getName() {
        return name;
    }
    public boolean isIcon() {
        return icon;
    }
}
