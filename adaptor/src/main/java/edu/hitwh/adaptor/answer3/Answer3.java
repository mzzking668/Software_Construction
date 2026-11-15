package edu.hitwh.adaptor.answer3;

public class Answer3 implements frameInterface3{
    contextClass3 context;
    @Override
    public void SimpleNameFunction() {
        context.uglyNamingFunction2();
    }
    @Override
    public void SimpleParamFunction(Builder builder) {
        context.tooManyParamsFunction3(builder.getParam1(), builder.getParam2());

    }
    @Override
    public void GoodUseFunction() {
        context.lowPerformanceFunction4();
    }
    @Override
    public void NoStaticFunction() {
        context.staticFunction1();
    }
}
