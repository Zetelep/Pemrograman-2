package MODUL6;

public class Mahasiswa {
    private int id;
    private String name;
    private String NIM;

    public Mahasiswa(int id, String name, String NIM) {
        this.id = id;
        this.name = name;
        this.NIM = NIM;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNIM() {
        return NIM;
    }

    public void setNIM(String NIM) {
        this.NIM = NIM;
    }
}
