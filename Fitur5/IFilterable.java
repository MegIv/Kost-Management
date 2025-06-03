package Fitur5;

import java.util.List;
import java.util.Map;

public interface IFilterable<T> {
    List<T> filterDariKriteria(Map<String, Object> criteria); // Untuk filter dinamis
    T searchById(String id); // Untuk pencarian by ID
}

// <T> adalah sebuah type parameter
    // dengan T merupakan konvensi dari penamaan Type (umum)
    // yang bisa diganti dengan tipe aktual saat membuat instance dari kelas/method
    
    // dengan generic <T> kompiler akan mengecek tipe data saat compile time
    // untuk mencegah ClassCastException saat runtime

    // dan tidak perlu melakukan casting eksplisit saat mengambil elemen
