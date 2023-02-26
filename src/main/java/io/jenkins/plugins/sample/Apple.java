package io.jenkins.plugins.sample;

import hudson.Extension;
import hudson.util.FormValidation;
import org.kohsuke.stapler.DataBoundConstructor;
import org.kohsuke.stapler.DataBoundSetter;

import java.util.List;

public class Apple extends Fruit {
    private final List<StringWarp> seeds;

    @DataBoundConstructor
    public Apple(List<StringWarp> seeds) {
        super("Apple");
        this.seeds = seeds;
    }

    public List<StringWarp> getSeeds() {
        return seeds;
    }

    @Extension
    public static final class DescriptorImpl extends FruitDescriptor {

    }
}
