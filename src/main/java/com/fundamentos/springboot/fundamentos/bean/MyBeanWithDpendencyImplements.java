package com.fundamentos.springboot.fundamentos.bean;

public class MyBeanWithDpendencyImplements  implements MyBeanWithDependency{

    private MyOperation myOperation;

    public MyBeanWithDpendencyImplements(MyOperation myOperation) {
        this.myOperation = myOperation;
    }

    @Override
    public void printWithDependency() {
        System.out.println(myOperation.sum(1));
        System.out.println("Hola desde la implementación de un bean con dependencia");
    }
}
