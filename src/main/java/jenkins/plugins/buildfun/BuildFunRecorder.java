package jenkins.plugins.buildfun;

import hudson.Launcher;
import hudson.model.BuildListener;
import hudson.model.AbstractBuild;
import hudson.tasks.BuildStepMonitor;
import hudson.tasks.Recorder;

import java.io.IOException;
import java.util.logging.Logger;

import org.kohsuke.stapler.DataBoundConstructor;

public class BuildFunRecorder extends Recorder {
	FunGenerator generator = new FunGenerator();
	private static final Logger LOGGER = Logger
			.getLogger(BuildFunRecorder.class.getName());

	@DataBoundConstructor
	public BuildFunRecorder() {
	}

	@Override
	public final boolean perform(final AbstractBuild<?, ?> build,
			final Launcher launcher, final BuildListener listener)
			throws InterruptedException, IOException {
		build.getActions().add(new BuildFunAction(generator.nextImage()));
		return true;
	}

	public final BuildStepMonitor getRequiredMonitorService() {
		return BuildStepMonitor.NONE;
	}
}
