package seedu.address.model.person;

import static java.util.Objects.requireNonNull;

/**
 * Represents a Pet in the address book.
 * Guarantees: immutable;
 */
public class Pet {
    private final Name petName;
    private final Species species;
    private final Breed breed;
    private final Note note;
    private final PhotoPath photoPath;

    /**
     * Returns a Pet object with the given pet name, species, breed, note and photo path.
     * @param petName
     * @param species
     * @param breed
     * @param note
     * @param photoPath
     */
    public Pet(Name petName, Species species, Breed breed, Note note, PhotoPath photoPath) {
        requireNonNull(petName);
        this.petName = petName;
        this.species = species;
        this.breed = breed;
        this.note = note;
        this.photoPath = photoPath;
    }

    public Name getName() {
        return petName;
    }

    public Species getSpecies() {
        return species;
    }

    public Breed getBreed() {
        return breed;
    }

    public Note getNote() {
        return note;
    }

    public PhotoPath getPhotoPath() {
        return photoPath;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }

        // instanceof handles nulls
        if (!(other instanceof Pet)) {
            return false;
        }

        Pet otherPet = (Pet) other;
        return petName.equals(otherPet.petName);
    }

    @Override
    public int hashCode() {
        return petName.hashCode();
    }

    /**
     * Format state as text for viewing.
     */
    public String toString() {
        return "[" + petName + "]";
    }
}
