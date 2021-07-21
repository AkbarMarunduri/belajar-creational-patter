package amd.programmer.java.spring.creational.builder.usebean;


import lombok.Builder;

//@builder untuk generate DoctorBuilder secara otomatis
@Builder
public class Docter {

    private String nik;

    private String nama;

    private String noKtp;

    private Spesialis spesialis;

    public Docter(String nik, String nama, String noKtp, Spesialis spesialis) {
        this.nik = nik;
        this.nama = nama;
        this.noKtp = noKtp;
        this.spesialis = spesialis;
    }

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNoKtp() {
        return noKtp;
    }

    public void setNoKtp(String noKtp) {
        this.noKtp = noKtp;
    }

    public Spesialis getSpesialis() {
        return spesialis;
    }

    public void setSpesialis(Spesialis spesialis) {
        this.spesialis = spesialis;
    }

    @Override
    public String toString() {
        return "Docter{" +
                "nik='" + nik + '\'' +
                ", nama='" + nama + '\'' +
                ", noKtp='" + noKtp + '\'' +
                ", spesialis=" + spesialis +
                '}';
    }
}
