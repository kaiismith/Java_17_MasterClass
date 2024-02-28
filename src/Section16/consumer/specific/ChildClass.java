package Section16.consumer.specific;

import Section16.generic.BaseClass;

public class ChildClass extends BaseClass {
    @Override
    protected void optionalMethod() {
        System.out.println("[Child.optionalMethod]: EXTRA Stuff Here");
        super.optionalMethod();
    }

    private void mandatoryMethod() {
        System.out.println("[Child.mandatoryMethod]: My own important stuff");
    }

    public static void recommendedStatic() {
        System.out.println("[Child.recommendedStatic]: BEST Way to Do it");
        optionalStatic();
    }
}
