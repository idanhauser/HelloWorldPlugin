package io.jenkins.plugins.sample;

import hudson.Extension;
import hudson.model.Describable;
import org.kohsuke.stapler.DataBoundConstructor;
import org.kohsuke.stapler.DataBoundSetter;

@Extension
public class ExtendingClass1 extends BaseDescriptors implements Describable<BaseClassExtensionPoint> {
    private String name1;
    private String name2;

    @DataBoundConstructor
    public ExtendingClass1(String name1, String name2) {
        super();
        this.name1 = name1;
        this.name2 = name2;
    }

    public String getName1() {
        return name1;
    }

    public ExtendingClass1() {
        super();
    }

    @DataBoundSetter
    public void setName1(String name1) {
        this.name1 = name1;
    }

    public String getName2() {
        return name2;
    }

    @DataBoundSetter
    public void setName2(String name2) {
        this.name2 = name2;
    }

    @Override
    public String getDisplayName() {
        return "First Extension";
    }

    @Override
    public BaseDescriptors getDescriptor() {
        return null;
    }
}
