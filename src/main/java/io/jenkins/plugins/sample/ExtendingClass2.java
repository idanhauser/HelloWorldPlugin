package io.jenkins.plugins.sample;

import hudson.Extension;
import hudson.model.Describable;
import hudson.model.Descriptor;
import jenkins.model.Jenkins;
import org.kohsuke.stapler.DataBoundConstructor;
import org.kohsuke.stapler.DataBoundSetter;

import java.util.Objects;

@Extension
public class ExtendingClass2 extends BaseClassExtensionPoint implements Describable<BaseClassExtensionPoint> {
    private String name3;
    private String name4;

    public ExtendingClass2() {
        super();
    }

    @DataBoundConstructor
    public ExtendingClass2(String name3, String name4) {
        super();
        this.name3 = name3;
        this.name4 = name4;
    }

    public String getName3() {
        return name3;
    }

    @DataBoundSetter
    public void setName3(String name3) {
        this.name3 = name3;
    }

    public String getName4() {
        return name4;
    }

    @DataBoundSetter
    public void setName4(String name4) {
        this.name4 = name4;
    }

    @Override
    public String getDisplayName() {
        return "Second Extension";
    }

    @Override
    @SuppressWarnings("unchecked")

    public Descriptor<BaseClassExtensionPoint> getDescriptor() {
        return (Descriptor<BaseClassExtensionPoint>) Objects.requireNonNull(Jenkins.getInstanceOrNull()).getDescriptorOrDie(getClass());

    }
}
