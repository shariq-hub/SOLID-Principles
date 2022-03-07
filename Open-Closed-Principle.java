//A class should be open for extension and closed for modification.
// This one is a bad Example
class AnimalFeeder {
    public void feedDog() {}
    public void feedCat() {}
    public void feedBird() {}
    // ...
}
//This one is a Good one

interface Animal {
    void feed();
}

class AnimalFeeder {
    public void feed(Animal a) {
        a.feed();
    }
}

class Dog implements Animal {
    public void feed() {}
}

class Cat implements Animal {
    public void feed() {}
}
