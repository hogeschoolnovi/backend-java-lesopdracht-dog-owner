public class DogOwner {


    private  String name;
    private final String gender;
    private Dog dog;
    public DogOwner(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public void changeNameDogTo(String name) {
        this.dog.name = name;
    }

    public void increaseAgeOfDogWithOneYear() {
        this.dog.age += 1;
    }

    public String toString() {
      
        return this.name + " heeft een " + dog.sex + ", deze is " + dog.age + " jaar oud en van het soort: " + dog.species + ". De hond heet: " + dog.name;
    }
}
