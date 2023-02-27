package io.jenkins.plugins.sample;

import hudson.*;
import hudson.model.AbstractProject;
import hudson.model.Descriptor;
import hudson.model.Run;
import hudson.model.TaskListener;
import hudson.tasks.Builder;
import hudson.tasks.BuildStepDescriptor;
import hudson.util.ListBoxModel;
import jenkins.model.Jenkins;
import org.kohsuke.stapler.DataBoundConstructor;

import java.io.IOException;

import jenkins.tasks.SimpleBuildStep;
import org.kohsuke.stapler.DataBoundSetter;

public class HelloWorldBuilder extends Builder implements SimpleBuildStep {

    private final Fruit fruit;

    private final Cert cert;


    @DataBoundConstructor
    public HelloWorldBuilder(Cert cert, Fruit fruit) {
        this.fruit = fruit;
        this.cert = cert;
    }

    public Cert getCert() {
        return cert;
    }

    public Fruit getFruit() {
        return fruit;
    }

    public DescriptorExtensionList<Fruit, Descriptor<Fruit>> getFruitDescriptors() {
        return Jenkins.get().getDescriptorList(Fruit.class);
    }


    public void perform(Run<?, ?> run, FilePath workspace, EnvVars env, Launcher launcher, TaskListener listener) throws InterruptedException, IOException {

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

