package springdemo;

public class Dog {
	
		private String name;
		private String breed;
		private int year;
		
		private Food food;
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getBreed() {
			return breed;
		}
		public void setBreed(String breed) {
			this.breed = breed;
		}
		public int getYear() {
			return year;
		}
		public void setYear(int year) {
			this.year = year;
		}
		public Food getFood() {
			return food;
		}
		public void setFood(Food food) {
			this.food = food;
		}
		@Override
		public String toString() {
			return "Dog [name=" + name + ", breed=" + breed + ", year=" + year + ", food=" + food + "]";
		}
	}
	