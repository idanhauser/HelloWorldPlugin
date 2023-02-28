package io.jenkins.plugins.sample;

import hudson.DescriptorExtensionList;
import hudson.Extension;
import hudson.model.Descriptor;
import jenkins.model.Jenkins;
import org.kohsuke.stapler.DataBoundConstructor;
import org.kohsuke.stapler.DataBoundSetter;

import javax.annotation.security.DenyAll;

public class Container1 extends Container {

    private Fruit fruit;

    @DataBoundConstructor
    public Container1(Fruit fruit) {
        this.fruit = fruit;
    }

    @DataBoundSetter
    public void setFruit(Fruit fruit) {
        this.fruit = fruit;
    }

    public Fruit getFruit() {
        return fruit;
    }

    public DescriptorExtensionList<Fruit, Descriptor<Fruit>> getFruitDescriptors() {
        return Jenkins.get().getDescriptorList(Fruit.class);
    }


    @Extension
    public static final class DescriptorImpl extends ContainerDescriptor {


        @Override
        public String getDisplayName() {
            return "Container1 option";
        }
    }
}
