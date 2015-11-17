package recyclerviewsample.com.example.kazuhiro.recyclerviewsample;

import android.content.Context;
import android.support.v7.widget.AppCompatImageView;
import android.support.v7.widget.AppCompatTextView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.squareup.picasso.Picasso;

import java.util.List;

import butterknife.ButterKnife;
import butterknife.InjectView;

/**
 * Created by kazuhiro on 15/11/18.
 */
public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ProfileViewHolder> {

    private Context mContext;
    private List<Profile> mItemList;

    public RecyclerAdapter(final Context context, final List<Profile> list) {

        this.mContext = context;
        this.mItemList = list;

    }

    public void onClick(View v) {

    }


    @Override
    public ProfileViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        final View view = LayoutInflater.from(mContext).inflate(R.layout.profile_item, parent, false);
        return new ProfileViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ProfileViewHolder holder, int position) {

        Profile profile = mItemList.get(position);

        holder.mNameText.setText(profile.getName());
        holder.mIntroductionText.setText(profile.getIntroduction());

        //画像をPicasoを利用して取得する
        Picasso.with(mContext).load(profile.getPhotoUrl().trim())
                .placeholder(R.drawable.ic_launcher)
                .into(holder.mProfileImage);

    }

    @Override
    public int getItemCount() {
        return (null != mItemList ? mItemList.size() : 0);
    }

    /**
     *
     */
     public class ProfileViewHolder extends RecyclerView.ViewHolder {

        @InjectView(R.id.profile_image)
        AppCompatImageView mProfileImage;
        @InjectView(R.id.name_text)
        AppCompatTextView mNameText;
        @InjectView(R.id.introduction_text)
        AppCompatTextView mIntroductionText;

        public ProfileViewHolder(View v) {
            super(v);
            ButterKnife.inject(this, v);
        }



    }
}
