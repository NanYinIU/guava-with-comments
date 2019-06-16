package com.nanyin.test.design.visitor;

public abstract class OperateNode {
    abstract void accept(Visitor visitor);
}
