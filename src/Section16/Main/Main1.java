package Section16.Main;

import Section16.consumer.specific.ChildClass;
import Section16.generic.BaseClass;

public class Main1 {
    private static final String SEP_LINE = "-".repeat(50);

    public static void main(String[] args) {
        BaseClass parent = new BaseClass();
        ChildClass child = new ChildClass();
        BaseClass childReferredToAsBase = new ChildClass();

        parent.recommendedMethod();
        System.out.println(SEP_LINE);
        childReferredToAsBase.recommendedMethod();
        System.out.println(SEP_LINE);
        child.recommendedMethod();

        System.out.println(SEP_LINE);
        parent.recommendedStatic();
        System.out.println(SEP_LINE);
        childReferredToAsBase.recommendedStatic();
        System.out.println(SEP_LINE);
        child.recommendedStatic();

        System.out.println(SEP_LINE);
        BaseClass.recommendedStatic();
        ChildClass.recommendedStatic();

        String xArgument = "This is all I've got to say about Section ";
        StringBuilder zArgument = new StringBuilder("Only saying this: Section ");
        doXYZ(xArgument, 16, zArgument);
        System.out.println("After Method, xArgument: " + xArgument);
        System.out.println("After Method, zArgument: " + zArgument);
    }

    private static void doXYZ(String x, int y, final StringBuilder z) {
        final String c = x + y;
        System.out.println("c = " + c);
        x = c;
        z.append(y);
    }
}
