package com.simple_test.caculator;



import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class AddUIConsoleOutput implements OutputBoundary {
    private ResponseError error = null;

    public ResponseError getError() {
        return error;
    }

    // fields

   // private PrintWriter stdOut = null;

   public AddUIConsoleOutput() {
      //  stdOut = new PrintWriter(new OutputStreamWriter(System.out));
    }

    //interface - visible
    public void showError(ResponseError error) {
        this.error = error;

       // error(responseData);
    }

    @Override
    public void showResult(ResponseResult result) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'showResult'");
    }


    //implementataion
    // private void error(ResponseData responseData) {
    //     stdOut.print(responseData.content);
    //     stdOut.println(responseData.strNumber1);
    //     stdOut.println(responseData.strNumber2);

    //     stdOut.flush();
    // }

}
