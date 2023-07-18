package Enum;

public enum Animal {
    DOG("Tuzik"), CAT("meow"), FROG("kva-kva");

    private  String translation;
    Animal(String translation) {
        this.translation = translation;
    }

    public String getTranslation() {
        return translation;
    }

    @Override
    public String toString() {
        return "The animal is :" +  translation;
    }
}
