package recyclerviewsample.com.example.kazuhiro.recyclerviewsample;

/**
 * Created by kazuhiro on 15/11/18.
 */
public class Profile {

    /**
     *　ユーザー名
     */
    private String name;

    /**
     * 画像URLx
     */
    private String photoUrl;

    /**
     * 自己紹介
     */
    private String introduction;

    /**
     *
     * @param nickname
     * @param photoUrl
     * @param intoroduction
     */
    public Profile(final String nickname, final String photoUrl, final String intoroduction) {
        this.name = nickname;
        this.photoUrl = photoUrl;
        this.introduction = intoroduction;
    }

    public String getIntroduction() {
        return introduction;
    }

    public String getName() {
        return name;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

}
