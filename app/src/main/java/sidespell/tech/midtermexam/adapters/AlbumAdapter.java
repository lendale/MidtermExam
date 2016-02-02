package sidespell.tech.midtermexam.adapters;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import sidespell.tech.midtermexam.R;

/**
 * Created by daleg on 02/02/2016.
 */
public class AlbumAdapter extends RecyclerView.Adapter<AlbumAdapter.AlbumViewHolder>{

    private Context mContext;
    private int mLayoutId;

    @Override
    public AlbumViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(mLayoutId, parent, false);
        return new AlbumViewHolder(view);
    }

    @Override
    public void onBindViewHolder(AlbumViewHolder holder, int position) {
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    static class AlbumViewHolder extends RecyclerView.ViewHolder {
        public CardView cardView;
        public ImageView imgAlbum;
        public TextView  tvAlbumName;
        public TextView tvArtistName;

        public AlbumViewHolder(View view) {
            super(view);
            cardView = (CardView) view.findViewById(R.id.cardView);
            imgAlbum = (ImageView) view.findViewById(R.id.imgAlbum);
            tvAlbumName = (TextView) view.findViewById(R.id.tvAlbumName);
            tvArtistName = (TextView) view.findViewById(R.id.tvArtistName);
        }
    }
}
