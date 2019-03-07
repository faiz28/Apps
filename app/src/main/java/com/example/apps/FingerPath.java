package com.example.apps;
import android.graphics.Path;


public class FingerPath {
    public int color;
    public boolean  emboss;
    public  boolean blur;
    public boolean white;
    public int strokWidth;
    public Path path;

    public FingerPath(int color, boolean emboss, boolean blur, int strokWidth,boolean white,Path path) {
        this.color = color;
        this.emboss = emboss;
        this.blur = blur;
        this.strokWidth = strokWidth;
        this.path=path;
        this.white=white;
    }
}
