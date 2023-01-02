package jobportal;

public interface ProfileView {
	public abstract void login(String mail,String name);
	public abstract void viewProfile(String mail);
	public abstract void feedback();
	public abstract void register();
}