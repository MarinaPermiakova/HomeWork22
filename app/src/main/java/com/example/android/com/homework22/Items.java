package com.example.android.com.homework22;

class Items{
    int mimageId;
    String string1;
    String string2;

    public Items(int imageId, String string1, String string2) {
        mimageId = imageId;
        this.string1 = string1;
        this.string2 = string2;
    }

    public int getImageId() {
        return mimageId;
    }

    public String getString1() {
        return string1;
    }

    public String getString2() {
        return string2;
    }
}
