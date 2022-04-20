package com.fundamentos.springboot.fundamentos.bean;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class MyBeanWithDpendencyImplements  implements MyBeanWithDependency{

    Log LOGGER = LogFactory.getLog(MyBeanWithDpendencyImplements.class);

    private MyOperation myOperation;

    public MyBeanWithDpendencyImplements(MyOperation myOperation) {
        this.myOperation = myOperation;
    }

    @Override
    public void printWithDependency() {
        LOGGER.info("Hemos ingresado al método printWithDependency de la clase MyBeanWithDpendencyImplements");
        int numero = 2;
        LOGGER.debug("El número enviado por parametro a la dependencia operación es: " + numero);
        System.out.println(myOperation.sum(numero));
        System.out.println("Hola desde la implementación de un bean con dependencia");
    }
}
