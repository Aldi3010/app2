package org.axii.goaxiii;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class RS extends ListActivity {
    protected void onCreate (Bundle icicle){
        super.onCreate(icicle);
        String[] ListRS = new String[] {"RUMAH SAKIT MAHATO","RUMAH SAKIT LOMBOK","RUMAH SAKIT TANJUNG MEDAN","RUMAH SAKIT KM5"};
        this.setListAdapter(new ArrayAdapter<String> (this, android.R.layout.simple_list_item_1,ListRS));

    }
    protected void onListItemClick (ListView l, View v, int position,long id){
        super.onListItemClick (l,v,position,id);
        Object o = this.getListAdapter().getItem(position);
        String pilihan = o.toString();
        tampilkanPilihan(pilihan);

    }

    private void tampilkanPilihan(String pilihan) {
        try{
            Intent a = null;
            if (pilihan.equals("RUMAH SAKIT MAHATO")){
                a=new Intent(this,RSMahato.class);


            }else if (pilihan.equals("RUMAH SAKIT LOMBOK")){

            }else if (pilihan.equals("RUMAH SAKIT TANJUNG MEDAN")){

            }else if (pilihan.equals("RUMAH SAKIT KM5")){

            }
            startActivity(a);

        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }

}
