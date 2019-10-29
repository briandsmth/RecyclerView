package com.briand.tugas_1718060_family;

import java.util.ArrayList;

public class familyData {
    private static String[] NamaKeluarga = {
            "MAIDI",
            "DIANA WAHYU NINGSIH",
            "FEBRIAN MEBIYANTARA",
            "JAUZJANI NOVANSYAH",
            "MUHAMMAD NAZRIEL ILHAM"
    };

    private static String[] Detail = {
            "Papa",
            "Mama",
            "Anak Pertama",
            "Anak Kedua",
            "Anak Ketiga"
    };

    private static int[] Photo = {
            R.drawable.father,
            R.drawable.mother,
            R.drawable.me,
            R.drawable.ovan,
            R.drawable.aling

    };

    static ArrayList<family> getListData() {
        family Family;
        ArrayList<com.briand.tugas_1718060_family.family> List = new ArrayList<>();
        for (int posisi = 0; posisi < NamaKeluarga.length; posisi++){
            Family = new family();
            Family.setNama(NamaKeluarga[posisi]);
            Family.setSebagai(Detail[posisi]);
            Family.setPhoto(Photo[posisi]);

            List.add(Family);
        }
        return List;
    }
}
