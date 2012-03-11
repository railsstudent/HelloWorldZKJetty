package foo;


public class Users {

	public static class User implements Comparable<User> {
		
		private String name;
		private String title;
		private int age;
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}

		public int compareTo(User other) {

		    //this optimization is usually worthwhile, and can
		    //always be added
		    if ( this == other ) return 0;

		    if (this.name.compareTo(other.name) < 0) return -1;
		    if (this.name.compareTo(other.name) > 0) return 1;

		    if (this.title.compareTo(other.title) < 0) return -1;
		    if (this.title.compareTo(other.title) > 0) return 1;

		    if (this.age < other.age) return -1;
		    if (this.age > other.age) return -1;

		    assert this.equals(other) : "compareTo inconsistent with equals.";
			return 0;
		}
	}
	
	public static User[] getAll() {
	   User[] users =  new User[4];
	   
	   for (int i = 0; i < users.length; i++) {
		   users[i] = new User();
	   }
	   
	   users[0].setAge(22);
	   users[0].setName("Emily Bestler");
	   users[0].setTitle("Freelancer");

	   users[1].setAge(29);
	   users[1].setName("Jason Kaufman");
	   users[1].setTitle("Editor");

	   users[2].setAge(45);
	   users[2].setName("Leonardo Vetra");
	   users[2].setTitle("Physicist");

	   users[3].setAge(43);
	   users[3].setName("Robert Langdon");
	   users[3].setTitle("Historian");
	   return users;
   }
}
