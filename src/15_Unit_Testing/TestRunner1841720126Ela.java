/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unittest;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import unittest.database.KategoriTest1841720126Ela;

/**
 *
 * @author Ela Widya
 */
public class TestRunner1841720126Ela {

    public static void main(String[] args) {
        Result mResult = new JUnitCore().runClasses(MessageProcessorTest1841720126Ela.class);
        showMessageResult(mResult, MessageProcessorTest1841720126Ela.class.getSimpleName());
        
        mResult = new JUnitCore().runClasses(KategoriTest1841720126Ela.class);
        showMessageResult(mResult, KategoriTest1841720126Ela.class.getSimpleName());
    }

    private static void showMessageResult(Result mResult, String className) {
        if (mResult.wasSuccessful()) {
            System.out.format("The Result Test from %s : %s\n", className, mResult.wasSuccessful());
        } else {
            for (Failure failure : mResult.getFailures()) {
                System.out.println(failure);
            }
        }
    }
}
