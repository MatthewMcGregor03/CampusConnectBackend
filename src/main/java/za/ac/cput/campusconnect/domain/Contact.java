/**
 * FileName Contact.java
 * Class: Conact
 * Author: Matthew McGregor
 * Completion date: 9 July 2024
 */
package za.ac.cput.campusconnect.domain;
import jakarta.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;
@Embeddable
public class Contact implements Serializable {
    private String phoneNumber;
    private String email;
    private String addressLine1;
    private String addressLine2;
    private String city;
    private String postalCode;
    protected Contact() {}
    private Contact(Builder builder) {
        this.phoneNumber = builder.phoneNumber;
        this.email = builder.email;
        this.addressLine1 = builder.addressLine1;
        this.addressLine2 = builder.addressLine2;
        this.city = builder.city;
        this.postalCode = builder.postalCode;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public String getCity() {
        return city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contact contact = (Contact) o;
        return Objects.equals(phoneNumber, contact.phoneNumber) &&
                Objects.equals(email, contact.email) &&
                Objects.equals(addressLine1, contact.addressLine1) &&
                Objects.equals(addressLine2, contact.addressLine2) &&
                Objects.equals(city, contact.city) &&
                Objects.equals(postalCode, contact.postalCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(phoneNumber, email, addressLine1, addressLine2, city, postalCode);
    }

    @Override
    public String toString() {
        return "Contact{" +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", addressLine1='" + addressLine1 + '\'' +
                ", addressLine2='" + addressLine2 + '\'' +
                ", city='" + city + '\'' +
                ", postalCode='" + postalCode + '\'' +
                '}';
    }

    public static class Builder {
        private String phoneNumber;
        private String email;
        private String addressLine1;
        private String addressLine2;
        private String city;
        private String postalCode;
        public Builder setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }
        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }
        public Builder setAddressLine1(String addressLine1) {
            this.addressLine1 = addressLine1;
            return this;
        }
        public Builder setAddressLine2(String addressLine2) {
            this.addressLine2 = addressLine2;
            return this;
        }

        public Builder setCity(String city) {
            this.city = city;
            return this;
        }

        public Builder setPostalCode(String postalCode) {
            this.postalCode = postalCode;
            return this;
        }
        public Builder copyContact(Contact contact) {
            this.phoneNumber = contact.phoneNumber;
            this.email = contact.email;
            this.addressLine1 = contact.addressLine1;
            this.addressLine2 = contact.addressLine2;
            this.city = contact.city;
            this.postalCode = contact.postalCode;
            return this;
        }
        public Contact buildContact() {
            return new Contact(this);
        }
    }
}
