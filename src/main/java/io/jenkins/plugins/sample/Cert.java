package io.jenkins.plugins.sample;

import hudson.Extension;
import hudson.model.AbstractDescribableImpl;
import hudson.model.Descriptor;
import hudson.util.Secret;
import org.kohsuke.stapler.DataBoundConstructor;

public class Cert extends AbstractDescribableImpl<Cert> {
    private final Secret token;
    private final String teamId;

    @DataBoundConstructor
    public Cert(Secret token, String teamId) {
        this.token = token;
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
