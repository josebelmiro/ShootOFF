package com.shootoff.camera;

public class MockCamera extends WebcamCaptureCamera {
	public MockCamera() {
		super();
	}

	@Override
	public boolean isOpen() {
		return true;
	}

	@Override
	public boolean isImageNew() {
		return false;
	}
	
	@Override
	public String getName()
	{
		return "MockCamera";
	}
}
