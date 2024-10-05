package com.simple_test.caculator;

public interface OutputBoundary {

    void showError(ResponseError error);

    void showResult(ResponseResult result);

}
