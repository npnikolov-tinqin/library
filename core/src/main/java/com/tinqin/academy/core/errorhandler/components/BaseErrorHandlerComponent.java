package com.tinqin.academy.core.errorhandler.components;

import com.tinqin.academy.core.errorhandler.base.ErrorHandlerComponent;

public abstract class BaseErrorHandlerComponent implements ErrorHandlerComponent {
    private ErrorHandlerComponent next;

    @Override
    public ErrorHandlerComponent getNext() {
        return next;
    }
    @Override
    public void setNext(ErrorHandlerComponent next) {
        this.next = next;
    }
}
