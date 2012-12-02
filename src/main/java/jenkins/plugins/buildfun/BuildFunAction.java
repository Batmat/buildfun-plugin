package jenkins.plugins.buildfun;

import hudson.model.Action;

public class BuildFunAction implements Action {

	FunImage funImage;

	public BuildFunAction(FunImage funImage) {
		this.funImage = funImage;
	}

	//iconFileName
	public String getIconFileName() {
		return "/plugin/buildfun/images/" + funImage.getImage();
	}

	public String getDisplayName() {
		return "build fun";
	}

	public String getUrlName() {
		return "buildfun";
	}

	public String getText() {
		return funImage.getText();
	}
}
