/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Ujikom.TabelModel;
import Ujikom.Tabel.TabelMobil;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author 
 */
public class ModelTabelMobil extends AbstractTableModel{
    ArrayList<TabelMobil> list = new ArrayList<TabelMobil>();
    @Override
    public int getRowCount() {
        return list.size();
    }

    @Override
    public int getColumnCount() {
        return 6;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0 : return list.get(rowIndex).getkode();
            case 1 : return list.get(rowIndex).getmerk();
            case 2 : return list.get(rowIndex).gettype();
            case 3 : return list.get(rowIndex).getwarna();
            case 4 : return list.get(rowIndex).getharga();
            case 5 : return list.get(rowIndex).getgambar();
            default: return null;
        }
    }
    public String getColumnName(int columnIndex){
        switch(columnIndex){
            case 0 : return "Kode Mobil";
            case 1 : return "Merk Mobil";
            case 2 : return "Type Mobil";
            case 3 : return "Warna Mobil";
            case 4 : return "Harga Mobil";
            case 5 : return "Gambar";
            default: return null;
        }
    }
    public void delete(int i,int baris){
        list.remove(i);
        fireTableRowsDeleted(i, baris);
    }
    public void add(TabelMobil mobil){
        list.add(mobil);
        fireTableRowsInserted(getRowCount(), getColumnCount());
    }
}
