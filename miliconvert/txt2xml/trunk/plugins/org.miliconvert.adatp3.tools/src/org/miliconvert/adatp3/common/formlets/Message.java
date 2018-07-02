package org.miliconvert.adatp3.common.formlets;

public class Message {

	private IntroductoryPart introductionPart;
	private MainMessagePart mainPart;
	private ClosingPart closingPart;

	public IntroductoryPart getIntroductionPart() {
		return introductionPart;
	}

	public void setIntroductionPart(IntroductoryPart introductionPart) {
		this.introductionPart = introductionPart;
	}

	public MainMessagePart getMainPart() {
		return mainPart;
	}

	public void setMainPart(MainMessagePart mainPart) {
		this.mainPart = mainPart;
	}

	public ClosingPart getClosingPart() {
		return closingPart;
	}

	public void setClosingPart(ClosingPart closingPart) {
		this.closingPart = closingPart;
	}

}
