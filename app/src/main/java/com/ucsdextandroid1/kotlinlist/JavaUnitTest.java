package com.ucsdextandroid1.kotlinlist;

import java.util.Collections;
import java.util.Comparator;

public class JavaUnitTest{
    public String createDate(int day, int week, int month){
        return day+"/"+week+"/"+month;

    }
    private void doSomething(){
        Collections.sort(Collections.emptyList(), (Comparator<Integer>)(o1, o2)->0);
    }
    public class PropertyDemo{
        private int counter;
        private String propertyWithCounter;
        public int getCount(){
            return counter;
        }
        public String getPropertyWithCounter(){
            return propertyWithCounter;
        }
        public void setPropertyWithCounter(String propertyWithCounter){
            this.counter += 1;
            this.propertyWithCounter = propertyWithCounter;
        }
    }
}


