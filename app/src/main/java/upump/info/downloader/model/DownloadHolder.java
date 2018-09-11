package upump.info.downloader.model;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import upump.info.downloader.DetailActivity;
import upump.info.downloader.R;

class DownloadHolder extends RecyclerView.ViewHolder {
    private ImageView imageView;
    private TextView name, description;
    private Context context;

    public DownloadHolder(@NonNull final View itemView) {
        super(itemView);
        context = itemView.getContext();
        name = itemView.findViewById(R.id.item_download_card_name);
        description = itemView.findViewById(R.id.item_download_card_description);
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = DetailActivity.createIntent();
                context.startActivity(intent);
            }
        });
    }

    public void bind(Download download){
        name.setText(download.getName());
        description.setText(download.getUrl().toString());
    }


}
