package io.jenkins.plugins.sample;

import hudson.Extension;
import org.kohsuke.stapler.DataBoundConstructor;

public class Banana extends Fruit {
    private final boolean isYellow;

    @DataBoundConstructor
    public Banana(boolean isYellow) {
        super("Banana");
        this.isYellow = isYellow;
    }

    public boolean isYellow() {
        return isYellow;
    }

    @Extension
    public static final class DescriptorImpl extends FruitDescriptor {

    }
}
