package io.jenkins.plugins.sample;

import hudson.Extension;
import hudson.model.AbstractDescribableImpl;
import hudson.model.Descriptor;
import hudson.util.Secret;
import org.kohsuke.stapler.DataBoundConstructor;
import org.kohsuke.stapler.DataBoundSetter;

public class Cert extends AbstractDescribableImpl<Cert> {
    private Secret token;
    private String teamId;

    @DataBoundConstructor
    public Cert(Secret token, String teamId) {
        this.token = token;
        this.teamId = teamId;
    }

    @DataBoundSetter
    public void setToken(Secret token) {
        this.token = token;
    }

    @DataBoundSetter
    public void setTeamId(String teamId) {
        this.teamId = teamId;
    }

    public Secret getToken() {
        return token;
    }

    public String getTeamId() {
        return teamId;
    }

    @Extension
    public static class DescriptorImpl extends Descriptor<Cert> {
        public String getDisplayName() {
            return "";
        }
    }

    public static class CertDescriptor extends Descriptor<Cert> {
        public String getDisplayName() {
            return "";
        }
    }
}
