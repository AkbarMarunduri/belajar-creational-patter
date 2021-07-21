package amd.programmer.java.spring.creational.builder.usebean;

import org.junit.jupiter.api.Test;

import javax.print.Doc;

import static org.junit.jupiter.api.Assertions.*;


class DocterTest {

    @Test
    void testBuilderBean() {
        Docter docterBedah = Docter.builder()
                .nik("2014804346")
                .nama("AKBAR MARUNDURI")
                .spesialis(Spesialis.BEDAH)
                .build();

        Docter dokterDalam = Docter.builder()
                .nik("2213233")
                .nama("RAHMALISA MARUNDURI")
                .spesialis(Spesialis.PENYAKIT_DALAM)
                .build();

        Docter dokterTHT = Docter.builder()
                .nik("1231132")
                .nama("HELMINDA MD")
                .spesialis(Spesialis.THT)
                .build();

        System.out.println(docterBedah);
        System.out.println(dokterDalam);
        System.out.println(dokterTHT);
    }
}