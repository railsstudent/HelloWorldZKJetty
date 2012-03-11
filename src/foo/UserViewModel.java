package foo;

public class UserViewModel {
	Users.User[] users = Users.getAll();

	public Users.User[] getAllUsers() {
		return users;
	}
}
