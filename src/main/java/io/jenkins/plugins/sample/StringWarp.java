package io.jenkins.plugins.sample;

import hudson.Extension;
import hudson.model.AbstractDescribableImpl;
import hudson.model.Descriptor;
import org.kohsuke.stapler.DataBoundConstructor;

public class StringWarp extends AbstractDescribableImpl<StringWarp> {
    private final String seeds;

    @DataBoundConstructor
    public StringWarp(String seeds) {
        this.seeds = seeds;
    }

    public String getSeeds() {
        return seeds;
    }


    @Extension
    public static class DescriptorImpl extends Descriptor<StringWarp> {
        public String getDisplayName() {
            return "";
        }
    }
}
