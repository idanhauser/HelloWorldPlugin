package io.jenkins.plugins.sample;

import hudson.model.Descriptor;

public abstract class BaseDescriptors extends Descriptor<BaseClassExtensionPoint> {
    protected BaseDescriptors() {
        super();
    }

    public abstract String getDisplayName();


    public BaseDescriptors getDescriptor() {
        return this;
    }
}
