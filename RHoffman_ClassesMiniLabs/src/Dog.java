//Ryan Hoffman - Period 5 - Classes Mini Labs
public class Dog {
		private String name, desc;
		private int age, humanyears;
		
		public Dog(String nameInit, int ageInit, String descInit, int humanyearsInit) {
			name = nameInit;
			age = ageInit;
			desc = descInit;
			humanyears = humanyearsInit;
		}
		
		public String getName() {
			return name;
		}
		public int getAge() {
			return age;
		}
		public String getDesc() {
			return desc;
		}
		public int getHumanyears() {
			return age*7;
		}
		
		
		
		public void setName(String nameUpdate) {
			name = nameUpdate;
		}
		public void setAge(int ageUpdate) {
			age = ageUpdate;
		}
		public void setDesc(String descUpdate) {
			desc = descUpdate;
		}
		public void setHumanyears(int humanyearsUpdate) {
			humanyears = humanyearsUpdate;
		}
		
		
		public String toString() {
			return "Name: "+name+"\nAge: "+age+"\nDescription: "+desc+"\nHuman Years: "+humanyears+"\n\n";
		}
		
}
