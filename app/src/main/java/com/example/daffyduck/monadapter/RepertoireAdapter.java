package com.example.daffyduck.monadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class RepertoireAdapter extends BaseAdapter {
    LayoutInflater layoutInflater;
    List<Contact> maList;
    Context context;

    public RepertoireAdapter(List<Contact> maList, LayoutInflater layoutInflater) {
        this.maList = maList;
        this.layoutInflater = layoutInflater;
    }

    @Override
    public int getCount() {
        return maList.size();
    }

    /**
     * Récupérer un item de la liste en fonction de sa position
     *
     * @param position - Position de l'item à récupérer
     * @return l'item récupéré
     */
    public Object getItem(int position) {
        return maList.get(position);
    }

    /**
     * Récupérer l'identifiant d'un item de la liste en fonction de sa position (plutôt utilisé dans le cas d'une
     * base de données, mais on va l'utiliser aussi)
     *
     * @param position - Position de l'item à récupérer
     * @return l'identifiant de l'item
     */
    public long getItemId(int position) {
        return position;
    }

    /**
     * Explication juste en dessous.
     */
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder = null;
        // Si la vue n'est pas recyclée
        if(convertView == null) {
            // On récupère le layout
            convertView  = layoutInflater.inflate(R.layout.element_list, null);

            holder = new ViewHolder();
            // On place les widgets de notre layout dans le holder
            holder.mNom = (TextView) convertView.findViewById(R.id.nom);
            holder.mNumero = (TextView) convertView.findViewById(R.id.numero);
            holder.mPhoto = (ImageView) convertView.findViewById(R.id.photo);

            // puis on insère le holder en tant que tag dans le layout
            convertView.setTag(holder);
        } else {
            // Si on recycle la vue, on récupère son holder en tag
            holder = (ViewHolder)convertView.getTag();
        }

        // Dans tous les cas, on récupère le contact téléphonique concerné
        Contact c = (Contact)getItem(position);
        // Si cet élément existe vraiment…
        if(c != null) {
            // On place dans le holder les informations sur le contact
            holder.mNom.setText(c.getNom());
            holder.mNumero.setText(c.getNumero());
            holder.mPhoto.setImageResource(c.getPhoto());
        }
        return convertView;
    }

    static class ViewHolder {
        public TextView mNom;
        public TextView mNumero;
        public ImageView mPhoto;
    }

}
