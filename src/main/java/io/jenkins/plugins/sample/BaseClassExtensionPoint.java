package io.jenkins.plugins.sample;


import hudson.ExtensionList;
import hudson.ExtensionPoint;

import hudson.model.Describable;
import hudson.model.Descriptor;
import jenkins.model.Jenkins;

public abstract class BaseClassExtensionPoint  implements ExtensionPoint, Describable<BaseClassExtensionPoint> {
    public static ExtensionList<BaseClassExtensionPoint> all() {
        return Jenkins.get().getExtensionList(BaseClassExtensionPoint.class);
    }



    public abstract String getDisplayName();
}

