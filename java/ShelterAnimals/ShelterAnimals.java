class ShelterAnimals {
  public int mAge;
  public String mSpecies;
  public String mGender;
  public String mSize;
  public String mColor;

  public ShelterAnimals(int age, String species, String gender, String size, String color) {
    mAge = age;
    mSpecies = species;
    mGender = gender;
    mSize = size;
    mColor = color;
  }

  public boolean perfectAnimal( String mySize ) {
    return mSize.equals(mySize);
  }
}
