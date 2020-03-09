package com.company;

public class Main {

    public static void main(String[] args) {
        OverrideFinal of = new OverrideFinal();
        of.f();
        of.g();
        of.h();
        WithFinal wf = of;
        wf.f();
        wf.g();
        wf.h();
    }
}
