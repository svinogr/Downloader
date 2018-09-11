package upump.info.downloader.model;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;

import java.util.zip.Inflater;

import upump.info.downloader.R;

public class FirebaseAdapter extends FirebaseRecyclerAdapter<Download, DownloadHolder> {

    /**
     * Initialize a {@link RecyclerView.Adapter} that listens to a Firebase query. See
     * {@link FirebaseRecyclerOptions} for configuration options.
     *
     * @param options
     */
    public FirebaseAdapter(@NonNull FirebaseRecyclerOptions<Download> options) {
        super(options);
    }


    @Override
    protected void onBindViewHolder(@NonNull DownloadHolder holder, int position, @NonNull Download model) {
        holder.bind(model);
    }

    @NonNull
    @Override
    public DownloadHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_download_card, viewGroup, false);
        return new DownloadHolder(view);
    }
}
