/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Ujikom.TabelModel;
import Ujikom.Tabel.TabelPembeli;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author 
 */
public class ModelTabelPembeli extends AbstractTableModel{
    ArrayList<TabelPembeli> list = new ArrayList<TabelPembeli>();
    @Override
    public int getRowCount() {
        return list.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0 : return list.get(rowIndex).getKTP();
            case 1 : return list.get(rowIndex).getnama();
            case 2 : return list.get(rowIndex).getalamat();
            case 3 : return list.get(rowIndex).gettelepon();
            default: return null;
        }
    }
    public String getColumnName(int columnIndex){
        switch(columnIndex){
            case 0 : return "No KTP";
            case 1 : return "Nama";
            case 2 : return "Alamat";
            case 3 : return "No Telepon";
            default: return null;
        }
    }
    public void delete(int i,int baris){
        list.remove(i);
        fireTableRowsDeleted(i, baris);
    }
    public void add(TabelPembeli beli){
        list.add(beli);
        fireTableRowsInserted(getRowCount(), getColumnCount());
    }
}
