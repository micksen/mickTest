package com.mick;

public class StageTwo extends NumberParent {
    @Override
    public String getOneNumberKeys(int index) throws Exception {
        if (index > 99 || index < 0) {

            throw new Exception("Please control between 0-99");
        } else {
            if(index < numberKeys.length) {

                return numberKeys[index];
            }else {
                int tens = index / 10;
                int bits = index % 10;
                return numberKeys[tens] + numberKeys[bits];
            }
        }
    }
}
