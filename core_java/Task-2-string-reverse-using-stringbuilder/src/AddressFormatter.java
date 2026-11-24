
public class AddressFormatter {

    public String formatAddress(String street, String city,
                                String state, String postalCode) {

        if (street == null || city == null ||
            state == null || postalCode == null) {

            throw new IllegalArgumentException(
                    "Address fields cannot be null.");
        }

        street = street.trim();
        city = city.trim();
        state = state.trim();
        postalCode = postalCode.trim();

        if (street.isEmpty() || city.isEmpty() ||
            state.isEmpty() || postalCode.isEmpty()) {

            throw new IllegalArgumentException(
                    "All address fields are required.");
        }

        StringBuffer address = new StringBuffer();

        address.append(street);
        address.append(", ");
        address.append(city);
        address.append(", ");
        address.append(state);
        address.append(" - ");
        address.append(postalCode);

        return address.toString();
    }
}
