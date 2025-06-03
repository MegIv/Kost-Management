package Fitur5;

import java.util.List;
import java.util.Map;

// PencarianBase bisa diartikan sebuah core class/dasar dari fungsi pencarian yg dibuat

public abstract class PencarianBase<T> implements IFilterable<T> {
    protected List<T> dataSource; // Data yang akan difilter/dicari

    public PencarianBase(List<T> dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public abstract List<T> filterDariKriteria(Map<String, Object> criteria);

    @Override
    public abstract T searchById(String id);
}
