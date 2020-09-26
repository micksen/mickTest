package com.mick;

public class StageOne extends NumberParent {
    @Override
    public String getOneNumberKeys(int index) throws Exception {

        if (index >= numberKeys.length || index < 0) {
            throw new Exception("Please control between 0-" + numberKeys.length);
        } else {
            return numberKeys[index];
        }
    }

}
