package ru.netology.domain;

public class Post {
    private int id;
    private int ownerId;
    private int fromid;
    private int replyOwnerId;
    private int replyPostId;
    private int friendsOnly;
    private int date;
    private CommentsInfo commentsInfo;
    private Copyright copyright;
    private LikesInfo likesInfo;
    private RepostsInfo repostsInfo;
    private ViewsInfo viewsInfo;
    private String postType;
    private PostSource postSource;
    private Geo geo;
    private int signerId;
    private boolean canPin;
    private boolean canDelete;
    private boolean canEdit;
    private boolean isPinned;
    private boolean markedAsAds;
    private boolean isFavorite;
    private Donut donut;
    private int postponedId;

    // + getters/setters*
}
