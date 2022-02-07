package spring.model2.control;

public class ModelAndView {
	// field
	private String viewName;
	private String medelName;
	private Object medelObject;

	// constructor
	public ModelAndView() {
	}

	public ModelAndView(String viewName) {
		this.viewName = viewName;
	}

	public ModelAndView(String viewName, String medelName, Object medelObject) {
		this.viewName = viewName;
		this.medelName = medelName;
		this.medelObject = medelObject;
	}
	
	// Method
	public String getViewName() {
		return viewName;
	}

	public void setViewName(String viewName) {
		this.viewName = viewName;
	}

	public String getMedelName() {
		return medelName;
	}

	public void setMedelName(String medelName) {
		this.medelName = medelName;
	}

	public Object getMedelObject() {
		return medelObject;
	}

	public void setMedelObject(Object medelObject) {
		this.medelObject = medelObject;
	}

	

}
