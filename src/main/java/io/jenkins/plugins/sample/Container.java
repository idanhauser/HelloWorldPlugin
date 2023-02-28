package io.jenkins.plugins.sample;

import hudson.ExtensionPoint;
import hudson.model.Describable;
import hudson.model.Descriptor;

public class Container implements Describable<Container>, ExtensionPoint {
    @Override
    public Descriptor<Container> getDescriptor() {
        return null;
    }
}
