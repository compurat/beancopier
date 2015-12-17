package com.bean.copy;

/**
 * Created by compurat on 12/14/15.
 */
public class EmptyTestBean {

    private String ignoreCopy;
    private String testString2;
    private String testStringNoAnnotation;

    public String getTestString2() {
        return testString2;
    }

    public void setTestString2(String testString2) {
        this.testString2 = testString2;
    }

    public String getTestStringNoAnnotation() {
        return testStringNoAnnotation;
    }

    public void setTestStringNoAnnotation(String testStringNoAnnotation) {
        this.testStringNoAnnotation = testStringNoAnnotation;
    }

    public String getIgnoreCopy() {
        return ignoreCopy;
    }

    public void setIgnoreCopy(String ignoreCopy) {
        this.ignoreCopy = ignoreCopy;
    }
}
