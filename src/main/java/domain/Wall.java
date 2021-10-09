package domain;

public class Wall<CommentsInfo> {
    private int id;
    private int author;
    private int date;
    private int messageData;
    private int likesCount;
    private int repostsCount;
    private int viewsCount;
    private CommentsInfo commentsInfo;

    //+get/set на все поля

    public class CommentsInfo {
        private int author;
        private int commentsData;
        private int date;
        private int answersCount;
    }


}
