/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Ujikom.TabelModel;
import Ujikom.Tabel.TabelPaket;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author 
 */
public class ModelTabelPaket extends AbstractTableModel{
  ArrayList<TabelPaket> list = new ArrayList<TabelPaket>();
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
            case 1 : return list.get(rowIndex).getharga();
            case 2 : return list.get(rowIndex).getuang();
            case 3 : return list.get(rowIndex).getjumlah();
            case 4 : return list.get(rowIndex).getbunga();
            case 5 : return list.get(rowIndex).getnilai();
            default: return null;
        }
    }
    public String getColumnName(int columnIndex){
        switch(columnIndex){
            case 0 : return "Kode Paket";
            case 1 : return "Harga Paket";
            case 2 : return "Uang Muka";
            case 3 : return "Jumlah Cicilan";
            case 4 : return "Bunga";
            case 5 : return "Nilai Cicilan";
            default: return null;
        }
    }
    public void delete(int i,int baris){
        list.remove(i);
        fireTableRowsDeleted(i, baris);
    }
    public void add(TabelPaket paket){
        list.add(paket);
        fireTableRowsInserted(getRowCount(), getColumnCount());
    }  
}
