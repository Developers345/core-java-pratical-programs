package com.jp.multithreading;

public class BrickDiary {

    public int brickCount = 0;
    public int brickCount2 = 0;

    public  void incrementBrickCount()
    {
        synchronized (this){
            brickCount+=50;
        }

        brickCount2 +=50;
    }
}
