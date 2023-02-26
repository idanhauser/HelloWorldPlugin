package io.jenkins.plugins.sample;

import hudson.ExtensionPoint;
import hudson.model.Describable;
import hudson.model.Descriptor;
import jenkins.model.Jenkins;

public abstract class Fruit implements Describable<Fruit>, ExtensionPoint {
    protected String name;

    protected Fruit(String name) {
        this.name = name;
    }

    @Override
    public Descriptor<Fruit> getDescriptor() {
        return Jenkins.get().getDescriptorOrDie(getClass());
    }

}
