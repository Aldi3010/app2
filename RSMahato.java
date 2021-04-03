package org.axii.goaxiii;

import android.app.ListActivity;
import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class RSMahato extends ListActivity {
    protected void onCreate (Bundle icicle){
        super.onCreate(icicle);
        String[] ListRSmahato = new String[] {"CALL CENTER","SMS CENTER","DRIVE DIRECTION","WEBSITE","INFO Google","EXIT"};
        this.setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,ListRSmahato));

    }
    protected void onListItemClick (ListView l, View v, int position, long id){
        super.onListItemClick (l,v,position,id);
        Object o = this.getListAdapter().getItem(position);
        String pilihan = o.toString();
        tampilkanPilihan(pilihan);

    }

    private void tampilkanPilihan(String pilihan) {
        try{
            Intent a = null;
            if (pilihan.equals("CALL CENTER")){
              String nomortel ="tel:082285956172";
                a= new Intent(Intent.ACTION_DIAL, Uri.parse(nomortel));

            }else if (pilihan.equals("SMS CENTER")){
                String smstext = "ALDI HARIASNYAH H/L";
                a = new Intent(Intent.ACTION_VIEW);
                a.setData(Uri.parse("sms:082285936172"));
                a.putExtra("sms_body",smstext);


            }else if (pilihan.equals("DRIVE DIRECTION")){

                String lokasi= "google.navigation:q=0.463823,101.390353";
                a = new Intent(Intent.ACTION_VIEW, Uri.parse(lokasi));


            }else if (pilihan.equals("WEBSITE")){
                String website ="http://google.com";
                a = new Intent(Intent.ACTION_VIEW, Uri.parse(website));

            }else if (pilihan.equals("INFO Google")){
                a = new Intent(Intent.ACTION_WEB_SEARCH);
                a.putExtra(SearchManager.QUERY,"RUMAH SAKIT MAHATO");
            }
            startActivity(a);

        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }

}

