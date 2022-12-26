package exception;

class SingleToneClass {
	private static SingleToneClass s = null;
	public String str="";
	private SingleToneClass() {
		str = "SingleToneClass";
	}
	public static SingleToneClass getObject() {
		if(s==null) {
			s = new SingleToneClass();
			return s;
		}
		return s;
	}
}