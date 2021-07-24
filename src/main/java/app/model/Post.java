package app.model;

import app.model.enums.ModerationStatus;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.*;

@Entity
@Table(name = "posts")
public class Post {

    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "is_active", nullable = false)
    private byte isActive;

    @Enumerated(EnumType.STRING)
    @Type(type = "app.model.enums.ModerationStatus")
    @Column(name = "moderation_status", nullable = false)
    private ModerationStatus moderationStatus;

    @Column(name = "moderator_id")
    private int moderatorId;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @NotNull
    private Date time;

    @NotNull
    private String title;

    @NotNull
    @Type(type = "text")
    private String text;

    @Column(name = "view_count", nullable = false)
    private int viewCount;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "post_id")
    private Set<PostVotes> postVotes;

    @ManyToMany(mappedBy = "posts")
    private final Collection<Tag> tags = new HashSet<>();

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "post_id")
    private List<Comment> comment;

}
