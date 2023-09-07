
/*Name:Damla Patar 
id:3104152 
date:13/05/2023
*/


public abstract class Shop {
    private String shopName; // Private member variable to store the name of the shop.
    private String address; // Private member variable to store the address of the shop.

    public String getAddress() {
        return address; // Returns the address of the shop.
    }

    public void setAddress(String address) {
        this.address = address; // Sets the address of the shop to the specified value.
    }

    public String getShopName() {
        return shopName; // Returns the name of the shop.
    }

    public void setShopName(String shopName) {
        this.shopName = shopName; // Sets the name of the shop to the specified value.
    }
}
