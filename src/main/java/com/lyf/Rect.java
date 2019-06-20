package com.lyf;

public class Rect {
    private long length;
    private long width;

    public long getPerimeter(){
        return (this.length + this.width) * 2;
    }

    public long getArea(){
        return this.length * this.width;
    }

    public long getLength() {
        return length;
    }

    public void setLength(long length) {
        this.length = length;
    }

    public long getWidth() {
        return width;
    }

    public void setWidth(long width) {
        this.width = width;
    }


}
