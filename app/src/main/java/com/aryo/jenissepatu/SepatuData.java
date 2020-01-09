package com.aryo.jenissepatu;

import java.util.ArrayList;

public class SepatuData {
    private static String[] sepatuFullName = {
            "Adidas",
            "Nike",
            "Yezzy",
            "Filla",
            "Converse",
            "Reebook",
            "New Balance",
            "Piero",
            "Diadora",
            "Puma"



    };

    private static String[] sepatuNickName = {
            "Adidas",
            "Nike",
            "Yezzy",
            "Filla",
            "Converse",
            "Reebook",
            "New Balance",
            "Piero",
            "Diadora",
            "Puma"


    };
    private static String[] sepatuDetail = {
            "1.\tadidas, adalah sebuah perusahaan sepatu Jerman. Perusahaan ini dinamakan atas pendirinya, Adolf (Adi) Dassler, yang mulai memproduksi sepatu pada 1920-an di Herzogenaurach dekat Nuremberg. Rancangan baju dan sepatu perusahaan ini biasanya termasuk tiga strip paralel dengan warna yang sama, dan motif yang sama digunakan sebagai logo resmi adidas",
            "2.\tnike adalah salah satu perusahaan sepatu, pakaian dan alat-alat olahraga Amerika Serikat yang merupakan salah satu yang terbesar di dunia. Mereka terkenal karena mensponsori beberapa olahragawan terkenal di dunia seperti Tiger Woods, Ronaldo, Courtois, Hazard, Ronaldinho dan Wayne Rooney",
            "3.\tYeezy ini memang dibuat dengan material yang nggak biasa. Beda dengan knit (rajut) pada pakaian atau topi. Uniknya lagi teknik pembuatannya dilakukan tanpa jahitan dan digabung dengan teknik sonic welding. Nah, kalau diintip di bagian dalamnya, pasalnya material yang digunakan handmade dari Jepang, material yang mirip kulit sintetis yang antis slip",
            "4.\tFila adalah salah satu perusahaan manufaktur perlengkapan olahraga terbesar di dunia. Didirkan pada tahun 1911 di Itali, kini Fila telah dimiliki dan dioperasikan oleh Korea Selatan, sejak pengambil alihan pada tahun 2007. Dipimpin oleh ketua dan CEO Yoon-Soo Yoon, Fila sekarang memiliki beberapa kantor di 11 negara di seluruh dunia.",
            "5.\tConverse /ˈkɒnvərs/ adalah sebuah perusahaan sepatu asal Amerika dengan hasil produksi yang terutama terdiri dari alas kaki berjenis olahraga dan brand gaya hidup. Perusahaan telah berdiri sejak tahun 1908 dan, pada tahun 2003,",
            "6.\tReebok adalah sponsor keperluan dan alas kaki resmi untuk CrossFit, Spartan Race, dan Les Mills. Perusahaan tersebut didirikan pada 1895 dengan nama J.W. Foster and Sons di Bolton, Lancashire, Inggris. Perusahaan tersebut kemudian diganti namanya menjadi Reebok dan beroperasi sebagai subsidiari dari Adidas sejak 2005.",
            "7.\tNew Balance, adalah sebuah perusahaan multinasional Amerika yang berpusat di Boston, Massachusetts. Perusahaan tersebut dibentuk di tahun 1906 dengan nama \"New Balance Arch Support Company\" dan merupakan salah satu produsen sepatu olahraga terbesar di dunia.",
            "8.\tPiero merupakan brand sepatu yang didirikan oleh Djimanto yang terinspirasi dari nama atlet sepakbola dunia, Alesandro Del PIERO. Merek ini sebelumnya bernama Star Moon yang dibeli dari Badan Penyehatan Perbankan Nasional (BPPN) dikarenakan menunggak uang BLBI (Bantuan Likuiditas Bank Indonesia). Sebelum bernama Piero, Djimanto menamai sepatu ini dengan nama \"Urip\" namun nama tersebut kurang menjual.",
            "9.\tDiadora adalah produk perlengkapan olahraga asal Italia yang mencakup sepak bola, tenis, lari, bersepeda, rugby, sepatu atletik, pakaian, dan produsen aksesori fashion dengan lokasi di Italia, Amerika Serikat, dan Hong Kong.",
            "10.\tPuma adalah perusahaan internasional yang memproduksi sepatu olahraga serta perlengkapan olahraga lainnya. Perusahaan ini berbasis di Jerman, dan didirikan oleh Rudolf Dassler. Rudolf adalah kakak dari Adolf Dassler, pendiri Adidas."

    };

    private static int[] photo = {
            R.drawable.adidass,
            R.drawable.nike,
            R.drawable.yeezy,
            R.drawable.fila,
            R.drawable.converse,
            R.drawable.reebook,
            R.drawable.newbalance,
            R.drawable.piero,
            R.drawable.diadora,
            R.drawable.puma


    };

    static ArrayList<SepatuArchitecture> getListData() {
        ArrayList<SepatuArchitecture> list = new ArrayList<>();
        for (int position = 0; position < sepatuNickName.length; position++) {
            SepatuArchitecture nw = new SepatuArchitecture();
            nw.setFullName(sepatuFullName[position]);
            nw.setNickName(sepatuNickName[position]);
            nw.setDetail(sepatuDetail[position]);
            nw.setPhoto(photo[position]);
            list.add(nw);
        }

        return list;
    }
}
