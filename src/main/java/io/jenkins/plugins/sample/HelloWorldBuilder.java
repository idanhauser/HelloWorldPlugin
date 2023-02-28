package io.jenkins.plugins.sample;

import hudson.*;
import hudson.model.AbstractProject;
import hudson.model.Descriptor;
import hudson.model.Run;
import hudson.model.TaskListener;
import hudson.tasks.Builder;
import hudson.tasks.BuildStepDescriptor;
import jenkins.model.Jenkins;
import org.kohsuke.stapler.DataBoundConstructor;

import java.io.IOException;
import java.util.List;

import jenkins.tasks.SimpleBuildStep;

public class HelloWorldBuilder extends Builder implements SimpleBuildStep {

//    private Fruit fruit;
    private final Container container;

//    private List<StringWarp> seeds;

    @DataBoundConstructor
    public HelloWorldBuilder(Container container) {
        this.container = container;
//        if (container instanceof Container1) {
//            fruit = ((Container1) container).getFruit();
//        }
    }

//    public List<StringWarp> getSeeds() {
//        if(fruit instanceof Apple) {
//            return ((Apple) fruit).getSeeds();
//        }
//        return null;
//    }
//
//    public void setStringWarp(List<StringWarp> stringWarp) {
//        this.seeds = stringWarp;
//    }

    public Container getContainer() {
        return container;
    }

    public DescriptorExtensionList<Container, Descriptor<Container>> getContainerDescriptors() {
        return Jenkins.get().getDescriptorList(Container.class);
    }

    public void perform(Run<?, ?> run, FilePath workspace, EnvVars env, Launcher launcher, TaskListener
            listener) throws InterruptedException, IOException {

    }

    @Extension
    public static final class DescriptorImpl extends BuildStepDescriptor<Builder> {


        @Override
        public boolean isApplicable(Class<? extends AbstractProject> aClass) {
            return true;
        }

        @Override
        public String getDisplayName() {
            return "Some Plugin";
        }

    }

}

