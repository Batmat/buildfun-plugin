package jenkins.plugins.buildfun;

import hudson.Extension;
import hudson.model.AbstractProject;
import hudson.tasks.BuildStepDescriptor;
import hudson.tasks.Publisher;

@Extension
public class BuilFunDescriptor extends BuildStepDescriptor<Publisher> {

    /**
     * Constructs a {@link BuilFunDescriptor}.
     */
    public BuilFunDescriptor() {
        super(BuildFunRecorder.class);
    }

    /**
     * Gets the descriptor display name, used in the post step checkbox
     * description.
     * @return the descriptor display name
     */
    @Override
    public final String getDisplayName() {
        return "Activate Build Fun";
    }

    /**
     * Checks whether this descriptor is applicable.
     * @param clazz
     *            the class
     * @return true - of course the beard is applicable
     */
    @Override
    public final boolean isApplicable(
            final Class<? extends AbstractProject> clazz) {
        return true;
    }
}
