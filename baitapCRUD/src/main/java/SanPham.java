public class SanPham {
    private int id;
    private String name;
    private String img;
    private float price;
    public SanPham(){

    }

    public SanPham(int id, String name, String img, float price) {
        this.id = id;
        this.name = name;
        this.img = img;
        this.price = price;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}

