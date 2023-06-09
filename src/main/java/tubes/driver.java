package tubes;

public class driver {
    public static void main(String[] args) {
        double panjang = 9;
        double lebar = 2;

        PersegiPanjang persegiPanjang = new PersegiPanjang(panjang, lebar);
        double luas = persegiPanjang.hitungLuas();

        System.out.println("Luas Persegi Panjang: " + luas);
    }
}

