package com.simple_test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.simple_test.caculator.AddUIConsoleOutput;
import com.simple_test.caculator.AddUseCaseControl;
import com.simple_test.caculator.InputBoundary;
import com.simple_test.caculator.RequestData;

public class TestUseCaseAdd {

    //@Test
    public void addError() {

        RequestData requestData = new RequestData();
        requestData.strNumber1 = "2";
        requestData.strNumber2 = "a";

        AddUseCaseControl addUseCaseControl = new AddUseCaseControl();
        addUseCaseControl.execute(requestData);

        assertEquals("ERROR_INPUT", addUseCaseControl.getResponseError().content);



        
    }

    @Test
    public void testError() {
        RequestData requestData = new RequestData();
        requestData.strNumber1 = "2";
        requestData.strNumber2 = "a";

        AddUIConsoleOutput output = new AddUIConsoleOutput();

        InputBoundary inputBoundary = new AddUseCaseControl();
        AddUseCaseControl addUseCaseControl = (AddUseCaseControl)inputBoundary;
        addUseCaseControl.setAddUIConsoleOutput(output);

        inputBoundary.execute(requestData);

       // output.getError().content

        assertEquals("ERROR_INPU", output.getError().content);


    }

}
