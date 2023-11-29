
package kiemtra;


public class Address {
    private String district;
    private String city;

    public Address(String district, String city) {
        this.district = district;
        this.city = city;
    }

    public Address() {
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Address{" + "district=" + district + ", city=" + city + '}';
    }
    
    
    
}
