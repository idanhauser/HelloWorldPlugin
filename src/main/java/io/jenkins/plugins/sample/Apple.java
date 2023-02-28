package io.jenkins.plugins.sample;

import hudson.Extension;
import hudson.util.FormValidation;
import org.kohsuke.stapler.DataBoundConstructor;
import org.kohsuke.stapler.DataBoundSetter;

import java.util.List;

public class Apple extends Fruit {
    private List<StringWarp> seeds;


    public Apple() {
        super("Apple");

    }

    @DataBoundConstructor
    public Apple(List<StringWarp> seeds) {
        super("Apple");
        this.seeds = seeds;
    }

    @DataBoundSetter
    public void setSeeds(List<StringWarp> seeds) {
        this.seeds = seeds;
    }

    public List<StringWarp> getSeeds() {
        return seeds;
    }

    @Extension
    public static final class DescriptorImpl extends FruitDescriptor {

    }
}
