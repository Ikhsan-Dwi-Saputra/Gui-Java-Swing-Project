package com.ikhsan.project;

public class DataResource {

    //Variabel
    private String nama;
    private String nim;

    public DataResource() {
    }

    public DataResource(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    //Jenjang Pendidikan
    public String getJenjangPendidikan() {
        char digit_ke1 = nim.charAt(0);
        if (digit_ke1 == '1') {
            return "S1 (Sarjana)";
        } else if (digit_ke1 == '2') {
            return "S2 (Magister)";
        } else if (digit_ke1 == '3') {
            return "S3 (Doktor)";
        }
        return "UNKNOWN";
    }

    //Tahun Masuk
    public String getTahunMasuk() {
        char digit_ke2 = nim.charAt(1);
        char digit_ke3 = nim.charAt(2);

        return "20" + digit_ke2 + digit_ke3;
    }
    //Fakultas
    public String getFakultas() {
        char digit_ke4 = nim.charAt(3);
        if (digit_ke4 == '1') {
            return "Tarbiyah dan Keguruan";
        } else if (digit_ke4 == '2') {
            return "Syariah dan hukum";
        } else if (digit_ke4 == '3') {
            return "ushuludidin";
        } else if (digit_ke4 == '4') {
            return "Dakwah dan Komunikasi";
        } else if (digit_ke4 == '5') {
            return "Sains dan Teknologi";
        } else if (digit_ke4 == '6') {
            return "Psikologi";
        } else if (digit_ke4 == '7') {
            return "Ekonomi dan ilmu sosial";
        } else if (digit_ke4 == '8') {
            return "Pertanian dan Peternakan";
        } else {
            return "UKNOWN";
        }
    }

    //Jurusan
    public String getJurusan() {
        char digit_ke5 = nim.charAt(4);
        char digit_ke6 = nim.charAt(5);

        if (digit_ke5 == '0' && digit_ke6 == '1') {
            return "Teknik Informatika";
        } else if (digit_ke5 == '0' && digit_ke6 == '2') {
            return "Teknik Industri";
        } else if (digit_ke5 == '0' && digit_ke6 == '3') {
            return "Sistem Informasi";
        } else if (digit_ke5 == '0' && digit_ke6 == '4') {
            return "matematika";
        } else if (digit_ke5 == '0' && digit_ke6 == '5') {
            return "Teknik Elektro";
        } else {
            return "UNKNOWN";
        }
    }

    //Jenis Kelamin
    public String getJenisKelamin() {
        char digit_ke7 = nim.charAt(6);
        if (digit_ke7 == '1') {
            return "Laki - laki";
        } else if (digit_ke7 == '2') {
            return "Perempuan";
        }
        return "UNKNOWN";
    }


    // Nomor Urut Mahasiswa
    public String getUrutaMahasiswa() {

        char digit_Ke8 = nim.charAt(7);
        char digit_Ke9 = nim.charAt(8);
        char digit_Ke10 = nim.charAt(9);
        char digit_Ke11 = nim.charAt(10);
        return "" + digit_Ke8 + digit_Ke9 + digit_Ke10 + digit_Ke11;
    }

// Pemanggil
    public String name() {
        return nama;
    }
    public String nim() {
        return nim;
    }
    public String jenjangPendidikan() {
        return jenjangPendidikan();
    }
    public String tahunMasuk() {
        return tahunMasuk();
    }
    public String Fakultas() {
        return Fakultas();
    }
    public String jurusan() {
        return jurusan();
    }
    public String jenisKelamin() {
        return jenisKelamin();
    }
    public String nourut() {
        return nourut();
    }


}
