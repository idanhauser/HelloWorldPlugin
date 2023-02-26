package io.jenkins.plugins.sample;

import hudson.Extension;
import hudson.util.FormValidation;
import org.kohsuke.stapler.DataBoundConstructor;
import org.kohsuke.stapler.DataBoundSetter;

public class Apple extends Fruit {
    private final int seeds;

    @DataBoundConstructor
    public Apple(int seeds) {
        super("Apple");
        this.seeds = seeds;
    }

    public int getSeeds() {
        return seeds;
    }

    @Extension
    public static final class DescriptorImpl extends FruitDescriptor {

    }
}
