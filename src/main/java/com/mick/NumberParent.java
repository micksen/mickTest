package com.mick;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public abstract class NumberParent {

    public static String[] numberKeys = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

    public ArrayList<String> convertNumberToLetters(int[] number) throws Exception {

        ArrayList<String> backList = new ArrayList<>();

        Queue<String> queStr = new LinkedList<>();

        for (int index : number) {
            //获取一个数字键上的字母串
            String val = getOneNumberKeys(index);
            if (!"".equals(val)) {
                if (!queStr.isEmpty()) {
                    int size = queStr.size();
                    int ith = 0;
                    while (size > ith) {
                        String s = queStr.remove();
                        for (int i = 0; i < val.length(); i++) {
                            queStr.add(s + val.charAt(i));
                        }
                        ith++;
                    }
                } else {
                    for (int i = 0; i < val.length(); i++) {
                        queStr.add(String.valueOf(val.charAt(i)));
                    }
                }
            }

        }
        backList.addAll(queStr);
        return backList;
    }

    public abstract String getOneNumberKeys(int index) throws Exception;

}
