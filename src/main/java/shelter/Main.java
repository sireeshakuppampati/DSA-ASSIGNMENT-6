package shelter;

public class Main {
    public static void main(String[] args) {
        AnimalShelter shelter = new AnimalShelter();

        shelter.enqueue(new Dog("Dog1"));
        shelter.enqueue(new Cat("Cat1"));
        shelter.enqueue(new Dog("Dog2"));
        shelter.enqueue(new Cat("Cat2"));

        System.out.println("Dequeue any: " + shelter.dequeueAny().getName()); // Expected: Dog1
        System.out.println("Dequeue cat: " + shelter.dequeueCat().getName()); // Expected: Cat1
        System.out.println("Dequeue dog: " + shelter.dequeueDog().getName()); // Expected: Dog2
        System.out.println("Dequeue any: " + shelter.dequeueAny().getName()); // Expected: Cat2
    }
}
