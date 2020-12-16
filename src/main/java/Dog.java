public class Dog extends Pet {
    // Instance variable(s)
    private String breed;

    // Constructors
    public Dog()
    {
        super("Rahil", 100);
        this.breed = "lab";
    }
    public Dog(String name, int age, String breed)
    {
        super(name,age);
        this.breed = breed;
    }

    // makeNoise() method
    public void makeNoise()
    {
        System.out.println("Woof!");
    }


    // toString method
    public String toString()
    {
        String str = "Name: " + this.getName() + ", Age: " + this.getAge() + ", Breed: " + breed;
        return str;
    }

    // Getter
    public String getBreed() 
    {
        return this.breed;
    }

    // Setter
    public void setBreed(String breed)
    {
        if(breed.trim().length() != 0)
        {
            this.breed = breed;
        }
    }
}