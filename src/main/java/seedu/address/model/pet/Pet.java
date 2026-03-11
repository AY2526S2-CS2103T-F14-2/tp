package seedu.address.model.pet;

import static java.util.Objects.requireNonNull;
import static seedu.address.commons.util.AppUtil.checkArgument;

/**
 * Represents a Pet in the address book.
 * Guarantees: immutable; name is valid as declared in {@link #isValidPetName(String)}
 */
public class Pet {

    public static final String MESSAGE_CONSTRAINTS = "Pet names cannot be empty";
    public static final String VALIDATION_REGEX = ".+";

    public final String petName;

    /**
     * Constructs a {@code Pet}.
     *
     * @param petName A valid pet name.
     */
    public Pet(String petName) {
        requireNonNull(petName);
        checkArgument(isValidPetName(petName), MESSAGE_CONSTRAINTS);
        this.petName = petName;
    }

    public String getName() {
        return this.petName;
    }

    /**
     * Returns true if a given string is a valid tag name.
     */
    public static boolean isValidPetName(String test) {
        return test.matches(VALIDATION_REGEX);
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

        Pet otherTag = (Pet) other;
        return petName.equals(otherTag.petName);
    }

    @Override
    public int hashCode() {
        return petName.hashCode();
    }

    /**
     * Format state as text for viewing.
     */
    public String toString() {
        return '[' + petName + ']';
    }

}
