package io.jenkins.plugins.sample;

import hudson.*;
import hudson.model.AbstractProject;
import hudson.model.Run;
import hudson.model.TaskListener;
import hudson.tasks.Builder;
import hudson.tasks.BuildStepDescriptor;
import jenkins.model.Jenkins;
import org.kohsuke.stapler.DataBoundConstructor;

import java.io.IOException;

import jenkins.tasks.SimpleBuildStep;
import org.kohsuke.stapler.DataBoundSetter;

public class HelloWorldBuilder extends Builder implements SimpleBuildStep {

    private BaseClassExtensionPoint baseClassExtensionPoint;


    @DataBoundConstructor
    public HelloWorldBuilder(BaseClassExtensionPoint baseClassExtensionPoint) {
        this.baseClassExtensionPoint = baseClassExtensionPoint;

    }

    public BaseClassExtensionPoint getBaseClassExtensionPoint() {
        return baseClassExtensionPoint;
    }



    @Override
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
